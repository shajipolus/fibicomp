package com.polus.fibicomp.report.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.polus.fibicomp.grantcall.pojo.GrantCall;
import com.polus.fibicomp.grantcall.pojo.GrantCallType;
import com.polus.fibicomp.pojo.ProtocolType;
import com.polus.fibicomp.report.vo.ReportVO;
import com.polus.fibicomp.view.AwardView;

@Service
public interface ReportDao {

	public ReportVO fetchApplicationByGrantCallId(ReportVO reportVO);

	public List<GrantCall> fetchOpenGrantIds();

	public List<ProtocolType> fetchAllProtocolTypes();

	public Long fetchApplicationsCountByGrantCallType(Integer grantCallTypeCode);

	public Long fetchProtocolsCountByProtocolType(String protocolTypeCode);

	public List<GrantCallType> fetchAllGrantCallTypes();

	public List<Integer> fetchIPByGrantTypeCode(Integer grantTypeCode);

	public Long fetchAwardCountByGrantType(List<Integer> proposalId);

	public ReportVO fetchAwardByGrantCallId(ReportVO reportVO);

	public ReportVO fetchExpenditureByAward(ReportVO reportVO);

	public List<AwardView> fetchAwardNumbers();

}

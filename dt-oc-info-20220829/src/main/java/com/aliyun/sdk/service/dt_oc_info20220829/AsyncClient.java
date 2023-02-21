// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dt_oc_info20220829.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<GetOcCompetitorsResponse> getOcCompetitors(GetOcCompetitorsRequest request);

    CompletableFuture<GetOcCoreTeamsResponse> getOcCoreTeams(GetOcCoreTeamsRequest request);

    CompletableFuture<GetOcFinancingResponse> getOcFinancing(GetOcFinancingRequest request);

    CompletableFuture<GetOcFuzzSearchResponse> getOcFuzzSearch(GetOcFuzzSearchRequest request);

    CompletableFuture<GetOcIcAbnormalOperationResponse> getOcIcAbnormalOperation(GetOcIcAbnormalOperationRequest request);

    CompletableFuture<GetOcIcAdminLicenseResponse> getOcIcAdminLicense(GetOcIcAdminLicenseRequest request);

    CompletableFuture<GetOcIcBasicResponse> getOcIcBasic(GetOcIcBasicRequest request);

    CompletableFuture<GetOcIcBranchResponse> getOcIcBranch(GetOcIcBranchRequest request);

    CompletableFuture<GetOcIcChangeRecordResponse> getOcIcChangeRecord(GetOcIcChangeRecordRequest request);

    CompletableFuture<GetOcIcCheckupResponse> getOcIcCheckup(GetOcIcCheckupRequest request);

    CompletableFuture<GetOcIcClearAccountResponse> getOcIcClearAccount(GetOcIcClearAccountRequest request);

    CompletableFuture<GetOcIcDoubleCheckupResponse> getOcIcDoubleCheckup(GetOcIcDoubleCheckupRequest request);

    CompletableFuture<GetOcIcEmployeeResponse> getOcIcEmployee(GetOcIcEmployeeRequest request);

    CompletableFuture<GetOcIcEquityFrozenResponse> getOcIcEquityFrozen(GetOcIcEquityFrozenRequest request);

    CompletableFuture<GetOcIcEquityPledgeResponse> getOcIcEquityPledge(GetOcIcEquityPledgeRequest request);

    CompletableFuture<GetOcIcInvestmentResponse> getOcIcInvestment(GetOcIcInvestmentRequest request);

    CompletableFuture<GetOcIcKnowledgePropertyPledgeResponse> getOcIcKnowledgePropertyPledge(GetOcIcKnowledgePropertyPledgeRequest request);

    CompletableFuture<GetOcIcMortgageResponse> getOcIcMortgage(GetOcIcMortgageRequest request);

    CompletableFuture<GetOcIcSeriousOffenseResponse> getOcIcSeriousOffense(GetOcIcSeriousOffenseRequest request);

    CompletableFuture<GetOcIcShareholderResponse> getOcIcShareholder(GetOcIcShareholderRequest request);

    CompletableFuture<GetOcIcSimpleCancelResponse> getOcIcSimpleCancel(GetOcIcSimpleCancelRequest request);

    CompletableFuture<GetOcIpCertificateResponse> getOcIpCertificate(GetOcIpCertificateRequest request);

    CompletableFuture<GetOcIpDomainResponse> getOcIpDomain(GetOcIpDomainRequest request);

    CompletableFuture<GetOcIpPatentResponse> getOcIpPatent(GetOcIpPatentRequest request);

    CompletableFuture<GetOcIpSoftwareCopyrightResponse> getOcIpSoftwareCopyright(GetOcIpSoftwareCopyrightRequest request);

    CompletableFuture<GetOcIpTrademarkResponse> getOcIpTrademark(GetOcIpTrademarkRequest request);

    CompletableFuture<GetOcIpWorksCopyrightResponse> getOcIpWorksCopyright(GetOcIpWorksCopyrightRequest request);

    CompletableFuture<GetOcJusticeAuctionResponse> getOcJusticeAuction(GetOcJusticeAuctionRequest request);

    CompletableFuture<GetOcJusticeCaseFilingResponse> getOcJusticeCaseFiling(GetOcJusticeCaseFilingRequest request);

    CompletableFuture<GetOcJusticeCourtAnnouncementResponse> getOcJusticeCourtAnnouncement(GetOcJusticeCourtAnnouncementRequest request);

    CompletableFuture<GetOcJusticeCourtNoticeResponse> getOcJusticeCourtNotice(GetOcJusticeCourtNoticeRequest request);

    CompletableFuture<GetOcJusticeDishonestyResponse> getOcJusticeDishonesty(GetOcJusticeDishonestyRequest request);

    CompletableFuture<GetOcJusticeExecutedResponse> getOcJusticeExecuted(GetOcJusticeExecutedRequest request);

    CompletableFuture<GetOcJusticeJudgementDocResponse> getOcJusticeJudgementDoc(GetOcJusticeJudgementDocRequest request);

    CompletableFuture<GetOcJusticeLimitHighConsumeResponse> getOcJusticeLimitHighConsume(GetOcJusticeLimitHighConsumeRequest request);

    CompletableFuture<GetOcJusticeTerminalCaseResponse> getOcJusticeTerminalCase(GetOcJusticeTerminalCaseRequest request);

    CompletableFuture<GetOcListedCompanyResponse> getOcListedCompany(GetOcListedCompanyRequest request);

    CompletableFuture<GetOcNegativeAdminPunishmentResponse> getOcNegativeAdminPunishment(GetOcNegativeAdminPunishmentRequest request);

    CompletableFuture<GetOcNegativeCustomsPunishmentResponse> getOcNegativeCustomsPunishment(GetOcNegativeCustomsPunishmentRequest request);

    CompletableFuture<GetOcNegativeEnvironmentPunishmentResponse> getOcNegativeEnvironmentPunishment(GetOcNegativeEnvironmentPunishmentRequest request);

    CompletableFuture<GetOcNegativeFoodDrugPunishmentResponse> getOcNegativeFoodDrugPunishment(GetOcNegativeFoodDrugPunishmentRequest request);

    CompletableFuture<GetOcNegativeQualityPunishmentResponse> getOcNegativeQualityPunishment(GetOcNegativeQualityPunishmentRequest request);

    CompletableFuture<GetOcOperationBiddingResponse> getOcOperationBidding(GetOcOperationBiddingRequest request);

    CompletableFuture<GetOcOperationCustomsResponse> getOcOperationCustoms(GetOcOperationCustomsRequest request);

    CompletableFuture<GetOcOperationPurchaseLandResponse> getOcOperationPurchaseLand(GetOcOperationPurchaseLandRequest request);

    CompletableFuture<GetOcOperationRecruitmentResponse> getOcOperationRecruitment(GetOcOperationRecruitmentRequest request);

    CompletableFuture<GetOcProductBandResponse> getOcProductBand(GetOcProductBandRequest request);

    CompletableFuture<GetOcTaxAbnormalResponse> getOcTaxAbnormal(GetOcTaxAbnormalRequest request);

    CompletableFuture<GetOcTaxClassAResponse> getOcTaxClassA(GetOcTaxClassARequest request);

    CompletableFuture<GetOcTaxGeneralTaxpayerResponse> getOcTaxGeneralTaxpayer(GetOcTaxGeneralTaxpayerRequest request);

    CompletableFuture<GetOcTaxIllegalResponse> getOcTaxIllegal(GetOcTaxIllegalRequest request);

    CompletableFuture<GetOcTaxOverdueResponse> getOcTaxOverdue(GetOcTaxOverdueRequest request);

    CompletableFuture<GetOcTaxPunishmentResponse> getOcTaxPunishment(GetOcTaxPunishmentRequest request);

    CompletableFuture<GetQccCertificationDetailByIdResponse> getQccCertificationDetailById(GetQccCertificationDetailByIdRequest request);

    CompletableFuture<GetQccSearchCertificationResponse> getQccSearchCertification(GetQccSearchCertificationRequest request);

}

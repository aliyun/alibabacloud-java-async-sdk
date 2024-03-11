// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alinlp20200629.models.*;
import darabonba.core.*;
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

    CompletableFuture<ADClockResponse> aDClock(ADClockRequest request);

    CompletableFuture<ADMMUResponse> aDMMU(ADMMURequest request);

    CompletableFuture<ADMiniCogResponse> aDMiniCog(ADMiniCogRequest request);

    CompletableFuture<ADMiniCogResultResponse> aDMiniCogResult(ADMiniCogResultRequest request);

    CompletableFuture<DeleteServiceDataByConditionsResponse> deleteServiceDataByConditions(DeleteServiceDataByConditionsRequest request);

    CompletableFuture<DeleteServiceDataByIdsResponse> deleteServiceDataByIds(DeleteServiceDataByIdsRequest request);

    CompletableFuture<GetBrandChEcomResponse> getBrandChEcom(GetBrandChEcomRequest request);

    CompletableFuture<GetCateChEcomResponse> getCateChEcom(GetCateChEcomRequest request);

    CompletableFuture<GetCheckDuplicationChMedicalResponse> getCheckDuplicationChMedical(GetCheckDuplicationChMedicalRequest request);

    CompletableFuture<GetDiagnosisChMedicalResponse> getDiagnosisChMedical(GetDiagnosisChMedicalRequest request);

    CompletableFuture<GetDpChEcomResponse> getDpChEcom(GetDpChEcomRequest request);

    CompletableFuture<GetDpChGeneralCTBResponse> getDpChGeneralCTB(GetDpChGeneralCTBRequest request);

    CompletableFuture<GetDpChGeneralStanfordResponse> getDpChGeneralStanford(GetDpChGeneralStanfordRequest request);

    CompletableFuture<GetEcChGeneralResponse> getEcChGeneral(GetEcChGeneralRequest request);

    CompletableFuture<GetEcEnGeneralResponse> getEcEnGeneral(GetEcEnGeneralRequest request);

    CompletableFuture<GetEmbeddingResponse> getEmbedding(GetEmbeddingRequest request);

    CompletableFuture<GetItemPubChEcomResponse> getItemPubChEcom(GetItemPubChEcomRequest request);

    CompletableFuture<GetKeywordChEcomResponse> getKeywordChEcom(GetKeywordChEcomRequest request);

    CompletableFuture<GetKeywordEnEcomResponse> getKeywordEnEcom(GetKeywordEnEcomRequest request);

    CompletableFuture<GetMedicineChMedicalResponse> getMedicineChMedical(GetMedicineChMedicalRequest request);

    CompletableFuture<GetNerChEcomResponse> getNerChEcom(GetNerChEcomRequest request);

    CompletableFuture<GetNerChMedicalResponse> getNerChMedical(GetNerChMedicalRequest request);

    CompletableFuture<GetNerCustomizedChEcomResponse> getNerCustomizedChEcom(GetNerCustomizedChEcomRequest request);

    CompletableFuture<GetNerCustomizedSeaEcomResponse> getNerCustomizedSeaEcom(GetNerCustomizedSeaEcomRequest request);

    CompletableFuture<GetOpenNLUResponse> getOpenNLU(GetOpenNLURequest request);

    CompletableFuture<GetOpenNLUHighRecallResponse> getOpenNLUHighRecall(GetOpenNLUHighRecallRequest request);

    CompletableFuture<GetOperationChMedicalResponse> getOperationChMedical(GetOperationChMedicalRequest request);

    CompletableFuture<GetPosChEcomResponse> getPosChEcom(GetPosChEcomRequest request);

    CompletableFuture<GetPosChGeneralResponse> getPosChGeneral(GetPosChGeneralRequest request);

    CompletableFuture<GetPriceChEcomResponse> getPriceChEcom(GetPriceChEcomRequest request);

    CompletableFuture<GetSSETestResponse> getSSETest(GetSSETestRequest request);

    CompletableFuture<GetSaChGeneralResponse> getSaChGeneral(GetSaChGeneralRequest request);

    CompletableFuture<GetSaSeaEcomResponse> getSaSeaEcom(GetSaSeaEcomRequest request);

    CompletableFuture<GetServiceDataImportStatusResponse> getServiceDataImportStatus(GetServiceDataImportStatusRequest request);

    CompletableFuture<GetSimilarityChMedicalResponse> getSimilarityChMedical(GetSimilarityChMedicalRequest request);

    CompletableFuture<GetSummaryChEcomResponse> getSummaryChEcom(GetSummaryChEcomRequest request);

    CompletableFuture<GetTableQAServiceInfoByIdResponse> getTableQAServiceInfoById(GetTableQAServiceInfoByIdRequest request);

    CompletableFuture<GetTcChEcomResponse> getTcChEcom(GetTcChEcomRequest request);

    CompletableFuture<GetTcChGeneralResponse> getTcChGeneral(GetTcChGeneralRequest request);

    CompletableFuture<GetTsChEcomResponse> getTsChEcom(GetTsChEcomRequest request);

    CompletableFuture<GetUserUploadSignResponse> getUserUploadSign(GetUserUploadSignRequest request);

    CompletableFuture<GetWeChCommentResponse> getWeChComment(GetWeChCommentRequest request);

    CompletableFuture<GetWeChEcomResponse> getWeChEcom(GetWeChEcomRequest request);

    CompletableFuture<GetWeChEntertainmentResponse> getWeChEntertainment(GetWeChEntertainmentRequest request);

    CompletableFuture<GetWeChGeneralResponse> getWeChGeneral(GetWeChGeneralRequest request);

    CompletableFuture<GetWeChSearchResponse> getWeChSearch(GetWeChSearchRequest request);

    CompletableFuture<GetWsChGeneralResponse> getWsChGeneral(GetWsChGeneralRequest request);

    CompletableFuture<GetWsCustomizedChEcomCommentResponse> getWsCustomizedChEcomComment(GetWsCustomizedChEcomCommentRequest request);

    CompletableFuture<GetWsCustomizedChEcomContentResponse> getWsCustomizedChEcomContent(GetWsCustomizedChEcomContentRequest request);

    CompletableFuture<GetWsCustomizedChEcomTitleResponse> getWsCustomizedChEcomTitle(GetWsCustomizedChEcomTitleRequest request);

    CompletableFuture<GetWsCustomizedChEntertainmentResponse> getWsCustomizedChEntertainment(GetWsCustomizedChEntertainmentRequest request);

    CompletableFuture<GetWsCustomizedChGeneralResponse> getWsCustomizedChGeneral(GetWsCustomizedChGeneralRequest request);

    CompletableFuture<GetWsCustomizedChO2OResponse> getWsCustomizedChO2O(GetWsCustomizedChO2ORequest request);

    CompletableFuture<GetWsCustomizedSeaEcomResponse> getWsCustomizedSeaEcom(GetWsCustomizedSeaEcomRequest request);

    CompletableFuture<GetWsCustomizedSeaGeneralResponse> getWsCustomizedSeaGeneral(GetWsCustomizedSeaGeneralRequest request);

    CompletableFuture<ImportServiceDataResponse> importServiceData(ImportServiceDataRequest request);

    CompletableFuture<InsertCustomResponse> insertCustom(InsertCustomRequest request);

    CompletableFuture<OpenAlinlpServiceResponse> openAlinlpService(OpenAlinlpServiceRequest request);

    CompletableFuture<PostMSConvSearchTokenGeneratedResponse> postMSConvSearchTokenGenerated(PostMSConvSearchTokenGeneratedRequest request);

    CompletableFuture<PostMSDataProcessingCountResponse> postMSDataProcessingCount(PostMSDataProcessingCountRequest request);

    CompletableFuture<PostMSSearchEnhanceResponse> postMSSearchEnhance(PostMSSearchEnhanceRequest request);

    CompletableFuture<RequestTableQAResponse> requestTableQA(RequestTableQARequest request);

    CompletableFuture<RequestTableQAOnlineResponse> requestTableQAOnline(RequestTableQAOnlineRequest request);

    CompletableFuture<UpdateServiceDataResponse> updateServiceData(UpdateServiceDataRequest request);

}

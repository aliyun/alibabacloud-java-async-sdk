// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.facebody20191230.models.*;
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

    /**
     * @param request the request parameters of AddFaceEntity  AddFaceEntityRequest
     * @return AddFaceEntityResponse
     */
    CompletableFuture<AddFaceEntityResponse> addFaceEntity(AddFaceEntityRequest request);

    /**
     * @param request the request parameters of CreateFaceDb  CreateFaceDbRequest
     * @return CreateFaceDbResponse
     */
    CompletableFuture<CreateFaceDbResponse> createFaceDb(CreateFaceDbRequest request);

    /**
     * @param request the request parameters of DeleteFace  DeleteFaceRequest
     * @return DeleteFaceResponse
     */
    CompletableFuture<DeleteFaceResponse> deleteFace(DeleteFaceRequest request);

    /**
     * @param request the request parameters of DeleteFaceDb  DeleteFaceDbRequest
     * @return DeleteFaceDbResponse
     */
    CompletableFuture<DeleteFaceDbResponse> deleteFaceDb(DeleteFaceDbRequest request);

    /**
     * @param request the request parameters of DeleteFaceEntity  DeleteFaceEntityRequest
     * @return DeleteFaceEntityResponse
     */
    CompletableFuture<DeleteFaceEntityResponse> deleteFaceEntity(DeleteFaceEntityRequest request);

    /**
     * @param request the request parameters of DeleteFaceImageTemplate  DeleteFaceImageTemplateRequest
     * @return DeleteFaceImageTemplateResponse
     */
    CompletableFuture<DeleteFaceImageTemplateResponse> deleteFaceImageTemplate(DeleteFaceImageTemplateRequest request);

    /**
     * @param request the request parameters of GenRealPersonVerificationToken  GenRealPersonVerificationTokenRequest
     * @return GenRealPersonVerificationTokenResponse
     */
    CompletableFuture<GenRealPersonVerificationTokenResponse> genRealPersonVerificationToken(GenRealPersonVerificationTokenRequest request);

    /**
     * @param request the request parameters of GetFaceEntity  GetFaceEntityRequest
     * @return GetFaceEntityResponse
     */
    CompletableFuture<GetFaceEntityResponse> getFaceEntity(GetFaceEntityRequest request);

    /**
     * @param request the request parameters of GetRealPersonVerificationResult  GetRealPersonVerificationResultRequest
     * @return GetRealPersonVerificationResultResponse
     */
    CompletableFuture<GetRealPersonVerificationResultResponse> getRealPersonVerificationResult(GetRealPersonVerificationResultRequest request);

    /**
     * @param request the request parameters of ListFaceDbs  ListFaceDbsRequest
     * @return ListFaceDbsResponse
     */
    CompletableFuture<ListFaceDbsResponse> listFaceDbs(ListFaceDbsRequest request);

    /**
     * @param request the request parameters of ListFaceEntities  ListFaceEntitiesRequest
     * @return ListFaceEntitiesResponse
     */
    CompletableFuture<ListFaceEntitiesResponse> listFaceEntities(ListFaceEntitiesRequest request);

    /**
     * @param request the request parameters of QueryFaceImageTemplate  QueryFaceImageTemplateRequest
     * @return QueryFaceImageTemplateResponse
     */
    CompletableFuture<QueryFaceImageTemplateResponse> queryFaceImageTemplate(QueryFaceImageTemplateRequest request);

    /**
     * @param request the request parameters of UpdateFaceEntity  UpdateFaceEntityRequest
     * @return UpdateFaceEntityResponse
     */
    CompletableFuture<UpdateFaceEntityResponse> updateFaceEntity(UpdateFaceEntityRequest request);

}

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

    CompletableFuture<AddFaceEntityResponse> addFaceEntity(AddFaceEntityRequest request);

    CompletableFuture<CreateFaceDbResponse> createFaceDb(CreateFaceDbRequest request);

    CompletableFuture<DeleteFaceResponse> deleteFace(DeleteFaceRequest request);

    CompletableFuture<DeleteFaceDbResponse> deleteFaceDb(DeleteFaceDbRequest request);

    CompletableFuture<DeleteFaceEntityResponse> deleteFaceEntity(DeleteFaceEntityRequest request);

    CompletableFuture<DeleteFaceImageTemplateResponse> deleteFaceImageTemplate(DeleteFaceImageTemplateRequest request);

    CompletableFuture<GenRealPersonVerificationTokenResponse> genRealPersonVerificationToken(GenRealPersonVerificationTokenRequest request);

    CompletableFuture<GetFaceEntityResponse> getFaceEntity(GetFaceEntityRequest request);

    CompletableFuture<GetRealPersonVerificationResultResponse> getRealPersonVerificationResult(GetRealPersonVerificationResultRequest request);

    CompletableFuture<ListFaceDbsResponse> listFaceDbs(ListFaceDbsRequest request);

    CompletableFuture<ListFaceEntitiesResponse> listFaceEntities(ListFaceEntitiesRequest request);

    CompletableFuture<QueryFaceImageTemplateResponse> queryFaceImageTemplate(QueryFaceImageTemplateRequest request);

    CompletableFuture<UpdateFaceEntityResponse> updateFaceEntity(UpdateFaceEntityRequest request);

}

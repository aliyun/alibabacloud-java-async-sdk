// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fcsandbox20260509.models.*;
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
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

    /**
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request);

    /**
     * @param request the request parameters of CreateVolume  CreateVolumeRequest
     * @return CreateVolumeResponse
     */
    CompletableFuture<CreateVolumeResponse> createVolume(CreateVolumeRequest request);

    /**
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

    /**
     * @param request the request parameters of DeleteQuota  DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    CompletableFuture<DeleteQuotaResponse> deleteQuota(DeleteQuotaRequest request);

    /**
     * @param request the request parameters of DeleteTeam  DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    CompletableFuture<DeleteTeamResponse> deleteTeam(DeleteTeamRequest request);

    /**
     * @param request the request parameters of DeleteVolume  DeleteVolumeRequest
     * @return DeleteVolumeResponse
     */
    CompletableFuture<DeleteVolumeResponse> deleteVolume(DeleteVolumeRequest request);

    /**
     * @param request the request parameters of DescribeApiKey  DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     */
    CompletableFuture<DescribeApiKeyResponse> describeApiKey(DescribeApiKeyRequest request);

    /**
     * @param request the request parameters of DescribeQuota  DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    CompletableFuture<DescribeQuotaResponse> describeQuota(DescribeQuotaRequest request);

    /**
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request);

    /**
     * @param request the request parameters of GetVolume  GetVolumeRequest
     * @return GetVolumeResponse
     */
    CompletableFuture<GetVolumeResponse> getVolume(GetVolumeRequest request);

    /**
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * @param request the request parameters of ListQuota  ListQuotaRequest
     * @return ListQuotaResponse
     */
    CompletableFuture<ListQuotaResponse> listQuota(ListQuotaRequest request);

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request);

    /**
     * @param request the request parameters of ListVolumes  ListVolumesRequest
     * @return ListVolumesResponse
     */
    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    /**
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * @param request the request parameters of UpdateApiKey  UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request);

    /**
     * @param request the request parameters of UpdateQuota  UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

    /**
     * @param request the request parameters of UpdateTeam  UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    CompletableFuture<UpdateTeamResponse> updateTeam(UpdateTeamRequest request);

    /**
     * @param request the request parameters of UpdateVolume  UpdateVolumeRequest
     * @return UpdateVolumeResponse
     */
    CompletableFuture<UpdateVolumeResponse> updateVolume(UpdateVolumeRequest request);

}

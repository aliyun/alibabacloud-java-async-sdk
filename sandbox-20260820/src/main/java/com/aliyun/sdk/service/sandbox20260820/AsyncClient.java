// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sandbox20260820.models.*;
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
     * @param request the request parameters of CreateCustomDomain  CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a template. If runtimeConfig.vpcBindings is null, it is treated as omitted. Inbound bindings are independent of the egress vpcConfig and API key source policy.</p>
     * 
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of CreateTemplateCache  CreateTemplateCacheRequest
     * @return CreateTemplateCacheResponse
     */
    CompletableFuture<CreateTemplateCacheResponse> createTemplateCache(CreateTemplateCacheRequest request);

    /**
     * @param request the request parameters of CreateVolume  CreateVolumeRequest
     * @return CreateVolumeResponse
     */
    CompletableFuture<CreateVolumeResponse> createVolume(CreateVolumeRequest request);

    /**
     * @param request the request parameters of CreateWarmPool  CreateWarmPoolRequest
     * @return CreateWarmPoolResponse
     */
    CompletableFuture<CreateWarmPoolResponse> createWarmPool(CreateWarmPoolRequest request);

    /**
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

    /**
     * @param request the request parameters of DeleteCustomDomain  DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     */
    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

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
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteTemplateCache  DeleteTemplateCacheRequest
     * @return DeleteTemplateCacheResponse
     */
    CompletableFuture<DeleteTemplateCacheResponse> deleteTemplateCache(DeleteTemplateCacheRequest request);

    /**
     * @param request the request parameters of DeleteVolume  DeleteVolumeRequest
     * @return DeleteVolumeResponse
     */
    CompletableFuture<DeleteVolumeResponse> deleteVolume(DeleteVolumeRequest request);

    /**
     * @param request the request parameters of DeleteWarmPool  DeleteWarmPoolRequest
     * @return DeleteWarmPoolResponse
     */
    CompletableFuture<DeleteWarmPoolResponse> deleteWarmPool(DeleteWarmPoolRequest request);

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
     * @param request the request parameters of DescribeTemplateCache  DescribeTemplateCacheRequest
     * @return DescribeTemplateCacheResponse
     */
    CompletableFuture<DescribeTemplateCacheResponse> describeTemplateCache(DescribeTemplateCacheRequest request);

    /**
     * @param request the request parameters of DescribeWarmPool  DescribeWarmPoolRequest
     * @return DescribeWarmPoolResponse
     */
    CompletableFuture<DescribeWarmPoolResponse> describeWarmPool(DescribeWarmPoolRequest request);

    /**
     * @param request the request parameters of GetCustomDomain  GetCustomDomainRequest
     * @return GetCustomDomainResponse
     */
    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Queries monitoring metrics at a specific point in time or retrieves trends over a period of time. You can query metrics by account, team, template, or sandbox. Each metric returns up to 200 time series, and a single request queries up to 100,000 nominal data points.</p>
     * 
     * @param request the request parameters of GetMetricData  GetMetricDataRequest
     * @return GetMetricDataResponse
     */
    CompletableFuture<GetMetricDataResponse> getMetricData(GetMetricDataRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the CPU, memory, and disk usage within a specified time range, including the disk usage of template caches and snapshots. You can view the cumulative usage for the interval, hourly usage, or daily usage. You can also group the results by team, template, snapshot, or sandbox plan.</p>
     * 
     * @param request the request parameters of GetResourceUsage  GetResourceUsageRequest
     * @return GetResourceUsageResponse
     */
    CompletableFuture<GetResourceUsageResponse> getResourceUsage(GetResourceUsageRequest request);

    /**
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

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
     * @param request the request parameters of ListCustomDomains  ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

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
     * @param request the request parameters of ListTemplateCache  ListTemplateCacheRequest
     * @return ListTemplateCacheResponse
     */
    CompletableFuture<ListTemplateCacheResponse> listTemplateCache(ListTemplateCacheRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of ListVolumes  ListVolumesRequest
     * @return ListVolumesResponse
     */
    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    /**
     * @param request the request parameters of ListWarmPools  ListWarmPoolsRequest
     * @return ListWarmPoolsResponse
     */
    CompletableFuture<ListWarmPoolsResponse> listWarmPools(ListWarmPoolsRequest request);

    /**
     * <b>description</b> :
     * <p>Rotates the credential value of an API key while retaining the original API key ID, IP address whitelist, IP address blacklist, and vpcBindings source policy. The apiKey field in the response returns the retained policy.</p>
     * 
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Updates an API key. IP blacklists and whitelists follow a paired replacement rule. If you commit a non-null array for one list and omit the other list or set it to null, the omitted list is cleared. If both lists are omitted or set to null, they are retained. The vpcBindings field is updated independently. If it is omitted or set to null, the current value is retained. A non-empty array replaces the current value, and an empty array [] clears it. Updates to IP addresses and VPCs do not clear each other. Source restrictions are retained if the source is null or if you update only other fields. An empty request body {} clears the IP address whitelist, IP blacklist, and VPC restrictions. You can also explicitly commit empty IP and VPC arrays to clear all source restrictions. To update the access policy, you must commit only the permissionPolicy and expectedPolicyVersion fields. Do not include other fields, including source fields with null values.</p>
     * 
     * @param request the request parameters of UpdateApiKey  UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request);

    /**
     * @param request the request parameters of UpdateCustomDomain  UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

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
     * <b>description</b> :
     * <p>Updates a template. For runtimeConfig.vpcBindings, you can omit the field or set it to null to retain the current bindings, provide a non-empty array to replace the entire list, or provide an empty array [] to clear the list. The new list takes effect when the new version is successfully built. Existing sandboxes continue to use the original configuration. If the build fails, the original effective version is retained.</p>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * @param request the request parameters of UpdateVolume  UpdateVolumeRequest
     * @return UpdateVolumeResponse
     */
    CompletableFuture<UpdateVolumeResponse> updateVolume(UpdateVolumeRequest request);

    /**
     * @param request the request parameters of UpdateWarmPool  UpdateWarmPoolRequest
     * @return UpdateWarmPoolResponse
     */
    CompletableFuture<UpdateWarmPoolResponse> updateWarmPool(UpdateWarmPoolRequest request);

}

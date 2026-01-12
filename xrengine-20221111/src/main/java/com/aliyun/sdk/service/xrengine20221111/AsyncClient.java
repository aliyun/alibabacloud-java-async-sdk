// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xrengine20221111.models.*;
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
     * @param request the request parameters of AcceptAgreement  AcceptAgreementRequest
     * @return AcceptAgreementResponse
     */
    CompletableFuture<AcceptAgreementResponse> acceptAgreement(AcceptAgreementRequest request);

    /**
     * @param request the request parameters of AddWhitelist  AddWhitelistRequest
     * @return AddWhitelistResponse
     */
    CompletableFuture<AddWhitelistResponse> addWhitelist(AddWhitelistRequest request);

    /**
     * @param request the request parameters of ApplyForTryOn  ApplyForTryOnRequest
     * @return ApplyForTryOnResponse
     */
    CompletableFuture<ApplyForTryOnResponse> applyForTryOn(ApplyForTryOnRequest request);

    /**
     * @param request the request parameters of AuthUser  AuthUserRequest
     * @return AuthUserResponse
     */
    CompletableFuture<AuthUserResponse> authUser(AuthUserRequest request);

    /**
     * @param request the request parameters of BatchCreateSvcMapBind  BatchCreateSvcMapBindRequest
     * @return BatchCreateSvcMapBindResponse
     */
    CompletableFuture<BatchCreateSvcMapBindResponse> batchCreateSvcMapBind(BatchCreateSvcMapBindRequest request);

    /**
     * @param request the request parameters of BatchDeleteSvcMapBind  BatchDeleteSvcMapBindRequest
     * @return BatchDeleteSvcMapBindResponse
     */
    CompletableFuture<BatchDeleteSvcMapBindResponse> batchDeleteSvcMapBind(BatchDeleteSvcMapBindRequest request);

    /**
     * @param request the request parameters of BuildProject  BuildProjectRequest
     * @return BuildProjectResponse
     */
    CompletableFuture<BuildProjectResponse> buildProject(BuildProjectRequest request);

    /**
     * @param request the request parameters of CreateLocationService  CreateLocationServiceRequest
     * @return CreateLocationServiceResponse
     */
    CompletableFuture<CreateLocationServiceResponse> createLocationService(CreateLocationServiceRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateSourcePolicy  CreateSourcePolicyRequest
     * @return CreateSourcePolicyResponse
     */
    CompletableFuture<CreateSourcePolicyResponse> createSourcePolicy(CreateSourcePolicyRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteSourceFile  DeleteSourceFileRequest
     * @return DeleteSourceFileResponse
     */
    CompletableFuture<DeleteSourceFileResponse> deleteSourceFile(DeleteSourceFileRequest request);

    /**
     * @param request the request parameters of DeployLocationTree  DeployLocationTreeRequest
     * @return DeployLocationTreeResponse
     */
    CompletableFuture<DeployLocationTreeResponse> deployLocationTree(DeployLocationTreeRequest request);

    /**
     * @param request the request parameters of FindSvcMapBind  FindSvcMapBindRequest
     * @return FindSvcMapBindResponse
     */
    CompletableFuture<FindSvcMapBindResponse> findSvcMapBind(FindSvcMapBindRequest request);

    /**
     * @param request the request parameters of GetApplyStatusForTryOn  GetApplyStatusForTryOnRequest
     * @return GetApplyStatusForTryOnResponse
     */
    CompletableFuture<GetApplyStatusForTryOnResponse> getApplyStatusForTryOn(GetApplyStatusForTryOnRequest request);

    /**
     * @param request the request parameters of GetArEditCommonMaterial  GetArEditCommonMaterialRequest
     * @return GetArEditCommonMaterialResponse
     */
    CompletableFuture<GetArEditCommonMaterialResponse> getArEditCommonMaterial(GetArEditCommonMaterialRequest request);

    /**
     * @param request the request parameters of GetArEditStsAuth  GetArEditStsAuthRequest
     * @return GetArEditStsAuthResponse
     */
    CompletableFuture<GetArEditStsAuthResponse> getArEditStsAuth(GetArEditStsAuthRequest request);

    /**
     * @param request the request parameters of GetArEditUgcMaterial  GetArEditUgcMaterialRequest
     * @return GetArEditUgcMaterialResponse
     */
    CompletableFuture<GetArEditUgcMaterialResponse> getArEditUgcMaterial(GetArEditUgcMaterialRequest request);

    /**
     * @param request the request parameters of GetProjectDataset  GetProjectDatasetRequest
     * @return GetProjectDatasetResponse
     */
    CompletableFuture<GetProjectDatasetResponse> getProjectDataset(GetProjectDatasetRequest request);

    /**
     * @param request the request parameters of InvokeSyncAlgorithm  InvokeSyncAlgorithmRequest
     * @return InvokeSyncAlgorithmResponse
     */
    CompletableFuture<InvokeSyncAlgorithmResponse> invokeSyncAlgorithm(InvokeSyncAlgorithmRequest request);

    /**
     * @param request the request parameters of ListAreaMap  ListAreaMapRequest
     * @return ListAreaMapResponse
     */
    CompletableFuture<ListAreaMapResponse> listAreaMap(ListAreaMapRequest request);

    /**
     * @param request the request parameters of ListClothTypes  ListClothTypesRequest
     * @return ListClothTypesResponse
     */
    CompletableFuture<ListClothTypesResponse> listClothTypes(ListClothTypesRequest request);

    /**
     * @param request the request parameters of ListClothes  ListClothesRequest
     * @return ListClothesResponse
     */
    CompletableFuture<ListClothesResponse> listClothes(ListClothesRequest request);

    /**
     * @param request the request parameters of ListHdr  ListHdrRequest
     * @return ListHdrResponse
     */
    CompletableFuture<ListHdrResponse> listHdr(ListHdrRequest request);

    /**
     * @param request the request parameters of ListLocationPaiImage  ListLocationPaiImageRequest
     * @return ListLocationPaiImageResponse
     */
    CompletableFuture<ListLocationPaiImageResponse> listLocationPaiImage(ListLocationPaiImageRequest request);

    /**
     * @param request the request parameters of ListLocationService  ListLocationServiceRequest
     * @return ListLocationServiceResponse
     */
    CompletableFuture<ListLocationServiceResponse> listLocationService(ListLocationServiceRequest request);

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * @param request the request parameters of ListProjectsByDependencyId  ListProjectsByDependencyIdRequest
     * @return ListProjectsByDependencyIdResponse
     */
    CompletableFuture<ListProjectsByDependencyIdResponse> listProjectsByDependencyId(ListProjectsByDependencyIdRequest request);

    /**
     * @param request the request parameters of ListSourceFile  ListSourceFileRequest
     * @return ListSourceFileResponse
     */
    CompletableFuture<ListSourceFileResponse> listSourceFile(ListSourceFileRequest request);

    /**
     * @param request the request parameters of ListWorkflow  ListWorkflowRequest
     * @return ListWorkflowResponse
     */
    CompletableFuture<ListWorkflowResponse> listWorkflow(ListWorkflowRequest request);

    /**
     * @param request the request parameters of Login  LoginRequest
     * @return LoginResponse
     */
    CompletableFuture<LoginResponse> login(LoginRequest request);

    /**
     * @param request the request parameters of LoginApp  LoginAppRequest
     * @return LoginAppResponse
     */
    CompletableFuture<LoginAppResponse> loginApp(LoginAppRequest request);

    /**
     * @param request the request parameters of PublishArEditProject  PublishArEditProjectRequest
     * @return PublishArEditProjectResponse
     */
    CompletableFuture<PublishArEditProjectResponse> publishArEditProject(PublishArEditProjectRequest request);

    /**
     * @param request the request parameters of PublishProject  PublishProjectRequest
     * @return PublishProjectResponse
     */
    CompletableFuture<PublishProjectResponse> publishProject(PublishProjectRequest request);

    /**
     * @param request the request parameters of QueryAreaMap  QueryAreaMapRequest
     * @return QueryAreaMapResponse
     */
    CompletableFuture<QueryAreaMapResponse> queryAreaMap(QueryAreaMapRequest request);

    /**
     * @param request the request parameters of QueryBuildBreakpoint  QueryBuildBreakpointRequest
     * @return QueryBuildBreakpointResponse
     */
    CompletableFuture<QueryBuildBreakpointResponse> queryBuildBreakpoint(QueryBuildBreakpointRequest request);

    /**
     * @param request the request parameters of QueryLocationService  QueryLocationServiceRequest
     * @return QueryLocationServiceResponse
     */
    CompletableFuture<QueryLocationServiceResponse> queryLocationService(QueryLocationServiceRequest request);

    /**
     * @param request the request parameters of QueryProjectBuildDetail  QueryProjectBuildDetailRequest
     * @return QueryProjectBuildDetailResponse
     */
    CompletableFuture<QueryProjectBuildDetailResponse> queryProjectBuildDetail(QueryProjectBuildDetailRequest request);

    /**
     * @param request the request parameters of QueryProjectDetail  QueryProjectDetailRequest
     * @return QueryProjectDetailResponse
     */
    CompletableFuture<QueryProjectDetailResponse> queryProjectDetail(QueryProjectDetailRequest request);

    /**
     * @param request the request parameters of RegisterUser  RegisterUserRequest
     * @return RegisterUserResponse
     */
    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserRequest request);

    /**
     * @param request the request parameters of ResumeLocationService  ResumeLocationServiceRequest
     * @return ResumeLocationServiceResponse
     */
    CompletableFuture<ResumeLocationServiceResponse> resumeLocationService(ResumeLocationServiceRequest request);

    /**
     * @param request the request parameters of SaveArEditProject  SaveArEditProjectRequest
     * @return SaveArEditProjectResponse
     */
    CompletableFuture<SaveArEditProjectResponse> saveArEditProject(SaveArEditProjectRequest request);

    /**
     * @param request the request parameters of SaveSource  SaveSourceRequest
     * @return SaveSourceResponse
     */
    CompletableFuture<SaveSourceResponse> saveSource(SaveSourceRequest request);

    /**
     * @param request the request parameters of SuspendLocationService  SuspendLocationServiceRequest
     * @return SuspendLocationServiceResponse
     */
    CompletableFuture<SuspendLocationServiceResponse> suspendLocationService(SuspendLocationServiceRequest request);

    /**
     * @param request the request parameters of UnPublishProject  UnPublishProjectRequest
     * @return UnPublishProjectResponse
     */
    CompletableFuture<UnPublishProjectResponse> unPublishProject(UnPublishProjectRequest request);

    /**
     * @param request the request parameters of UpdateLocationService  UpdateLocationServiceRequest
     * @return UpdateLocationServiceResponse
     */
    CompletableFuture<UpdateLocationServiceResponse> updateLocationService(UpdateLocationServiceRequest request);

    /**
     * @param request the request parameters of UpdateLocationTree  UpdateLocationTreeRequest
     * @return UpdateLocationTreeResponse
     */
    CompletableFuture<UpdateLocationTreeResponse> updateLocationTree(UpdateLocationTreeRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

}

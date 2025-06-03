// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.apds20220331.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "apds";
        this.version = "2022-03-31";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateMigrationGroup  CreateMigrationGroupRequest
     * @return CreateMigrationGroupResponse
     */
    @Override
    public CompletableFuture<CreateMigrationGroupResponse> createMigrationGroup(CreateMigrationGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMigrationGroup").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-group/save-migration-group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMigrationGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMigrationGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMigrationJob  CreateMigrationJobRequest
     * @return CreateMigrationJobResponse
     */
    @Override
    public CompletableFuture<CreateMigrationJobResponse> createMigrationJob(CreateMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/create-migration-jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePayOrderCallback  CreatePayOrderCallbackRequest
     * @return CreatePayOrderCallbackResponse
     */
    @Override
    public CompletableFuture<CreatePayOrderCallbackResponse> createPayOrderCallback(CreatePayOrderCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePayOrderCallback").setMethod(HttpMethod.POST).setPathRegex("/sys/user/pop/api/v1/payOrderCallback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePayOrderCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePayOrderCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRefund  CreateRefundRequest
     * @return CreateRefundResponse
     */
    @Override
    public CompletableFuture<CreateRefundResponse> createRefund(CreateRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRefund").setMethod(HttpMethod.POST).setPathRegex("/sys/user/pop/api/v1/refund").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSurveyJob  CreateSurveyJobRequest
     * @return CreateSurveyJobResponse
     */
    @Override
    public CompletableFuture<CreateSurveyJobResponse> createSurveyJob(CreateSurveyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSurveyJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/add-survey-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSurveyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSurveyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSurveyJobOffline  CreateSurveyJobOfflineRequest
     * @return CreateSurveyJobOfflineResponse
     */
    @Override
    public CompletableFuture<CreateSurveyJobOfflineResponse> createSurveyJobOffline(CreateSurveyJobOfflineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSurveyJobOffline").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/add-import-survey-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSurveyJobOfflineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSurveyJobOfflineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMigrationJob  DeleteMigrationJobRequest
     * @return DeleteMigrationJobResponse
     */
    @Override
    public CompletableFuture<DeleteMigrationJobResponse> deleteMigrationJob(DeleteMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/remove-migration-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOssFile  DeleteOssFileRequest
     * @return DeleteOssFileResponse
     */
    @Override
    public CompletableFuture<DeleteOssFileResponse> deleteOssFile(DeleteOssFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOssFile").setMethod(HttpMethod.POST).setPathRegex("/okss-services/file-job/delete-file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOssFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOssFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSurveyJob  DeleteSurveyJobRequest
     * @return DeleteSurveyJobResponse
     */
    @Override
    public CompletableFuture<DeleteSurveyJobResponse> deleteSurveyJob(DeleteSurveyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSurveyJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/delete-survey-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSurveyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSurveyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSurveyResources  DeleteSurveyResourcesRequest
     * @return DeleteSurveyResourcesResponse
     */
    @Override
    public CompletableFuture<DeleteSurveyResourcesResponse> deleteSurveyResources(DeleteSurveyResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSurveyResources").setMethod(HttpMethod.POST).setPathRegex("/okss-services/confirm-resource/destroy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSurveyResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSurveyResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobConfig  DescribeMigrationJobConfigRequest
     * @return DescribeMigrationJobConfigResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobConfigResponse> describeMigrationJobConfig(DescribeMigrationJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeMigrationJobConfig").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/describe-migration-job-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobCount  DescribeMigrationJobCountRequest
     * @return DescribeMigrationJobCountResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobCountResponse> describeMigrationJobCount(DescribeMigrationJobCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeMigrationJobCount").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/count-migration-jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOssSts  DescribeOssStsRequest
     * @return DescribeOssStsResponse
     */
    @Override
    public CompletableFuture<DescribeOssStsResponse> describeOssSts(DescribeOssStsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeOssSts").setMethod(HttpMethod.POST).setPathRegex("/okss-services/file-job/sts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOssStsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOssStsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSummaryByStatus  DescribeSummaryByStatusRequest
     * @return DescribeSummaryByStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSummaryByStatusResponse> describeSummaryByStatus(DescribeSummaryByStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSummaryByStatus").setMethod(HttpMethod.POST).setPathRegex("/okss-services/summary/summary-by-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSummaryByStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSummaryByStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSummaryByStatusAndGroup  DescribeSummaryByStatusAndGroupRequest
     * @return DescribeSummaryByStatusAndGroupResponse
     */
    @Override
    public CompletableFuture<DescribeSummaryByStatusAndGroupResponse> describeSummaryByStatusAndGroup(DescribeSummaryByStatusAndGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSummaryByStatusAndGroup").setMethod(HttpMethod.POST).setPathRegex("/okss-services/summary/summary-by-status-and-region").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSummaryByStatusAndGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSummaryByStatusAndGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSurveyJob  DescribeSurveyJobRequest
     * @return DescribeSurveyJobResponse
     */
    @Override
    public CompletableFuture<DescribeSurveyJobResponse> describeSurveyJob(DescribeSurveyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSurveyJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/query-survey-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSurveyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSurveyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSurveyJobCount  DescribeSurveyJobCountRequest
     * @return DescribeSurveyJobCountResponse
     */
    @Override
    public CompletableFuture<DescribeSurveyJobCountResponse> describeSurveyJobCount(DescribeSurveyJobCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSurveyJobCount").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/count-survey-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSurveyJobCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSurveyJobCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSurveyResourceTag  DescribeSurveyResourceTagRequest
     * @return DescribeSurveyResourceTagResponse
     */
    @Override
    public CompletableFuture<DescribeSurveyResourceTagResponse> describeSurveyResourceTag(DescribeSurveyResourceTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSurveyResourceTag").setMethod(HttpMethod.POST).setPathRegex("/okss-services/confirm-resource/get-resource-tag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSurveyResourceTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSurveyResourceTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSurveyTemplate  DescribeSurveyTemplateRequest
     * @return DescribeSurveyTemplateResponse
     */
    @Override
    public CompletableFuture<DescribeSurveyTemplateResponse> describeSurveyTemplate(DescribeSurveyTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSurveyTemplate").setMethod(HttpMethod.POST).setPathRegex("/okss-services/survey-template/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSurveyTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSurveyTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTableMetaInfo  GetTableMetaInfoRequest
     * @return GetTableMetaInfoResponse
     */
    @Override
    public CompletableFuture<GetTableMetaInfoResponse> getTableMetaInfo(GetTableMetaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTableMetaInfo").setMethod(HttpMethod.POST).setPathRegex("/api/bigdata/sql-translator/open/single/get-table-info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableMetaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableMetaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskDetail  GetTaskDetailRequest
     * @return GetTaskDetailResponse
     */
    @Override
    public CompletableFuture<GetTaskDetailResponse> getTaskDetail(GetTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTaskDetail").setMethod(HttpMethod.GET).setPathRegex("/api/bigdata/jobMigrate/sqlTranslator/task/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppDownloadHistory  ListAppDownloadHistoryRequest
     * @return ListAppDownloadHistoryResponse
     */
    @Override
    public CompletableFuture<ListAppDownloadHistoryResponse> listAppDownloadHistory(ListAppDownloadHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppDownloadHistory").setMethod(HttpMethod.POST).setPathRegex("/abm/app/manager/api/v1/fetchAppDownloadHistory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppDownloadHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppDownloadHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMigrationJobs  ListMigrationJobsRequest
     * @return ListMigrationJobsResponse
     */
    @Override
    public CompletableFuture<ListMigrationJobsResponse> listMigrationJobs(ListMigrationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMigrationJobs").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/describe-migration-jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMigrationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMigrationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyJobDownLoadJobs  ListSurveyJobDownLoadJobsRequest
     * @return ListSurveyJobDownLoadJobsResponse
     */
    @Override
    public CompletableFuture<ListSurveyJobDownLoadJobsResponse> listSurveyJobDownLoadJobs(ListSurveyJobDownLoadJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyJobDownLoadJobs").setMethod(HttpMethod.POST).setPathRegex("/okss-services/file-job/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyJobDownLoadJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyJobDownLoadJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyJobs  ListSurveyJobsRequest
     * @return ListSurveyJobsResponse
     */
    @Override
    public CompletableFuture<ListSurveyJobsResponse> listSurveyJobs(ListSurveyJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyJobs").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/query-survey-jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyResourceByMigrationGroups  ListSurveyResourceByMigrationGroupsRequest
     * @return ListSurveyResourceByMigrationGroupsResponse
     */
    @Override
    public CompletableFuture<ListSurveyResourceByMigrationGroupsResponse> listSurveyResourceByMigrationGroups(ListSurveyResourceByMigrationGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyResourceByMigrationGroups").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-group/get-survey-resource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyResourceByMigrationGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyResourceByMigrationGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyResourceConnections  ListSurveyResourceConnectionsRequest
     * @return ListSurveyResourceConnectionsResponse
     */
    @Override
    public CompletableFuture<ListSurveyResourceConnectionsResponse> listSurveyResourceConnections(ListSurveyResourceConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyResourceConnections").setMethod(HttpMethod.POST).setPathRegex("/okss-services/resource-connects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyResourceConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyResourceConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyResourceTypes  ListSurveyResourceTypesRequest
     * @return ListSurveyResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListSurveyResourceTypesResponse> listSurveyResourceTypes(ListSurveyResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyResourceTypes").setMethod(HttpMethod.POST).setPathRegex("/okss-services/winback/query-resource-type").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSurveyResourcesDetail  ListSurveyResourcesDetailRequest
     * @return ListSurveyResourcesDetailResponse
     */
    @Override
    public CompletableFuture<ListSurveyResourcesDetailResponse> listSurveyResourcesDetail(ListSurveyResourcesDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSurveyResourcesDetail").setMethod(HttpMethod.POST).setPathRegex("/okss-services/survey-detail/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSurveyResourcesDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSurveyResourcesDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PopCreateTask  PopCreateTaskRequest
     * @return PopCreateTaskResponse
     */
    @Override
    public CompletableFuture<PopCreateTaskResponse> popCreateTask(PopCreateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PopCreateTask").setMethod(HttpMethod.POST).setPathRegex("/api/bigdata/jobMigrate/sqlTranslator/task/popAdd").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PopCreateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PopCreateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PopDownloadTemplate  PopDownloadTemplateRequest
     * @return PopDownloadTemplateResponse
     */
    @Override
    public CompletableFuture<PopDownloadTemplateResponse> popDownloadTemplate(PopDownloadTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PopDownloadTemplate").setMethod(HttpMethod.GET).setPathRegex("/api/bigdata/jobMigrate/sqlTranslator/task/popDownload/TableNameMappingTemplate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PopDownloadTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PopDownloadTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PopEditTask  PopEditTaskRequest
     * @return PopEditTaskResponse
     */
    @Override
    public CompletableFuture<PopEditTaskResponse> popEditTask(PopEditTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PopEditTask").setMethod(HttpMethod.POST).setPathRegex("/api/bigdata/jobMigrate/sqlTranslator/task/popEdit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PopEditTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PopEditTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecoverMigrationJob  RecoverMigrationJobRequest
     * @return RecoverMigrationJobResponse
     */
    @Override
    public CompletableFuture<RecoverMigrationJobResponse> recoverMigrationJob(RecoverMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecoverMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/recover-migration-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SingleScriptSyncTranslate  SingleScriptSyncTranslateRequest
     * @return SingleScriptSyncTranslateResponse
     */
    @Override
    public CompletableFuture<SingleScriptSyncTranslateResponse> singleScriptSyncTranslate(SingleScriptSyncTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SingleScriptSyncTranslate").setMethod(HttpMethod.POST).setPathRegex("/api/bigdata/sql-translator/open/single/translate-sync").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SingleScriptSyncTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SingleScriptSyncTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopSyncMigrationJob  StopSyncMigrationJobRequest
     * @return StopSyncMigrationJobResponse
     */
    @Override
    public CompletableFuture<StopSyncMigrationJobResponse> stopSyncMigrationJob(StopSyncMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopSyncMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/unsync-migration-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopSyncMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopSyncMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncMigrationJob  SyncMigrationJobRequest
     * @return SyncMigrationJobResponse
     */
    @Override
    public CompletableFuture<SyncMigrationJobResponse> syncMigrationJob(SyncMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/okss-services/migration-job/sync-migration-job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePushApp  UpdatePushAppRequest
     * @return UpdatePushAppResponse
     */
    @Override
    public CompletableFuture<UpdatePushAppResponse> updatePushApp(UpdatePushAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePushApp").setMethod(HttpMethod.POST).setPathRegex("/abm/app/manager/api/v1/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePushAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePushAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}

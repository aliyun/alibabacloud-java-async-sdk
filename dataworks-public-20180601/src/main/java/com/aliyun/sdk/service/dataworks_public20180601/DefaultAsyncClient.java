// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dataworks_public20180601.models.*;
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
        this.product = "dataworks-public";
        this.version = "2018-06-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateManualDag  CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    @Override
    public CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateManualDag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateManualDagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateManualDagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEmrHiveTable  DescribeEmrHiveTableRequest
     * @return DescribeEmrHiveTableResponse
     */
    @Override
    public CompletableFuture<DescribeEmrHiveTableResponse> describeEmrHiveTable(DescribeEmrHiveTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEmrHiveTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEmrHiveTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEmrHiveTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceApiAuthMapContext  GetDataServiceApiAuthMapContextRequest
     * @return GetDataServiceApiAuthMapContextResponse
     */
    @Override
    public CompletableFuture<GetDataServiceApiAuthMapContextResponse> getDataServiceApiAuthMapContext(GetDataServiceApiAuthMapContextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceApiAuthMapContext").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceApiAuthMapContextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceApiAuthMapContextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceApiContext  GetDataServiceApiContextRequest
     * @return GetDataServiceApiContextResponse
     */
    @Override
    public CompletableFuture<GetDataServiceApiContextResponse> getDataServiceApiContext(GetDataServiceApiContextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceApiContext").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceApiContextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceApiContextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceConnection  GetDataServiceConnectionRequest
     * @return GetDataServiceConnectionResponse
     */
    @Override
    public CompletableFuture<GetDataServiceConnectionResponse> getDataServiceConnection(GetDataServiceConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceConnection").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceContextUpdateEvent  GetDataServiceContextUpdateEventRequest
     * @return GetDataServiceContextUpdateEventResponse
     */
    @Override
    public CompletableFuture<GetDataServiceContextUpdateEventResponse> getDataServiceContextUpdateEvent(GetDataServiceContextUpdateEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceContextUpdateEvent").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceContextUpdateEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceContextUpdateEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataServiceFunction  GetDataServiceFunctionRequest
     * @return GetDataServiceFunctionResponse
     */
    @Override
    public CompletableFuture<GetDataServiceFunctionResponse> getDataServiceFunction(GetDataServiceFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataServiceFunction").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataServiceFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataServiceFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSwitchValue  GetSwitchValueRequest
     * @return GetSwitchValueResponse
     */
    @Override
    public CompletableFuture<GetSwitchValueResponse> getSwitchValue(GetSwitchValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSwitchValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSwitchValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSwitchValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTimeMachineTask  GetTimeMachineTaskRequest
     * @return GetTimeMachineTaskResponse
     */
    @Override
    public CompletableFuture<GetTimeMachineTaskResponse> getTimeMachineTask(GetTimeMachineTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTimeMachineTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTimeMachineTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTimeMachineTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEmrHiveAuditLogs  ListEmrHiveAuditLogsRequest
     * @return ListEmrHiveAuditLogsResponse
     */
    @Override
    public CompletableFuture<ListEmrHiveAuditLogsResponse> listEmrHiveAuditLogs(ListEmrHiveAuditLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEmrHiveAuditLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEmrHiveAuditLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEmrHiveAuditLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEmrHiveDatabases  ListEmrHiveDatabasesRequest
     * @return ListEmrHiveDatabasesResponse
     */
    @Override
    public CompletableFuture<ListEmrHiveDatabasesResponse> listEmrHiveDatabases(ListEmrHiveDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEmrHiveDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEmrHiveDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEmrHiveDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEmrHiveTables  ListEmrHiveTablesRequest
     * @return ListEmrHiveTablesResponse
     */
    @Override
    public CompletableFuture<ListEmrHiveTablesResponse> listEmrHiveTables(ListEmrHiveTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEmrHiveTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEmrHiveTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEmrHiveTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGovernanceIssueDataServiceAPIs  ListGovernanceIssueDataServiceAPIsRequest
     * @return ListGovernanceIssueDataServiceAPIsResponse
     */
    @Override
    public CompletableFuture<ListGovernanceIssueDataServiceAPIsResponse> listGovernanceIssueDataServiceAPIs(ListGovernanceIssueDataServiceAPIsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGovernanceIssueDataServiceAPIs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGovernanceIssueDataServiceAPIsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGovernanceIssueDataServiceAPIsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGovernanceIssueTables  ListGovernanceIssueTablesRequest
     * @return ListGovernanceIssueTablesResponse
     */
    @Override
    public CompletableFuture<ListGovernanceIssueTablesResponse> listGovernanceIssueTables(ListGovernanceIssueTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGovernanceIssueTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGovernanceIssueTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGovernanceIssueTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGovernanceIssueTasks  ListGovernanceIssueTasksRequest
     * @return ListGovernanceIssueTasksResponse
     */
    @Override
    public CompletableFuture<ListGovernanceIssueTasksResponse> listGovernanceIssueTasks(ListGovernanceIssueTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGovernanceIssueTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGovernanceIssueTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGovernanceIssueTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGovernanceRules  ListGovernanceRulesRequest
     * @return ListGovernanceRulesResponse
     */
    @Override
    public CompletableFuture<ListGovernanceRulesResponse> listGovernanceRules(ListGovernanceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGovernanceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGovernanceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGovernanceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHiveColumnLineages  ListHiveColumnLineagesRequest
     * @return ListHiveColumnLineagesResponse
     */
    @Override
    public CompletableFuture<ListHiveColumnLineagesResponse> listHiveColumnLineages(ListHiveColumnLineagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHiveColumnLineages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHiveColumnLineagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHiveColumnLineagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHiveTableLineages  ListHiveTableLineagesRequest
     * @return ListHiveTableLineagesResponse
     */
    @Override
    public CompletableFuture<ListHiveTableLineagesResponse> listHiveTableLineages(ListHiveTableLineagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHiveTableLineages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHiveTableLineagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHiveTableLineagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTablePartitions  ListTablePartitionsRequest
     * @return ListTablePartitionsResponse
     */
    @Override
    public CompletableFuture<ListTablePartitionsResponse> listTablePartitions(ListTablePartitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTablePartitions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablePartitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablePartitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenDataWorksStandardService  OpenDataWorksStandardServiceRequest
     * @return OpenDataWorksStandardServiceResponse
     */
    @Override
    public CompletableFuture<OpenDataWorksStandardServiceResponse> openDataWorksStandardService(OpenDataWorksStandardServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenDataWorksStandardService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenDataWorksStandardServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenDataWorksStandardServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchManualDagNodeInstance  SearchManualDagNodeInstanceRequest
     * @return SearchManualDagNodeInstanceResponse
     */
    @Override
    public CompletableFuture<SearchManualDagNodeInstanceResponse> searchManualDagNodeInstance(SearchManualDagNodeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchManualDagNodeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchManualDagNodeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchManualDagNodeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendTaskMetaCallback  SendTaskMetaCallbackRequest
     * @return SendTaskMetaCallbackResponse
     */
    @Override
    public CompletableFuture<SendTaskMetaCallbackResponse> sendTaskMetaCallback(SendTaskMetaCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendTaskMetaCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendTaskMetaCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendTaskMetaCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSwitchValue  SetSwitchValueRequest
     * @return SetSwitchValueResponse
     */
    @Override
    public CompletableFuture<SetSwitchValueResponse> setSwitchValue(SetSwitchValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSwitchValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSwitchValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSwitchValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartCollectQuality  StartCollectQualityRequest
     * @return StartCollectQualityResponse
     */
    @Override
    public CompletableFuture<StartCollectQualityResponse> startCollectQuality(StartCollectQualityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartCollectQuality").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCollectQualityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCollectQualityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDoCheckQuality  StartDoCheckQualityRequest
     * @return StartDoCheckQualityResponse
     */
    @Override
    public CompletableFuture<StartDoCheckQualityResponse> startDoCheckQuality(StartDoCheckQualityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDoCheckQuality").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDoCheckQualityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDoCheckQualityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTaskQuality  StartTaskQualityRequest
     * @return StartTaskQualityResponse
     */
    @Override
    public CompletableFuture<StartTaskQualityResponse> startTaskQuality(StartTaskQualityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTaskQuality").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTaskQualityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTaskQualityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerDataLoader  TriggerDataLoaderRequest
     * @return TriggerDataLoaderResponse
     */
    @Override
    public CompletableFuture<TriggerDataLoaderResponse> triggerDataLoader(TriggerDataLoaderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerDataLoader").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerDataLoaderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerDataLoaderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerTimeMachineTask  TriggerTimeMachineTaskRequest
     * @return TriggerTimeMachineTaskResponse
     */
    @Override
    public CompletableFuture<TriggerTimeMachineTaskResponse> triggerTimeMachineTask(TriggerTimeMachineTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerTimeMachineTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerTimeMachineTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerTimeMachineTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}

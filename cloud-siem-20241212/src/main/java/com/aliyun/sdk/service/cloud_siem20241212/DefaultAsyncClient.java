// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloud_siem20241212.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "cloud-siem";
        this.version = "2024-12-12";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Cancels a specified security operations Agent conversation turn. Before calling this operation, use CreateCopilotConversation to create a session and obtain the ConversationId, then use CreateCopilotChat to initiate a streaming conversation and obtain the TurnId from the response.</p>
     * 
     * @param request the request parameters of CancelCopilotTurn  CancelCopilotTurnRequest
     * @return CancelCopilotTurnResponse
     */
    @Override
    public CompletableFuture<CancelCopilotTurnResponse> cancelCopilotTurn(CancelCopilotTurnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCopilotTurn").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/turn/cancel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCopilotTurnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCopilotTurnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Checks the execution status of a specified upgrade item. You must specify the upgrade item ID (UpgradeItemId) when calling this operation. The response includes the checkpoint status (CheckStatus) and check result (CheckResult) of the upgrade item.</p>
     * 
     * @param request the request parameters of CheckUpgradeItem  CheckUpgradeItemRequest
     * @return CheckUpgradeItemResponse
     */
    @Override
    public CompletableFuture<CheckUpgradeItemResponse> checkUpgradeItem(CheckUpgradeItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckUpgradeItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckUpgradeItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckUpgradeItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. Refer to the helper class in the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for configuration examples.</p>
     * 
     * @param request the request parameters of CreateAutoDisposeConfig  CreateAutoDisposeConfigRequest
     * @return CreateAutoDisposeConfigResponse
     */
    @Override
    public CompletableFuture<CreateAutoDisposeConfigResponse> createAutoDisposeConfig(CreateAutoDisposeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoDisposeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoDisposeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoDisposeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a security operations Agent conversation and returns results as an SSE event stream.</p>
     * 
     * @param request the request parameters of CreateCopilotChat  CreateCopilotChatRequest
     * @return CreateCopilotChatResponse
     */
    @Override
    public CompletableFuture<CreateCopilotChatResponse> createCopilotChat(CreateCopilotChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCopilotChat").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/chat/completions/create").setBodyType(BodyType.STRING).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCopilotChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCopilotChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> createCopilotChatWithResponseIterable(CreateCopilotChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CreateCopilotChat").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/chat/completions/create").setBodyType(BodyType.STRING).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        CreateCopilotChatResponseBodyIterator iterator = CreateCopilotChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>Creates a security operations Agent session.</p>
     * 
     * @param request the request parameters of CreateCopilotConversation  CreateCopilotConversationRequest
     * @return CreateCopilotConversationResponse
     */
    @Override
    public CompletableFuture<CreateCopilotConversationResponse> createCopilotConversation(CreateCopilotConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCopilotConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/conversation/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCopilotConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCopilotConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an access policy to ingest log data from a data source into threat analysis.
     * Before you begin:</p>
     * <ol>
     * <li>Call the CreateDataSource operation to create a data source and obtain the data source ID (DataSourceId).</li>
     * <li>Call the CreateNormalizationRule operation to create a normalization rule and obtain the normalization rule ID (NormalizationRuleId).</li>
     * </ol>
     * 
     * @param request the request parameters of CreateDataIngestion  CreateDataIngestionRequest
     * @return CreateDataIngestionResponse
     */
    @Override
    public CompletableFuture<CreateDataIngestionResponse> createDataIngestion(CreateDataIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataSet  CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    @Override
    public CompletableFuture<CreateDataSetResponse> createDataSet(CreateDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON object. For a configuration example, see the supporting tool class in the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">demo</a>.</p>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDetectionRule  CreateDetectionRuleRequest
     * @return CreateDetectionRuleResponse
     */
    @Override
    public CompletableFuture<CreateDetectionRuleResponse> createDetectionRule(CreateDetectionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDetectionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDetectionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDetectionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExportTask  CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    @Override
    public CompletableFuture<CreateExportTaskResponse> createExportTask(CreateExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateLogStore  CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    @Override
    public CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLogStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateNormalizationRule  CreateNormalizationRuleRequest
     * @return CreateNormalizationRuleResponse
     */
    @Override
    public CompletableFuture<CreateNormalizationRuleResponse> createNormalizationRule(CreateNormalizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNormalizationRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNormalizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNormalizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, we provide a supporting utility class. Refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateNormalizationSchema  CreateNormalizationSchemaRequest
     * @return CreateNormalizationSchemaResponse
     */
    @Override
    public CompletableFuture<CreateNormalizationSchemaResponse> createNormalizationSchema(CreateNormalizationSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNormalizationSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNormalizationSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNormalizationSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex set of JSON Configurations. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    @Override
    public CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, we provide a supporting tool with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateResponseRule  CreateResponseRuleRequest
     * @return CreateResponseRuleResponse
     */
    @Override
    public CompletableFuture<CreateResponseRuleResponse> createResponseRule(CreateResponseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResponseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResponseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResponseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a vendor.
     * Before you begin: You must have purchased the cloud-siem service and have a valid order before calling this operation. If you have not purchased the service or your order has expired, the API returns &quot;The order doesn\&quot;t exist or is expired.&quot; Purchase or renew the service before calling this operation.</p>
     * 
     * @param request the request parameters of CreateVendor  CreateVendorRequest
     * @return CreateVendorResponse
     */
    @Override
    public CompletableFuture<CreateVendorResponse> createVendor(CreateVendorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVendor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVendorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVendorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are sent only between 08:00 and 20:00. Each user can receive a maximum of two notifications per day.</p>
     * 
     * @param request the request parameters of DeleteDataIngestion  DeleteDataIngestionRequest
     * @return DeleteDataIngestionResponse
     */
    @Override
    public CompletableFuture<DeleteDataIngestionResponse> deleteDataIngestion(DeleteDataIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    @Override
    public CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataSetRecord  DeleteDataSetRecordRequest
     * @return DeleteDataSetRecordResponse
     */
    @Override
    public CompletableFuture<DeleteDataSetRecordResponse> deleteDataSetRecord(DeleteDataSetRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSetRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSetRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSetRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified data source.
     * Before you begin: The calling account must have a valid SIEM data source management value-added feature subscription.</p>
     * 
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDetectionRule  DeleteDetectionRuleRequest
     * @return DeleteDetectionRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDetectionRuleResponse> deleteDetectionRule(DeleteDetectionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDetectionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDetectionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDetectionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteLogStore  DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    @Override
    public CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLogStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class that contains configuration examples is provided. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteNormalizationRule  DeleteNormalizationRuleRequest
     * @return DeleteNormalizationRuleResponse
     */
    @Override
    public CompletableFuture<DeleteNormalizationRuleResponse> deleteNormalizationRule(DeleteNormalizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNormalizationRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNormalizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNormalizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class with configuration examples is provided. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteNormalizationRuleVersion  DeleteNormalizationRuleVersionRequest
     * @return DeleteNormalizationRuleVersionResponse
     */
    @Override
    public CompletableFuture<DeleteNormalizationRuleVersionResponse> deleteNormalizationRuleVersion(DeleteNormalizationRuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNormalizationRuleVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNormalizationRuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNormalizationRuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteNormalizationSchema  DeleteNormalizationSchemaRequest
     * @return DeleteNormalizationSchemaResponse
     */
    @Override
    public CompletableFuture<DeleteNormalizationSchemaResponse> deleteNormalizationSchema(DeleteNormalizationSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNormalizationSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNormalizationSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNormalizationSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class is provided to help you create the configuration. For an example, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    @Override
    public CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of DeleteResponseRule  DeleteResponseRuleRequest
     * @return DeleteResponseRuleResponse
     */
    @Override
    public CompletableFuture<DeleteResponseRuleResponse> deleteResponseRule(DeleteResponseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteResponseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResponseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResponseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day. These notifications are sent only between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of DeleteVendor  DeleteVendorRequest
     * @return DeleteVendorResponse
     */
    @Override
    public CompletableFuture<DeleteVendorResponse> deleteVendor(DeleteVendorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVendor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVendorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVendorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of DisableDataIngestion  DisableDataIngestionRequest
     * @return DisableDataIngestionResponse
     */
    @Override
    public CompletableFuture<DisableDataIngestionResponse> disableDataIngestion(DisableDataIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDataIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDataIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDataIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notification frequency is limited to a maximum of two per user per day. Notifications are sent only between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of EnableDataIngestion  EnableDataIngestionRequest
     * @return EnableDataIngestionResponse
     */
    @Override
    public CompletableFuture<EnableDataIngestionResponse> enableDataIngestion(EnableDataIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDataIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDataIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDataIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ExecuteAutoDisposeRecords  ExecuteAutoDisposeRecordsRequest
     * @return ExecuteAutoDisposeRecordsResponse
     */
    @Override
    public CompletableFuture<ExecuteAutoDisposeRecordsResponse> executeAutoDisposeRecords(ExecuteAutoDisposeRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteAutoDisposeRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAutoDisposeRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAutoDisposeRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, a utility class is provided. For specific configuration examples, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ExecuteLogQuery  ExecuteLogQueryRequest
     * @return ExecuteLogQueryResponse
     */
    @Override
    public CompletableFuture<ExecuteLogQueryResponse> executeLogQuery(ExecuteLogQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteLogQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteLogQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteLogQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Before calling this operation, ensure that a pending upgrade order exists (created through the Alibaba Cloud Management Console or a business flow).</li>
     * <li>Call ListUpgradeItems to view the items that can be upgraded, and call CheckUpgradeItem to perform a dry run.</li>
     * <li>If no items can be upgraded, the API returns an error.</li>
     * </ol>
     * 
     * @param request the request parameters of ExecuteUpgrade  ExecuteUpgradeRequest
     * @return ExecuteUpgradeResponse
     */
    @Override
    public CompletableFuture<ExecuteUpgradeResponse> executeUpgrade(ExecuteUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteUpgrade").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetAlert  GetAlertRequest
     * @return GetAlertResponse
     */
    @Override
    public CompletableFuture<GetAlertResponse> getAlert(GetAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <code>JsonConfig</code> input parameter uses a complex JSON structure. Refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for a helper utility and configuration examples.</p>
     * 
     * @param request the request parameters of GetAutoDisposeConfig  GetAutoDisposeConfigRequest
     * @return GetAutoDisposeConfigResponse
     */
    @Override
    public CompletableFuture<GetAutoDisposeConfigResponse> getAutoDisposeConfig(GetAutoDisposeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoDisposeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoDisposeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoDisposeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified security operations agent session.</p>
     * 
     * @param request the request parameters of GetCopilotConversation  GetCopilotConversationRequest
     * @return GetCopilotConversationResponse
     */
    @Override
    public CompletableFuture<GetCopilotConversationResponse> getCopilotConversation(GetCopilotConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCopilotConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/conversation/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified Security Operations agent conversation turn. Before calling this operation, call CreateCopilotConversation to create a session and obtain the ConversationId, and then call CreateCopilotChat to initiate a conversation and obtain the TurnId.</p>
     * 
     * @param request the request parameters of GetCopilotTurn  GetCopilotTurnRequest
     * @return GetCopilotTurnResponse
     */
    @Override
    public CompletableFuture<GetCopilotTurnResponse> getCopilotTurn(GetCopilotTurnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCopilotTurn").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/turn/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotTurnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotTurnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the security operations agent conversation turn based on the client message ID. Before calling this operation, call CreateCopilotConversation to create a conversation and then call CreateCopilotChat to initiate a conversation. The ClientMessageId is specified by the client when initiating the conversation.</p>
     * 
     * @param request the request parameters of GetCopilotTurnByClientMessageId  GetCopilotTurnByClientMessageIdRequest
     * @return GetCopilotTurnByClientMessageIdResponse
     */
    @Override
    public CompletableFuture<GetCopilotTurnByClientMessageIdResponse> getCopilotTurnByClientMessageId(GetCopilotTurnByClientMessageIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCopilotTurnByClientMessageId").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/turn/get-by-client-message-id").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotTurnByClientMessageIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotTurnByClientMessageIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetDataBatchIngestion  GetDataBatchIngestionRequest
     * @return GetDataBatchIngestionResponse
     */
    @Override
    public CompletableFuture<GetDataBatchIngestionResponse> getDataBatchIngestion(GetDataBatchIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataBatchIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataBatchIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataBatchIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the log storage region, project, capacity, Logstore, and multi-account delivery settings of the current account. Before you update the multi-account configuration, read Data.DeliverySettings.ConfigurationVersion and TargetProject, and pass them to the write operation as is. The capacity is measured in GB, and the TTL is measured in days. The account UID in DeliverySettings is a string. If the system fails to read the optional delivery settings, the cause is returned in DeliverySettingsError, and other storage information is still returned.</p>
     * 
     * @param request the request parameters of GetDataStorage  GetDataStorageRequest
     * @return GetDataStorageResponse
     */
    @Override
    public CompletableFuture<GetDataStorageResponse> getDataStorage(GetDataStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDetectionStatistic  GetDetectionStatisticRequest
     * @return GetDetectionStatisticResponse
     */
    @Override
    public CompletableFuture<GetDetectionStatisticResponse> getDetectionStatistic(GetDetectionStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDetectionStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDetectionStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDetectionStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExportTask  GetExportTaskRequest
     * @return GetExportTaskResponse
     */
    @Override
    public CompletableFuture<GetExportTaskResponse> getExportTask(GetExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetExportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetIncident  GetIncidentRequest
     * @return GetIncidentResponse
     */
    @Override
    public CompletableFuture<GetIncidentResponse> getIncident(GetIncidentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIncident").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIncidentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIncidentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the AI investigation results that have been generated for a specified incident. You can call ListIncidentInvestigations to obtain the report ID or display ID first, and then call this operation to query the details.
     * The query priority is as follows:</p>
     * <ol>
     * <li>If IncidentInvestigationId is specified, the query is performed by report ID.</li>
     * <li>If the report ID is not specified but IncidentInvestigationDisplayId is specified, the query is performed by display ID.</li>
     * <li>If neither identifier is specified, the most recent successfully completed investigation result for the incident corresponding to IncidentUuid is returned, selected in descending order of investigation end time.
     * If no matching investigation record is found, IncidentInvestigation is empty.
     * IncidentInvestigationStatus indicates the judgment category in the report. Both IncidentInvestigationReport and IncidentInvestigationOutput are JSON-formatted strings that must be parsed before their fields can be used. Internal fields may change across report versions, and callers should handle missing fields gracefully. The examples show only partial report content.</li>
     * </ol>
     * 
     * @param request the request parameters of GetIncidentInvestigation  GetIncidentInvestigationRequest
     * @return GetIncidentInvestigationResponse
     */
    @Override
    public CompletableFuture<GetIncidentInvestigationResponse> getIncidentInvestigation(GetIncidentInvestigationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIncidentInvestigation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIncidentInvestigationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIncidentInvestigationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetLogTicket  GetLogTicketRequest
     * @return GetLogTicketResponse
     */
    @Override
    public CompletableFuture<GetLogTicketResponse> getLogTicket(GetLogTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLogTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig contains highly complex JSON configurations. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetNormalizationRule  GetNormalizationRuleRequest
     * @return GetNormalizationRuleResponse
     */
    @Override
    public CompletableFuture<GetNormalizationRuleResponse> getNormalizationRule(GetNormalizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNormalizationRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNormalizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNormalizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a supporting utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetNormalizationRuleVersion  GetNormalizationRuleVersionRequest
     * @return GetNormalizationRuleVersionResponse
     */
    @Override
    public CompletableFuture<GetNormalizationRuleVersionResponse> getNormalizationRuleVersion(GetNormalizationRuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNormalizationRuleVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNormalizationRuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNormalizationRuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetNormalizationSchema  GetNormalizationSchemaRequest
     * @return GetNormalizationSchemaResponse
     */
    @Override
    public CompletableFuture<GetNormalizationSchemaResponse> getNormalizationSchema(GetNormalizationSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNormalizationSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNormalizationSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNormalizationSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of GetResponseRuleStatistic  GetResponseRuleStatisticRequest
     * @return GetResponseRuleStatisticResponse
     */
    @Override
    public CompletableFuture<GetResponseRuleStatisticResponse> getResponseRuleStatistic(GetResponseRuleStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResponseRuleStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResponseRuleStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResponseRuleStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetUserConfig  GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    @Override
    public CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class and configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListAlertAggregations  ListAlertAggregationsRequest
     * @return ListAlertAggregationsResponse
     */
    @Override
    public CompletableFuture<ListAlertAggregationsResponse> listAlertAggregations(ListAlertAggregationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAlertAggregations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertAggregationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertAggregationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations. We provide a utility class with configuration examples to help you get started. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before invoking this operation, ensure that Cloud SIEM storage resources (the alert-record Logstore in the Simple Log Service project) are activated. Invoke GetDataStorage to check the storage status. If storage is not activated, purchase SIEM storage first. Otherwise, the invocation will fail.</p>
     * 
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    @Override
    public CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAlerts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListAutoDisposeEntities  ListAutoDisposeEntitiesRequest
     * @return ListAutoDisposeEntitiesResponse
     */
    @Override
    public CompletableFuture<ListAutoDisposeEntitiesResponse> listAutoDisposeEntities(ListAutoDisposeEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoDisposeEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoDisposeEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoDisposeEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the message list of a specified security operations Agent conversation.</p>
     * 
     * @param request the request parameters of ListCopilotMessages  ListCopilotMessagesRequest
     * @return ListCopilotMessagesResponse
     */
    @Override
    public CompletableFuture<ListCopilotMessagesResponse> listCopilotMessages(ListCopilotMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCopilotMessages").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/message/list").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCopilotMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCopilotMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataConnectors  ListDataConnectorsRequest
     * @return ListDataConnectorsResponse
     */
    @Override
    public CompletableFuture<ListDataConnectorsResponse> listDataConnectors(ListDataConnectorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataConnectors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataConnectorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataConnectorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListDataIngestionTemplates  ListDataIngestionTemplatesRequest
     * @return ListDataIngestionTemplatesResponse
     */
    @Override
    public CompletableFuture<ListDataIngestionTemplatesResponse> listDataIngestionTemplates(ListDataIngestionTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataIngestionTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataIngestionTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataIngestionTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListDataIngestions  ListDataIngestionsRequest
     * @return ListDataIngestionsResponse
     */
    @Override
    public CompletableFuture<ListDataIngestionsResponse> listDataIngestions(ListDataIngestionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataIngestions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataIngestionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataIngestionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSetRecords  ListDataSetRecordsRequest
     * @return ListDataSetRecordsResponse
     */
    @Override
    public CompletableFuture<ListDataSetRecordsResponse> listDataSetRecords(ListDataSetRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSetRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSetRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSetRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSets  ListDataSetsRequest
     * @return ListDataSetsResponse
     */
    @Override
    public CompletableFuture<ListDataSetsResponse> listDataSets(ListDataSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * @param request the request parameters of ListDataSourceTemplates  ListDataSourceTemplatesRequest
     * @return ListDataSourceTemplatesResponse
     */
    @Override
    public CompletableFuture<ListDataSourceTemplatesResponse> listDataSourceTemplates(ListDataSourceTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSourceTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListDetectionRules  ListDetectionRulesRequest
     * @return ListDetectionRulesResponse
     */
    @Override
    public CompletableFuture<ListDetectionRulesResponse> listDetectionRules(ListDetectionRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDetectionRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDetectionRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDetectionRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListIncidents  ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    @Override
    public CompletableFuture<ListIncidentsResponse> listIncidents(ListIncidentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIncidents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIncidentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIncidentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of log projects associated with threat detection and response.</p>
     * 
     * @param request the request parameters of ListLogProjects  ListLogProjectsRequest
     * @return ListLogProjectsResponse
     */
    @Override
    public CompletableFuture<ListLogProjectsResponse> listLogProjects(ListLogProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLogProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The \<code>JsonConfig\\</code> request parameter is a complex JSON configuration. A supporting tool class provides configuration examples. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListLogRegions  ListLogRegionsRequest
     * @return ListLogRegionsResponse
     */
    @Override
    public CompletableFuture<ListLogRegionsResponse> listLogRegions(ListLogRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLogRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListLogStores  ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    @Override
    public CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLogStores").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListNormalizationCategories  ListNormalizationCategoriesRequest
     * @return ListNormalizationCategoriesResponse
     */
    @Override
    public CompletableFuture<ListNormalizationCategoriesResponse> listNormalizationCategories(ListNormalizationCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided for configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationFields  ListNormalizationFieldsRequest
     * @return ListNormalizationFieldsResponse
     */
    @Override
    public CompletableFuture<ListNormalizationFieldsResponse> listNormalizationFields(ListNormalizationFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationFields").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationRuleCapacities  ListNormalizationRuleCapacitiesRequest
     * @return ListNormalizationRuleCapacitiesResponse
     */
    @Override
    public CompletableFuture<ListNormalizationRuleCapacitiesResponse> listNormalizationRuleCapacities(ListNormalizationRuleCapacitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationRuleCapacities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationRuleCapacitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationRuleCapacitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationRuleVersions  ListNormalizationRuleVersionsRequest
     * @return ListNormalizationRuleVersionsResponse
     */
    @Override
    public CompletableFuture<ListNormalizationRuleVersionsResponse> listNormalizationRuleVersions(ListNormalizationRuleVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationRuleVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationRuleVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationRuleVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListNormalizationRules  ListNormalizationRulesRequest
     * @return ListNormalizationRulesResponse
     */
    @Override
    public CompletableFuture<ListNormalizationRulesResponse> listNormalizationRules(ListNormalizationRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. A utility class is provided with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationSchemas  ListNormalizationSchemasRequest
     * @return ListNormalizationSchemasResponse
     */
    @Override
    public CompletableFuture<ListNormalizationSchemasResponse> listNormalizationSchemas(ListNormalizationSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationSchemas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class and configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationSecurityDomains  ListNormalizationSecurityDomainsRequest
     * @return ListNormalizationSecurityDomainsResponse
     */
    @Override
    public CompletableFuture<ListNormalizationSecurityDomainsResponse> listNormalizationSecurityDomains(ListNormalizationSecurityDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNormalizationSecurityDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNormalizationSecurityDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNormalizationSecurityDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a highly complex JSON configuration. A utility class with specific configuration examples is provided. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListQueryViews  ListQueryViewsRequest
     * @return ListQueryViewsResponse
     */
    @Override
    public CompletableFuture<ListQueryViewsResponse> listQueryViews(ListQueryViewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQueryViews").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQueryViewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQueryViewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListResponseRuleFields  ListResponseRuleFieldsRequest
     * @return ListResponseRuleFieldsResponse
     */
    @Override
    public CompletableFuture<ListResponseRuleFieldsResponse> listResponseRuleFields(ListResponseRuleFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResponseRuleFields").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResponseRuleFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResponseRuleFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user receives a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListResponseRules  ListResponseRulesRequest
     * @return ListResponseRulesResponse
     */
    @Override
    public CompletableFuture<ListResponseRulesResponse> listResponseRules(ListResponseRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResponseRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResponseRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResponseRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    @Override
    public CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListTrafficStatistics  ListTrafficStatisticsRequest
     * @return ListTrafficStatisticsResponse
     */
    @Override
    public CompletableFuture<ListTrafficStatisticsResponse> listTrafficStatistics(ListTrafficStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTrafficStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListUpgradeItems  ListUpgradeItemsRequest
     * @return ListUpgradeItemsResponse
     */
    @Override
    public CompletableFuture<ListUpgradeItemsResponse> listUpgradeItems(ListUpgradeItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUpgradeItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUpgradeItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUpgradeItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListVendors  ListVendorsRequest
     * @return ListVendorsResponse
     */
    @Override
    public CompletableFuture<ListVendorsResponse> listVendors(ListVendorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVendors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVendorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVendorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of RefreshDataSource  RefreshDataSourceRequest
     * @return RefreshDataSourceResponse
     */
    @Override
    public CompletableFuture<RefreshDataSourceResponse> refreshDataSource(RefreshDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetDataStorage  ResetDataStorageRequest
     * @return ResetDataStorageResponse
     */
    @Override
    public CompletableFuture<ResetDataStorageResponse> resetDataStorage(ResetDataStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDataStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDataStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDataStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resumes the SSE event stream for a security operations Agent conversation turn from a specified cursor.</p>
     * 
     * @param request the request parameters of ResumeCopilotTurnStream  ResumeCopilotTurnStreamRequest
     * @return ResumeCopilotTurnStreamResponse
     */
    @Override
    public CompletableFuture<ResumeCopilotTurnStreamResponse> resumeCopilotTurnStream(ResumeCopilotTurnStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeCopilotTurnStream").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/turn/resume-stream").setBodyType(BodyType.STRING).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeCopilotTurnStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeCopilotTurnStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> resumeCopilotTurnStreamWithResponseIterable(ResumeCopilotTurnStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ResumeCopilotTurnStream").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/turn/resume-stream").setBodyType(BodyType.STRING).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        ResumeCopilotTurnStreamResponseBodyIterator iterator = ResumeCopilotTurnStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of SetDefaultNormalizationRuleVersion  SetDefaultNormalizationRuleVersionRequest
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    @Override
    public CompletableFuture<SetDefaultNormalizationRuleVersionResponse> setDefaultNormalizationRuleVersion(SetDefaultNormalizationRuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultNormalizationRuleVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultNormalizationRuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultNormalizationRuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user receives a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of UpdateAlert  UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    @Override
    public CompletableFuture<UpdateAlertResponse> updateAlert(UpdateAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <code>JsonConfig</code> parameter is a complex JSON configuration. See the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for helper utility classes and configuration examples.</p>
     * 
     * @param request the request parameters of UpdateAutoDisposeConfig  UpdateAutoDisposeConfigRequest
     * @return UpdateAutoDisposeConfigResponse
     */
    @Override
    public CompletableFuture<UpdateAutoDisposeConfigResponse> updateAutoDisposeConfig(UpdateAutoDisposeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAutoDisposeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoDisposeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoDisposeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The AutoDecisionEntityList parameter is a JSON-formatted string. A helper class is available to simplify its creation. For an example, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateAutoDisposeRecord  UpdateAutoDisposeRecordRequest
     * @return UpdateAutoDisposeRecordResponse
     */
    @Override
    public CompletableFuture<UpdateAutoDisposeRecordResponse> updateAutoDisposeRecord(UpdateAutoDisposeRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAutoDisposeRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoDisposeRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoDisposeRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class that contains configuration examples is provided to help you. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDataBatchIngestion  UpdateDataBatchIngestionRequest
     * @return UpdateDataBatchIngestionResponse
     */
    @Override
    public CompletableFuture<UpdateDataBatchIngestionResponse> updateDataBatchIngestion(UpdateDataBatchIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataBatchIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataBatchIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataBatchIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00 (UTC+8). No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of UpdateDataConnector  UpdateDataConnectorRequest
     * @return UpdateDataConnectorResponse
     */
    @Override
    public CompletableFuture<UpdateDataConnectorResponse> updateDataConnector(UpdateDataConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataConnector").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. A maximum of two notifications are sent to each user per day between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of UpdateDataIngestion  UpdateDataIngestionRequest
     * @return UpdateDataIngestionResponse
     */
    @Override
    public CompletableFuture<UpdateDataIngestionResponse> updateDataIngestion(UpdateDataIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataIngestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Frequency and time limits apply to notifications. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. Notifications are not sent outside of this time period.</p>
     * 
     * @param request the request parameters of UpdateDataIngestionTemplate  UpdateDataIngestionTemplateRequest
     * @return UpdateDataIngestionTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateDataIngestionTemplateResponse> updateDataIngestionTemplate(UpdateDataIngestionTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataIngestionTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataIngestionTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataIngestionTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are limited by frequency and time. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. Notifications are not sent outside this time range.</p>
     * 
     * @param request the request parameters of UpdateDataSet  UpdateDataSetRequest
     * @return UpdateDataSetResponse
     */
    @Override
    public CompletableFuture<UpdateDataSetResponse> updateDataSet(UpdateDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of UpdateDataSetRecord  UpdateDataSetRecordRequest
     * @return UpdateDataSetRecordResponse
     */
    @Override
    public CompletableFuture<UpdateDataSetRecordResponse> updateDataSetRecord(UpdateDataSetRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSetRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSetRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSetRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    @Override
    public CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter accepts a complex JSON configuration. To simplify this process, a supporting tool class is available. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDataSourceTemplate  UpdateDataSourceTemplateRequest
     * @return UpdateDataSourceTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateDataSourceTemplateResponse> updateDataSourceTemplate(UpdateDataSourceTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSourceTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSourceTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSourceTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the log storage region or the global switch for multi-account centralized delivery. Submit these two types of operations separately. Before modifying the global switch, query GetDataStorage first and use the returned ConfigurationVersion and TargetProject. Do not copy the fixed version and account from the examples. The current V2 version does not support the legacy DeliveryStatus global switch. After writing, re-query GetDataStorage to obtain the latest configuration.</p>
     * 
     * @param request the request parameters of UpdateDataStorage  UpdateDataStorageRequest
     * @return UpdateDataStorageResponse
     */
    @Override
    public CompletableFuture<UpdateDataStorageResponse> updateDataStorage(UpdateDataStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the Cloud Threat Detection and Response (CTDR) data storage service is activated for your account and that the data storage order has not expired. Call the GetDataStorage operation to check the data storage order status.</p>
     * 
     * @param request the request parameters of UpdateDataStorageDelivery  UpdateDataStorageDeliveryRequest
     * @return UpdateDataStorageDeliveryResponse
     */
    @Override
    public CompletableFuture<UpdateDataStorageDeliveryResponse> updateDataStorageDelivery(UpdateDataStorageDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataStorageDelivery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataStorageDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataStorageDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataStorageTtl  UpdateDataStorageTtlRequest
     * @return UpdateDataStorageTtlResponse
     */
    @Override
    public CompletableFuture<UpdateDataStorageTtlResponse> updateDataStorageTtl(UpdateDataStorageTtlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataStorageTtl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataStorageTtlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataStorageTtlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, a utility class is provided with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDetectionRule  UpdateDetectionRuleRequest
     * @return UpdateDetectionRuleResponse
     */
    @Override
    public CompletableFuture<UpdateDetectionRuleResponse> updateDetectionRule(UpdateDetectionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDetectionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDetectionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDetectionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateNormalizationRule  UpdateNormalizationRuleRequest
     * @return UpdateNormalizationRuleResponse
     */
    @Override
    public CompletableFuture<UpdateNormalizationRuleResponse> updateNormalizationRule(UpdateNormalizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNormalizationRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNormalizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNormalizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateNormalizationSchema  UpdateNormalizationSchemaRequest
     * @return UpdateNormalizationSchemaResponse
     */
    @Override
    public CompletableFuture<UpdateNormalizationSchemaResponse> updateNormalizationSchema(UpdateNormalizationSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNormalizationSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNormalizationSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNormalizationSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, a utility class is provided. Refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    @Override
    public CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. To help you configure it, a supporting utility class with examples is provided. Refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateResponseRule  UpdateResponseRuleRequest
     * @return UpdateResponseRuleResponse
     */
    @Override
    public CompletableFuture<UpdateResponseRuleResponse> updateResponseRule(UpdateResponseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateResponseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResponseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResponseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The delivery of notifications is limited by frequency and time. A user can receive a maximum of two notifications per day between 08:00 and 20:00. Notifications are not sent outside this time period.</p>
     * 
     * @param request the request parameters of UpdateVendor  UpdateVendorRequest
     * @return UpdateVendorResponse
     */
    @Override
    public CompletableFuture<UpdateVendorResponse> updateVendor(UpdateVendorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVendor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVendorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVendorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To simplify this, we provide a utility class to assist with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ValidateLogStore  ValidateLogStoreRequest
     * @return ValidateLogStoreResponse
     */
    @Override
    public CompletableFuture<ValidateLogStoreResponse> validateLogStore(ValidateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateLogStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ValidateNormalizationRule  ValidateNormalizationRuleRequest
     * @return ValidateNormalizationRuleResponse
     */
    @Override
    public CompletableFuture<ValidateNormalizationRuleResponse> validateNormalizationRule(ValidateNormalizationRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateNormalizationRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateNormalizationRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateNormalizationRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}

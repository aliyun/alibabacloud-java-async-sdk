// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dts20200101.models.*;
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
        this.product = "Dts";
        this.version = "2020-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-east-1", "dts.aliyuncs.com"),
            new TeaPair("eu-central-1", "dts.aliyuncs.com"),
            new TeaPair("me-east-1", "dts.aliyuncs.com"),
            new TeaPair("ap-south-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dts.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dts.aliyuncs.com"),
            new TeaPair("cn-fujian", "dts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dts.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ConfigureMigrationJob  ConfigureMigrationJobRequest
     * @return ConfigureMigrationJobResponse
     */
    @Override
    public CompletableFuture<ConfigureMigrationJobResponse> configureMigrationJob(ConfigureMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfigureMigrationJobAlert  ConfigureMigrationJobAlertRequest
     * @return ConfigureMigrationJobAlertResponse
     */
    @Override
    public CompletableFuture<ConfigureMigrationJobAlertResponse> configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureMigrationJobAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureMigrationJobAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureMigrationJobAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfigureSubscription  ConfigureSubscriptionRequest
     * @return ConfigureSubscriptionResponse
     */
    @Override
    public CompletableFuture<ConfigureSubscriptionResponse> configureSubscription(ConfigureSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to create a change tracking instance.</p>
     * <blockquote>
     * <p>In the <strong>Advanced Settings</strong> step of the console, move the pointer over the <strong>Next: Save the task and perform a precheck</strong> button, and then click <strong>Preview OpenAPI parameters</strong> in the tooltip to view the parameter information for configuring this instance by using API operations.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfigureSubscriptionInstance  ConfigureSubscriptionInstanceRequest
     * @return ConfigureSubscriptionInstanceResponse
     */
    @Override
    public CompletableFuture<ConfigureSubscriptionInstanceResponse> configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSubscriptionInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSubscriptionInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSubscriptionInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfigureSubscriptionInstanceAlert  ConfigureSubscriptionInstanceAlertRequest
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    @Override
    public CompletableFuture<ConfigureSubscriptionInstanceAlertResponse> configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSubscriptionInstanceAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSubscriptionInstanceAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSubscriptionInstanceAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49446.html">CreateSynchronizationJob</a> operation to create a data synchronization instance.</p>
     * <blockquote>
     * <ul>
     * <li>After this operation is called, the data synchronization instance automatically starts and performs a precheck. You do not need to call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to start the instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the data synchronization instance fails to start, the precheck may have failed. You can call the <a href="https://help.aliyun.com/document_detail/49453.html">DescribeSynchronizationJobStatus</a> operation to query the status of the data synchronization instance, obtain the error message of the precheck failure, and adjust the parameters. After the adjustment, you can call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to restart the data synchronization instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigureSynchronizationJob  ConfigureSynchronizationJobRequest
     * @return ConfigureSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<ConfigureSynchronizationJobResponse> configureSynchronizationJob(ConfigureSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfigureSynchronizationJobAlert  ConfigureSynchronizationJobAlertRequest
     * @return ConfigureSynchronizationJobAlertResponse
     */
    @Override
    public CompletableFuture<ConfigureSynchronizationJobAlertResponse> configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSynchronizationJobAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSynchronizationJobAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSynchronizationJobAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfigureSynchronizationJobReplicatorCompare  ConfigureSynchronizationJobReplicatorCompareRequest
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    @Override
    public CompletableFuture<ConfigureSynchronizationJobReplicatorCompareResponse> configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureSynchronizationJobReplicatorCompare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureSynchronizationJobReplicatorCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureSynchronizationJobReplicatorCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConvertInstanceResourceGroup  ConvertInstanceResourceGroupRequest
     * @return ConvertInstanceResourceGroupResponse
     */
    @Override
    public CompletableFuture<ConvertInstanceResourceGroupResponse> convertInstanceResourceGroup(ConvertInstanceResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertInstanceResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertInstanceResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertInstanceResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CountJobByCondition  CountJobByConditionRequest
     * @return CountJobByConditionResponse
     */
    @Override
    public CompletableFuture<CountJobByConditionResponse> countJobByCondition(CountJobByConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CountJobByCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountJobByConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountJobByConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConsumerChannel  CreateConsumerChannelRequest
     * @return CreateConsumerChannelResponse
     */
    @Override
    public CompletableFuture<CreateConsumerChannelResponse> createConsumerChannel(CreateConsumerChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConsumerChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    @Override
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDedicatedClusterMonitorRule  CreateDedicatedClusterMonitorRuleRequest
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    @Override
    public CompletableFuture<CreateDedicatedClusterMonitorRuleResponse> createDedicatedClusterMonitorRule(CreateDedicatedClusterMonitorRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedClusterMonitorRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDedicatedClusterMonitorRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDedicatedClusterMonitorRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</li>
     * <li>Nodes on a dedicated cluster support only the workflow of configuring a node before purchasing an instance. You can invoke the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to configure a node.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDtsInstance  CreateDtsInstanceRequest
     * @return CreateDtsInstanceResponse
     */
    @Override
    public CompletableFuture<CreateDtsInstanceResponse> createDtsInstance(CreateDtsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDtsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDtsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDtsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DTS currently supports the following alert metrics: <strong>Latency</strong>, <strong>Migration Status</strong>, and <strong>Full Migration Duration</strong>:</p>
     * <ul>
     * <li><strong>Latency</strong>: Monitors incremental data migration latency. An alert is triggered when the migration latency, synchronization latency, or change tracking latency exceeds the specified threshold (in seconds).</li>
     * <li><strong>Migration Status</strong>: Monitors the task status. An alert is triggered when the task status is <strong>Error</strong> or <strong>Recovered</strong>.</li>
     * <li><strong>Full Migration Duration</strong>: Monitors the duration of full data migration. An alert is triggered when the duration exceeds the specified threshold (in hours).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateJobMonitorRule  CreateJobMonitorRuleRequest
     * @return CreateJobMonitorRuleResponse
     */
    @Override
    public CompletableFuture<CreateJobMonitorRuleResponse> createJobMonitorRule(CreateJobMonitorRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateJobMonitorRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobMonitorRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobMonitorRuleResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The reverse task created by calling this operation immediately starts a precheck. After the precheck is passed, incremental data collection begins, but the incremental data write module does not run. You must call the <strong>StartReverseWriter</strong> operation to start it.</p>
     * <blockquote>
     * <p>The created reverse task is a synchronization task that contains only the incremental write module.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateReverseDtsJob  CreateReverseDtsJobRequest
     * @return CreateReverseDtsJobResponse
     */
    @Override
    public CompletableFuture<CreateReverseDtsJobResponse> createReverseDtsJob(CreateReverseDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateReverseDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateReverseDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateReverseDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSubscriptionInstance  CreateSubscriptionInstanceRequest
     * @return CreateSubscriptionInstanceResponse
     */
    @Override
    public CompletableFuture<CreateSubscriptionInstanceResponse> createSubscriptionInstance(CreateSubscriptionInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSubscriptionInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubscriptionInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubscriptionInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSynchronizationJob  CreateSynchronizationJobRequest
     * @return CreateSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<CreateSynchronizationJobResponse> createSynchronizationJob(CreateSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConsumerChannel  DeleteConsumerChannelRequest
     * @return DeleteConsumerChannelResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerChannelResponse> deleteConsumerChannel(DeleteConsumerChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConsumerChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling this API operation. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDtsJob  DeleteDtsJobRequest
     * @return DeleteDtsJobResponse
     */
    @Override
    public CompletableFuture<DeleteDtsJobResponse> deleteDtsJob(DeleteDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling API operations. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDtsJobs  DeleteDtsJobsRequest
     * @return DeleteDtsJobsResponse
     */
    @Override
    public CompletableFuture<DeleteDtsJobsResponse> deleteDtsJobs(DeleteDtsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDtsJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDtsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDtsJobsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSubscriptionInstance  DeleteSubscriptionInstanceRequest
     * @return DeleteSubscriptionInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteSubscriptionInstanceResponse> deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSubscriptionInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubscriptionInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubscriptionInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSynchronizationJob  DeleteSynchronizationJobRequest
     * @return DeleteSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<DeleteSynchronizationJobResponse> deleteSynchronizationJob(DeleteSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeChannelAccount  DescribeChannelAccountRequest
     * @return DescribeChannelAccountResponse
     */
    @Override
    public CompletableFuture<DescribeChannelAccountResponse> describeChannelAccount(DescribeChannelAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChannelAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChannelAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChannelAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckJobs  DescribeCheckJobsRequest
     * @return DescribeCheckJobsResponse
     */
    @Override
    public CompletableFuture<DescribeCheckJobsResponse> describeCheckJobs(DescribeCheckJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterOperateLogs  DescribeClusterOperateLogsRequest
     * @return DescribeClusterOperateLogsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterOperateLogsResponse> describeClusterOperateLogs(DescribeClusterOperateLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterOperateLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterOperateLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterOperateLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterUsedUtilization  DescribeClusterUsedUtilizationRequest
     * @return DescribeClusterUsedUtilizationResponse
     */
    @Override
    public CompletableFuture<DescribeClusterUsedUtilizationResponse> describeClusterUsedUtilization(DescribeClusterUsedUtilizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterUsedUtilization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterUsedUtilizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterUsedUtilizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConnectionStatus  DescribeConnectionStatusRequest
     * @return DescribeConnectionStatusResponse
     */
    @Override
    public CompletableFuture<DescribeConnectionStatusResponse> describeConnectionStatus(DescribeConnectionStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeConnectionStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConnectionStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConnectionStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConsumerChannel  DescribeConsumerChannelRequest
     * @return DescribeConsumerChannelResponse
     */
    @Override
    public CompletableFuture<DescribeConsumerChannelResponse> describeConsumerChannel(DescribeConsumerChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeConsumerChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConsumerChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConsumerChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConsumerGroup  DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     */
    @Override
    public CompletableFuture<DescribeConsumerGroupResponse> describeConsumerGroup(DescribeConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDTSIP  DescribeDTSIPRequest
     * @return DescribeDTSIPResponse
     */
    @Override
    public CompletableFuture<DescribeDTSIPResponse> describeDTSIP(DescribeDTSIPRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDTSIP").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDTSIPResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDTSIPResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataCheckReportUrl  DescribeDataCheckReportUrlRequest
     * @return DescribeDataCheckReportUrlResponse
     */
    @Override
    public CompletableFuture<DescribeDataCheckReportUrlResponse> describeDataCheckReportUrl(DescribeDataCheckReportUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataCheckReportUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataCheckReportUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataCheckReportUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataCheckTableDetails  DescribeDataCheckTableDetailsRequest
     * @return DescribeDataCheckTableDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeDataCheckTableDetailsResponse> describeDataCheckTableDetails(DescribeDataCheckTableDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataCheckTableDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataCheckTableDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataCheckTableDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataCheckTableDiffDetails  DescribeDataCheckTableDiffDetailsRequest
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeDataCheckTableDiffDetailsResponse> describeDataCheckTableDiffDetails(DescribeDataCheckTableDiffDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataCheckTableDiffDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataCheckTableDiffDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataCheckTableDiffDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDedicatedCluster  DescribeDedicatedClusterRequest
     * @return DescribeDedicatedClusterResponse
     */
    @Override
    public CompletableFuture<DescribeDedicatedClusterResponse> describeDedicatedCluster(DescribeDedicatedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDedicatedClusterMonitorRule  DescribeDedicatedClusterMonitorRuleRequest
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    @Override
    public CompletableFuture<DescribeDedicatedClusterMonitorRuleResponse> describeDedicatedClusterMonitorRule(DescribeDedicatedClusterMonitorRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedClusterMonitorRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedClusterMonitorRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedClusterMonitorRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold per region is 100 calls per second.</li>
     * <li>The call threshold per account per region is 5 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobResult  DescribeDocParserJobResultRequest
     * @return DescribeDocParserJobResultResponse
     */
    @Override
    public CompletableFuture<DescribeDocParserJobResultResponse> describeDocParserJobResult(DescribeDocParserJobResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDocParserJobResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDocParserJobResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDocParserJobResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation has call frequency limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold for a single region is 200 calls per second.</li>
     * <li>The call threshold for a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobStatus  DescribeDocParserJobStatusRequest
     * @return DescribeDocParserJobStatusResponse
     */
    @Override
    public CompletableFuture<DescribeDocParserJobStatusResponse> describeDocParserJobStatus(DescribeDocParserJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDocParserJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDocParserJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDocParserJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDtsEtlJobVersionInfo  DescribeDtsEtlJobVersionInfoRequest
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDtsEtlJobVersionInfoResponse> describeDtsEtlJobVersionInfo(DescribeDtsEtlJobVersionInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDtsEtlJobVersionInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDtsEtlJobVersionInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDtsEtlJobVersionInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDtsJobConfig  DescribeDtsJobConfigRequest
     * @return DescribeDtsJobConfigResponse
     */
    @Override
    public CompletableFuture<DescribeDtsJobConfigResponse> describeDtsJobConfig(DescribeDtsJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDtsJobConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDtsJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDtsJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 160 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 40 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDtsJobDetail  DescribeDtsJobDetailRequest
     * @return DescribeDtsJobDetailResponse
     */
    @Override
    public CompletableFuture<DescribeDtsJobDetailResponse> describeDtsJobDetail(DescribeDtsJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDtsJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDtsJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDtsJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 200 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDtsJobs  DescribeDtsJobsRequest
     * @return DescribeDtsJobsResponse
     */
    @Override
    public CompletableFuture<DescribeDtsJobsResponse> describeDtsJobs(DescribeDtsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDtsJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDtsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDtsJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDtsServiceLog  DescribeDtsServiceLogRequest
     * @return DescribeDtsServiceLogResponse
     */
    @Override
    public CompletableFuture<DescribeDtsServiceLogResponse> describeDtsServiceLog(DescribeDtsServiceLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDtsServiceLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDtsServiceLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDtsServiceLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEndpointSwitchStatus  DescribeEndpointSwitchStatusRequest
     * @return DescribeEndpointSwitchStatusResponse
     */
    @Override
    public CompletableFuture<DescribeEndpointSwitchStatusResponse> describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEndpointSwitchStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEndpointSwitchStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEndpointSwitchStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEtlJobLogs  DescribeEtlJobLogsRequest
     * @return DescribeEtlJobLogsResponse
     */
    @Override
    public CompletableFuture<DescribeEtlJobLogsResponse> describeEtlJobLogs(DescribeEtlJobLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEtlJobLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEtlJobLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEtlJobLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFullProcessList  DescribeFullProcessListRequest
     * @return DescribeFullProcessListResponse
     */
    @Override
    public CompletableFuture<DescribeFullProcessListResponse> describeFullProcessList(DescribeFullProcessListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFullProcessList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFullProcessListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFullProcessListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGadInstances  DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGadInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGadInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGadInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInitializationStatus  DescribeInitializationStatusRequest
     * @return DescribeInitializationStatusResponse
     */
    @Override
    public CompletableFuture<DescribeInitializationStatusResponse> describeInitializationStatus(DescribeInitializationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInitializationStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInitializationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInitializationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeJobMonitorRule  DescribeJobMonitorRuleRequest
     * @return DescribeJobMonitorRuleResponse
     */
    @Override
    public CompletableFuture<DescribeJobMonitorRuleResponse> describeJobMonitorRule(DescribeJobMonitorRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeJobMonitorRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeJobMonitorRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeJobMonitorRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobAlert  DescribeMigrationJobAlertRequest
     * @return DescribeMigrationJobAlertResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobAlertResponse> describeMigrationJobAlert(DescribeMigrationJobAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrationJobAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobDetail  DescribeMigrationJobDetailRequest
     * @return DescribeMigrationJobDetailResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobDetailResponse> describeMigrationJobDetail(DescribeMigrationJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrationJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobStatus  DescribeMigrationJobStatusRequest
     * @return DescribeMigrationJobStatusResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobStatusResponse> describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrationJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMigrationJobs  DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     */
    @Override
    public CompletableFuture<DescribeMigrationJobsResponse> describeMigrationJobs(DescribeMigrationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrationJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePreCheckCreateGadOrderResult  DescribePreCheckCreateGadOrderResultRequest
     * @return DescribePreCheckCreateGadOrderResultResponse
     */
    @Override
    public CompletableFuture<DescribePreCheckCreateGadOrderResultResponse> describePreCheckCreateGadOrderResult(DescribePreCheckCreateGadOrderResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePreCheckCreateGadOrderResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePreCheckCreateGadOrderResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePreCheckCreateGadOrderResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePreCheckStatus  DescribePreCheckStatusRequest
     * @return DescribePreCheckStatusResponse
     */
    @Override
    public CompletableFuture<DescribePreCheckStatusResponse> describePreCheckStatus(DescribePreCheckStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePreCheckStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePreCheckStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePreCheckStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSubscriptionInstanceAlert  DescribeSubscriptionInstanceAlertRequest
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    @Override
    public CompletableFuture<DescribeSubscriptionInstanceAlertResponse> describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSubscriptionInstanceAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSubscriptionInstanceAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSubscriptionInstanceAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSubscriptionInstanceStatus  DescribeSubscriptionInstanceStatusRequest
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSubscriptionInstanceStatusResponse> describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSubscriptionInstanceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSubscriptionInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSubscriptionInstanceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSubscriptionInstances  DescribeSubscriptionInstancesRequest
     * @return DescribeSubscriptionInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeSubscriptionInstancesResponse> describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSubscriptionInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSubscriptionInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSubscriptionInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Because a PolarDB-X 1.0 change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a PolarDB-X 1.0 change tracking task.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Because a DRDS change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a DRDS change tracking task.
     * .</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSubscriptionMeta  DescribeSubscriptionMetaRequest
     * @return DescribeSubscriptionMetaResponse
     */
    @Override
    public CompletableFuture<DescribeSubscriptionMetaResponse> describeSubscriptionMeta(DescribeSubscriptionMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSubscriptionMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSubscriptionMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSubscriptionMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSyncStatus  DescribeSyncStatusRequest
     * @return DescribeSyncStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSyncStatusResponse> describeSyncStatus(DescribeSyncStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSyncStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyncStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyncStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationJobAlert  DescribeSynchronizationJobAlertRequest
     * @return DescribeSynchronizationJobAlertResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationJobAlertResponse> describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationJobAlert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationJobAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationJobAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationJobReplicatorCompare  DescribeSynchronizationJobReplicatorCompareRequest
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationJobReplicatorCompareResponse> describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationJobReplicatorCompare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationJobReplicatorCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationJobReplicatorCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationJobStatus  DescribeSynchronizationJobStatusRequest
     * @return DescribeSynchronizationJobStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationJobStatusResponse> describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationJobStatusList  DescribeSynchronizationJobStatusListRequest
     * @return DescribeSynchronizationJobStatusListResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationJobStatusListResponse> describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationJobStatusList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationJobStatusListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationJobStatusListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationJobs  DescribeSynchronizationJobsRequest
     * @return DescribeSynchronizationJobsResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationJobsResponse> describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSynchronizationObjectModifyStatus  DescribeSynchronizationObjectModifyStatusRequest
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSynchronizationObjectModifyStatusResponse> describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSynchronizationObjectModifyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSynchronizationObjectModifyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSynchronizationObjectModifyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTagKeys  DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    @Override
    public CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTagValues  DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    @Override
    public CompletableFuture<DescribeTagValuesResponse> describeTagValues(DescribeTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachGadInstanceDbMember  DetachGadInstanceDbMemberRequest
     * @return DetachGadInstanceDbMemberResponse
     */
    @Override
    public CompletableFuture<DetachGadInstanceDbMemberResponse> detachGadInstanceDbMember(DetachGadInstanceDbMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachGadInstanceDbMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachGadInstanceDbMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachGadInstanceDbMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The unit node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database connected through Cloud Enterprise Network (CEN).</li>
     * <li>This operation initializes a built-in account named rdsdt_dtsacct in a unit node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform synchronization tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of InitDtsRdsInstance  InitDtsRdsInstanceRequest
     * @return InitDtsRdsInstanceResponse
     */
    @Override
    public CompletableFuture<InitDtsRdsInstanceResponse> initDtsRdsInstance(InitDtsRdsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitDtsRdsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitDtsRdsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitDtsRdsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDedicatedCluster  ListDedicatedClusterRequest
     * @return ListDedicatedClusterResponse
     */
    @Override
    public CompletableFuture<ListDedicatedClusterResponse> listDedicatedCluster(ListDedicatedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDedicatedCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDedicatedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDedicatedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobStep  ListJobStepRequest
     * @return ListJobStepResponse
     */
    @Override
    public CompletableFuture<ListJobStepResponse> listJobStep(ListJobStepRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListJobStep").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobStepResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobStepResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyConsumerChannel  ModifyConsumerChannelRequest
     * @return ModifyConsumerChannelResponse
     */
    @Override
    public CompletableFuture<ModifyConsumerChannelResponse> modifyConsumerChannel(ModifyConsumerChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyConsumerChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyConsumerChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyConsumerChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyConsumerGroupPassword  ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     */
    @Override
    public CompletableFuture<ModifyConsumerGroupPasswordResponse> modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyConsumerGroupPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyConsumerGroupPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyConsumerGroupPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyConsumptionTimestamp  ModifyConsumptionTimestampRequest
     * @return ModifyConsumptionTimestampResponse
     */
    @Override
    public CompletableFuture<ModifyConsumptionTimestampResponse> modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyConsumptionTimestamp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyConsumptionTimestampResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyConsumptionTimestampResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Currently, only the overcommit ratio can be modified.</p>
     * 
     * @param request the request parameters of ModifyDedicatedCluster  ModifyDedicatedClusterRequest
     * @return ModifyDedicatedClusterResponse
     */
    @Override
    public CompletableFuture<ModifyDedicatedClusterResponse> modifyDedicatedCluster(ModifyDedicatedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDtsJobConfig  ModifyDtsJobConfigRequest
     * @return ModifyDtsJobConfigResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobConfigResponse> modifyDtsJobConfig(ModifyDtsJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a migration task is changed from a dedicated cluster to a public cluster, the billing method of the task changes to pay-as-you-go, and billing starts.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDtsJobDedicatedCluster  ModifyDtsJobDedicatedClusterRequest
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobDedicatedClusterResponse> modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobDedicatedCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobDedicatedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobDedicatedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>DTS instances in a dedicated cluster must support specification changes. By changing the resources consumed by a task at runtime, you can dynamically adjust the number of schedulable tasks in the current cluster, thereby deducting or releasing the total number of DUs in the cluster.</li>
     * <li>Before modifying the DU upper limit of a task, ensure that sufficient resources are available.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDtsJobDuLimit  ModifyDtsJobDuLimitRequest
     * @return ModifyDtsJobDuLimitResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobDuLimitResponse> modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobDuLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobDuLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobDuLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the database instance is modified, the DTS incremental write module rolls back writes by 10 seconds. If the data being synchronized or migrated does not have a primary key, stop writing data to the business associated with the source instance during the database instance replacement. Otherwise, duplicate data may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDtsJobEndpoint  ModifyDtsJobEndpointRequest
     * @return ModifyDtsJobEndpointResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobEndpointResponse> modifyDtsJobEndpoint(ModifyDtsJobEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDtsJobName  ModifyDtsJobNameRequest
     * @return ModifyDtsJobNameResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobNameResponse> modifyDtsJobName(ModifyDtsJobNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDtsJobPassword  ModifyDtsJobPasswordRequest
     * @return ModifyDtsJobPasswordResponse
     */
    @Override
    public CompletableFuture<ModifyDtsJobPasswordResponse> modifyDtsJobPassword(ModifyDtsJobPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDtsJobPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDtsJobPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDtsJobPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDynamicConfig  ModifyDynamicConfigRequest
     * @return ModifyDynamicConfigResponse
     */
    @Override
    public CompletableFuture<ModifyDynamicConfigResponse> modifyDynamicConfig(ModifyDynamicConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDynamicConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDynamicConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDynamicConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGadInstanceName  ModifyGadInstanceNameRequest
     * @return ModifyGadInstanceNameResponse
     */
    @Override
    public CompletableFuture<ModifyGadInstanceNameResponse> modifyGadInstanceName(ModifyGadInstanceNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGadInstanceName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGadInstanceNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGadInstanceNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyJobStepCheckpoint  ModifyJobStepCheckpointRequest
     * @return ModifyJobStepCheckpointResponse
     */
    @Override
    public CompletableFuture<ModifyJobStepCheckpointResponse> modifyJobStepCheckpoint(ModifyJobStepCheckpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyJobStepCheckpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyJobStepCheckpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyJobStepCheckpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required preconfigurations in the console and then preview the corresponding OpenAPI parameter information to help you fill in the request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySubscription  ModifySubscriptionRequest
     * @return ModifySubscriptionResponse
     */
    @Override
    public CompletableFuture<ModifySubscriptionResponse> modifySubscription(ModifySubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySubscriptionObject  ModifySubscriptionObjectRequest
     * @return ModifySubscriptionObjectResponse
     */
    @Override
    public CompletableFuture<ModifySubscriptionObjectResponse> modifySubscriptionObject(ModifySubscriptionObjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySubscriptionObject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySubscriptionObjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySubscriptionObjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySynchronizationObject  ModifySynchronizationObjectRequest
     * @return ModifySynchronizationObjectResponse
     */
    @Override
    public CompletableFuture<ModifySynchronizationObjectResponse> modifySynchronizationObject(ModifySynchronizationObjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySynchronizationObject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySynchronizationObjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySynchronizationObjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreCheckCreateGadOrder  PreCheckCreateGadOrderRequest
     * @return PreCheckCreateGadOrderResponse
     */
    @Override
    public CompletableFuture<PreCheckCreateGadOrderResponse> preCheckCreateGadOrder(PreCheckCreateGadOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreCheckCreateGadOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreCheckCreateGadOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreCheckCreateGadOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PromoteToMaster  PromoteToMasterRequest
     * @return PromoteToMasterResponse
     */
    @Override
    public CompletableFuture<PromoteToMasterResponse> promoteToMaster(PromoteToMasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PromoteToMaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PromoteToMasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PromoteToMasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the configuration of a data synchronization or change tracking task is cleared, the original task is deleted. DTS creates a new unconfigured task. You must call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to reconfigure the task.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetDtsJob  ResetDtsJobRequest
     * @return ResetDtsJobResponse
     */
    @Override
    public CompletableFuture<ResetDtsJobResponse> resetDtsJob(ResetDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you reset the configuration of a data synchronization task, the original synchronization task is released. You must call the <strong>ConfigureSynchronizationJob</strong> operation to reconfigure the synchronization task before you can start the task.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetSynchronizationJob  ResetSynchronizationJobRequest
     * @return ResetSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<ResetSynchronizationJobResponse> resetSynchronizationJob(ResetSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReverseTwoWayDirection  ReverseTwoWayDirectionRequest
     * @return ReverseTwoWayDirectionResponse
     */
    @Override
    public CompletableFuture<ReverseTwoWayDirectionResponse> reverseTwoWayDirection(ReverseTwoWayDirectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReverseTwoWayDirection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReverseTwoWayDirectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReverseTwoWayDirectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ShieldPrecheck  ShieldPrecheckRequest
     * @return ShieldPrecheckResponse
     */
    @Override
    public CompletableFuture<ShieldPrecheckResponse> shieldPrecheck(ShieldPrecheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ShieldPrecheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShieldPrecheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShieldPrecheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SkipFullJobTable  SkipFullJobTableRequest
     * @return SkipFullJobTableResponse
     */
    @Override
    public CompletableFuture<SkipFullJobTableResponse> skipFullJobTable(SkipFullJobTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SkipFullJobTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SkipFullJobTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SkipFullJobTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SkipPreCheck  SkipPreCheckRequest
     * @return SkipPreCheckResponse
     */
    @Override
    public CompletableFuture<SkipPreCheckResponse> skipPreCheck(SkipPreCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SkipPreCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SkipPreCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SkipPreCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDtsJob  StartDtsJobRequest
     * @return StartDtsJobResponse
     */
    @Override
    public CompletableFuture<StartDtsJobResponse> startDtsJob(StartDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDtsJobs  StartDtsJobsRequest
     * @return StartDtsJobsResponse
     */
    @Override
    public CompletableFuture<StartDtsJobsResponse> startDtsJobs(StartDtsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDtsJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDtsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDtsJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartMigrationJob  StartMigrationJobRequest
     * @return StartMigrationJobResponse
     */
    @Override
    public CompletableFuture<StartMigrationJobResponse> startMigrationJob(StartMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, check the status of the reverse task in the console or by calling <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a>. Make sure that the task has not been released and is in the paused state.</p>
     * 
     * @param request the request parameters of StartReverseWriter  StartReverseWriterRequest
     * @return StartReverseWriterResponse
     */
    @Override
    public CompletableFuture<StartReverseWriterResponse> startReverseWriter(StartReverseWriterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartReverseWriter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartReverseWriterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartReverseWriterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartSubscriptionInstance  StartSubscriptionInstanceRequest
     * @return StartSubscriptionInstanceResponse
     */
    @Override
    public CompletableFuture<StartSubscriptionInstanceResponse> startSubscriptionInstance(StartSubscriptionInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartSubscriptionInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartSubscriptionInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartSubscriptionInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartSynchronizationJob  StartSynchronizationJobRequest
     * @return StartSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<StartSynchronizationJobResponse> startSynchronizationJob(StartSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDedicatedCluster  StopDedicatedClusterRequest
     * @return StopDedicatedClusterResponse
     */
    @Override
    public CompletableFuture<StopDedicatedClusterResponse> stopDedicatedCluster(StopDedicatedClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDedicatedCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDedicatedClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDedicatedClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDtsJob  StopDtsJobRequest
     * @return StopDtsJobResponse
     */
    @Override
    public CompletableFuture<StopDtsJobResponse> stopDtsJob(StopDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDtsJobs  StopDtsJobsRequest
     * @return StopDtsJobsResponse
     */
    @Override
    public CompletableFuture<StopDtsJobsResponse> stopDtsJobs(StopDtsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDtsJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDtsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDtsJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopMigrationJob  StopMigrationJobRequest
     * @return StopMigrationJobResponse
     */
    @Override
    public CompletableFuture<StopMigrationJobResponse> stopMigrationJob(StopMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SummaryJobDetail  SummaryJobDetailRequest
     * @return SummaryJobDetailResponse
     */
    @Override
    public CompletableFuture<SummaryJobDetailResponse> summaryJobDetail(SummaryJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SummaryJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SummaryJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SummaryJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of SuspendDtsJob  SuspendDtsJobRequest
     * @return SuspendDtsJobResponse
     */
    @Override
    public CompletableFuture<SuspendDtsJobResponse> suspendDtsJob(SuspendDtsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendDtsJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendDtsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendDtsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendDtsJobs  SuspendDtsJobsRequest
     * @return SuspendDtsJobsResponse
     */
    @Override
    public CompletableFuture<SuspendDtsJobsResponse> suspendDtsJobs(SuspendDtsJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendDtsJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendDtsJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendDtsJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SuspendMigrationJob  SuspendMigrationJobRequest
     * @return SuspendMigrationJobResponse
     */
    @Override
    public CompletableFuture<SuspendMigrationJobResponse> suspendMigrationJob(SuspendMigrationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendMigrationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendMigrationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendMigrationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>When you call this operation, the synchronization task must be in the Synchronizing state.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>A synchronization task cannot be paused for more than 6 hours. Otherwise, the task cannot be restarted.</li>
     * <li>DTS continues to charge fees for a pay-as-you-go synchronization task even if the task is paused. This is because DTS only pauses writing data to the destination instance but continues to pull logs from the source instance to ensure quick resumption when the task is restarted. Therefore, the task still consumes resources such as bandwidth of the source database.</li>
     * </ul>
     * 
     * @param request the request parameters of SuspendSynchronizationJob  SuspendSynchronizationJobRequest
     * @return SuspendSynchronizationJobResponse
     */
    @Override
    public CompletableFuture<SuspendSynchronizationJobResponse> suspendSynchronizationJob(SuspendSynchronizationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendSynchronizationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendSynchronizationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendSynchronizationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchPhysicalDtsJobToCloud  SwitchPhysicalDtsJobToCloudRequest
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    @Override
    public CompletableFuture<SwitchPhysicalDtsJobToCloudResponse> switchPhysicalDtsJobToCloud(SwitchPhysicalDtsJobToCloudRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchPhysicalDtsJobToCloud").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchPhysicalDtsJobToCloudResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchPhysicalDtsJobToCloudResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchSynchronizationEndpoint  SwitchSynchronizationEndpointRequest
     * @return SwitchSynchronizationEndpointResponse
     */
    @Override
    public CompletableFuture<SwitchSynchronizationEndpointResponse> switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchSynchronizationEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchSynchronizationEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchSynchronizationEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags and attach different tags to instances for categorization. Then, you can filter instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key-value pair. Tag keys must be unique within the same Alibaba Cloud account and region. Tag values do not have this restriction.</li>
     * <li>If the specified tag does not exist, the tag is automatically created and attached to the destination instance.</li>
     * <li>If the instance already has a tag with the same key, the existing tag is overwritten.</li>
     * <li>You can attach up to 20 tags to each instance.</li>
     * <li>You can invoke the operation to attach tags to up to 50 instances at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Downgrading DTS instance specifications is no longer supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the source of a DTS instance is Redis 6.0 and incremental data updates exist, do not perform an upgrade. Otherwise, the DTS instance may fail and cannot be recovered. You must reconfigure the instance after a failure.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferInstanceClass  TransferInstanceClassRequest
     * @return TransferInstanceClassResponse
     */
    @Override
    public CompletableFuture<TransferInstanceClassResponse> transferInstanceClass(TransferInstanceClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferInstanceClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferInstanceClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferInstanceClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</p>
     * <ul>
     * <li>To avoid resource waste, confirm the payment method transformation before you perform the operation.</li>
     * <li>Data migration instances support only the pay-as-you-go billing method. No transformation is required.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>Serverless instances do not support payment method transformation.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferPayType  TransferPayTypeRequest
     * @return TransferPayTypeResponse
     */
    @Override
    public CompletableFuture<TransferPayTypeResponse> transferPayType(TransferPayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferPayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferPayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferPayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a tag is unbound from an instance, the tag is automatically deleted if it is not bound to any other instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of ApsaraDB DTS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of ApsaraDB DTS.
     * Before you begin:</p>
     * <ul>
     * <li>The database type of both the source instance and the destination instance of the data synchronization node must be <strong>MySQL</strong>.</li>
     * <li>The synchronization topology of the data synchronization node must be <strong>one-way synchronization</strong>.</li>
     * <li>The data synchronization node must be in the <strong>Synchronizing</strong> state.</li>
     * <li>During the upgrade, data synchronization may experience a latency of approximately 5 seconds. Perform this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeTwoWay  UpgradeTwoWayRequest
     * @return UpgradeTwoWayResponse
     */
    @Override
    public CompletableFuture<UpgradeTwoWayResponse> upgradeTwoWay(UpgradeTwoWayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeTwoWay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeTwoWayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeTwoWayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/84900.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database for migration, synchronization, or subscribe</a>.
     * &lt;props=&quot;intl&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/176627.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database</a>.</p>
     * <blockquote>
     * <p>If the <strong>source or destination database</strong> is an <strong>Alibaba Cloud database instance</strong> (such as ApsaraDB RDS or ApsaraDB for MongoDB) or a <strong>self-managed database hosted on ECS</strong>, the system automatically adds the IP addresses of DTS servers to the security settings of the instance when you click <strong>Authorize Whitelist and Proceed to Next Step</strong> during the configuration of the source or destination instance. You do not need to manually add the IP addresses.</p>
     * </blockquote>
     * 
     * @param request the request parameters of WhiteIpList  WhiteIpListRequest
     * @return WhiteIpListResponse
     */
    @Override
    public CompletableFuture<WhiteIpListResponse> whiteIpList(WhiteIpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WhiteIpList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WhiteIpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WhiteIpListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}

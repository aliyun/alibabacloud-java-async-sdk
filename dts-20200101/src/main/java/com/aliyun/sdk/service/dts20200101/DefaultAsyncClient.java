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
      * After you call this operation to configure a data migration task, the task will be automatically started. You do not need to call the [StartMigrationJob](~~49429~~) operation to start the task.
      * A data migration task may fail to be started due to precheck failures. You can call the [DescribeMigrationJobStatus](~~49433~~) operation to query the error messages about precheck failures. Then, you can fix the issue based on the error messages. After you fix the issue, you must call the [StartMigrationJob](~~49429~~) operation to restart the data migration task.
      *
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
      * The operation that you want to perform. Set the value to **ConfigureSubscriptionInstance**.
      *
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
      * Before you call this operation, you must call the [CreateSynchronizationJob](~~49446~~) operation to create a data synchronization instance.
      * > 
      * *   After you call this operation to configure a data synchronization task, the task will be automatically started and prechecked. You do not need to call the [StartSynchronizationJob](~~49448~~) operation to start the task.
      * *   A data synchronization task may fail to be started due to precheck failures. You can call the [DescribeSynchronizationJobStatus](~~49453~~) operation to query the status of the task. Then, you can change parameter settings based on the error messages about the precheck failures. After you fix the issue, you must call the [StartSynchronizationJob](~~49448~~) operation to restart the data synchronization task.
      *
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
      * When you use Data Transmission Service (DTS) to synchronize data, other data sources may write data to the destination instance. In this case, data may become inconsistent between the source and destination instances. To ensure data consistency, you can enable image matching.
      * After you call this operation, you can call the [DescribeSynchronizationJobReplicatorCompare](~~199183~~) operation to verify whether image matching is enabled for the data synchronization instance.
      *
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
      * *   Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of DTS.
      * *   If you want to run a DTS task on a DTS dedicated cluster, you must configure the task before you purchase a DTS instance. You can call the [ConfigureDtsJob](~~208399~~) operation to configure a DTS task.
      *
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
      * DTS provides the following metrics for DTS tasks:************
      * *   **Latency**: DTS monitors the latency of a DTS task. If the latency of the task exceeds the specified threshold, an alert is triggered. Unit: seconds.
      * *   **Status**: DTS monitors the status of a DTS task. If the state of the task changes to **Error** or **Restore**, an alert is triggered.
      * *   **Full Timeout**: DTS monitors the duration of a DTS task. If the duration of the task exceeds the specified threshold, an alert is triggered. Unit: hours.
      *
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
      * >  This API operation is outdated. We recommend that you use the new version. For more information, see [CreateDtsInstance](~~208270~~).
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      * After you purchase a data migration instance, you must call the [ConfigureMigrationJob](~~324260~~) operation to configure a data migration task.
      *
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      *
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
      * After you purchase a data synchronization instance, you must call the [ConfigureSynchronizationJob](~~49447~~) operation to configure a data synchronization task. Then, the task is automatically started.
      *
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
      * >  After a data migration instance is released, it cannot be recovered.
      *
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
      * >  After a change tracking instance is released, it cannot be recovered.
      *
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
      * >  After a data synchronization instance is released, it cannot be recovered.
      *
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
      * If the **source or destination instance** is an **on-premises database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](~~176627~~).
      * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on ECS**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically add the CIDR blocks of DTS servers to the security settings of the source or destination instance.
      *
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
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Dts\\&api=DescribeDtsJobs\\&type=RPC\\&version=2020-01-01)
      *
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
      * Before you call this operation, you must call the [SwitchSynchronizationEndpoint](~~201858~~) operation to change the database connection settings.
      *
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
      * When you call this operation, the data migration task must be in the Migrating, Failed, Paused, or Finished state.
      *
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
      * *   When Data Transmission Service (DTS) tracks data changes from a PolarDB-X 1.0 instance, data is distributed across the attached ApsaraDB RDS for MySQL instances. DTS runs a subtask for each ApsaraDB RDS for MySQL instance. You can call this operation to query the details of the subtasks in a distributed change tracking task.
      * *   You can call the [DescribeDtsJobs](~~209702~~) operation to query the ID of the change tracking instance and the ID of the consumer group.
      *
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
      * Before you call this operation, you must call the [ModifySynchronizationObject](~~49451~~) operation to obtain the task ID.
      *
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
      * *   The node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database that is connected over Cloud Enterprise Network (CEN).
      * *   This operation is used to initialize the built-in account named rdsdt_dtsacct on a node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform data synchronization tasks.
      *
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
      * ****
      *
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
      * > 
      * *   This operation is applicable to only the new version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the ConfigureSubscriptionInstance operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
      * *   When you call this operation, the change tracking task must be in the NotStarted, Failed, Normal, or Abnormal state.
      *
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
      * > 
      * *   This operation is applicable to only the previous version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the [ConfigureSubscriptionInstance](~~49437~~) operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
      * *   If you use the new version, you need to set the consumption checkpoint on the change tracking client.
      * *   When you call this operation, you must stop the change tracking client, and the change tracking task must be in the Normal state.
      *
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
      * You can modify only the overcommit ratio.
      *
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
      * *   DTS allows you to upgrade or downgrade the configurations of DTS instances in a dedicated cluster. You can adjust the resources that are occupied for task execution to dynamically adjust the number of tasks that can be scheduled in the cluster. This way, you can reduce the total number of DUs required for the cluster or release DUs.
      * *   Before you modify the upper limit of DUs for a DTS task, make sure that sufficient DUs are available.
      *
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
      * When you call this operation, the change tracking task must be in the Normal, NotStarted, or Failed state.
      * > 
      * *   If you call this operation to modify the objects of a change tracking task that is in the Normal state, DTS automatically calls the [StartSubscriptionInstance](~~49438~~) to restart the task.
      * *   If you call this operation to modify the objects of a change tracking task that is in the NotStarted or Failed state, DTS does not automatically start the task. You must call the [StartSubscriptionInstance](~~49438~~) to restart the task.
      *
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
      * >  When you call this operation, the data synchronization task must be in the Not Started or Synchronizing state.
      *
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
      * >  If you clear the configurations of a data synchronization or change tracking task, DTS deletes the task. Then, DTS creates another task. The task is in the Not Configured state. You must call the [ConfigureDtsJob](~~208399~~) operation reconfigure the task.
      *
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
      * >  If you clear the configurations of a data synchronization task, the task will be released. To start the task again, you must call the **ConfigureSynchronizationJob** operation to reconfigure the task.
      *
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
      * If you call this operation to ignore all precheck items, you must call the [StartMigrationJob](https://www.alibabacloud.com/help/zh/doc-detail/49429.htm) or [StartSynchronizationJob](https://www.alibabacloud.com/help/zh/doc-detail/49448.htm) operation. DTS performs a precheck again. After the data migration or synchronization task passes the precheck, the task will be automatically started.
      *
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
      * >  When you call this operation, the data migration task must be in the Not Started, Paused, or Migration Failed state.
      *
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
      * Before you call this operation, make sure that your instance is not released and is paused. You can check the status of the instance in the Data Transmission Service (DTS) console or by calling the [DescribeDtsJobDetail](~~208925~~) operation.
      *
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
      * When you call this operation, the change tracking task must be in the NotStarted or Failed state.
      *
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
      * >  After you call this operation to stop a data migration task, the status of the task changes to Finished and you cannot restart the task by calling the [StartMigrationJob](~~49429~~) operation.
      *
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
      * ****
      *
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
      * > 
      * *   If a data migration task is performing incremental data migration, we recommend that you do not pause the task for more than 6 hours. Otherwise, you will not be able to call the [StartMigrationJob](~~49429~~) operation to restart the task.
      * *   If you select incremental data migration as the migration type for a pay-as-you-go instance, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, incremental data migration consumes resources such as the bandwidth of the source database.
      *
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
      * > 
      * *   When you call this operation, the data synchronization task must be in the Synchronizing state.
      * *   We recommend that you do not pause a data synchronization task for more than 6 hours. Otherwise, the task cannot be started again.
      * *   If the billing method is pay-as-you-go, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, data synchronization consumes resources such as the bandwidth of the source database.
      *
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
      * *   If the source or destination database is a self-managed MySQL database connected over the Internet, Elastic Compute Service (ECS) or Express Connect, you must call this operation to update the connection settings.
      * *   If the source or destination database is hosted on an ApsaraDB instance (such as ApsaraDB RDS instance and ApsaraDB for MongoDB instance), DTS automatically updates the connection settings. You do not need to call this operation.
      * > *   For two-way synchronization tasks, if you perform a primary/secondary switchover on the source or destination database, you must call this operation twice to update the connection settings.
      *         For example, if you perform a primary/secondary switchover on the destination database of the forward direction, you must call this operation twice. In the first call, set the **SynchronizationDirection** parameter to **Forward**, set the **Endpoint.Type **parameter to **Destination**, and configure the connection settings. In the second call, set the **SynchronizationDirection** parameter to **Reverse**, set the **Endpoint.Type **parameter to **Source**, and configure the connection settings.
      *
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
      * If you have a large number of instances, you can create multiple tags and bind these tags to the instances. Then, you can filter the instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
      * *   If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances in each call.
      *
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of DTS.
      * *   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.
      * *   Data migration instances are all pay-as-you-go instances. You do not need to change the billing method of data migration instances.
      * *   After you change the billing method from pay-as-you-go to subscription, the DTS instance is not affected.
      *
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
      * >  If a tag is unbound from an instance and is not bound to other instances, the tag is deleted.
      *
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
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS)
      * When you call this operation, take note of the following information:
      * *   The source and destination databases of the data synchronization task are both **MySQL** databases.
      * *   The synchronization topology of the data synchronization task is **one-way synchronization**.
      * *   The data synchronization task is in the **Synchronizing** state.
      * *   The upgrade operation causes data synchronization latency of about 5 seconds. We recommend that you perform this operation during off-peak hours.
      *
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
      * The operation that you want to perform. Set the value to **WhiteIpList**.
      *
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

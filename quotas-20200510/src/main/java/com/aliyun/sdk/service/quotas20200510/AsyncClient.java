// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.quotas20200510.models.*;
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
      * The ID of the alert.
      *
     */
    CompletableFuture<CreateQuotaAlarmResponse> createQuotaAlarm(CreateQuotaAlarmRequest request);

    /**
      * In this example, the operation is called to submit an application to increase the value of a quota whose ID is `q_security-groups` and whose name is Maximum Number of Security Groups. The quota belongs to Elastic Compute Service (ECS). The expected value of the quota is `804`, the application reason is `Scale Out`, and the ID of the region to which the quota belongs is `cn-hangzhou`.
      *
     */
    CompletableFuture<CreateQuotaApplicationResponse> createQuotaApplication(CreateQuotaApplicationRequest request);

    /**
      * ### [](#)QPS limit
      * You can add a maximum of 10 quota items to a quota template at a time.
      *
     */
    CompletableFuture<CreateQuotaApplicationsForTemplateResponse> createQuotaApplicationsForTemplate(CreateQuotaApplicationsForTemplateRequest request);

    /**
      * ### [](#)Prerequisites
      * You must set the `ServiceStatus` parameter to `1`. This ensures that the quota template is enabled.
      * You can call the [GetQuotaTemplateServiceStatus](~~450407~~) operation to query the status of a quota template. If the `ServiceStatus` parameter is set to `0` or `-1`, you must call the [ModifyQuotaTemplateServiceStatus](~~450406~~) operation to set the ServiceStatus parameter to `1`.
      *
     */
    CompletableFuture<CreateTemplateQuotaItemResponse> createTemplateQuotaItem(CreateTemplateQuotaItemRequest request);

    /**
      * In this example, the operation is called to delete a quota alert whose ID is `6b512ab7-da3a-4142-b529-2b2a9294****`.
      *
     */
    CompletableFuture<DeleteQuotaAlarmResponse> deleteQuotaAlarm(DeleteQuotaAlarmRequest request);

    CompletableFuture<DeleteTemplateQuotaItemResponse> deleteTemplateQuotaItem(DeleteTemplateQuotaItemRequest request);

    /**
      * In this example, the operation is called to query the details of a quota whose ID is `q_security-groups` and whose name is Maximum Number of Security Groups. This quota belongs to Elastic Compute Service (ECS). The query result shows the details of the quota. The details include the name, ID, description, quota value, used quota, unit, and dimension of the quota. In this example, the quota name is `Maximum Number of Security Groups`. The quota ID is `q_security-groups`. The description is `The maximum number of security groups that can be created for the current account`. The quota value is `801`. The used quota is `26`. The quota unit is `Number of security groups`. The quota dimension is `{"regionId":"cn-hangzhou"}`.
      *
     */
    CompletableFuture<GetProductQuotaResponse> getProductQuota(GetProductQuotaRequest request);

    /**
      * In this example, the operation is called to query the details of a quota dimension whose key is `regionId`. The quota dimension belongs to Elastic Compute Service (ECS) Quotas by Instance Type whose service code is ecs-spec. The following query results are returned:
      * *   The values of the quota dimension include `cn-shenzhen`, `cn-beijing`, and `cn-hangzhou`.
      * *   The name of the quota dimension is `region`.
      *
     */
    CompletableFuture<GetProductQuotaDimensionResponse> getProductQuotaDimension(GetProductQuotaDimensionRequest request);

    /**
      * In this example, the operation is called to query the details of a quota alert whose ID is `78d7e436-4b25-4897-84b5-d7b656bb****`. The details of the alert are returned. The query result includes the alert ID, alert name, alert contact, and the time when the quota alert was created.
      *
     */
    CompletableFuture<GetQuotaAlarmResponse> getQuotaAlarm(GetQuotaAlarmRequest request);

    /**
      * In this example, the operation is called to query the details about an application whose ID is `d314d6ae-867d-484c-9009-3d421a80****`. The query result shows the details about the application. The details include the application ID, application time, expected quota value, and application result.
      *
     */
    CompletableFuture<GetQuotaApplicationResponse> getQuotaApplication(GetQuotaApplicationRequest request);

    /**
      * ### [](#)Prerequisites
      * Make sure that you have created an application for quota increase. For more information, see [CreateQuotaApplication](~~440566~~).
      *
     */
    CompletableFuture<GetQuotaApplicationApprovalResponse> getQuotaApplicationApproval(GetQuotaApplicationApprovalRequest request);

    CompletableFuture<GetQuotaTemplateServiceStatusResponse> getQuotaTemplateServiceStatus(GetQuotaTemplateServiceStatusRequest request);

    CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistories(ListAlarmHistoriesRequest request);

    /**
      * In this example, the operation is called to query the quotas on which a Container Service for Kubernetes (ACK) quota whose ID is `q_i5uzm3` depends. This quota is the maximum number of nodes that can be created in an ACK cluster. The query result indicates that the specified quota depends on the following three quotas:
      * *   An Elastic Compute Service (ECS) quota whose ID is `q_elastic-network-interfaces`. This quota is the maximum number of ENIs (Secondary ENIs) that can be owned by an Alibaba Cloud account. The quota is available in the following regions: `cn-shenzhen`, `cn-beijing`, and `cn-hangzhou`.
      * *   A Server Load Balancer (SLB) quota whose ID is `q_fh20b0`. This quota is the number of servers that can be attached to the backend of an SLB instance.
      * *   An SLB quota whose ID is `q_3mmbsp`. This quota is the number of SLB instances that can be owned by an Alibaba Cloud account.
      *
     */
    CompletableFuture<ListDependentQuotasResponse> listDependentQuotas(ListDependentQuotasRequest request);

    /**
      * This topic provides an example on how to call the ListProductDimensionGroups operation to query the dimension groups of Object Storage Service (OSS). In this example, a dimension group is returned. The group name is `OSS_Group`, the group code is `oss_wf1ngqmd7q`, and the group key is `chargeType`.
      *
     */
    CompletableFuture<ListProductDimensionGroupsResponse> listProductDimensionGroups(ListProductDimensionGroupsRequest request);

    /**
      * In this example, the operation is called to query the quota dimensions that are supported by Elastic Compute Service (ECS). The query results show all the quota dimensions that are supported by ECS.
      *
     */
    CompletableFuture<ListProductQuotaDimensionsResponse> listProductQuotaDimensions(ListProductQuotaDimensionsRequest request);

    /**
      * In this example, the operation is called to query the quotas whose instance type is `ecs.g5.2xlarge`. The quotas belong to Elastic Compute Service (ECS) Quotas by Instance Type. The query result includes the name, ID, unit, dimensions, and cycle of each quota.
      *
     */
    CompletableFuture<ListProductQuotasResponse> listProductQuotas(ListProductQuotasRequest request);

    /**
      * The services in the query result are the same as the services listed in [Alibaba Cloud services that support Quota Center](~~182368~~).
      *
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    CompletableFuture<ListQuotaAlarmsResponse> listQuotaAlarms(ListQuotaAlarmsRequest request);

    CompletableFuture<ListQuotaApplicationTemplatesResponse> listQuotaApplicationTemplates(ListQuotaApplicationTemplatesRequest request);

    /**
      * In this example, the operation is called to query the details of an application that is submitted to increase a quota whose ID is `q_i5uzm3` and whose name is Maximum Number of Nodes. This quota belongs to Container Service for Kubernetes (ACK). The query result shows the details of the application. The details include the application ID, application time, requested quota, and application result. In this example, the application ID is `b926571d-cc09-4711-b547-58a615f0****`. The application time is `2021-01-15T09:13:53Z`. The expected quota value is `101`. The application result is `Agree`.
      *
     */
    CompletableFuture<ListQuotaApplicationsResponse> listQuotaApplications(ListQuotaApplicationsRequest request);

    CompletableFuture<ListQuotaApplicationsDetailForTemplateResponse> listQuotaApplicationsDetailForTemplate(ListQuotaApplicationsDetailForTemplateRequest request);

    CompletableFuture<ListQuotaApplicationsForTemplateResponse> listQuotaApplicationsForTemplate(ListQuotaApplicationsForTemplateRequest request);

    /**
      * ### [](#)Prerequisites
      * A resource directory is enabled. For more information, see [EnableResourceDirectory](~~604185~~).
      * ### [](#)Usage notes
      * If the `ServiceStatus` parameter is set to `0` or `-1`, you can call this operation to set the parameter to `1`. Then, you can call the [CreateTemplateQuotaItem](~~450615~~) operation to create a quota template.
      *
     */
    CompletableFuture<ModifyQuotaTemplateServiceStatusResponse> modifyQuotaTemplateServiceStatus(ModifyQuotaTemplateServiceStatusRequest request);

    CompletableFuture<ModifyTemplateQuotaItemResponse> modifyTemplateQuotaItem(ModifyTemplateQuotaItemRequest request);

    /**
      * >  You can call this operation to enable the approval reminder feature for quota applications that support this feature. To check whether this feature is supported, you can view the value of `SupportReminder` in the GetQuotaApplicationApproval operation. If the value of SupportReminder is `true`, this feature is supported.
      *
     */
    CompletableFuture<RemindQuotaApplicationApprovalResponse> remindQuotaApplicationApproval(RemindQuotaApplicationApprovalRequest request);

    /**
      * In this example, the operation is called to modify the information about a quota alert whose ID is `a2efa7fc-832f-47bb-8054-39e28012****` and whose name is `rules`. The alert threshold is changed from `150` to `160`.
      *
     */
    CompletableFuture<UpdateQuotaAlarmResponse> updateQuotaAlarm(UpdateQuotaAlarmRequest request);

}

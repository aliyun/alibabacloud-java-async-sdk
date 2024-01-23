// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hologram20220601.models.*;
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
      * > Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.
      * *   For more information about the billing details of Hologres, see [Pricing](https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance).
      * *   When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:
      * <!---->
      *     cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
      *        cn-shanghai: cn-shanghai-e, cn-shanghai-f
      *        cn-beijing: cn-beijing-i, cn-beijing-g
      *        cn-zhangjiakou: cn-zhangjiakou-b
      *        cn-shenzhen: cn-shenzhen-e
      *        cn-hongkong: cn-hongkong-b
      *        cn-shanghai-finance-1: cn-shanghai-finance-1z
      *        ap-northeast-1: ap-northeast-1a
      *        ap-southeast-1: ap-southeast-1c
      *        ap-southeast-3: ap-southeast-3b
      *        ap-southeast-5: ap-southeast-5b
      *        ap-south-1: ap-south-1b
      *        eu-central-1: eu-central-1a
      *        us-east-1: us-east-1a
      *        us-west-1: us-west-1b
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
      * > Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.
      * *   After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see [Billing overview](https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview#section-h6a-x58-jc0).
      * *   You can delete only pay-as-you-go instances.
      * *   If you want to unsubscribe from a subscription instance, submit a ticket.[](https://help.aliyun.com/document_detail/150284.html#section-ogc-9vc-858)
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * > Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.
      * *   For more information about billing details of Hologres, see [Pricing](https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview).
      * *   For more information about how to renew a Hologres instance, see [Manage renewals](https://www.alibabacloud.com/help/en/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.73f27c8d1Q0FUi).
      * *   You can renew only subscription instances.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
      * > Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.
      * *   For more information about the billing of Hologres, see [Billing overview](https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview).
      * *   During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see [Upgrade or downgrade instance specifications](https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications).
      *
     */
    CompletableFuture<ScaleInstanceResponse> scaleInstance(ScaleInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    CompletableFuture<UpdateInstanceNetworkTypeResponse> updateInstanceNetworkType(UpdateInstanceNetworkTypeRequest request);

}

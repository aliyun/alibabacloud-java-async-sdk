// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAppInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppInstanceGroupResponseBody</p>
 */
public class CreateAppInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupModel")
    private AppInstanceGroupModel appInstanceGroupModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppInstanceGroupResponseBody(Builder builder) {
        this.appInstanceGroupModel = builder.appInstanceGroupModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupModel
     */
    public AppInstanceGroupModel getAppInstanceGroupModel() {
        return this.appInstanceGroupModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppInstanceGroupModel appInstanceGroupModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAppInstanceGroupResponseBody model) {
            this.appInstanceGroupModel = model.appInstanceGroupModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The delivery group.</p>
         */
        public Builder appInstanceGroupModel(AppInstanceGroupModel appInstanceGroupModel) {
            this.appInstanceGroupModel = appInstanceGroupModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppInstanceGroupResponseBody build() {
            return new CreateAppInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupResponseBody</p>
     */
    public static class AppInstanceGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        private AppInstanceGroupModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.nodePoolId = builder.nodePoolId;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceGroupModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String nodePoolId; 
            private String orderId; 

            private Builder() {
            } 

            private Builder(AppInstanceGroupModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.nodePoolId = model.nodePoolId;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The ID of the resource group. This parameter is returned if a resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-ew7va2g1wl3vm****</p>
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public AppInstanceGroupModel build() {
                return new AppInstanceGroupModel(this);
            } 

        } 

    }
}

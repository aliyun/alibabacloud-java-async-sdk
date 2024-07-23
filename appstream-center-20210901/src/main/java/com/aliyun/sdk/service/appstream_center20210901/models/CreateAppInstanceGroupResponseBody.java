// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * AppInstanceGroupModel.
         */
        public Builder appInstanceGroupModel(AppInstanceGroupModel appInstanceGroupModel) {
            this.appInstanceGroupModel = appInstanceGroupModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppInstanceGroupResponseBody build() {
            return new CreateAppInstanceGroupResponseBody(this);
        } 

    } 

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

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * NodePoolId.
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * OrderId.
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

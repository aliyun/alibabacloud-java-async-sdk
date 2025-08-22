// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndroidInstanceGroupResponseBody</p>
 */
public class CreateAndroidInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    @com.aliyun.core.annotation.NameInMap("InstanceGroupInfos")
    private java.util.List<InstanceGroupInfos> instanceGroupInfos;

    @com.aliyun.core.annotation.NameInMap("NetworkPackageOrderModel")
    private NetworkPackageOrderModel networkPackageOrderModel;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAndroidInstanceGroupResponseBody(Builder builder) {
        this.instanceGroupIds = builder.instanceGroupIds;
        this.instanceGroupInfos = builder.instanceGroupInfos;
        this.networkPackageOrderModel = builder.networkPackageOrderModel;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndroidInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    /**
     * @return instanceGroupInfos
     */
    public java.util.List<InstanceGroupInfos> getInstanceGroupInfos() {
        return this.instanceGroupInfos;
    }

    /**
     * @return networkPackageOrderModel
     */
    public NetworkPackageOrderModel getNetworkPackageOrderModel() {
        return this.networkPackageOrderModel;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> instanceGroupIds; 
        private java.util.List<InstanceGroupInfos> instanceGroupInfos; 
        private NetworkPackageOrderModel networkPackageOrderModel; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAndroidInstanceGroupResponseBody model) {
            this.instanceGroupIds = model.instanceGroupIds;
            this.instanceGroupInfos = model.instanceGroupInfos;
            this.networkPackageOrderModel = model.networkPackageOrderModel;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the instance groups.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        /**
         * <p>The instance groups.</p>
         */
        public Builder instanceGroupInfos(java.util.List<InstanceGroupInfos> instanceGroupInfos) {
            this.instanceGroupInfos = instanceGroupInfos;
            return this;
        }

        /**
         * NetworkPackageOrderModel.
         */
        public Builder networkPackageOrderModel(NetworkPackageOrderModel networkPackageOrderModel) {
            this.networkPackageOrderModel = networkPackageOrderModel;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>22365781890****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAndroidInstanceGroupResponseBody build() {
            return new CreateAndroidInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAndroidInstanceGroupResponseBody</p>
     */
    public static class InstanceGroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        private InstanceGroupInfos(Builder builder) {
            this.instanceGroupId = builder.instanceGroupId;
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceGroupInfos create() {
            return builder().build();
        }

        /**
         * @return instanceGroupId
         */
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private String instanceGroupId; 
            private java.util.List<String> instanceIds; 

            private Builder() {
            } 

            private Builder(InstanceGroupInfos model) {
                this.instanceGroupId = model.instanceGroupId;
                this.instanceIds = model.instanceIds;
            } 

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>ag-cuv4scs4obxch****</p>
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * <p>The IDs of the instances.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public InstanceGroupInfos build() {
                return new InstanceGroupInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAndroidInstanceGroupResponseBody</p>
     */
    public static class NetworkPackageOrderModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageOrderId")
        private String bandwidthPackageOrderId;

        private NetworkPackageOrderModel(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageOrderId = builder.bandwidthPackageOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkPackageOrderModel create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageOrderId
         */
        public String getBandwidthPackageOrderId() {
            return this.bandwidthPackageOrderId;
        }

        public static final class Builder {
            private String bandwidthPackageId; 
            private String bandwidthPackageOrderId; 

            private Builder() {
            } 

            private Builder(NetworkPackageOrderModel model) {
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthPackageOrderId = model.bandwidthPackageOrderId;
            } 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * BandwidthPackageOrderId.
             */
            public Builder bandwidthPackageOrderId(String bandwidthPackageOrderId) {
                this.bandwidthPackageOrderId = bandwidthPackageOrderId;
                return this;
            }

            public NetworkPackageOrderModel build() {
                return new NetworkPackageOrderModel(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormV2StreamEngineInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormV2StreamEngineInfoResponseBody</p>
 */
public class GetLindormV2StreamEngineInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupList")
    private java.util.List<ResourceGroupList> resourceGroupList;

    private GetLindormV2StreamEngineInfoResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.resourceGroupList = builder.resourceGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormV2StreamEngineInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupList
     */
    public java.util.List<ResourceGroupList> getResourceGroupList() {
        return this.resourceGroupList;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private java.util.List<ResourceGroupList> resourceGroupList; 

        private Builder() {
        } 

        private Builder(GetLindormV2StreamEngineInfoResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.resourceGroupList = model.resourceGroupList;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupList.
         */
        public Builder resourceGroupList(java.util.List<ResourceGroupList> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }

        public GetLindormV2StreamEngineInfoResponseBody build() {
            return new GetLindormV2StreamEngineInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormV2StreamEngineInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2StreamEngineInfoResponseBody</p>
     */
    public static class ResourceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JmIpList")
        private java.util.List<String> jmIpList;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SgIpList")
        private java.util.List<String> sgIpList;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceGroupList(Builder builder) {
            this.jmIpList = builder.jmIpList;
            this.quantity = builder.quantity;
            this.resourceGroupName = builder.resourceGroupName;
            this.sgIpList = builder.sgIpList;
            this.spec = builder.spec;
            this.specId = builder.specId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupList create() {
            return builder().build();
        }

        /**
         * @return jmIpList
         */
        public java.util.List<String> getJmIpList() {
            return this.jmIpList;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return sgIpList
         */
        public java.util.List<String> getSgIpList() {
            return this.sgIpList;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> jmIpList; 
            private Integer quantity; 
            private String resourceGroupName; 
            private java.util.List<String> sgIpList; 
            private String spec; 
            private String specId; 
            private String status; 

            private Builder() {
            } 

            private Builder(ResourceGroupList model) {
                this.jmIpList = model.jmIpList;
                this.quantity = model.quantity;
                this.resourceGroupName = model.resourceGroupName;
                this.sgIpList = model.sgIpList;
                this.spec = model.spec;
                this.specId = model.specId;
                this.status = model.status;
            } 

            /**
             * JmIpList.
             */
            public Builder jmIpList(java.util.List<String> jmIpList) {
                this.jmIpList = jmIpList;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * SgIpList.
             */
            public Builder sgIpList(java.util.List<String> sgIpList) {
                this.sgIpList = sgIpList;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceGroupList build() {
                return new ResourceGroupList(this);
            } 

        } 

    }
}

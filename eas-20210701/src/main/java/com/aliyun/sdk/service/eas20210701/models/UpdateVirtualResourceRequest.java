// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateVirtualResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirtualResourceRequest</p>
 */
public class UpdateVirtualResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisableSpotProtectionPeriod")
    private Boolean disableSpotProtectionPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualResourceName")
    private String virtualResourceName;

    private UpdateVirtualResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.virtualResourceId = builder.virtualResourceId;
        this.disableSpotProtectionPeriod = builder.disableSpotProtectionPeriod;
        this.resources = builder.resources;
        this.virtualResourceName = builder.virtualResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    /**
     * @return disableSpotProtectionPeriod
     */
    public Boolean getDisableSpotProtectionPeriod() {
        return this.disableSpotProtectionPeriod;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return virtualResourceName
     */
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static final class Builder extends Request.Builder<UpdateVirtualResourceRequest, Builder> {
        private String clusterId; 
        private String virtualResourceId; 
        private Boolean disableSpotProtectionPeriod; 
        private java.util.List<Resources> resources; 
        private String virtualResourceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirtualResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.virtualResourceId = request.virtualResourceId;
            this.disableSpotProtectionPeriod = request.disableSpotProtectionPeriod;
            this.resources = request.resources;
            this.virtualResourceName = request.virtualResourceName;
        } 

        /**
         * <p>The ID of the region to which the virtual resource group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.putPathParameter("VirtualResourceId", virtualResourceId);
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        /**
         * <p>Specifies whether to disable the retention period of preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
            this.putBodyParameter("DisableSpotProtectionPeriod", disableSpotProtectionPeriod);
            this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
            return this;
        }

        /**
         * <p>The resources in the virtual resource group.</p>
         * <blockquote>
         * <p> If you specify this parameter, previous data is overwritten.</p>
         * </blockquote>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The new name of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>NewMyVirtualResource</p>
         */
        public Builder virtualResourceName(String virtualResourceName) {
            this.putBodyParameter("VirtualResourceName", virtualResourceName);
            this.virtualResourceName = virtualResourceName;
            return this;
        }

        @Override
        public UpdateVirtualResourceRequest build() {
            return new UpdateVirtualResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVirtualResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateVirtualResourceRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("QuotaId")
        private String quotaId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        private Resources(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priority = builder.priority;
            this.quotaId = builder.quotaId;
            this.region = builder.region;
            this.resourceId = builder.resourceId;
            this.spotPriceLimit = builder.spotPriceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return quotaId
         */
        public String getQuotaId() {
            return this.quotaId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer priority; 
            private String quotaId; 
            private String region; 
            private String resourceId; 
            private Float spotPriceLimit; 

            /**
             * <p>The instance type of the public resource group.</p>
             * <blockquote>
             * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m2.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The priority of resource scheduling. A greater number indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the Lingjun resource quota.</p>
             * <blockquote>
             * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>quota185lqf994k6</p>
             */
            public Builder quotaId(String quotaId) {
                this.quotaId = quotaId;
                return this;
            }

            /**
             * <p>The region in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the dedicated resource group. For information about how to obtain the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
             * <blockquote>
             * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>eas-r-g55ieatgg3butwrn7a</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The maximum price of preemptible instances in a public resource group.</p>
             * <blockquote>
             * <p> If you leave this parameter empty, preemptible instances are not used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.05</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link ModifyPrepayInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayInstanceSpecRequest</p>
 */
public class ModifyPrepayInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
    private HaResourceSpec haResourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
    private java.util.List<String> haVSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HaZoneId")
    private String haZoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceSpec resourceSpec;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.ha = builder.ha;
        this.haResourceSpec = builder.haResourceSpec;
        this.haVSwitchIds = builder.haVSwitchIds;
        this.haZoneId = builder.haZoneId;
        this.instanceId = builder.instanceId;
        this.region = builder.region;
        this.resourceSpec = builder.resourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
    }

    /**
     * @return haResourceSpec
     */
    public HaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    /**
     * @return haVSwitchIds
     */
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    /**
     * @return haZoneId
     */
    public String getHaZoneId() {
        return this.haZoneId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private Boolean ha; 
        private HaResourceSpec haResourceSpec; 
        private java.util.List<String> haVSwitchIds; 
        private String haZoneId; 
        private String instanceId; 
        private String region; 
        private ResourceSpec resourceSpec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest request) {
            super(request);
            this.ha = request.ha;
            this.haResourceSpec = request.haResourceSpec;
            this.haVSwitchIds = request.haVSwitchIds;
            this.haZoneId = request.haZoneId;
            this.instanceId = request.instanceId;
            this.region = request.region;
            this.resourceSpec = request.resourceSpec;
        } 

        /**
         * Ha.
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("Ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * HaResourceSpec.
         */
        public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
            String haResourceSpecShrink = shrink(haResourceSpec, "HaResourceSpec", "json");
            this.putBodyParameter("HaResourceSpec", haResourceSpecShrink);
            this.haResourceSpec = haResourceSpec;
            return this;
        }

        /**
         * HaVSwitchIds.
         */
        public Builder haVSwitchIds(java.util.List<String> haVSwitchIds) {
            String haVSwitchIdsShrink = shrink(haVSwitchIds, "HaVSwitchIds", "json");
            this.putBodyParameter("HaVSwitchIds", haVSwitchIdsShrink);
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }

        /**
         * HaZoneId.
         */
        public Builder haZoneId(String haZoneId) {
            this.putBodyParameter("HaZoneId", haZoneId);
            this.haZoneId = haZoneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-wwo36qj4g06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            String resourceSpecShrink = shrink(resourceSpec, "ResourceSpec", "json");
            this.putBodyParameter("ResourceSpec", resourceSpecShrink);
            this.resourceSpec = resourceSpec;
            return this;
        }

        @Override
        public ModifyPrepayInstanceSpecRequest build() {
            return new ModifyPrepayInstanceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPrepayInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayInstanceSpecRequest</p>
     */
    public static class HaResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private HaResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public HaResourceSpec build() {
                return new HaResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyPrepayInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayInstanceSpecRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
    @com.aliyun.core.annotation.NameInMap("ModifyPrepayInstanceSpecRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.modifyPrepayInstanceSpecRequest = builder.modifyPrepayInstanceSpecRequest;
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
     * @return modifyPrepayInstanceSpecRequest
     */
    public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest getModifyPrepayInstanceSpecRequest() {
        return this.modifyPrepayInstanceSpecRequest;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest request) {
            super(request);
            this.modifyPrepayInstanceSpecRequest = request.modifyPrepayInstanceSpecRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifyPrepayInstanceSpecRequest(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest) {
            this.putBodyParameter("ModifyPrepayInstanceSpecRequest", modifyPrepayInstanceSpecRequest);
            this.modifyPrepayInstanceSpecRequest = modifyPrepayInstanceSpecRequest;
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

            private Builder() {
            } 

            private Builder(HaResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

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

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    /**
     * 
     * {@link ModifyPrepayInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayInstanceSpecRequest</p>
     */
    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("HaResourceSpec")
        private HaResourceSpec haResourceSpec;

        @com.aliyun.core.annotation.NameInMap("HaVSwitchIds")
        private java.util.List<String> haVSwitchIds;

        @com.aliyun.core.annotation.NameInMap("HaZoneId")
        private String haZoneId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private ResourceSpec resourceSpec;

        private ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest(Builder builder) {
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

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest create() {
            return builder().build();
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

        public static final class Builder {
            private Boolean ha; 
            private HaResourceSpec haResourceSpec; 
            private java.util.List<String> haVSwitchIds; 
            private String haZoneId; 
            private String instanceId; 
            private String region; 
            private ResourceSpec resourceSpec; 

            private Builder() {
            } 

            private Builder(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest model) {
                this.ha = model.ha;
                this.haResourceSpec = model.haResourceSpec;
                this.haVSwitchIds = model.haVSwitchIds;
                this.haZoneId = model.haZoneId;
                this.instanceId = model.instanceId;
                this.region = model.region;
                this.resourceSpec = model.resourceSpec;
            } 

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * HaResourceSpec.
             */
            public Builder haResourceSpec(HaResourceSpec haResourceSpec) {
                this.haResourceSpec = haResourceSpec;
                return this;
            }

            /**
             * HaVSwitchIds.
             */
            public Builder haVSwitchIds(java.util.List<String> haVSwitchIds) {
                this.haVSwitchIds = haVSwitchIds;
                return this;
            }

            /**
             * HaZoneId.
             */
            public Builder haZoneId(String haZoneId) {
                this.haZoneId = haZoneId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sc_flinkserverlesspost_public_cn-0ju2bj2i104</p>
             */
            public Builder instanceId(String instanceId) {
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
                this.region = region;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest build() {
                return new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest(this);
            } 

        } 

    }
}

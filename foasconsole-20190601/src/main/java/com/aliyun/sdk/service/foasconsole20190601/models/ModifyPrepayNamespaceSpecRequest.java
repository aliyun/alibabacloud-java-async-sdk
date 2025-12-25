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
 * {@link ModifyPrepayNamespaceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayNamespaceSpecRequest</p>
 */
public class ModifyPrepayNamespaceSpecRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyPrepayNamespaceSpecRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest;

    private ModifyPrepayNamespaceSpecRequest(Builder builder) {
        super(builder);
        this.modifyPrepayNamespaceSpecRequest = builder.modifyPrepayNamespaceSpecRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayNamespaceSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyPrepayNamespaceSpecRequest
     */
    public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest getModifyPrepayNamespaceSpecRequest() {
        return this.modifyPrepayNamespaceSpecRequest;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayNamespaceSpecRequest, Builder> {
        private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayNamespaceSpecRequest request) {
            super(request);
            this.modifyPrepayNamespaceSpecRequest = request.modifyPrepayNamespaceSpecRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifyPrepayNamespaceSpecRequest(ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest) {
            this.putBodyParameter("ModifyPrepayNamespaceSpecRequest", modifyPrepayNamespaceSpecRequest);
            this.modifyPrepayNamespaceSpecRequest = modifyPrepayNamespaceSpecRequest;
            return this;
        }

        @Override
        public ModifyPrepayNamespaceSpecRequest build() {
            return new ModifyPrepayNamespaceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPrepayNamespaceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayNamespaceSpecRequest</p>
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
     * {@link ModifyPrepayNamespaceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayNamespaceSpecRequest</p>
     */
    public static class ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private ResourceSpec resourceSpec;

        private ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.region = builder.region;
            this.resourceSpec = builder.resourceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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
            private String instanceId; 
            private String namespace; 
            private String region; 
            private ResourceSpec resourceSpec; 

            private Builder() {
            } 

            private Builder(ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest model) {
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.region = model.region;
                this.resourceSpec = model.resourceSpec;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sc_flinkserverlesspost_public_cn-0ju2bj2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ns-1</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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

            public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest build() {
                return new ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest(this);
            } 

        } 

    }
}

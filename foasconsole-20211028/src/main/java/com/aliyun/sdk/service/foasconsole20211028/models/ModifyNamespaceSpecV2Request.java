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
 * {@link ModifyNamespaceSpecV2Request} extends {@link RequestModel}
 *
 * <p>ModifyNamespaceSpecV2Request</p>
 */
public class ModifyNamespaceSpecV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticResourceSpec")
    private ElasticResourceSpec elasticResourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuaranteedResourceSpec")
    private GuaranteedResourceSpec guaranteedResourceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ha")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ModifyNamespaceSpecV2Request(Builder builder) {
        super(builder);
        this.elasticResourceSpec = builder.elasticResourceSpec;
        this.guaranteedResourceSpec = builder.guaranteedResourceSpec;
        this.ha = builder.ha;
        this.instanceId = builder.instanceId;
        this.namespace = builder.namespace;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNamespaceSpecV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticResourceSpec
     */
    public ElasticResourceSpec getElasticResourceSpec() {
        return this.elasticResourceSpec;
    }

    /**
     * @return guaranteedResourceSpec
     */
    public GuaranteedResourceSpec getGuaranteedResourceSpec() {
        return this.guaranteedResourceSpec;
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
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

    public static final class Builder extends Request.Builder<ModifyNamespaceSpecV2Request, Builder> {
        private ElasticResourceSpec elasticResourceSpec; 
        private GuaranteedResourceSpec guaranteedResourceSpec; 
        private Boolean ha; 
        private String instanceId; 
        private String namespace; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNamespaceSpecV2Request request) {
            super(request);
            this.elasticResourceSpec = request.elasticResourceSpec;
            this.guaranteedResourceSpec = request.guaranteedResourceSpec;
            this.ha = request.ha;
            this.instanceId = request.instanceId;
            this.namespace = request.namespace;
            this.region = request.region;
        } 

        /**
         * ElasticResourceSpec.
         */
        public Builder elasticResourceSpec(ElasticResourceSpec elasticResourceSpec) {
            String elasticResourceSpecShrink = shrink(elasticResourceSpec, "ElasticResourceSpec", "json");
            this.putBodyParameter("ElasticResourceSpec", elasticResourceSpecShrink);
            this.elasticResourceSpec = elasticResourceSpec;
            return this;
        }

        /**
         * GuaranteedResourceSpec.
         */
        public Builder guaranteedResourceSpec(GuaranteedResourceSpec guaranteedResourceSpec) {
            String guaranteedResourceSpecShrink = shrink(guaranteedResourceSpec, "GuaranteedResourceSpec", "json");
            this.putBodyParameter("GuaranteedResourceSpec", guaranteedResourceSpecShrink);
            this.guaranteedResourceSpec = guaranteedResourceSpec;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ha(Boolean ha) {
            this.putQueryParameter("Ha", ha);
            this.ha = ha;
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
         * <p>di-593439443804417</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
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
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ModifyNamespaceSpecV2Request build() {
            return new ModifyNamespaceSpecV2Request(this);
        } 

    } 

    /**
     * 
     * {@link ModifyNamespaceSpecV2Request} extends {@link TeaModel}
     *
     * <p>ModifyNamespaceSpecV2Request</p>
     */
    public static class ElasticResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer memoryGB;

        private ElasticResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticResourceSpec create() {
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

            private Builder(ElasticResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ElasticResourceSpec build() {
                return new ElasticResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyNamespaceSpecV2Request} extends {@link TeaModel}
     *
     * <p>ModifyNamespaceSpecV2Request</p>
     */
    public static class GuaranteedResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer memoryGB;

        private GuaranteedResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuaranteedResourceSpec create() {
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

            private Builder(GuaranteedResourceSpec model) {
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

            public GuaranteedResourceSpec build() {
                return new GuaranteedResourceSpec(this);
            } 

        } 

    }
}

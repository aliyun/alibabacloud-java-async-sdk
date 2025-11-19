// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyCloudResourceCertRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudResourceCertRequest</p>
 */
public class ModifyCloudResourceCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificates")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudResourceId")
    private String cloudResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @Deprecated
    @com.aliyun.core.annotation.Validation(maximum = 65534, minimum = 1)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    @Deprecated
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceProduct")
    @Deprecated
    private String resourceProduct;

    private ModifyCloudResourceCertRequest(Builder builder) {
        super(builder);
        this.certificates = builder.certificates;
        this.cloudResourceId = builder.cloudResourceId;
        this.instanceId = builder.instanceId;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceProduct = builder.resourceProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudResourceCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificates
     */
    public java.util.List<Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return cloudResourceId
     */
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return resourceProduct
     */
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public static final class Builder extends Request.Builder<ModifyCloudResourceCertRequest, Builder> {
        private java.util.List<Certificates> certificates; 
        private String cloudResourceId; 
        private String instanceId; 
        private Integer port; 
        private String regionId; 
        private String resourceInstanceId; 
        private String resourceProduct; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudResourceCertRequest request) {
            super(request);
            this.certificates = request.certificates;
            this.cloudResourceId = request.cloudResourceId;
            this.instanceId = request.instanceId;
            this.port = request.port;
            this.regionId = request.regionId;
            this.resourceInstanceId = request.resourceInstanceId;
            this.resourceProduct = request.resourceProduct;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * CloudResourceId.
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.putQueryParameter("CloudResourceId", cloudResourceId);
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceInstanceId.
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * ResourceProduct.
         */
        public Builder resourceProduct(String resourceProduct) {
            this.putQueryParameter("ResourceProduct", resourceProduct);
            this.resourceProduct = resourceProduct;
            return this;
        }

        @Override
        public ModifyCloudResourceCertRequest build() {
            return new ModifyCloudResourceCertRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCloudResourceCertRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudResourceCertRequest</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String appliedType;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certificateId;

        private Certificates(Builder builder) {
            this.appliedType = builder.appliedType;
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return appliedType
         */
        public String getAppliedType() {
            return this.appliedType;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String appliedType; 
            private String certificateId; 

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.appliedType = model.appliedType;
                this.certificateId = model.certificateId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder appliedType(String appliedType) {
                this.appliedType = appliedType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>232***-cn-hangzhou</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}

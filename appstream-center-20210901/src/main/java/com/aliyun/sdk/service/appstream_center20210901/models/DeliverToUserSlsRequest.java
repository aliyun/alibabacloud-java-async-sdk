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
 * {@link DeliverToUserSlsRequest} extends {@link RequestModel}
 *
 * <p>DeliverToUserSlsRequest</p>
 */
public class DeliverToUserSlsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryScopes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeliveryScopes> deliveryScopes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExistedProjectName")
    private String existedProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private DeliverToUserSlsRequest(Builder builder) {
        super(builder);
        this.deliveryScopes = builder.deliveryScopes;
        this.existedProjectName = builder.existedProjectName;
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.slsRegionId = builder.slsRegionId;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeliverToUserSlsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryScopes
     */
    public java.util.List<DeliveryScopes> getDeliveryScopes() {
        return this.deliveryScopes;
    }

    /**
     * @return existedProjectName
     */
    public String getExistedProjectName() {
        return this.existedProjectName;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<DeliverToUserSlsRequest, Builder> {
        private java.util.List<DeliveryScopes> deliveryScopes; 
        private String existedProjectName; 
        private String logStoreName; 
        private String projectName; 
        private String slsRegionId; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(DeliverToUserSlsRequest request) {
            super(request);
            this.deliveryScopes = request.deliveryScopes;
            this.existedProjectName = request.existedProjectName;
            this.logStoreName = request.logStoreName;
            this.projectName = request.projectName;
            this.slsRegionId = request.slsRegionId;
            this.ttl = request.ttl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;productType&quot;:&quot;China_China&quot;}]</p>
         */
        public Builder deliveryScopes(java.util.List<DeliveryScopes> deliveryScopes) {
            this.putBodyParameter("DeliveryScopes", deliveryScopes);
            this.deliveryScopes = deliveryScopes;
            return this;
        }

        /**
         * ExistedProjectName.
         */
        public Builder existedProjectName(String existedProjectName) {
            this.putBodyParameter("ExistedProjectName", existedProjectName);
            this.existedProjectName = existedProjectName;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putBodyParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public DeliverToUserSlsRequest build() {
            return new DeliverToUserSlsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeliverToUserSlsRequest} extends {@link TeaModel}
     *
     * <p>DeliverToUserSlsRequest</p>
     */
    public static class DeliveryScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productType;

        private DeliveryScopes(Builder builder) {
            this.productType = builder.productType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryScopes create() {
            return builder().build();
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        public static final class Builder {
            private String productType; 

            private Builder() {
            } 

            private Builder(DeliveryScopes model) {
                this.productType = model.productType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudBrowser</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            public DeliveryScopes build() {
                return new DeliveryScopes(this);
            } 

        } 

    }
}

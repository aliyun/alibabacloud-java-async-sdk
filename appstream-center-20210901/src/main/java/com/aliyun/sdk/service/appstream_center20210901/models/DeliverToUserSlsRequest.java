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
         * <p>The list of product scopes for which delivery needs to be configured. Specify at least one item. You cannot create duplicate enabled delivery configurations for the same account and product type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProductType&quot;:&quot;CloudBrowser&quot;}]</p>
         */
        public Builder deliveryScopes(java.util.List<DeliveryScopes> deliveryScopes) {
            this.putBodyParameter("DeliveryScopes", deliveryScopes);
            this.deliveryScopes = deliveryScopes;
            return this;
        }

        /**
         * <p>The name of an existing SLS project. The name must start with <code>elastic-desktop-</code> and the project must already exist in the specified SLS region of the current account.</p>
         * <p>Specify either this parameter or <code>ProjectName</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic-desktop-audit</p>
         */
        public Builder existedProjectName(String existedProjectName) {
            this.putBodyParameter("ExistedProjectName", existedProjectName);
            this.existedProjectName = existedProjectName;
            return this;
        }

        /**
         * <p>The name of the destination Logstore. The name must start with <code>elastic_desktop_</code>. If the Logstore does not exist, it is created. If the Logstore already exists, it is reused.</p>
         * <p>If this parameter is not specified, the part after <code>elastic-desktop-</code> in the selected project name is used as a suffix to generate a name that starts with <code>elastic_desktop_</code>. For example, if the project name is <code>elastic-desktop-audit</code>, the default Logstore name is <code>elastic_desktop_audit</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic_desktop_audit</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The name of the SLS project to be created or reused. The name must start with <code>elastic-desktop-</code>.</p>
         * <p>Specify either this parameter or <code>ExistedProjectName</code>. If the project does not exist, it is created. If the project already exists, it is reused.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic-desktop-audit</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the region where the destination SLS project is located. This parameter is required.</p>
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
         * <p>The data retention period of the new Logstore. Unit: days.</p>
         * <p><strong>Valid values:</strong> 1 to 3650.</p>
         * <p><strong>Default value:</strong> 30.</p>
         * <p>If an existing Logstore is reused, this operation does not update its data retention period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
             * <p>The product type to which the logs belong. Specify the product type for which you want to enable log delivery. For example, <code>CloudBrowser</code> indicates Cloud Browser.</p>
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

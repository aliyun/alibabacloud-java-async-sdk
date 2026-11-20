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
 * {@link DescribeSlsDeliveryConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlsDeliveryConfigRequest</p>
 */
public class DescribeSlsDeliveryConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryScopes")
    private java.util.List<DeliveryScopes> deliveryScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    private String slsRegionId;

    private DescribeSlsDeliveryConfigRequest(Builder builder) {
        super(builder);
        this.deliveryScopes = builder.deliveryScopes;
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.slsRegionId = builder.slsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsDeliveryConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSlsDeliveryConfigRequest, Builder> {
        private java.util.List<DeliveryScopes> deliveryScopes; 
        private String logStoreName; 
        private String projectName; 
        private String slsRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlsDeliveryConfigRequest request) {
            super(request);
            this.deliveryScopes = request.deliveryScopes;
            this.logStoreName = request.logStoreName;
            this.projectName = request.projectName;
            this.slsRegionId = request.slsRegionId;
        } 

        /**
         * <p>Filters delivery scopes by the product type to which the logs belong. If this parameter is omitted or an empty list is passed, delivery scopes are not filtered by product type.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProductType&quot;:&quot;WuyingServer&quot;}]</p>
         */
        public Builder deliveryScopes(java.util.List<DeliveryScopes> deliveryScopes) {
            this.putBodyParameter("DeliveryScopes", deliveryScopes);
            this.deliveryScopes = deliveryScopes;
            return this;
        }

        /**
         * <p>The name of the SLS Logstore. Exact match is used. If this parameter is omitted, the results are not filtered by Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-session-audit</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The name of the SLS project. Exact match is used. If this parameter is omitted, the results are not filtered by project name.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-audit-cn-hangzhou</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the region where the SLS project is located. Exact match is used. If this parameter is omitted, the results are not filtered by region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        @Override
        public DescribeSlsDeliveryConfigRequest build() {
            return new DescribeSlsDeliveryConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlsDeliveryConfigRequest} extends {@link TeaModel}
     *
     * <p>DescribeSlsDeliveryConfigRequest</p>
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
             * <p>The query condition for the product type to which the logs belong. If you specify this parameter, the results are filtered by the specified product type, which must be consistent with the existing delivery configurations. For example, <code>WuyingServer</code> indicates Enterprise Edition workstations.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>WuyingServer</p>
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

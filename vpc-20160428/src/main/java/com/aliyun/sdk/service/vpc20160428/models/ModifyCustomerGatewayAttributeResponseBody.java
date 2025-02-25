// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyCustomerGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCustomerGatewayAttributeResponseBody</p>
 */
public class ModifyCustomerGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyCustomerGatewayAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.customerGatewayId = builder.customerGatewayId;
        this.description = builder.description;
        this.ipAddress = builder.ipAddress;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomerGatewayAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private Long createTime; 
        private String customerGatewayId; 
        private String description; 
        private String ipAddress; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * <p>The timestamp generated when the customer gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-bp1pvpl9r9adju6l5****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>The description of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The public IP address of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>139.32.XX.XX</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The name of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8AA5CE21-2E6A-4530-BDF5-F055849476E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the customer gateway belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public ModifyCustomerGatewayAttributeResponseBody build() {
            return new ModifyCustomerGatewayAttributeResponseBody(this);
        } 

    } 

}

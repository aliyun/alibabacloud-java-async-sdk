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
 * {@link GetIpv4GatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpv4GatewayAttributeResponseBody</p>
 */
public class GetIpv4GatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayDescription")
    private String ipv4GatewayDescription;

    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayName")
    private String ipv4GatewayName;

    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayRouteTableId")
    private String ipv4GatewayRouteTableId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private GetIpv4GatewayAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.enabled = builder.enabled;
        this.ipv4GatewayDescription = builder.ipv4GatewayDescription;
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.ipv4GatewayName = builder.ipv4GatewayName;
        this.ipv4GatewayRouteTableId = builder.ipv4GatewayRouteTableId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpv4GatewayAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return ipv4GatewayDescription
     */
    public String getIpv4GatewayDescription() {
        return this.ipv4GatewayDescription;
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    /**
     * @return ipv4GatewayName
     */
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
    }

    /**
     * @return ipv4GatewayRouteTableId
     */
    public String getIpv4GatewayRouteTableId() {
        return this.ipv4GatewayRouteTableId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String createTime; 
        private Boolean enabled; 
        private String ipv4GatewayDescription; 
        private String ipv4GatewayId; 
        private String ipv4GatewayName; 
        private String ipv4GatewayRouteTableId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(GetIpv4GatewayAttributeResponseBody model) {
            this.createTime = model.createTime;
            this.enabled = model.enabled;
            this.ipv4GatewayDescription = model.ipv4GatewayDescription;
            this.ipv4GatewayId = model.ipv4GatewayId;
            this.ipv4GatewayName = model.ipv4GatewayName;
            this.ipv4GatewayRouteTableId = model.ipv4GatewayRouteTableId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tags = model.tags;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The time when the IPv4 gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-24T09:02:36Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the IPv4 gateway is activated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The description of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        public Builder ipv4GatewayDescription(String ipv4GatewayDescription) {
            this.ipv4GatewayDescription = ipv4GatewayDescription;
            return this;
        }

        /**
         * <p>The ID of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * <p>The name of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder ipv4GatewayName(String ipv4GatewayName) {
            this.ipv4GatewayName = ipv4GatewayName;
            return this;
        }

        /**
         * <p>The ID of the route table associated with the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-5ts0ohchwkp3dydt2****</p>
         */
        public Builder ipv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
            this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F79A919-6FE9-50C4-967B-45705E1F9C38</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IPv4 gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the IPv4 gateway. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>Activating</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the VPC with which the IPv4 gateway is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-5tsrxlw7dv074gci4****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GetIpv4GatewayAttributeResponseBody build() {
            return new GetIpv4GatewayAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIpv4GatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetIpv4GatewayAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}

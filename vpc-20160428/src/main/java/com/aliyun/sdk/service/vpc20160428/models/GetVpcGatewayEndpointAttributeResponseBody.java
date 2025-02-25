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
 * {@link GetVpcGatewayEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcGatewayEndpointAttributeResponseBody</p>
 */
public class GetVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("EndpointDescription")
    private String endpointDescription;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("EndpointStatus")
    private String endpointStatus;

    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RouteTables")
    private java.util.List<String> routeTables;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private GetVpcGatewayEndpointAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.endpointDescription = builder.endpointDescription;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.policyDocument = builder.policyDocument;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeTables = builder.routeTables;
        this.serviceName = builder.serviceName;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcGatewayEndpointAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return endpointStatus
     */
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
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
     * @return routeTables
     */
    public java.util.List<String> getRouteTables() {
        return this.routeTables;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
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
        private String creationTime; 
        private String endpointDescription; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String policyDocument; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List<String> routeTables; 
        private String serviceName; 
        private java.util.List<Tags> tags; 
        private String vpcId; 

        /**
         * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-27T01:58:37Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * <p>The ID of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpce-bp1w1dmdqjpwul0v3****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The name of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>The status of the gateway endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Associating</strong></li>
         * <li><strong>Dissociating</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * <p>The access policy for the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot; : &quot;1&quot;,   &quot;Statement&quot; : [ {     &quot;Effect&quot; : &quot;Allow&quot;,     &quot;Resource&quot; : [ &quot;<em>&quot; ],     &quot;Action&quot; : [ &quot;</em>&quot; ],     &quot;Principal&quot; : [ &quot;*&quot; ]   } ] }</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1122D0F-7B3B-5445-BB19-17F27F97FE1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxvfvazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the route table associated with the gateway endpoint.</p>
         */
        public Builder routeTables(java.util.List<String> routeTables) {
            this.routeTables = routeTables;
            return this;
        }

        /**
         * <p>The name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.cn-hangzhou.oss</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
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
         * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nh86rugg01zol0****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GetVpcGatewayEndpointAttributeResponseBody build() {
            return new GetVpcGatewayEndpointAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpcGatewayEndpointAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcGatewayEndpointAttributeResponseBody</p>
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

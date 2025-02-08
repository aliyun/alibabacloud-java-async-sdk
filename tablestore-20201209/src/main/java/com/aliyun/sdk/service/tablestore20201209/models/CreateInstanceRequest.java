// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisableReplication")
    private Boolean disableReplication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkSourceACL")
    private java.util.List<String> networkSourceACL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkTypeACL")
    private java.util.List<String> networkTypeACL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(maxLength = 4000)
    private String policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.disableReplication = builder.disableReplication;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.network = builder.network;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
        this.policy = builder.policy;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return disableReplication
     */
    public Boolean getDisableReplication() {
        return this.disableReplication;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String clusterType; 
        private Boolean disableReplication; 
        private String instanceDescription; 
        private String instanceName; 
        private String network; 
        private java.util.List<String> networkSourceACL; 
        private java.util.List<String> networkTypeACL; 
        private String policy; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.disableReplication = request.disableReplication;
            this.instanceDescription = request.instanceDescription;
            this.instanceName = request.instanceName;
            this.network = request.network;
            this.networkSourceACL = request.networkSourceACL;
            this.networkTypeACL = request.networkTypeACL;
            this.policy = request.policy;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * <p>The type of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SSD</p>
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>(Deprecated) Specifies whether to enable disaster recovery for the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableReplication(Boolean disableReplication) {
            this.putBodyParameter("DisableReplication", disableReplication);
            this.disableReplication = disableReplication;
            return this;
        }

        /**
         * <p>The description of the instance. The instance description must be 3 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>the test instance</p>
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putBodyParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>The name of the instance. Instance naming conventions:</p>
         * <ul>
         * <li>The name can contain only letters, digits, and hyphens (-).</li>
         * <li>The name must start with a letter.</li>
         * <li>The name cannot end with a hyphen (-).</li>
         * <li>The name is case-insensitive.</li>
         * <li>The name must be 3 to 16 characters in length.</li>
         * <li>The name cannot contain the following words: ali, ay, ots, taobao, and admin.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance-test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>(Deprecated) The network type of the instance. Valid values: NORMAL and VPC_CONSOLE. Default value: NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder network(String network) {
            this.putBodyParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * <p>The types of the source from which access is allowed. By default, the following source type is allowed:</p>
         * <p>TRUST_PROXY: console</p>
         */
        public Builder networkSourceACL(java.util.List<String> networkSourceACL) {
            this.putBodyParameter("NetworkSourceACL", networkSourceACL);
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * <p>The types of the network from which access is allowed. By default, the following network types are allowed:</p>
         * <ul>
         * <li>INTERNET: Internet</li>
         * <li>VPC: virtual private cloud (VPC)</li>
         * <li>CLASSIC: classic network</li>
         * </ul>
         */
        public Builder networkTypeACL(java.util.List<String> networkTypeACL) {
            this.putBodyParameter("NetworkTypeACL", networkTypeACL);
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        /**
         * <p>The instance policy in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Version&quot;: &quot;1&quot;,
         *     &quot;Statement&quot;: [
         *         {
         *             &quot;Action&quot;: [
         *                 &quot;ots:<em>&quot;
         *             ],
         *             &quot;Resource&quot;: [
         *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
         *             ],
         *             &quot;Principal&quot;: [
         *                 &quot;*&quot;
         *             ],
         *             &quot;Effect&quot;: &quot;Allow&quot;,
         *             &quot;Condition&quot;: {
         *                 &quot;StringEquals&quot;: {
         *                     &quot;ots:TLSVersion&quot;: [
         *                         &quot;1.2&quot;
         *                     ]
         *                 },
         *                 &quot;IpAddress&quot;: {
         *                     &quot;acs:SourceIp&quot;: [
         *                         &quot;192.168.0.1&quot;,
         *                         &quot;198.51.100.1&quot;
         *                     ]
         *                 }
         *             }
         *         }
         *     ]
         * }</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jnbcd</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The tag key. The tag key can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>p_instance</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0woauavextilfqr61</p>
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

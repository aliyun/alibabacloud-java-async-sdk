// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateNatGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateNatGatewayRequest</p>
 */
public class CreateNatGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateNatGatewayRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceType = builder.instanceType;
        this.name = builder.name;
        this.networkId = builder.networkId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateNatGatewayRequest, Builder> {
        private String ensRegionId; 
        private String instanceBillingCycle; 
        private String instanceType; 
        private String name; 
        private String networkId; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNatGatewayRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceType = request.instanceType;
            this.name = request.name;
            this.networkId = request.networkId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-suzhou-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceBillingCycle.
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The instance type of the NAT gateway. Set the value to <strong>enat.default</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>enat.default</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the NAT gateway. The name must be 1 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5qj7ykuxmjn7k96l090sp****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the new vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5savh5ngxh8sbj14bu7n****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateNatGatewayRequest build() {
            return new CreateNatGatewayRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNatGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateNatGatewayRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
             * <ul>
             * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
             * <li>The key must be up to 64 characters in length.</li>
             * <li>The tag key cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>Deep</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}

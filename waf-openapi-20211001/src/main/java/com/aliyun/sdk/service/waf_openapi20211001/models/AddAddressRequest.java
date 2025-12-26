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
 * {@link AddAddressRequest} extends {@link RequestModel}
 *
 * <p>AddAddressRequest</p>
 */
public class AddAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> addressList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private AddAddressRequest(Builder builder) {
        super(builder);
        this.addressList = builder.addressList;
        this.instanceId = builder.instanceId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressList
     */
    public java.util.List<String> getAddressList() {
        return this.addressList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<AddAddressRequest, Builder> {
        private java.util.List<String> addressList; 
        private String instanceId; 
        private String resourceManagerResourceGroupId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(AddAddressRequest request) {
            super(request);
            this.addressList = request.addressList;
            this.instanceId = request.instanceId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addressList(java.util.List<String> addressList) {
            this.putQueryParameter("AddressList", addressList);
            this.addressList = addressList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public AddAddressRequest build() {
            return new AddAddressRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeMachineSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeMachineSpecRequest</p>
 */
public class DescribeMachineSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    @Deprecated
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DescribeMachineSpecRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.instanceTypes = builder.instanceTypes;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMachineSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeMachineSpecRequest, Builder> {
        private String chargeType; 
        private java.util.List<String> instanceTypes; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMachineSpecRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.instanceTypes = request.instanceTypes;
            this.resourceType = request.resourceType;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            String instanceTypesShrink = shrink(instanceTypes, "InstanceTypes", "simple");
            this.putQueryParameter("InstanceTypes", instanceTypesShrink);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeMachineSpecRequest build() {
            return new DescribeMachineSpecRequest(this);
        } 

    } 

}

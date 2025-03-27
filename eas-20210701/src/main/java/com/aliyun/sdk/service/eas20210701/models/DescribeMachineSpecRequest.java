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
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    @Deprecated
    private java.util.List<String> instanceTypes;

    private DescribeMachineSpecRequest(Builder builder) {
        super(builder);
        this.instanceTypes = builder.instanceTypes;
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
     * @return instanceTypes
     */
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public static final class Builder extends Request.Builder<DescribeMachineSpecRequest, Builder> {
        private java.util.List<String> instanceTypes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMachineSpecRequest request) {
            super(request);
            this.instanceTypes = request.instanceTypes;
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

        @Override
        public DescribeMachineSpecRequest build() {
            return new DescribeMachineSpecRequest(this);
        } 

    } 

}

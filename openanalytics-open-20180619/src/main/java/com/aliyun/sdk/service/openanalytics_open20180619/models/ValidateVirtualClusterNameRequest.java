// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateVirtualClusterNameRequest} extends {@link RequestModel}
 *
 * <p>ValidateVirtualClusterNameRequest</p>
 */
public class ValidateVirtualClusterNameRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VcName")
    private String vcName;

    private ValidateVirtualClusterNameRequest(Builder builder) {
        super(builder);
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateVirtualClusterNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<ValidateVirtualClusterNameRequest, Builder> {
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(ValidateVirtualClusterNameRequest request) {
            super(request);
            this.vcName = request.vcName;
        } 

        /**
         * VcName.
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public ValidateVirtualClusterNameRequest build() {
            return new ValidateVirtualClusterNameRequest(this);
        } 

    } 

}

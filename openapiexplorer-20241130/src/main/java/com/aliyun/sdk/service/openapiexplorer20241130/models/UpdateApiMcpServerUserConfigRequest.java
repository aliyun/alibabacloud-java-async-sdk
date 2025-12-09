// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link UpdateApiMcpServerUserConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiMcpServerUserConfigRequest</p>
 */
public class UpdateApiMcpServerUserConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enablePublicAccess")
    private Boolean enablePublicAccess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcWhitelists")
    private java.util.List<String> vpcWhitelists;

    private UpdateApiMcpServerUserConfigRequest(Builder builder) {
        super(builder);
        this.enablePublicAccess = builder.enablePublicAccess;
        this.vpcWhitelists = builder.vpcWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiMcpServerUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enablePublicAccess
     */
    public Boolean getEnablePublicAccess() {
        return this.enablePublicAccess;
    }

    /**
     * @return vpcWhitelists
     */
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

    public static final class Builder extends Request.Builder<UpdateApiMcpServerUserConfigRequest, Builder> {
        private Boolean enablePublicAccess; 
        private java.util.List<String> vpcWhitelists; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiMcpServerUserConfigRequest request) {
            super(request);
            this.enablePublicAccess = request.enablePublicAccess;
            this.vpcWhitelists = request.vpcWhitelists;
        } 

        /**
         * enablePublicAccess.
         */
        public Builder enablePublicAccess(Boolean enablePublicAccess) {
            this.putBodyParameter("enablePublicAccess", enablePublicAccess);
            this.enablePublicAccess = enablePublicAccess;
            return this;
        }

        /**
         * vpcWhitelists.
         */
        public Builder vpcWhitelists(java.util.List<String> vpcWhitelists) {
            this.putBodyParameter("vpcWhitelists", vpcWhitelists);
            this.vpcWhitelists = vpcWhitelists;
            return this;
        }

        @Override
        public UpdateApiMcpServerUserConfigRequest build() {
            return new UpdateApiMcpServerUserConfigRequest(this);
        } 

    } 

}

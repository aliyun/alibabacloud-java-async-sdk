// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaLiveInputSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMediaLiveInputSecurityGroupRequest</p>
 */
public class GetMediaLiveInputSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    private GetMediaLiveInputSecurityGroupRequest(Builder builder) {
        super(builder);
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaLiveInputSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<GetMediaLiveInputSecurityGroupRequest, Builder> {
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaLiveInputSecurityGroupRequest request) {
            super(request);
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public GetMediaLiveInputSecurityGroupRequest build() {
            return new GetMediaLiveInputSecurityGroupRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccessKeyInfoInRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyInfoInRecycleBinRequest</p>
 */
public class GetAccessKeyInfoInRecycleBinRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessKeyId;

    private GetAccessKeyInfoInRecycleBinRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyInfoInRecycleBinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyInfoInRecycleBinRequest, Builder> {
        private String userAccessKeyId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyInfoInRecycleBinRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
        } 

        /**
         * <p>The AccessKey ID of the Resource Access Management (RAM) user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4GFTgcR8m8cZQDTH****</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        @Override
        public GetAccessKeyInfoInRecycleBinRequest build() {
            return new GetAccessKeyInfoInRecycleBinRequest(this);
        } 

    } 

}

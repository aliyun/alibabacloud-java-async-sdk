// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link UnbindMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindMFADeviceRequest</p>
 */
public class UnbindMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UnbindMFADeviceRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindMFADeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UnbindMFADeviceRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindMFADeviceRequest request) {
            super(request);
            this.userName = request.userName;
        } 

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UnbindMFADeviceRequest build() {
            return new UnbindMFADeviceRequest(this);
        } 

    } 

}

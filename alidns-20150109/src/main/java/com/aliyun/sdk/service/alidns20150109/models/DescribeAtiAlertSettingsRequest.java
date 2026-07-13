// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeAtiAlertSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAtiAlertSettingsRequest</p>
 */
public class DescribeAtiAlertSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private DescribeAtiAlertSettingsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiAlertSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DescribeAtiAlertSettingsRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAtiAlertSettingsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DescribeAtiAlertSettingsRequest build() {
            return new DescribeAtiAlertSettingsRequest(this);
        } 

    } 

}

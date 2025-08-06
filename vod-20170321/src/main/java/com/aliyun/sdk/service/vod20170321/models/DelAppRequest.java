// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DelAppRequest} extends {@link RequestModel}
 *
 * <p>DelAppRequest</p>
 */
public class DelAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appItemId;

    private DelAppRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appItemId
     */
    public String getAppItemId() {
        return this.appItemId;
    }

    public static final class Builder extends Request.Builder<DelAppRequest, Builder> {
        private String appItemId; 

        private Builder() {
            super();
        } 

        private Builder(DelAppRequest request) {
            super(request);
            this.appItemId = request.appItemId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appItemId(String appItemId) {
            this.putBodyParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
            return this;
        }

        @Override
        public DelAppRequest build() {
            return new DelAppRequest(this);
        } 

    } 

}

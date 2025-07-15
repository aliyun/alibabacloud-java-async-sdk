// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeRtcMPUEventSubRequest} extends {@link RequestModel}
 *
 * <p>DescribeRtcMPUEventSubRequest</p>
 */
public class DescribeRtcMPUEventSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private DescribeRtcMPUEventSubRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcMPUEventSubRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DescribeRtcMPUEventSubRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRtcMPUEventSubRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The ID of your application.</p>
         * <blockquote>
         * <p>The ID can be up to 64 characters in length and can contain letters, digits, underscores, and hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeRtcMPUEventSubRequest build() {
            return new DescribeRtcMPUEventSubRequest(this);
        } 

    } 

}

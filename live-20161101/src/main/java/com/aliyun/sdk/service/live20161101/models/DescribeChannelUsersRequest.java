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
 * {@link DescribeChannelUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeChannelUsersRequest</p>
 */
public class DescribeChannelUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    private DescribeChannelUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelUsersRequest create() {
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

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    public static final class Builder extends Request.Builder<DescribeChannelUsersRequest, Builder> {
        private String appId; 
        private String channelId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChannelUsersRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
        } 

        /**
         * <p>The application ID. You can specify only one application ID in a request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aec****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The channel ID. You can specify only one channel ID in a request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        @Override
        public DescribeChannelUsersRequest build() {
            return new DescribeChannelUsersRequest(this);
        } 

    } 

}

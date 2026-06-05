// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetMiniAppBindingForAdminRequest} extends {@link RequestModel}
 *
 * <p>GetMiniAppBindingForAdminRequest</p>
 */
public class GetMiniAppBindingForAdminRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformAppid")
    private String platformAppid;

    private GetMiniAppBindingForAdminRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channel = builder.channel;
        this.platformAppid = builder.platformAppid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppBindingForAdminRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return platformAppid
     */
    public String getPlatformAppid() {
        return this.platformAppid;
    }

    public static final class Builder extends Request.Builder<GetMiniAppBindingForAdminRequest, Builder> {
        private String bizId; 
        private String channel; 
        private String platformAppid; 

        private Builder() {
            super();
        } 

        private Builder(GetMiniAppBindingForAdminRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channel = request.channel;
            this.platformAppid = request.platformAppid;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * PlatformAppid.
         */
        public Builder platformAppid(String platformAppid) {
            this.putQueryParameter("PlatformAppid", platformAppid);
            this.platformAppid = platformAppid;
            return this;
        }

        @Override
        public GetMiniAppBindingForAdminRequest build() {
            return new GetMiniAppBindingForAdminRequest(this);
        } 

    } 

}

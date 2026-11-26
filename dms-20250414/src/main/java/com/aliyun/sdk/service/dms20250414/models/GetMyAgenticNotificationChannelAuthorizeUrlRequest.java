// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetMyAgenticNotificationChannelAuthorizeUrlRequest} extends {@link RequestModel}
 *
 * <p>GetMyAgenticNotificationChannelAuthorizeUrlRequest</p>
 */
public class GetMyAgenticNotificationChannelAuthorizeUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    private GetMyAgenticNotificationChannelAuthorizeUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channel = builder.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyAgenticNotificationChannelAuthorizeUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    public static final class Builder extends Request.Builder<GetMyAgenticNotificationChannelAuthorizeUrlRequest, Builder> {
        private String regionId; 
        private String channel; 

        private Builder() {
            super();
        } 

        private Builder(GetMyAgenticNotificationChannelAuthorizeUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channel = request.channel;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The notification channel type. Currently, only FEISHU (the Chinese version of Lark) is supported. Specifying other values results in a parameter error.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        @Override
        public GetMyAgenticNotificationChannelAuthorizeUrlRequest build() {
            return new GetMyAgenticNotificationChannelAuthorizeUrlRequest(this);
        } 

    } 

}

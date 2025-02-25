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
 * {@link GetLivePackageChannelRequest} extends {@link RequestModel}
 *
 * <p>GetLivePackageChannelRequest</p>
 */
public class GetLivePackageChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private GetLivePackageChannelRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLivePackageChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<GetLivePackageChannelRequest, Builder> {
        private String channelName; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(GetLivePackageChannelRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.groupName = request.groupName;
        } 

        /**
         * <p>频道名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>频道组名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public GetLivePackageChannelRequest build() {
            return new GetLivePackageChannelRequest(this);
        } 

    } 

}

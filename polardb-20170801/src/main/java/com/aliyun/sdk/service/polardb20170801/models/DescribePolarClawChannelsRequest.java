// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawChannelsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawChannelsRequest</p>
 */
public class DescribePolarClawChannelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelList")
    private java.util.List<String> channelList;

    private DescribePolarClawChannelsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.channelList = builder.channelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawChannelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return channelList
     */
    public java.util.List<String> getChannelList() {
        return this.channelList;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawChannelsRequest, Builder> {
        private String applicationId; 
        private java.util.List<String> channelList; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawChannelsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.channelList = request.channelList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ChannelList.
         */
        public Builder channelList(java.util.List<String> channelList) {
            String channelListShrink = shrink(channelList, "ChannelList", "json");
            this.putQueryParameter("ChannelList", channelListShrink);
            this.channelList = channelList;
            return this;
        }

        @Override
        public DescribePolarClawChannelsRequest build() {
            return new DescribePolarClawChannelsRequest(this);
        } 

    } 

}

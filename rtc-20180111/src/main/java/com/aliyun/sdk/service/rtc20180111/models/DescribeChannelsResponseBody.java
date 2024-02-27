// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelsResponseBody</p>
 */
public class DescribeChannelsResponseBody extends TeaModel {
    @NameInMap("ChannelIds")
    private java.util.List < String > channelIds;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeChannelsResponseBody(Builder builder) {
        this.channelIds = builder.channelIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelIds
     */
    public java.util.List < String > getChannelIds() {
        return this.channelIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > channelIds; 
        private String requestId; 

        /**
         * ChannelIds.
         */
        public Builder channelIds(java.util.List < String > channelIds) {
            this.channelIds = channelIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChannelsResponseBody build() {
            return new DescribeChannelsResponseBody(this);
        } 

    } 

}

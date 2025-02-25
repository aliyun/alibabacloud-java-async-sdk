// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChannelRiskDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListChannelRiskDetailsRequest</p>
 */
public class ListChannelRiskDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    @com.aliyun.core.annotation.Validation(required = true)
    private String end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isAllChannel")
    private String isAllChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start")
    @com.aliyun.core.annotation.Validation(required = true)
    private String start;

    private ListChannelRiskDetailsRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.dataSourceId = builder.dataSourceId;
        this.end = builder.end;
        this.isAllChannel = builder.isAllChannel;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelRiskDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return isAllChannel
     */
    public String getIsAllChannel() {
        return this.isAllChannel;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListChannelRiskDetailsRequest, Builder> {
        private String channel; 
        private String dataSourceId; 
        private String end; 
        private String isAllChannel; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(ListChannelRiskDetailsRequest request) {
            super(request);
            this.channel = request.channel;
            this.dataSourceId = request.dataSourceId;
            this.end = request.end;
            this.isAllChannel = request.isAllChannel;
            this.start = request.start;
        } 

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * end.
         */
        public Builder end(String end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * isAllChannel.
         */
        public Builder isAllChannel(String isAllChannel) {
            this.putQueryParameter("isAllChannel", isAllChannel);
            this.isAllChannel = isAllChannel;
            return this;
        }

        /**
         * start.
         */
        public Builder start(String start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListChannelRiskDetailsRequest build() {
            return new ListChannelRiskDetailsRequest(this);
        } 

    } 

}

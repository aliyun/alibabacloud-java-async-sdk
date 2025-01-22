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
 * {@link ListChannelsRequest} extends {@link RequestModel}
 *
 * <p>ListChannelsRequest</p>
 */
public class ListChannelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelTier")
    private String channelTier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybackMode")
    private String playbackMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortByModifiedTime")
    private String sortByModifiedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    private ListChannelsRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.channelTier = builder.channelTier;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.playbackMode = builder.playbackMode;
        this.sortBy = builder.sortBy;
        this.sortByModifiedTime = builder.sortByModifiedTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelsRequest create() {
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
     * @return channelTier
     */
    public String getChannelTier() {
        return this.channelTier;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbackMode
     */
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortByModifiedTime
     */
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListChannelsRequest, Builder> {
        private String channelName; 
        private String channelTier; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String playbackMode; 
        private String sortBy; 
        private String sortByModifiedTime; 
        private Integer state; 

        private Builder() {
            super();
        } 

        private Builder(ListChannelsRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.channelTier = request.channelTier;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.playbackMode = request.playbackMode;
            this.sortBy = request.sortBy;
            this.sortByModifiedTime = request.sortByModifiedTime;
            this.state = request.state;
        } 

        /**
         * ChannelName.
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * ChannelTier.
         */
        public Builder channelTier(String channelTier) {
            this.putQueryParameter("ChannelTier", channelTier);
            this.channelTier = channelTier;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlaybackMode.
         */
        public Builder playbackMode(String playbackMode) {
            this.putQueryParameter("PlaybackMode", playbackMode);
            this.playbackMode = playbackMode;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortByModifiedTime.
         */
        public Builder sortByModifiedTime(String sortByModifiedTime) {
            this.putQueryParameter("SortByModifiedTime", sortByModifiedTime);
            this.sortByModifiedTime = sortByModifiedTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListChannelsRequest build() {
            return new ListChannelsRequest(this);
        } 

    } 

}

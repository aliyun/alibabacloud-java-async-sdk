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
 * {@link ListChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChannelsResponseBody</p>
 */
public class ListChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelList")
    private java.util.List<ChannelAssemblyChannel> channelList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListChannelsResponseBody(Builder builder) {
        this.channelList = builder.channelList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelList
     */
    public java.util.List<ChannelAssemblyChannel> getChannelList() {
        return this.channelList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ChannelAssemblyChannel> channelList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ChannelList.
         */
        public Builder channelList(java.util.List<ChannelAssemblyChannel> channelList) {
            this.channelList = channelList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChannelsResponseBody build() {
            return new ListChannelsResponseBody(this);
        } 

    } 

}

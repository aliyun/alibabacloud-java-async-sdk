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
 * {@link ListSchedulesRequest} extends {@link RequestModel}
 *
 * <p>ListSchedulesRequest</p>
 */
public class ListSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WindowDurationSeconds")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long windowDurationSeconds;

    private ListSchedulesRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.windowDurationSeconds = builder.windowDurationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulesRequest create() {
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
     * @return windowDurationSeconds
     */
    public Long getWindowDurationSeconds() {
        return this.windowDurationSeconds;
    }

    public static final class Builder extends Request.Builder<ListSchedulesRequest, Builder> {
        private String channelName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long windowDurationSeconds; 

        private Builder() {
            super();
        } 

        private Builder(ListSchedulesRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.windowDurationSeconds = request.windowDurationSeconds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14400</p>
         */
        public Builder windowDurationSeconds(Long windowDurationSeconds) {
            this.putQueryParameter("WindowDurationSeconds", windowDurationSeconds);
            this.windowDurationSeconds = windowDurationSeconds;
            return this;
        }

        @Override
        public ListSchedulesRequest build() {
            return new ListSchedulesRequest(this);
        } 

    } 

}

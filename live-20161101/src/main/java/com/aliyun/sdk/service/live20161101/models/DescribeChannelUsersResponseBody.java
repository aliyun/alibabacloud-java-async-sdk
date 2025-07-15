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
 * {@link DescribeChannelUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelUsersResponseBody</p>
 */
public class DescribeChannelUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InteractiveUserList")
    private java.util.List<String> interactiveUserList;

    @com.aliyun.core.annotation.NameInMap("InteractiveUserNumber")
    private Integer interactiveUserNumber;

    @com.aliyun.core.annotation.NameInMap("IsChannelExists")
    private Boolean isChannelExists;

    @com.aliyun.core.annotation.NameInMap("LiveUserList")
    private java.util.List<String> liveUserList;

    @com.aliyun.core.annotation.NameInMap("LiveUserNumber")
    private Integer liveUserNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private DescribeChannelUsersResponseBody(Builder builder) {
        this.interactiveUserList = builder.interactiveUserList;
        this.interactiveUserNumber = builder.interactiveUserNumber;
        this.isChannelExists = builder.isChannelExists;
        this.liveUserList = builder.liveUserList;
        this.liveUserNumber = builder.liveUserNumber;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interactiveUserList
     */
    public java.util.List<String> getInteractiveUserList() {
        return this.interactiveUserList;
    }

    /**
     * @return interactiveUserNumber
     */
    public Integer getInteractiveUserNumber() {
        return this.interactiveUserNumber;
    }

    /**
     * @return isChannelExists
     */
    public Boolean getIsChannelExists() {
        return this.isChannelExists;
    }

    /**
     * @return liveUserList
     */
    public java.util.List<String> getLiveUserList() {
        return this.liveUserList;
    }

    /**
     * @return liveUserNumber
     */
    public Integer getLiveUserNumber() {
        return this.liveUserNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private java.util.List<String> interactiveUserList; 
        private Integer interactiveUserNumber; 
        private Boolean isChannelExists; 
        private java.util.List<String> liveUserList; 
        private Integer liveUserNumber; 
        private String requestId; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(DescribeChannelUsersResponseBody model) {
            this.interactiveUserList = model.interactiveUserList;
            this.interactiveUserNumber = model.interactiveUserNumber;
            this.isChannelExists = model.isChannelExists;
            this.liveUserList = model.liveUserList;
            this.liveUserNumber = model.liveUserNumber;
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The list of streamers/co-streamers.</p>
         */
        public Builder interactiveUserList(java.util.List<String> interactiveUserList) {
            this.interactiveUserList = interactiveUserList;
            return this;
        }

        /**
         * <p>The number of co-streamers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interactiveUserNumber(Integer interactiveUserNumber) {
            this.interactiveUserNumber = interactiveUserNumber;
            return this;
        }

        /**
         * <p>Indicates whether the channel exists. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>After all users leave the channel, the system requires a few seconds to clear the cache. If you call the operation during this period, the value of this parameter is true, and the value of InteractiveUserNumber and LiveUserNumber is 0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isChannelExists(Boolean isChannelExists) {
            this.isChannelExists = isChannelExists;
            return this;
        }

        /**
         * <p>The list of viewers.</p>
         */
        public Builder liveUserList(java.util.List<String> liveUserList) {
            this.liveUserList = liveUserList;
            return this;
        }

        /**
         * <p>The number of viewers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder liveUserNumber(Integer liveUserNumber) {
            this.liveUserNumber = liveUserNumber;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AD86847D-1F36-18C8-A995-5EEA340B3202</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The UTC timestamp when the response is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1691027655</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public DescribeChannelUsersResponseBody build() {
            return new DescribeChannelUsersResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    @com.aliyun.core.annotation.NameInMap("ChannelProfile")
    private Integer channelProfile;

    @com.aliyun.core.annotation.NameInMap("CommTotalNum")
    private Integer commTotalNum;

    @com.aliyun.core.annotation.NameInMap("InteractiveUserList")
    private java.util.List<String> interactiveUserList;

    @com.aliyun.core.annotation.NameInMap("InteractiveUserNum")
    private Integer interactiveUserNum;

    @com.aliyun.core.annotation.NameInMap("IsChannelExist")
    private Boolean isChannelExist;

    @com.aliyun.core.annotation.NameInMap("LiveUserList")
    private java.util.List<String> liveUserList;

    @com.aliyun.core.annotation.NameInMap("LiveUserNum")
    private Integer liveUserNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Integer timestamp;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<String> userList;

    private DescribeChannelUsersResponseBody(Builder builder) {
        this.channelProfile = builder.channelProfile;
        this.commTotalNum = builder.commTotalNum;
        this.interactiveUserList = builder.interactiveUserList;
        this.interactiveUserNum = builder.interactiveUserNum;
        this.isChannelExist = builder.isChannelExist;
        this.liveUserList = builder.liveUserList;
        this.liveUserNum = builder.liveUserNum;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
        this.userList = builder.userList;
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
     * @return channelProfile
     */
    public Integer getChannelProfile() {
        return this.channelProfile;
    }

    /**
     * @return commTotalNum
     */
    public Integer getCommTotalNum() {
        return this.commTotalNum;
    }

    /**
     * @return interactiveUserList
     */
    public java.util.List<String> getInteractiveUserList() {
        return this.interactiveUserList;
    }

    /**
     * @return interactiveUserNum
     */
    public Integer getInteractiveUserNum() {
        return this.interactiveUserNum;
    }

    /**
     * @return isChannelExist
     */
    public Boolean getIsChannelExist() {
        return this.isChannelExist;
    }

    /**
     * @return liveUserList
     */
    public java.util.List<String> getLiveUserList() {
        return this.liveUserList;
    }

    /**
     * @return liveUserNum
     */
    public Integer getLiveUserNum() {
        return this.liveUserNum;
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
    public Integer getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return userList
     */
    public java.util.List<String> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private Integer channelProfile; 
        private Integer commTotalNum; 
        private java.util.List<String> interactiveUserList; 
        private Integer interactiveUserNum; 
        private Boolean isChannelExist; 
        private java.util.List<String> liveUserList; 
        private Integer liveUserNum; 
        private String requestId; 
        private Integer timestamp; 
        private java.util.List<String> userList; 

        private Builder() {
        } 

        private Builder(DescribeChannelUsersResponseBody model) {
            this.channelProfile = model.channelProfile;
            this.commTotalNum = model.commTotalNum;
            this.interactiveUserList = model.interactiveUserList;
            this.interactiveUserNum = model.interactiveUserNum;
            this.isChannelExist = model.isChannelExist;
            this.liveUserList = model.liveUserList;
            this.liveUserNum = model.liveUserNum;
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
            this.userList = model.userList;
        } 

        /**
         * <p>The channel mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Communication (communication mode).</p>
         * </li>
         * <li><p><strong>2</strong>: Interactive_live (live streaming mode).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder channelProfile(Integer channelProfile) {
            this.channelProfile = channelProfile;
            return this;
        }

        /**
         * <p>The total number of users in the channel in communication mode. If the channel is not in communication mode, this parameter is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder commTotalNum(Integer commTotalNum) {
            this.commTotalNum = commTotalNum;
            return this;
        }

        /**
         * <p>The list of interactive user IDs in the channel in live streaming mode. This parameter is empty if the channel is not in live streaming mode.</p>
         */
        public Builder interactiveUserList(java.util.List<String> interactiveUserList) {
            this.interactiveUserList = interactiveUserList;
            return this;
        }

        /**
         * <p>The total number of interactive users in the channel in live streaming mode. If the channel is not in live streaming mode, this parameter is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder interactiveUserNum(Integer interactiveUserNum) {
            this.interactiveUserNum = interactiveUserNum;
            return this;
        }

        /**
         * <p>Indicates whether the channel exists. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The channel exists.</p>
         * </li>
         * <li><p><strong>false</strong>: The channel does not exist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isChannelExist(Boolean isChannelExist) {
            this.isChannelExist = isChannelExist;
            return this;
        }

        /**
         * <p>The list of viewer IDs in the channel in live streaming mode. A maximum of 1,000 viewers are returned. This parameter is empty if the channel is not in live streaming mode.</p>
         */
        public Builder liveUserList(java.util.List<String> liveUserList) {
            this.liveUserList = liveUserList;
            return this;
        }

        /**
         * <p>The total number of viewers in the channel in live streaming mode. If the channel is not in live streaming mode, this parameter is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder liveUserNum(Integer liveUserNum) {
            this.liveUserNum = liveUserNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp of the current time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The list of user IDs in the channel in communication mode. This parameter is empty if the channel is not in communication mode.</p>
         */
        public Builder userList(java.util.List<String> userList) {
            this.userList = userList;
            return this;
        }

        public DescribeChannelUsersResponseBody build() {
            return new DescribeChannelUsersResponseBody(this);
        } 

    } 

}

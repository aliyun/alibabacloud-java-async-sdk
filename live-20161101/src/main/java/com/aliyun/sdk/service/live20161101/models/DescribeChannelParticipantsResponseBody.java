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
 * {@link DescribeChannelParticipantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelParticipantsResponseBody</p>
 */
public class DescribeChannelParticipantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Times")
    private Long times;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<String> userList;

    private DescribeChannelParticipantsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.times = builder.times;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelParticipantsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return times
     */
    public Long getTimes() {
        return this.times;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return userList
     */
    public java.util.List<String> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String requestId; 
        private Long times; 
        private Integer totalNum; 
        private Integer totalPage; 
        private java.util.List<String> userList; 

        private Builder() {
        } 

        private Builder(DescribeChannelParticipantsResponseBody model) {
            this.requestId = model.requestId;
            this.times = model.times;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
            this.userList = model.userList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time elapsed until the result was returned. Unit: seconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1557909133</p>
         */
        public Builder times(Long times) {
            this.times = times;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * <p>The list of user IDs.</p>
         */
        public Builder userList(java.util.List<String> userList) {
            this.userList = userList;
            return this;
        }

        public DescribeChannelParticipantsResponseBody build() {
            return new DescribeChannelParticipantsResponseBody(this);
        } 

    } 

}

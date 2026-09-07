// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeOnlineUserCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnlineUserCountResponseBody</p>
 */
public class DescribeOnlineUserCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdAssignedUserCount")
    private Long adAssignedUserCount;

    @com.aliyun.core.annotation.NameInMap("AssignedUserCount")
    private Long assignedUserCount;

    @com.aliyun.core.annotation.NameInMap("OnlineUserCount")
    private Long onlineUserCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimpleAssignedUserCount")
    private Long simpleAssignedUserCount;

    private DescribeOnlineUserCountResponseBody(Builder builder) {
        this.adAssignedUserCount = builder.adAssignedUserCount;
        this.assignedUserCount = builder.assignedUserCount;
        this.onlineUserCount = builder.onlineUserCount;
        this.requestId = builder.requestId;
        this.simpleAssignedUserCount = builder.simpleAssignedUserCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnlineUserCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adAssignedUserCount
     */
    public Long getAdAssignedUserCount() {
        return this.adAssignedUserCount;
    }

    /**
     * @return assignedUserCount
     */
    public Long getAssignedUserCount() {
        return this.assignedUserCount;
    }

    /**
     * @return onlineUserCount
     */
    public Long getOnlineUserCount() {
        return this.onlineUserCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simpleAssignedUserCount
     */
    public Long getSimpleAssignedUserCount() {
        return this.simpleAssignedUserCount;
    }

    public static final class Builder {
        private Long adAssignedUserCount; 
        private Long assignedUserCount; 
        private Long onlineUserCount; 
        private String requestId; 
        private Long simpleAssignedUserCount; 

        private Builder() {
        } 

        private Builder(DescribeOnlineUserCountResponseBody model) {
            this.adAssignedUserCount = model.adAssignedUserCount;
            this.assignedUserCount = model.assignedUserCount;
            this.onlineUserCount = model.onlineUserCount;
            this.requestId = model.requestId;
            this.simpleAssignedUserCount = model.simpleAssignedUserCount;
        } 

        /**
         * <p>The number of AD users with assigned desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder adAssignedUserCount(Long adAssignedUserCount) {
            this.adAssignedUserCount = adAssignedUserCount;
            return this;
        }

        /**
         * <p>The number of users with assigned desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder assignedUserCount(Long assignedUserCount) {
            this.assignedUserCount = assignedUserCount;
            return this;
        }

        /**
         * <p>The number of online users, including convenience users and AD users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder onlineUserCount(Long onlineUserCount) {
            this.onlineUserCount = onlineUserCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of convenience users with assigned desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder simpleAssignedUserCount(Long simpleAssignedUserCount) {
            this.simpleAssignedUserCount = simpleAssignedUserCount;
            return this;
        }

        public DescribeOnlineUserCountResponseBody build() {
            return new DescribeOnlineUserCountResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMeetingRoomGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMeetingRoomGroupResponseBody</p>
 */
public class QueryMeetingRoomGroupResponseBody extends TeaModel {
    @NameInMap("groupId")
    private Long groupId;

    @NameInMap("groupName")
    private String groupName;

    @NameInMap("parentId")
    private Long parentId;

    @NameInMap("requestId")
    private String requestId;

    private QueryMeetingRoomGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.parentId = builder.parentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMeetingRoomGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long groupId; 
        private String groupName; 
        private Long parentId; 
        private String requestId; 

        /**
         * groupId.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMeetingRoomGroupResponseBody build() {
            return new QueryMeetingRoomGroupResponseBody(this);
        } 

    } 

}

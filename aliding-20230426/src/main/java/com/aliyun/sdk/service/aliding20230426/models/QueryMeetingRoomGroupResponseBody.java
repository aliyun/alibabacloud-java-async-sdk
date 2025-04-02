// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryMeetingRoomGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMeetingRoomGroupResponseBody</p>
 */
public class QueryMeetingRoomGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupId")
    private Long groupId;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("requestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryMeetingRoomGroupResponseBody model) {
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.parentId = model.parentId;
            this.requestId = model.requestId;
        } 

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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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

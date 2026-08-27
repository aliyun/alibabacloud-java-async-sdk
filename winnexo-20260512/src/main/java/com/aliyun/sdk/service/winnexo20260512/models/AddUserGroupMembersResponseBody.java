// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link AddUserGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserGroupMembersResponseBody</p>
 */
public class AddUserGroupMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("affectedCount")
    private Long affectedCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestedCount")
    private Long requestedCount;

    @com.aliyun.core.annotation.NameInMap("userGroupId")
    private String userGroupId;

    private AddUserGroupMembersResponseBody(Builder builder) {
        this.affectedCount = builder.affectedCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.requestedCount = builder.requestedCount;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMembersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectedCount
     */
    public Long getAffectedCount() {
        return this.affectedCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestedCount
     */
    public Long getRequestedCount() {
        return this.requestedCount;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder {
        private Long affectedCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private Long requestedCount; 
        private String userGroupId; 

        private Builder() {
        } 

        private Builder(AddUserGroupMembersResponseBody model) {
            this.affectedCount = model.affectedCount;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.requestedCount = model.requestedCount;
            this.userGroupId = model.userGroupId;
        } 

        /**
         * <p>实际新增成员关系数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder affectedCount(Long affectedCount) {
            this.affectedCount = affectedCount;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>去重前请求成员数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder requestedCount(Long requestedCount) {
            this.requestedCount = requestedCount;
            return this;
        }

        /**
         * <p>目标用户组ID</p>
         * 
         * <strong>example:</strong>
         * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }

        public AddUserGroupMembersResponseBody build() {
            return new AddUserGroupMembersResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemberResponseBody</p>
 */
public class GetMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<String> roles;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetMemberResponseBody(Builder builder) {
        this.accountType = builder.accountType;
        this.displayName = builder.displayName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roles
     */
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String accountType; 
        private String displayName; 
        private String gmtCreateTime; 
        private String memberId; 
        private String memberName; 
        private String requestId; 
        private java.util.List<String> roles; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GetMemberResponseBody model) {
            this.accountType = model.accountType;
            this.displayName = model.displayName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.memberId = model.memberId;
            this.memberName = model.memberName;
            this.requestId = model.requestId;
            this.roles = model.roles;
            this.userId = model.userId;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>myDisplayName</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>145883-21513926******88039</p>
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder memberName(String memberName) {
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of roles.</p>
         */
        public Builder roles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21513926******88039</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetMemberResponseBody build() {
            return new GetMemberResponseBody(this);
        } 

    } 

}

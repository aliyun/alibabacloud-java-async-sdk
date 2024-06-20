// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemberResponseBody</p>
 */
public class GetMemberResponseBody extends TeaModel {
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
    private java.util.List < String > roles;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetMemberResponseBody(Builder builder) {
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
    public java.util.List < String > getRoles() {
        return this.roles;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String displayName; 
        private String gmtCreateTime; 
        private String memberId; 
        private String memberName; 
        private String requestId; 
        private java.util.List < String > roles; 
        private String userId; 

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * MemberName.
         */
        public Builder memberName(String memberName) {
            this.memberName = memberName;
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
         * Roles.
         */
        public Builder roles(java.util.List < String > roles) {
            this.roles = roles;
            return this;
        }

        /**
         * UserId.
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

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
 * {@link CreateMemberResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemberResponseBody</p>
 */
public class CreateMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMemberResponseBody(Builder builder) {
        this.members = builder.members;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Members> members; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMemberResponseBody model) {
            this.members = model.members;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned members.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DA869D1B-035A-43B2-ACC1-C56681BD9FAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMemberResponseBody build() {
            return new CreateMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemberResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemberResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Members(Builder builder) {
            this.displayName = builder.displayName;
            this.memberId = builder.memberId;
            this.roles = builder.roles;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
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
            private String displayName; 
            private String memberId; 
            private java.util.List<String> roles; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.displayName = model.displayName;
                this.memberId = model.memberId;
                this.roles = model.roles;
                this.userId = model.userId;
            } 

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>myDisplayName</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}

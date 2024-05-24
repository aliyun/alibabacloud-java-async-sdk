// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Member} extends {@link TeaModel}
 *
 * <p>Member</p>
 */
public class Member extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("member")
    @com.aliyun.core.annotation.Validation(required = true)
    private String member;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    private Member(Builder builder) {
        this.member = builder.member;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Member create() {
        return builder().build();
    }

    /**
     * @return member
     */
    public String getMember() {
        return this.member;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private String member; 
        private String role; 

        /**
         * member.
         */
        public Builder member(String member) {
            this.member = member;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Member build() {
            return new Member(this);
        } 

    } 

}

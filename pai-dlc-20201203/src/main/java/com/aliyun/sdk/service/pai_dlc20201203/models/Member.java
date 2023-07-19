// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Member} extends {@link TeaModel}
 *
 * <p>Member</p>
 */
public class Member extends TeaModel {
    @NameInMap("MemberId")
    private String memberId;

    @NameInMap("MemberType")
    private String memberType;

    private Member(Builder builder) {
        this.memberId = builder.memberId;
        this.memberType = builder.memberType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Member create() {
        return builder().build();
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberType
     */
    public String getMemberType() {
        return this.memberType;
    }

    public static final class Builder {
        private String memberId; 
        private String memberType; 

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * MemberType.
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        public Member build() {
            return new Member(this);
        } 

    } 

}

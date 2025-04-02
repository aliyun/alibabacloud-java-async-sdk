// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link Member} extends {@link TeaModel}
 *
 * <p>Member</p>
 */
public class Member extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.NameInMap("MemberType")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Member model) {
            this.memberId = model.memberId;
            this.memberType = model.memberType;
        } 

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

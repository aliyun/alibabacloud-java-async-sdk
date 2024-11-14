// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddRdMemberListRequest} extends {@link RequestModel}
 *
 * <p>AddRdMemberListRequest</p>
 */
public class AddRdMemberListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < MemberList> memberList;

    private AddRdMemberListRequest(Builder builder) {
        super(builder);
        this.memberList = builder.memberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRdMemberListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberList
     */
    public java.util.List < MemberList> getMemberList() {
        return this.memberList;
    }

    public static final class Builder extends Request.Builder<AddRdMemberListRequest, Builder> {
        private java.util.List < MemberList> memberList; 

        private Builder() {
            super();
        } 

        private Builder(AddRdMemberListRequest request) {
            super(request);
            this.memberList = request.memberList;
        } 

        /**
         * <p>The list of the members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        @Override
        public AddRdMemberListRequest build() {
            return new AddRdMemberListRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddRdMemberListRequest} extends {@link TeaModel}
     *
     * <p>AddRdMemberListRequest</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private MemberList(Builder builder) {
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String uid; 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>19510843762****</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
}

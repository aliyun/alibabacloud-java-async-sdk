// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link AddInstanceMembersRequest} extends {@link RequestModel}
 *
 * <p>AddInstanceMembersRequest</p>
 */
public class AddInstanceMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Members> members;

    private AddInstanceMembersRequest(Builder builder) {
        super(builder);
        this.members = builder.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstanceMembersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    public static final class Builder extends Request.Builder<AddInstanceMembersRequest, Builder> {
        private java.util.List<Members> members; 

        private Builder() {
            super();
        } 

        private Builder(AddInstanceMembersRequest request) {
            super(request);
            this.members = request.members;
        } 

        /**
         * <p>The members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.putQueryParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public AddInstanceMembersRequest build() {
            return new AddInstanceMembersRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddInstanceMembersRequest} extends {@link TeaModel}
     *
     * <p>AddInstanceMembersRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberDesc")
        private String memberDesc;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long memberUid;

        private Members(Builder builder) {
            this.memberDesc = builder.memberDesc;
            this.memberUid = builder.memberUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberDesc
         */
        public String getMemberDesc() {
            return this.memberDesc;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        public static final class Builder {
            private String memberDesc; 
            private Long memberUid; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.memberDesc = model.memberDesc;
                this.memberUid = model.memberUid;
            } 

            /**
             * <p>The remarks of the member. The value must be 1 to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>renewal</p>
             */
            public Builder memberDesc(String memberDesc) {
                this.memberDesc = memberDesc;
                return this;
            }

            /**
             * <p>The UID of the member. You can add up to 20 members to Cloud Firewall at a time.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}

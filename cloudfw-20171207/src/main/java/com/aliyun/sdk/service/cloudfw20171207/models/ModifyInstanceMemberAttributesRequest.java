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
 * {@link ModifyInstanceMemberAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceMemberAttributesRequest</p>
 */
public class ModifyInstanceMemberAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Members> members;

    private ModifyInstanceMemberAttributesRequest(Builder builder) {
        super(builder);
        this.members = builder.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMemberAttributesRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyInstanceMemberAttributesRequest, Builder> {
        private java.util.List<Members> members; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMemberAttributesRequest request) {
            super(request);
            this.members = request.members;
        } 

        /**
         * <p>The members that to be modified.</p>
         * <p>This parameter is required.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.putQueryParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public ModifyInstanceMemberAttributesRequest build() {
            return new ModifyInstanceMemberAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceMemberAttributesRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceMemberAttributesRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberDesc")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * <p>The remarks of the member in Cloud Firewall.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>renewal</p>
             */
            public Builder memberDesc(String memberDesc) {
                this.memberDesc = memberDesc;
                return this;
            }

            /**
             * <p>The UID of the member in Cloud Firewall.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123412341234****</p>
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

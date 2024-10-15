// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteInstanceMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceMembersRequest</p>
 */
public class DeleteInstanceMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > memberUids;

    private DeleteInstanceMembersRequest(Builder builder) {
        super(builder);
        this.memberUids = builder.memberUids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberUids
     */
    public java.util.List < Long > getMemberUids() {
        return this.memberUids;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceMembersRequest, Builder> {
        private java.util.List < Long > memberUids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceMembersRequest request) {
            super(request);
            this.memberUids = request.memberUids;
        } 

        /**
         * <p>The UIDs of the members.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123412341234</p>
         */
        public Builder memberUids(java.util.List < Long > memberUids) {
            this.putQueryParameter("MemberUids", memberUids);
            this.memberUids = memberUids;
            return this;
        }

        @Override
        public DeleteInstanceMembersRequest build() {
            return new DeleteInstanceMembersRequest(this);
        } 

    } 

}

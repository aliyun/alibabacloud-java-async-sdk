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
 * {@link DescribeMemberInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeMemberInfoRequest</p>
 */
public class DescribeMemberInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    private DescribeMemberInfoRequest(Builder builder) {
        super(builder);
        this.memberUid = builder.memberUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    public static final class Builder extends Request.Builder<DescribeMemberInfoRequest, Builder> {
        private String memberUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMemberInfoRequest request) {
            super(request);
            this.memberUid = request.memberUid;
        } 

        /**
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        @Override
        public DescribeMemberInfoRequest build() {
            return new DescribeMemberInfoRequest(this);
        } 

    } 

}

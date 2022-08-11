// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserPermissionRequest</p>
 */
public class DescribeUserPermissionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private DescribeUserPermissionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeUserPermissionRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserPermissionRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * RAM 用户的 UID
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeUserPermissionRequest build() {
            return new DescribeUserPermissionRequest(this);
        } 

    } 

}

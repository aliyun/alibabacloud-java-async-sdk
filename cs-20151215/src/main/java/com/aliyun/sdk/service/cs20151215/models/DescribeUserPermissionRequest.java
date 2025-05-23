// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserPermissionRequest</p>
 */
public class DescribeUserPermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("uid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the RAM user or RAM role.</p>
         * <ul>
         * <li>If you query RAM user permissions, the UID of the RAM user is used.</li>
         * <li>If you query the permissions of a RAM role, the ID of the RAM role is used.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21175****</p>
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

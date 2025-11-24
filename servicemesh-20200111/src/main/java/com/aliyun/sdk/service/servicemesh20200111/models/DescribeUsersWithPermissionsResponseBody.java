// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeUsersWithPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersWithPermissionsResponseBody</p>
 */
public class DescribeUsersWithPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UIDs")
    private java.util.List<String> UIDs;

    private DescribeUsersWithPermissionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.UIDs = builder.UIDs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersWithPermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return UIDs
     */
    public java.util.List<String> getUIDs() {
        return this.UIDs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> UIDs; 

        private Builder() {
        } 

        private Builder(DescribeUsersWithPermissionsResponseBody model) {
            this.requestId = model.requestId;
            this.UIDs = model.UIDs;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12B94024-C241-13CD-BA44-6106DF1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of the IDs of the RAM users or RAM roles to which an RBAC role is assigned.</p>
         */
        public Builder UIDs(java.util.List<String> UIDs) {
            this.UIDs = UIDs;
            return this;
        }

        public DescribeUsersWithPermissionsResponseBody build() {
            return new DescribeUsersWithPermissionsResponseBody(this);
        } 

    } 

}

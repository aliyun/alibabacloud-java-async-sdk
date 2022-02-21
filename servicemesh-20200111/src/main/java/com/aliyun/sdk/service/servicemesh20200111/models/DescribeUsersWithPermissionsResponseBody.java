// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersWithPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersWithPermissionsResponseBody</p>
 */
public class DescribeUsersWithPermissionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UIDs")
    private java.util.List < String > UIDs;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return UIDs
     */
    public java.util.List < String > getUIDs() {
        return this.UIDs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > UIDs; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UIDs.
         */
        public Builder UIDs(java.util.List < String > UIDs) {
            this.UIDs = UIDs;
            return this;
        }

        public DescribeUsersWithPermissionsResponseBody build() {
            return new DescribeUsersWithPermissionsResponseBody(this);
        } 

    } 

}

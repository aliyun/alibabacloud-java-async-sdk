// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ListFilePermissionResponseBody</p>
 */
public class ListFilePermissionResponseBody extends TeaModel {
    @NameInMap("FilePermissions")
    private java.util.List < FilePermissionMember > filePermissions;

    @NameInMap("RequestId")
    private String requestId;

    private ListFilePermissionResponseBody(Builder builder) {
        this.filePermissions = builder.filePermissions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return filePermissions
     */
    public java.util.List < FilePermissionMember > getFilePermissions() {
        return this.filePermissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FilePermissionMember > filePermissions; 
        private String requestId; 

        /**
         * The permissions on the shared file.
         */
        public Builder filePermissions(java.util.List < FilePermissionMember > filePermissions) {
            this.filePermissions = filePermissions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFilePermissionResponseBody build() {
            return new ListFilePermissionResponseBody(this);
        } 

    } 

}

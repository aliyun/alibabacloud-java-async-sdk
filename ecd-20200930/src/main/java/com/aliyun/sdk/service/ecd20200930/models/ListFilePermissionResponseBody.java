// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListFilePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ListFilePermissionResponseBody</p>
 */
public class ListFilePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePermissions")
    private java.util.List<FilePermissionMember> filePermissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<FilePermissionMember> getFilePermissions() {
        return this.filePermissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FilePermissionMember> filePermissions; 
        private String requestId; 

        /**
         * <p>The permissions on the shared file.</p>
         */
        public Builder filePermissions(java.util.List<FilePermissionMember> filePermissions) {
            this.filePermissions = filePermissions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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

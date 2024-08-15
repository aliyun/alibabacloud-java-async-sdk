// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMemberDeletionPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>SetMemberDeletionPermissionResponseBody</p>
 */
public class SetMemberDeletionPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagementAccountId")
    private String managementAccountId;

    @com.aliyun.core.annotation.NameInMap("MemberDeletionStatus")
    private String memberDeletionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
    private String resourceDirectoryId;

    private SetMemberDeletionPermissionResponseBody(Builder builder) {
        this.managementAccountId = builder.managementAccountId;
        this.memberDeletionStatus = builder.memberDeletionStatus;
        this.requestId = builder.requestId;
        this.resourceDirectoryId = builder.resourceDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMemberDeletionPermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return managementAccountId
     */
    public String getManagementAccountId() {
        return this.managementAccountId;
    }

    /**
     * @return memberDeletionStatus
     */
    public String getMemberDeletionStatus() {
        return this.memberDeletionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDirectoryId
     */
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

    public static final class Builder {
        private String managementAccountId; 
        private String memberDeletionStatus; 
        private String requestId; 
        private String resourceDirectoryId; 

        /**
         * The ID of the management account of the resource directory.
         */
        public Builder managementAccountId(String managementAccountId) {
            this.managementAccountId = managementAccountId;
            return this;
        }

        /**
         * The status of the member deletion feature. Valid values:
         * <p>
         * 
         * *   Enabled: The feature is enabled.
         * *   Disabled: The feature is disabled.
         */
        public Builder memberDeletionStatus(String memberDeletionStatus) {
            this.memberDeletionStatus = memberDeletionStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource directory.
         */
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }

        public SetMemberDeletionPermissionResponseBody build() {
            return new SetMemberDeletionPermissionResponseBody(this);
        } 

    } 

}

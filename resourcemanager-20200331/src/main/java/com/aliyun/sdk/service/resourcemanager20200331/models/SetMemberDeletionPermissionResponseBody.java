// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
         * <p>The ID of the management account of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        public Builder managementAccountId(String managementAccountId) {
            this.managementAccountId = managementAccountId;
            return this;
        }

        /**
         * <p>The status of the member deletion feature. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder memberDeletionStatus(String memberDeletionStatus) {
            this.memberDeletionStatus = memberDeletionStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C55A4CAA-9039-1DDF-91CE-FCC134513D29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-3G****</p>
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

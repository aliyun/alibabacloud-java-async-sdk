// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceDirectoryResponseBody</p>
 */
public class GetResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectory")
    private ResourceDirectory resourceDirectory;

    private GetResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceDirectory = builder.resourceDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDirectory
     */
    public ResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceDirectory resourceDirectory; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource directory.</p>
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        public GetResourceDirectoryResponseBody build() {
            return new GetResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceDirectoryResponseBody</p>
     */
    public static class ResourceDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlPolicyStatus")
        private String controlPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IdentityInformation")
        private String identityInformation;

        @com.aliyun.core.annotation.NameInMap("MasterAccountId")
        private String masterAccountId;

        @com.aliyun.core.annotation.NameInMap("MasterAccountName")
        private String masterAccountName;

        @com.aliyun.core.annotation.NameInMap("MemberAccountDisplayNameSyncStatus")
        private String memberAccountDisplayNameSyncStatus;

        @com.aliyun.core.annotation.NameInMap("MemberDeletionStatus")
        private String memberDeletionStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("RootFolderId")
        private String rootFolderId;

        private ResourceDirectory(Builder builder) {
            this.controlPolicyStatus = builder.controlPolicyStatus;
            this.createTime = builder.createTime;
            this.identityInformation = builder.identityInformation;
            this.masterAccountId = builder.masterAccountId;
            this.masterAccountName = builder.masterAccountName;
            this.memberAccountDisplayNameSyncStatus = builder.memberAccountDisplayNameSyncStatus;
            this.memberDeletionStatus = builder.memberDeletionStatus;
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.rootFolderId = builder.rootFolderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDirectory create() {
            return builder().build();
        }

        /**
         * @return controlPolicyStatus
         */
        public String getControlPolicyStatus() {
            return this.controlPolicyStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return identityInformation
         */
        public String getIdentityInformation() {
            return this.identityInformation;
        }

        /**
         * @return masterAccountId
         */
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        /**
         * @return masterAccountName
         */
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        /**
         * @return memberAccountDisplayNameSyncStatus
         */
        public String getMemberAccountDisplayNameSyncStatus() {
            return this.memberAccountDisplayNameSyncStatus;
        }

        /**
         * @return memberDeletionStatus
         */
        public String getMemberDeletionStatus() {
            return this.memberDeletionStatus;
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return rootFolderId
         */
        public String getRootFolderId() {
            return this.rootFolderId;
        }

        public static final class Builder {
            private String controlPolicyStatus; 
            private String createTime; 
            private String identityInformation; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String memberAccountDisplayNameSyncStatus; 
            private String memberDeletionStatus; 
            private String resourceDirectoryId; 
            private String rootFolderId; 

            /**
             * <p>The status of the Control Policy feature. Valid values:</p>
             * <ul>
             * <li>Enabled: The feature is enabled.</li>
             * <li>PendingEnable: The feature is being enabled.</li>
             * <li>Disabled: The feature is disabled.</li>
             * <li>PendingDisable: The feature is being disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder controlPolicyStatus(String controlPolicyStatus) {
                this.controlPolicyStatus = controlPolicyStatus;
                return this;
            }

            /**
             * <p>The time when the resource directory was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-18T15:32:10.473Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The real-name verification information.</p>
             * 
             * <strong>example:</strong>
             * <p>*** Co., Ltd.</p>
             */
            public Builder identityInformation(String identityInformation) {
                this.identityInformation = identityInformation;
                return this;
            }

            /**
             * <p>The ID of the management account.</p>
             * 
             * <strong>example:</strong>
             * <p>172845045600****</p>
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * <p>The name of the management account.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-admin</p>
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder memberAccountDisplayNameSyncStatus(String memberAccountDisplayNameSyncStatus) {
                this.memberAccountDisplayNameSyncStatus = memberAccountDisplayNameSyncStatus;
                return this;
            }

            /**
             * <p>The status of the member deletion feature. Valid values:</p>
             * <ul>
             * <li>Enabled: The feature is enabled. You can call the <a href="~~DeleteAccount~~">DeleteAccount</a> operation to delete members of the resource account type.</li>
             * <li>Disabled: The feature is disabled. You cannot delete members of the resource account type.</li>
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
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-St****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The ID of the Root folder.</p>
             * 
             * <strong>example:</strong>
             * <p>r-Zo****</p>
             */
            public Builder rootFolderId(String rootFolderId) {
                this.rootFolderId = rootFolderId;
                return this;
            }

            public ResourceDirectory build() {
                return new ResourceDirectory(this);
            } 

        } 

    }
}

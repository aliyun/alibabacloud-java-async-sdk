// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>EnableResourceDirectoryResponseBody</p>
 */
public class EnableResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDirectory")
    private ResourceDirectory resourceDirectory;

    private EnableResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceDirectory = builder.resourceDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceDirectoryResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the resource directory.
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        public EnableResourceDirectoryResponseBody build() {
            return new EnableResourceDirectoryResponseBody(this);
        } 

    } 

    public static class ResourceDirectory extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MasterAccountId")
        private String masterAccountId;

        @NameInMap("MasterAccountName")
        private String masterAccountName;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("RootFolderId")
        private String rootFolderId;

        private ResourceDirectory(Builder builder) {
            this.createTime = builder.createTime;
            this.masterAccountId = builder.masterAccountId;
            this.masterAccountName = builder.masterAccountName;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
            private String createTime; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String resourceDirectoryId; 
            private String rootFolderId; 

            /**
             * The time when the resource directory was enabled.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the management account.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * The name of the management account.
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * The ID of the resource directory.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * The ID of the Root folder.
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

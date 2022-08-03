// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>InitResourceDirectoryResponseBody</p>
 */
public class InitResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDirectory")
    private ResourceDirectory resourceDirectory;

    private InitResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceDirectory = builder.resourceDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitResourceDirectoryResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceDirectory.
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        public InitResourceDirectoryResponseBody build() {
            return new InitResourceDirectoryResponseBody(this);
        } 

    } 

    public static class ResourceDirectory extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("MasterAccountId")
        private String masterAccountId;

        @NameInMap("MasterAccountName")
        private String masterAccountName;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("RootFolderId")
        private String rootFolderId;

        private ResourceDirectory(Builder builder) {
            this.createDate = builder.createDate;
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
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
            private String createDate; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String resourceDirectoryId; 
            private String rootFolderId; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * MasterAccountId.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * MasterAccountName.
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * ResourceDirectoryId.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * RootFolderId.
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

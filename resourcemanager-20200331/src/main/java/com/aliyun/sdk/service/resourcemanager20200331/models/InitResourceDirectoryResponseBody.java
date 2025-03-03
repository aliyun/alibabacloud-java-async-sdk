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
 * {@link InitResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>InitResourceDirectoryResponseBody</p>
 */
public class InitResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectory")
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
         * <p>The information of the resource directory.</p>
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        public InitResourceDirectoryResponseBody build() {
            return new InitResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>InitResourceDirectoryResponseBody</p>
     */
    public static class ResourceDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("MasterAccountId")
        private String masterAccountId;

        @com.aliyun.core.annotation.NameInMap("MasterAccountName")
        private String masterAccountName;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("RootFolderId")
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
             * <p>The ID of the enterprise management account.</p>
             * 
             * <strong>example:</strong>
             * <p>172841235500****</p>
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * <p>The name of the enterprise management account.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-****</p>
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-Ss****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The ID of the root folder.</p>
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

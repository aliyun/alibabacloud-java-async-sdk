// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFilesetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilesetsResponseBody</p>
 */
public class DescribeFilesetsResponseBody extends TeaModel {
    @NameInMap("Entries")
    private Entries entries;

    @NameInMap("FileSystemId")
    private String fileSystemId;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFilesetsResponseBody(Builder builder) {
        this.entries = builder.entries;
        this.fileSystemId = builder.fileSystemId;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return entries
     */
    public Entries getEntries() {
        return this.entries;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Entries entries; 
        private String fileSystemId; 
        private String nextToken; 
        private String requestId; 

        /**
         * The fileset information.
         */
        public Builder entries(Entries entries) {
            this.entries = entries;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFilesetsResponseBody build() {
            return new DescribeFilesetsResponseBody(this);
        } 

    } 

    public static class Entrie extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FileSystemPath")
        private String fileSystemPath;

        @NameInMap("FsetId")
        private String fsetId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Entrie(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemPath = builder.fileSystemPath;
            this.fsetId = builder.fsetId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entrie create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemPath
         */
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        /**
         * @return fsetId
         */
        public String getFsetId() {
            return this.fsetId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String fileSystemPath; 
            private String fsetId; 
            private String status; 
            private String updateTime; 

            /**
             * The time when the fileset was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The fileset description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The fileset path.
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * The fileset ID.
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * The fileset status. Valid values:
             * <p>
             * 
             * *   CREATING: The fileset is being created.
             * *   CREATED: The fileset has been created and is running properly.
             * *   RELEASING: The fileset is being released.
             * *   RELEASED: The fileset has been deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the fileset was last updated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Entrie build() {
                return new Entrie(this);
            } 

        } 

    }
    public static class Entries extends TeaModel {
        @NameInMap("Entrie")
        private java.util.List < Entrie> entrie;

        private Entries(Builder builder) {
            this.entrie = builder.entrie;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return entrie
         */
        public java.util.List < Entrie> getEntrie() {
            return this.entrie;
        }

        public static final class Builder {
            private java.util.List < Entrie> entrie; 

            /**
             * Entrie.
             */
            public Builder entrie(java.util.List < Entrie> entrie) {
                this.entrie = entrie;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ListDataInsightDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataInsightDirectoriesResponseBody</p>
 */
public class ListDataInsightDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directory")
    private Directory directory;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataInsightDirectoriesResponseBody(Builder builder) {
        this.directory = builder.directory;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataInsightDirectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directory
     */
    public Directory getDirectory() {
        return this.directory;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private Directory directory; 
        private String fileSystemId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataInsightDirectoriesResponseBody model) {
            this.directory = model.directory;
            this.fileSystemId = model.fileSystemId;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The directory information.</p>
         */
        public Builder directory(Directory directory) {
            this.directory = directory;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-370lx1ev9ss27o0****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The maximum number of directories returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>/subDir</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataInsightDirectoriesResponseBody build() {
            return new ListDataInsightDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataInsightDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataInsightDirectoriesResponseBody</p>
     */
    public static class SubDirectories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DirCapacity")
        private Long dirCapacity;

        @com.aliyun.core.annotation.NameInMap("DirCapacityOffline")
        private Long dirCapacityOffline;

        @com.aliyun.core.annotation.NameInMap("DirCapacityOnline")
        private Long dirCapacityOnline;

        @com.aliyun.core.annotation.NameInMap("DirLevel")
        private Integer dirLevel;

        @com.aliyun.core.annotation.NameInMap("DirName")
        private String dirName;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Long fileCount;

        @com.aliyun.core.annotation.NameInMap("FileCountOffline")
        private Long fileCountOffline;

        @com.aliyun.core.annotation.NameInMap("FileCountOnline")
        private Long fileCountOnline;

        @com.aliyun.core.annotation.NameInMap("Inode")
        private Long inode;

        @com.aliyun.core.annotation.NameInMap("LastAccessTime")
        private String lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private SubDirectories(Builder builder) {
            this.createdAt = builder.createdAt;
            this.dirCapacity = builder.dirCapacity;
            this.dirCapacityOffline = builder.dirCapacityOffline;
            this.dirCapacityOnline = builder.dirCapacityOnline;
            this.dirLevel = builder.dirLevel;
            this.dirName = builder.dirName;
            this.fileCount = builder.fileCount;
            this.fileCountOffline = builder.fileCountOffline;
            this.fileCountOnline = builder.fileCountOnline;
            this.inode = builder.inode;
            this.lastAccessTime = builder.lastAccessTime;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDirectories create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dirCapacity
         */
        public Long getDirCapacity() {
            return this.dirCapacity;
        }

        /**
         * @return dirCapacityOffline
         */
        public Long getDirCapacityOffline() {
            return this.dirCapacityOffline;
        }

        /**
         * @return dirCapacityOnline
         */
        public Long getDirCapacityOnline() {
            return this.dirCapacityOnline;
        }

        /**
         * @return dirLevel
         */
        public Integer getDirLevel() {
            return this.dirLevel;
        }

        /**
         * @return dirName
         */
        public String getDirName() {
            return this.dirName;
        }

        /**
         * @return fileCount
         */
        public Long getFileCount() {
            return this.fileCount;
        }

        /**
         * @return fileCountOffline
         */
        public Long getFileCountOffline() {
            return this.fileCountOffline;
        }

        /**
         * @return fileCountOnline
         */
        public Long getFileCountOnline() {
            return this.fileCountOnline;
        }

        /**
         * @return inode
         */
        public Long getInode() {
            return this.inode;
        }

        /**
         * @return lastAccessTime
         */
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private Long dirCapacity; 
            private Long dirCapacityOffline; 
            private Long dirCapacityOnline; 
            private Integer dirLevel; 
            private String dirName; 
            private Long fileCount; 
            private Long fileCountOffline; 
            private Long fileCountOnline; 
            private Long inode; 
            private String lastAccessTime; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(SubDirectories model) {
                this.createdAt = model.createdAt;
                this.dirCapacity = model.dirCapacity;
                this.dirCapacityOffline = model.dirCapacityOffline;
                this.dirCapacityOnline = model.dirCapacityOnline;
                this.dirLevel = model.dirLevel;
                this.dirName = model.dirName;
                this.fileCount = model.fileCount;
                this.fileCountOffline = model.fileCountOffline;
                this.fileCountOnline = model.fileCountOnline;
                this.inode = model.inode;
                this.lastAccessTime = model.lastAccessTime;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The time when the directory was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-23T12:47:14Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The capacity of the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>345518080</p>
             */
            public Builder dirCapacity(Long dirCapacity) {
                this.dirCapacity = dirCapacity;
                return this;
            }

            /**
             * <p>The capacity of IA files in the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dirCapacityOffline(Long dirCapacityOffline) {
                this.dirCapacityOffline = dirCapacityOffline;
                return this;
            }

            /**
             * <p>The capacity of standard files in the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>345518080</p>
             */
            public Builder dirCapacityOnline(Long dirCapacityOnline) {
                this.dirCapacityOnline = dirCapacityOnline;
                return this;
            }

            /**
             * <p>The subdirectory level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dirLevel(Integer dirLevel) {
                this.dirLevel = dirLevel;
                return this;
            }

            /**
             * <p>The subdirectory name.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir_l1_n000</p>
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * <p>The number of files in the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>84846</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The number of IA files in the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>2343</p>
             */
            public Builder fileCountOffline(Long fileCountOffline) {
                this.fileCountOffline = fileCountOffline;
                return this;
            }

            /**
             * <p>The number of standard files in the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>84355</p>
             */
            public Builder fileCountOnline(Long fileCountOnline) {
                this.fileCountOnline = fileCountOnline;
                return this;
            }

            /**
             * <p>The inode number of the subdirectory.</p>
             * 
             * <strong>example:</strong>
             * <p>140288</p>
             */
            public Builder inode(Long inode) {
                this.inode = inode;
                return this;
            }

            /**
             * <p>The time when the database directory data record was last updated. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-29T03:41:12Z</p>
             */
            public Builder lastAccessTime(String lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * <p>The time when the directory was last accessed. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-29T03:41:12Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public SubDirectories build() {
                return new SubDirectories(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataInsightDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataInsightDirectoriesResponseBody</p>
     */
    public static class Directory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirCapacity")
        private Long dirCapacity;

        @com.aliyun.core.annotation.NameInMap("DirCapacityOffline")
        private Long dirCapacityOffline;

        @com.aliyun.core.annotation.NameInMap("DirCapacityOnline")
        private Long dirCapacityOnline;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Long fileCount;

        @com.aliyun.core.annotation.NameInMap("FileCountOffline")
        private Long fileCountOffline;

        @com.aliyun.core.annotation.NameInMap("FileCountOnline")
        private Long fileCountOnline;

        @com.aliyun.core.annotation.NameInMap("Inode")
        private Long inode;

        @com.aliyun.core.annotation.NameInMap("SubDirectories")
        private java.util.List<SubDirectories> subDirectories;

        private Directory(Builder builder) {
            this.dirCapacity = builder.dirCapacity;
            this.dirCapacityOffline = builder.dirCapacityOffline;
            this.dirCapacityOnline = builder.dirCapacityOnline;
            this.fileCount = builder.fileCount;
            this.fileCountOffline = builder.fileCountOffline;
            this.fileCountOnline = builder.fileCountOnline;
            this.inode = builder.inode;
            this.subDirectories = builder.subDirectories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
        }

        /**
         * @return dirCapacity
         */
        public Long getDirCapacity() {
            return this.dirCapacity;
        }

        /**
         * @return dirCapacityOffline
         */
        public Long getDirCapacityOffline() {
            return this.dirCapacityOffline;
        }

        /**
         * @return dirCapacityOnline
         */
        public Long getDirCapacityOnline() {
            return this.dirCapacityOnline;
        }

        /**
         * @return fileCount
         */
        public Long getFileCount() {
            return this.fileCount;
        }

        /**
         * @return fileCountOffline
         */
        public Long getFileCountOffline() {
            return this.fileCountOffline;
        }

        /**
         * @return fileCountOnline
         */
        public Long getFileCountOnline() {
            return this.fileCountOnline;
        }

        /**
         * @return inode
         */
        public Long getInode() {
            return this.inode;
        }

        /**
         * @return subDirectories
         */
        public java.util.List<SubDirectories> getSubDirectories() {
            return this.subDirectories;
        }

        public static final class Builder {
            private Long dirCapacity; 
            private Long dirCapacityOffline; 
            private Long dirCapacityOnline; 
            private Long fileCount; 
            private Long fileCountOffline; 
            private Long fileCountOnline; 
            private Long inode; 
            private java.util.List<SubDirectories> subDirectories; 

            private Builder() {
            } 

            private Builder(Directory model) {
                this.dirCapacity = model.dirCapacity;
                this.dirCapacityOffline = model.dirCapacityOffline;
                this.dirCapacityOnline = model.dirCapacityOnline;
                this.fileCount = model.fileCount;
                this.fileCountOffline = model.fileCountOffline;
                this.fileCountOnline = model.fileCountOnline;
                this.inode = model.inode;
                this.subDirectories = model.subDirectories;
            } 

            /**
             * <p>The directory capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder dirCapacity(Long dirCapacity) {
                this.dirCapacity = dirCapacity;
                return this;
            }

            /**
             * <p>The capacity of IA files.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder dirCapacityOffline(Long dirCapacityOffline) {
                this.dirCapacityOffline = dirCapacityOffline;
                return this;
            }

            /**
             * <p>The capacity of standard files.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder dirCapacityOnline(Long dirCapacityOnline) {
                this.dirCapacityOnline = dirCapacityOnline;
                return this;
            }

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>2343232</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The number of Infrequent Access (IA) files.</p>
             * 
             * <strong>example:</strong>
             * <p>204800</p>
             */
            public Builder fileCountOffline(Long fileCountOffline) {
                this.fileCountOffline = fileCountOffline;
                return this;
            }

            /**
             * <p>The number of standard files.</p>
             * 
             * <strong>example:</strong>
             * <p>204800</p>
             */
            public Builder fileCountOnline(Long fileCountOnline) {
                this.fileCountOnline = fileCountOnline;
                return this;
            }

            /**
             * <p>The inode number of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>2343</p>
             */
            public Builder inode(Long inode) {
                this.inode = inode;
                return this;
            }

            /**
             * <p>The subdirectory information.</p>
             */
            public Builder subDirectories(java.util.List<SubDirectories> subDirectories) {
                this.subDirectories = subDirectories;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
}

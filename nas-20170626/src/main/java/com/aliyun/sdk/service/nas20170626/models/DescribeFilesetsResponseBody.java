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
 * {@link DescribeFilesetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilesetsResponseBody</p>
 */
public class DescribeFilesetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private Entries entries;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @Deprecated
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The fileset information.</p>
         */
        public Builder entries(Entries entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c****.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya****.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS is not supported on the international site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64ya****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFilesetsResponseBody build() {
            return new DescribeFilesetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesetsResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        private Quota(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private Long fileCountLimit; 
            private Long sizeLimit; 

            /**
             * <p>The limit of the file quantity of the quota. Valid values:</p>
             * <p>Minimum value: 10000.</p>
             * <p>Maximum value: 10000000000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The limit of the quota capacity. Unit: bytes.</p>
             * <p>Minimum value: 10737418240 (10 GiB).</p>
             * <p>Maximum value: 1073741824000 (1024000 GiB).</p>
             * <p>Step size: 1073741824 (1 GiB).</p>
             * 
             * <strong>example:</strong>
             * <p>10737418240</p>
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFilesetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesetsResponseBody</p>
     */
    public static class Entrie extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileCountUsage")
        private Long fileCountUsage;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemPath")
        private String fileSystemPath;

        @com.aliyun.core.annotation.NameInMap("FsetId")
        private String fsetId;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("SpaceUsage")
        private Long spaceUsage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Entrie(Builder builder) {
            this.createTime = builder.createTime;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.fileCountUsage = builder.fileCountUsage;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemPath = builder.fileSystemPath;
            this.fsetId = builder.fsetId;
            this.quota = builder.quota;
            this.spaceUsage = builder.spaceUsage;
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
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileCountUsage
         */
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
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
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return spaceUsage
         */
        public Long getSpaceUsage() {
            return this.spaceUsage;
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
            private Boolean deletionProtection; 
            private String description; 
            private Long fileCountUsage; 
            private String fileSystemId; 
            private String fileSystemPath; 
            private String fsetId; 
            private Quota quota; 
            private Long spaceUsage; 
            private String status; 
            private String updateTime; 

            /**
             * <p>The time when the fileset was created.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-30T10:08:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable deletion protection to allow you to release the fileset by using the console or by calling the <a href="https://help.aliyun.com/document_detail/2838077.html">DeleteFileset</a> operation. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p> This parameter can protect filesets only against manual releases, but not against automatic releases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The fileset description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The usage of the file quantity.</p>
             * <blockquote>
             * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder fileCountUsage(Long fileCountUsage) {
                this.fileCountUsage = fileCountUsage;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * <ul>
             * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c****.</li>
             * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya****.</li>
             * </ul>
             * <blockquote>
             * <p> CPFS is not supported on the international site.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-290w65p03ok64ya****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The fileset path.</p>
             * 
             * <strong>example:</strong>
             * <p>pathtoroot/fset</p>
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * <p>The fileset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fset-1902718ea0ae****</p>
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * <p>The quota information.</p>
             * <blockquote>
             * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
             * </blockquote>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The capacity usage. Unit: bytes.</p>
             * <blockquote>
             * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder spaceUsage(Long spaceUsage) {
                this.spaceUsage = spaceUsage;
                return this;
            }

            /**
             * <p>The fileset status. Valid values:</p>
             * <ul>
             * <li>CREATING: The fileset is being created.</li>
             * <li>CREATED: The fileset has been created and is running properly.</li>
             * <li>RELEASING: The fileset is being released.</li>
             * <li>RELEASED: The fileset has been deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the fileset was last updated.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-30T10:08:08Z</p>
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
    /**
     * 
     * {@link DescribeFilesetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesetsResponseBody</p>
     */
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entrie")
        private java.util.List<Entrie> entrie;

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
        public java.util.List<Entrie> getEntrie() {
            return this.entrie;
        }

        public static final class Builder {
            private java.util.List<Entrie> entrie; 

            /**
             * Entrie.
             */
            public Builder entrie(java.util.List<Entrie> entrie) {
                this.entrie = entrie;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}

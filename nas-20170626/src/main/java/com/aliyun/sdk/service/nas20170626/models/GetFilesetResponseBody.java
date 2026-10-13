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
 * {@link GetFilesetResponseBody} extends {@link TeaModel}
 *
 * <p>GetFilesetResponseBody</p>
 */
public class GetFilesetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFilesetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFilesetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFilesetResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFilesetResponseBody build() {
            return new GetFilesetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFilesetResponseBody} extends {@link TeaModel}
     *
     * <p>GetFilesetResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Quota model) {
                this.fileCountLimit = model.fileCountLimit;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * <p>The file count limit of the quota. Value range:</p>
             * <ul>
             * <li><p>Minimum value: 10,000.</p>
             * </li>
             * <li><p>Maximum value: 10,000,000,000.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The total capacity limit of the quota. Unit: bytes.</p>
             * <p>Value range:</p>
             * <ul>
             * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
             * </li>
             * <li><p>Increment: 1,073,741,824 (1 GiB).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10,737,418,240</p>
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
     * {@link GetFilesetResponseBody} extends {@link TeaModel}
     *
     * <p>GetFilesetResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.deletionProtection = model.deletionProtection;
                this.description = model.description;
                this.fileCountUsage = model.fileCountUsage;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemPath = model.fileSystemPath;
                this.fsetId = model.fsetId;
                this.quota = model.quota;
                this.spaceUsage = model.spaceUsage;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the Fileset was created.</p>
             * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-21 12:49:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation.</p>
             * <ul>
             * <li>true: Release protection is enabled.</li>
             * <li>false (default): Release protection is disabled.</li>
             * </ul>
             * <blockquote>
             * <p>This property applies only to manual release operations and does not apply to system-initiated release operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The description of the Fileset.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The file count usage.</p>
             * <blockquote>
             * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
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
             * <p>The file system ID.</p>
             * <ul>
             * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
             * </li>
             * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpfs-0244729a8ef8****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The path of the Fileset in the CPFS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>pathtoroot/fset/</p>
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * <p>The Fileset ID.</p>
             * <blockquote>
             * <p>This parameter is required if the file system type is CPFS.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fset-03250e8fe78d****</p>
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * <p>The quota information.</p>
             * <blockquote>
             * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
             * </blockquote>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The capacity usage. Unit: bytes.</p>
             * <blockquote>
             * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
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
             * <p>The status of the Fileset. Valid values:</p>
             * <ul>
             * <li>CREATING: The Fileset is being created.</li>
             * <li>CREATED: The Fileset is created and running as expected. </li>
             * <li>RELEASING: The Fileset is being released.</li>
             * <li>RELEASED: The Fileset is deleted.</li>
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
             * <p>The time when the Fileset was last updated.</p>
             * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-22 12:49:25</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

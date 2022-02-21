// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssDownloadsForSQLServerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssDownloadsForSQLServerResponseBody</p>
 */
public class DescribeOssDownloadsForSQLServerResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("Items")
    private Items items;

    @NameInMap("MigrateIaskId")
    private String migrateIaskId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOssDownloadsForSQLServerResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.migrateIaskId = builder.migrateIaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssDownloadsForSQLServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return migrateIaskId
     */
    public String getMigrateIaskId() {
        return this.migrateIaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private Items items; 
        private String migrateIaskId; 
        private String requestId; 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * MigrateIaskId.
         */
        public Builder migrateIaskId(String migrateIaskId) {
            this.migrateIaskId = migrateIaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssDownloadsForSQLServerResponseBody build() {
            return new DescribeOssDownloadsForSQLServerResponseBody(this);
        } 

    } 

    public static class OssDownload extends TeaModel {
        @NameInMap("BakType")
        private String bakType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("IsAvail")
        private String isAvail;

        @NameInMap("Status")
        private String status;

        private OssDownload(Builder builder) {
            this.bakType = builder.bakType;
            this.createTime = builder.createTime;
            this.desc = builder.desc;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.isAvail = builder.isAvail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDownload create() {
            return builder().build();
        }

        /**
         * @return bakType
         */
        public String getBakType() {
            return this.bakType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return isAvail
         */
        public String getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bakType; 
            private String createTime; 
            private String desc; 
            private String fileName; 
            private String fileSize; 
            private String isAvail; 
            private String status; 

            /**
             * BakType.
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public OssDownload build() {
                return new OssDownload(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("OssDownload")
        private java.util.List < OssDownload> ossDownload;

        private Items(Builder builder) {
            this.ossDownload = builder.ossDownload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return ossDownload
         */
        public java.util.List < OssDownload> getOssDownload() {
            return this.ossDownload;
        }

        public static final class Builder {
            private java.util.List < OssDownload> ossDownload; 

            /**
             * OssDownload.
             */
            public Builder ossDownload(java.util.List < OssDownload> ossDownload) {
                this.ossDownload = ossDownload;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}

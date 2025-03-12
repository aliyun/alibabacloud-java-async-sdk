// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeBackupSetDownloadLinkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetDownloadLinkResponseBody</p>
 */
public class DescribeBackupSetDownloadLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupSetDownloadLinkResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetDownloadLinkResponseBody create() {
        return builder().build();
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

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupSetDownloadLinkResponseBody build() {
            return new DescribeBackupSetDownloadLinkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupSetDownloadLinkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetDownloadLinkResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupRestorableTime")
        private String backupRestorableTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("DownloadTaskCreateTime")
        private String downloadTaskCreateTime;

        @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
        private Long downloadTaskId;

        @com.aliyun.core.annotation.NameInMap("DownloadTaskStatus")
        private String downloadTaskStatus;

        @com.aliyun.core.annotation.NameInMap("InternalUrl")
        private String internalUrl;

        @com.aliyun.core.annotation.NameInMap("UrlAliveTime")
        private Long urlAliveTime;

        @com.aliyun.core.annotation.NameInMap("UrlExpiredTime")
        private String urlExpiredTime;

        private Data(Builder builder) {
            this.backupRestorableTime = builder.backupRestorableTime;
            this.backupSetId = builder.backupSetId;
            this.downloadTaskCreateTime = builder.downloadTaskCreateTime;
            this.downloadTaskId = builder.downloadTaskId;
            this.downloadTaskStatus = builder.downloadTaskStatus;
            this.internalUrl = builder.internalUrl;
            this.urlAliveTime = builder.urlAliveTime;
            this.urlExpiredTime = builder.urlExpiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupRestorableTime
         */
        public String getBackupRestorableTime() {
            return this.backupRestorableTime;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return downloadTaskCreateTime
         */
        public String getDownloadTaskCreateTime() {
            return this.downloadTaskCreateTime;
        }

        /**
         * @return downloadTaskId
         */
        public Long getDownloadTaskId() {
            return this.downloadTaskId;
        }

        /**
         * @return downloadTaskStatus
         */
        public String getDownloadTaskStatus() {
            return this.downloadTaskStatus;
        }

        /**
         * @return internalUrl
         */
        public String getInternalUrl() {
            return this.internalUrl;
        }

        /**
         * @return urlAliveTime
         */
        public Long getUrlAliveTime() {
            return this.urlAliveTime;
        }

        /**
         * @return urlExpiredTime
         */
        public String getUrlExpiredTime() {
            return this.urlExpiredTime;
        }

        public static final class Builder {
            private String backupRestorableTime; 
            private String backupSetId; 
            private String downloadTaskCreateTime; 
            private Long downloadTaskId; 
            private String downloadTaskStatus; 
            private String internalUrl; 
            private Long urlAliveTime; 
            private String urlExpiredTime; 

            /**
             * <p>The restorable time of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyy-MM-dd HH:mm:ss</p>
             */
            public Builder backupRestorableTime(String backupRestorableTime) {
                this.backupRestorableTime = backupRestorableTime;
                return this;
            }

            /**
             * <p>The ID of the target backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>bak-4n****gacpa8</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The time when the download task corresponding to the target backup set was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-22T17:04:18</p>
             */
            public Builder downloadTaskCreateTime(String downloadTaskCreateTime) {
                this.downloadTaskCreateTime = downloadTaskCreateTime;
                return this;
            }

            /**
             * <p>The ID of the download task corresponding to the target backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>1000002</p>
             */
            public Builder downloadTaskId(Long downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * <p>The status of the download task corresponding to the target backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder downloadTaskStatus(String downloadTaskStatus) {
                this.downloadTaskStatus = downloadTaskStatus;
                return this;
            }

            /**
             * <p>The internal URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://bucket.oss-region-internal.aliyuncs.com/xxxxx">http://bucket.oss-region-internal.aliyuncs.com/xxxxx</a></p>
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * <p>The validity period of the URL, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder urlAliveTime(Long urlAliveTime) {
                this.urlAliveTime = urlAliveTime;
                return this;
            }

            /**
             * <p>The expiration time of the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-04 17:39:49</p>
             */
            public Builder urlExpiredTime(String urlExpiredTime) {
                this.urlExpiredTime = urlExpiredTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

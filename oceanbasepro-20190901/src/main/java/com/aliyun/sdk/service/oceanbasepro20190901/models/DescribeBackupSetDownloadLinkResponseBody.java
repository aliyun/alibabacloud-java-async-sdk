// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupSetDownloadLinkResponseBody build() {
            return new DescribeBackupSetDownloadLinkResponseBody(this);
        } 

    } 

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
             * The restorable time of the backup set.
             */
            public Builder backupRestorableTime(String backupRestorableTime) {
                this.backupRestorableTime = backupRestorableTime;
                return this;
            }

            /**
             * The ID of the target backup set.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * The time when the download task corresponding to the target backup set was created.
             */
            public Builder downloadTaskCreateTime(String downloadTaskCreateTime) {
                this.downloadTaskCreateTime = downloadTaskCreateTime;
                return this;
            }

            /**
             * The ID of the download task corresponding to the target backup set.
             */
            public Builder downloadTaskId(Long downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * The status of the download task corresponding to the target backup set.
             */
            public Builder downloadTaskStatus(String downloadTaskStatus) {
                this.downloadTaskStatus = downloadTaskStatus;
                return this;
            }

            /**
             * The internal URL.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * The validity period of the URL, in seconds.
             */
            public Builder urlAliveTime(Long urlAliveTime) {
                this.urlAliveTime = urlAliveTime;
                return this;
            }

            /**
             * The expiration time of the URL.
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

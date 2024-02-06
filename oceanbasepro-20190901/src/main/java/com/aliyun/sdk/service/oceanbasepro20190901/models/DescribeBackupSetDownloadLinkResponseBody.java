// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetDownloadLinkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetDownloadLinkResponseBody</p>
 */
public class DescribeBackupSetDownloadLinkResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("BackupRestorableTime")
        private String backupRestorableTime;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("DownloadTaskCreateTime")
        private String downloadTaskCreateTime;

        @NameInMap("DownloadTaskId")
        private Long downloadTaskId;

        @NameInMap("DownloadTaskStatus")
        private String downloadTaskStatus;

        @NameInMap("InternalUrl")
        private String internalUrl;

        @NameInMap("UrlAliveTime")
        private Long urlAliveTime;

        @NameInMap("UrlExpiredTime")
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
             * BackupRestorableTime.
             */
            public Builder backupRestorableTime(String backupRestorableTime) {
                this.backupRestorableTime = backupRestorableTime;
                return this;
            }

            /**
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * DownloadTaskCreateTime.
             */
            public Builder downloadTaskCreateTime(String downloadTaskCreateTime) {
                this.downloadTaskCreateTime = downloadTaskCreateTime;
                return this;
            }

            /**
             * DownloadTaskId.
             */
            public Builder downloadTaskId(Long downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * DownloadTaskStatus.
             */
            public Builder downloadTaskStatus(String downloadTaskStatus) {
                this.downloadTaskStatus = downloadTaskStatus;
                return this;
            }

            /**
             * InternalUrl.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * UrlAliveTime.
             */
            public Builder urlAliveTime(Long urlAliveTime) {
                this.urlAliveTime = urlAliveTime;
                return this;
            }

            /**
             * UrlExpiredTime.
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

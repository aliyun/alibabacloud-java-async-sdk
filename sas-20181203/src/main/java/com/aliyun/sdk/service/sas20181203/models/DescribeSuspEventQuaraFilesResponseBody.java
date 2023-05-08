// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventQuaraFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponseBody</p>
 */
public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("QuaraFiles")
    private java.util.List < QuaraFiles> quaraFiles;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSuspEventQuaraFilesResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.quaraFiles = builder.quaraFiles;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quaraFiles
     */
    public java.util.List < QuaraFiles> getQuaraFiles() {
        return this.quaraFiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < QuaraFiles> quaraFiles; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The download link of the quarantined file.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the quarantined file. Valid values:
         * <p>
         * 
         * *   **quaraFailed**: The file fails to be quarantined.
         * *   **quaraDone**: The file is quarantined.
         * *   **quaraing**: The file is being quarantined.
         * *   **rollbackFailed**: The system fails to cancel quarantining the file.
         * *   **rollbackDone**: The system cancelled quarantining the file.
         * *   **rollbacking**: The system is cancelling quarantining the file.
         */
        public Builder quaraFiles(java.util.List < QuaraFiles> quaraFiles) {
            this.quaraFiles = quaraFiles;
            return this;
        }

        /**
         * An array that consists of the quarantined files.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The quarantined file.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSuspEventQuaraFilesResponseBody build() {
            return new DescribeSuspEventQuaraFilesResponseBody(this);
        } 

    } 

    public static class QuaraFiles extends TeaModel {
        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Link")
        private String link;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Path")
        private String path;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Uuid")
        private String uuid;

        private QuaraFiles(Builder builder) {
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.link = builder.link;
            this.md5 = builder.md5;
            this.modifyTime = builder.modifyTime;
            this.path = builder.path;
            this.status = builder.status;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuaraFiles create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String eventName; 
            private String eventType; 
            private Integer id; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String link; 
            private String md5; 
            private String modifyTime; 
            private String path; 
            private String status; 
            private String tag; 
            private String uuid; 

            /**
             * The unique ID of the event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The MD5 hash value of the quarantined file.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * 172.16.XX.XX
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the server on which the quarantined file is located.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the quarantined file.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The instance ID of the asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The public IP address of the server on which the quarantined file is located.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The private IP address of the server on which the quarantined file is located.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The time when the quarantined file was last modified.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The public IP address of the server on which the quarantined file is located.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the event.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The path to the quarantined file on the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public QuaraFiles build() {
                return new QuaraFiles(this);
            } 

        } 

    }
}

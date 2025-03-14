// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventQuaraFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponseBody</p>
 */
public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("QuaraFiles")
    private java.util.List<QuaraFiles> quaraFiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<QuaraFiles> getQuaraFiles() {
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
        private java.util.List<QuaraFiles> quaraFiles; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSuspEventQuaraFilesResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.quaraFiles = model.quaraFiles;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>An array that consists of the quarantined files.</p>
         */
        public Builder quaraFiles(java.util.List<QuaraFiles> quaraFiles) {
            this.quaraFiles = quaraFiles;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>32A73759-4C0F-4801-BE98-901223ACEE9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSuspEventQuaraFilesResponseBody build() {
            return new DescribeSuspEventQuaraFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSuspEventQuaraFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventQuaraFilesResponseBody</p>
     */
    public static class QuaraFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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

            private Builder() {
            } 

            private Builder(QuaraFiles model) {
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.ip = model.ip;
                this.link = model.link;
                this.md5 = model.md5;
                this.modifyTime = model.modifyTime;
                this.path = model.path;
                this.status = model.status;
                this.tag = model.tag;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The type of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>WebshellQuaraEventType</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the quarantined file.</p>
             * 
             * <strong>example:</strong>
             * <p>26918</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze9t1qp36n1436m****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server on which the quarantined file is located.</p>
             * 
             * <strong>example:</strong>
             * <p>iZwz98dkiw3vbrtqrt5v****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server on which the quarantined file is located.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.131</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server on which the quarantined file is located.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The public IP address of the server on which the quarantined file is located.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.131</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The download link of the quarantined file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.xxx/xxx">https://xxx.xxx/xxx</a></p>
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * <p>The MD5 hash value of the quarantined file.</p>
             * 
             * <strong>example:</strong>
             * <p>5ddebe926acc7ed39a664409bfd0ec10</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The time when the quarantined file was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-11 20:37:08</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The path to the quarantined file on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>/var/www/html/webshell-sample-master/others/defc3e21bab59e2a2ab49f7eda99f65f83d4d349.jpg</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The status of the quarantined file. Valid values:</p>
             * <ul>
             * <li><strong>quaraFailed</strong>: The file fails to be quarantined.</li>
             * <li><strong>quaraDone</strong>: The file is quarantined.</li>
             * <li><strong>quaraing</strong>: The file is being quarantined.</li>
             * <li><strong>rollbackFailed</strong>: The system fails to cancel quarantining the file.</li>
             * <li><strong>rollbackDone</strong>: The system cancelled quarantining the file.</li>
             * <li><strong>rollbacking</strong>: The system is cancelling quarantining the file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rollbackDone</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The unique ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>228f890e56eae9eec6a42c7ea801b538</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>04a0e735-ad32-4835-b635-0458d77b****</p>
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

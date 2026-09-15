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
 * {@link ListUnknownThreatDetectEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnknownThreatDetectEventResponseBody</p>
 */
public class ListUnknownThreatDetectEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUnknownThreatDetectEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUnknownThreatDetectEventResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data details.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUnknownThreatDetectEventResponseBody build() {
            return new ListUnknownThreatDetectEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUnknownThreatDetectEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalyzeDesc")
        private String analyzeDesc;

        @com.aliyun.core.annotation.NameInMap("AnalyzeResult")
        private String analyzeResult;

        @com.aliyun.core.annotation.NameInMap("CmdChain")
        private String cmdChain;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HandleRemark")
        private String handleRemark;

        @com.aliyun.core.annotation.NameInMap("HandleType")
        private String handleType;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ParentCmdline")
        private String parentCmdline;

        @com.aliyun.core.annotation.NameInMap("ParentPid")
        private String parentPid;

        @com.aliyun.core.annotation.NameInMap("ParentProcessPath")
        private String parentProcessPath;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.analyzeDesc = builder.analyzeDesc;
            this.analyzeResult = builder.analyzeResult;
            this.cmdChain = builder.cmdChain;
            this.cmdline = builder.cmdline;
            this.count = builder.count;
            this.firstTime = builder.firstTime;
            this.handleRemark = builder.handleRemark;
            this.handleType = builder.handleType;
            this.hashKey = builder.hashKey;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTime = builder.lastTime;
            this.md5 = builder.md5;
            this.parentCmdline = builder.parentCmdline;
            this.parentPid = builder.parentPid;
            this.parentProcessPath = builder.parentProcessPath;
            this.pid = builder.pid;
            this.processPath = builder.processPath;
            this.sha256 = builder.sha256;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analyzeDesc
         */
        public String getAnalyzeDesc() {
            return this.analyzeDesc;
        }

        /**
         * @return analyzeResult
         */
        public String getAnalyzeResult() {
            return this.analyzeResult;
        }

        /**
         * @return cmdChain
         */
        public String getCmdChain() {
            return this.cmdChain;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return handleRemark
         */
        public String getHandleRemark() {
            return this.handleRemark;
        }

        /**
         * @return handleType
         */
        public String getHandleType() {
            return this.handleType;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return parentCmdline
         */
        public String getParentCmdline() {
            return this.parentCmdline;
        }

        /**
         * @return parentPid
         */
        public String getParentPid() {
            return this.parentPid;
        }

        /**
         * @return parentProcessPath
         */
        public String getParentProcessPath() {
            return this.parentProcessPath;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String analyzeDesc; 
            private String analyzeResult; 
            private String cmdChain; 
            private String cmdline; 
            private Integer count; 
            private Long firstTime; 
            private String handleRemark; 
            private String handleType; 
            private String hashKey; 
            private String id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastTime; 
            private String md5; 
            private String parentCmdline; 
            private String parentPid; 
            private String parentProcessPath; 
            private String pid; 
            private String processPath; 
            private String sha256; 
            private Integer status; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analyzeDesc = model.analyzeDesc;
                this.analyzeResult = model.analyzeResult;
                this.cmdChain = model.cmdChain;
                this.cmdline = model.cmdline;
                this.count = model.count;
                this.firstTime = model.firstTime;
                this.handleRemark = model.handleRemark;
                this.handleType = model.handleType;
                this.hashKey = model.hashKey;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.lastTime = model.lastTime;
                this.md5 = model.md5;
                this.parentCmdline = model.parentCmdline;
                this.parentPid = model.parentPid;
                this.parentProcessPath = model.parentProcessPath;
                this.pid = model.pid;
                this.processPath = model.processPath;
                this.sha256 = model.sha256;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * AnalyzeDesc.
             */
            public Builder analyzeDesc(String analyzeDesc) {
                this.analyzeDesc = analyzeDesc;
                return this;
            }

            /**
             * AnalyzeResult.
             */
            public Builder analyzeResult(String analyzeResult) {
                this.analyzeResult = analyzeResult;
                return this;
            }

            /**
             * <p>The process chain.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;5133&quot;:&quot;pickup -l -t unix -u&quot;},{&quot;1077&quot;:&quot;/usr/libexec/postfix/master -w&quot;},{&quot;1&quot;:&quot;/usr/lib/systemd/systemd --switched-root --system --deserialize 22&quot;}]</p>
             */
            public Builder cmdChain(String cmdChain) {
                this.cmdChain = cmdChain;
                return this;
            }

            /**
             * <p>The process command line.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sbin/sshd -D</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The number of occurrences.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The timestamp of the first occurrence.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * HandleRemark.
             */
            public Builder handleRemark(String handleRemark) {
                this.handleRemark = handleRemark;
                return this;
            }

            /**
             * HandleType.
             */
            public Builder handleType(String handleType) {
                this.handleType = handleType;
                return this;
            }

            /**
             * <p>The unique identifier of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>30368144069e7567bbb10eabc2******</p>
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>centos****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp of the most recent occurrence.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The MD5 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>5b394b54ca632fe51c4ab4a6dbaf****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The parent command line.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sbin/sshd -D</p>
             */
            public Builder parentCmdline(String parentCmdline) {
                this.parentCmdline = parentCmdline;
                return this;
            }

            /**
             * <p>The parent process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder parentPid(String parentPid) {
                this.parentPid = parentPid;
                return this;
            }

            /**
             * <p>The parent process path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/tar</p>
             */
            public Builder parentProcessPath(String parentProcessPath) {
                this.parentProcessPath = parentProcessPath;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The process path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/tar</p>
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * <p>The SHA-256 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Unhandled.</li>
             * <li><strong>2</strong>: Blocked.</li>
             * <li><strong>3</strong>: Ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUnknownThreatDetectEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectEventResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of alerting events displayed on the current page in a paging query.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the current page in a paging query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The maximum number of entries displayed on each page in a paging query.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}

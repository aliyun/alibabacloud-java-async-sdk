// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulListByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulListByIdResponseBody</p>
 */
public class GetVulListByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetVulListByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulListByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>API response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>D38B3D2F-67FD-57FF-87D1-C431D2C70F76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Values: - <strong>true</strong>: Yes. - <strong>false</strong>: No.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVulListByIdResponseBody build() {
            return new GetVulListByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulListByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulListByIdResponseBody</p>
     */
    public static class EffectMsgDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchList")
        private String matchList;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SoftName")
        private String softName;

        private EffectMsgDTOS(Builder builder) {
            this.matchList = builder.matchList;
            this.path = builder.path;
            this.softName = builder.softName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectMsgDTOS create() {
            return builder().build();
        }

        /**
         * @return matchList
         */
        public String getMatchList() {
            return this.matchList;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return softName
         */
        public String getSoftName() {
            return this.softName;
        }

        public static final class Builder {
            private String matchList; 
            private String path; 
            private String softName; 

            /**
             * <p>Hit</p>
             * 
             * <strong>example:</strong>
             * <p>fastjson(jar) extendField.safemode equals false</p>
             */
            public Builder matchList(String matchList) {
                this.matchList = matchList;
                return this;
            }

            /**
             * <p>Path</p>
             * 
             * <strong>example:</strong>
             * <p>/uat6/qry/enquiry/policy/yrtPolicyList</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Software name</p>
             * 
             * <strong>example:</strong>
             * <p>python-perf 3.10.0</p>
             */
            public Builder softName(String softName) {
                this.softName = softName;
                return this;
            }

            public EffectMsgDTOS build() {
                return new EffectMsgDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVulListByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulListByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("EffectMsgDTOS")
        private java.util.List < EffectMsgDTOS> effectMsgDTOS;

        @com.aliyun.core.annotation.NameInMap("FirstTs")
        private String firstTs;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastTs")
        private String lastTs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("Related")
        private String related;

        @com.aliyun.core.annotation.NameInMap("RepairCmd")
        private String repairCmd;

        @com.aliyun.core.annotation.NameInMap("RepairTs")
        private String repairTs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.aliasName = builder.aliasName;
            this.effectMsgDTOS = builder.effectMsgDTOS;
            this.firstTs = builder.firstTs;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTs = builder.lastTs;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.related = builder.related;
            this.repairCmd = builder.repairCmd;
            this.repairTs = builder.repairTs;
            this.status = builder.status;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return effectMsgDTOS
         */
        public java.util.List < EffectMsgDTOS> getEffectMsgDTOS() {
            return this.effectMsgDTOS;
        }

        /**
         * @return firstTs
         */
        public String getFirstTs() {
            return this.firstTs;
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
         * @return lastTs
         */
        public String getLastTs() {
            return this.lastTs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return related
         */
        public String getRelated() {
            return this.related;
        }

        /**
         * @return repairCmd
         */
        public String getRepairCmd() {
            return this.repairCmd;
        }

        /**
         * @return repairTs
         */
        public String getRepairTs() {
            return this.repairTs;
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
            private String aliasName; 
            private java.util.List < EffectMsgDTOS> effectMsgDTOS; 
            private String firstTs; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String lastTs; 
            private String name; 
            private String necessity; 
            private String related; 
            private String repairCmd; 
            private String repairTs; 
            private String status; 
            private String tag; 
            private String uuid; 

            /**
             * <p>Vulnerability Alias</p>
             * 
             * <strong>example:</strong>
             * <p>Tomcat websocket 拒绝服务漏洞利用代码披露（CVE-2020-13935）</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>Impact description</p>
             */
            public Builder effectMsgDTOS(java.util.List < EffectMsgDTOS> effectMsgDTOS) {
                this.effectMsgDTOS = effectMsgDTOS;
                return this;
            }

            /**
             * <p>Timestamp of the first time the vulnerability was detected</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder firstTs(String firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * <p>Instance name of the asset</p>
             * 
             * <strong>example:</strong>
             * <p>凌星-CentOS</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Public IP of the asset</p>
             * 
             * <strong>example:</strong>
             * <p>39.101.73.28</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>Private IP of the asset</p>
             * 
             * <strong>example:</strong>
             * <p>172.22.216.17</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Timestamp of the last time the vulnerability was detected</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder lastTs(String lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>Vulnerability name</p>
             * 
             * <strong>example:</strong>
             * <p>SCA:ACSV-2020-111301</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Necessity level of vulnerability repair</p>
             * 
             * <strong>example:</strong>
             * <p>later,asap,nntf</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>List of associated CVEs for the vulnerability, separated by commas (,) if there are multiple values.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2020-13935</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>Repair command</p>
             * 
             * <strong>example:</strong>
             * <p>*** update python-perf</p>
             */
            public Builder repairCmd(String repairCmd) {
                this.repairCmd = repairCmd;
                return this;
            }

            /**
             * <p>Timestamp of vulnerability repair</p>
             * 
             * <strong>example:</strong>
             * <p>1541207563000</p>
             */
            public Builder repairTs(String repairTs) {
                this.repairTs = repairTs;
                return this;
            }

            /**
             * <p>Vulnerability status:
             * 1: Not fixed
             * 2: Fix failed
             * 3: Rollback failed
             * 4: Fixing
             * 5: Rolling back
             * 6: Verifying
             * 7: Fixed successfully
             * 8: Fixed successfully, pending reboot
             * 9: Rolled back successfully
             * 10: Ignored
             * 11: Rolled back successfully, pending reboot
             * 12: Vulnerability does not exist
             * 20: Expired</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Vulnerability tag</p>
             * 
             * <strong>example:</strong>
             * <p>Restart Required</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>UUID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hdm_5cf2eaf263c021b354877943f181956d</p>
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
     * {@link GetVulListByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulListByIdResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Number of items per page in the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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

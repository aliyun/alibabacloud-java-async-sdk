// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSuspEventPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetSuspEventPageResponseBody</p>
 */
public class GetSuspEventPageResponseBody extends TeaModel {
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

    private GetSuspEventPageResponseBody(Builder builder) {
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

    public static GetSuspEventPageResponseBody create() {
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
         * <p>OK</p>
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
         * <p>Prompt message of the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>system error</p>
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
         * <p>AFA6F7B7-7C4B-58BB-B8FB-E0FFA4483561</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSuspEventPageResponseBody build() {
            return new GetSuspEventPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSuspEventPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEventType")
        private String alarmEventType;

        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("AlarmSource")
        private String alarmSource;

        @com.aliyun.core.annotation.NameInMap("AlarmTime")
        private String alarmTime;

        @com.aliyun.core.annotation.NameInMap("AnalysisResult")
        private String analysisResult;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private String dealTime;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.alarmEventType = builder.alarmEventType;
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.alarmSource = builder.alarmSource;
            this.alarmTime = builder.alarmTime;
            this.analysisResult = builder.analysisResult;
            this.dealTime = builder.dealTime;
            this.eventLevel = builder.eventLevel;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.occurrenceTime = builder.occurrenceTime;
            this.ownerId = builder.ownerId;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return alarmSource
         */
        public String getAlarmSource() {
            return this.alarmSource;
        }

        /**
         * @return alarmTime
         */
        public String getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return analysisResult
         */
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        /**
         * @return dealTime
         */
        public String getDealTime() {
            return this.dealTime;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return id
         */
        public Long getId() {
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
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String alarmEventType; 
            private Long alarmId; 
            private String alarmName; 
            private String alarmSource; 
            private String alarmTime; 
            private String analysisResult; 
            private String dealTime; 
            private String eventLevel; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String occurrenceTime; 
            private String ownerId; 
            private String remark; 
            private String status; 

            /**
             * <p>Alarm event type.</p>
             * 
             * <strong>example:</strong>
             * <p>精准防御</p>
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * <p>Alarm ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5b1eeebe4f22daa2b177298234214fa3</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>Alarm name.</p>
             * 
             * <strong>example:</strong>
             * <p>Web服务漏洞利用</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>Alarm source.</p>
             * 
             * <strong>example:</strong>
             * <p>SUSP_EVENT</p>
             */
            public Builder alarmSource(String alarmSource) {
                this.alarmSource = alarmSource;
                return this;
            }

            /**
             * <p>Latest alarm time.</p>
             * 
             * <strong>example:</strong>
             * <p>1722515522000</p>
             */
            public Builder alarmTime(String alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * <p>Analysis process.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;value&quot;:&quot;服务器可能已被黑客攻击，存在恶意进程在运行。 分析过程：告警显示，服务端存在一个名为”dns.exe”的进程在访问”polling.burpcollaborator.net”，这是一个被黑名单列出的恶意域名。在正常情况下,”dns.exe”不应该单独存在于系统的路径下，并且也不应该访问这类恶意域名。因此，这个进程可能是黑客留下的恶意进程。&quot;,&quot;key&quot;:&quot;结论&quot;},{&quot;value&quot;:&quot;尽快对服务器进行全面扫描，清除恶意进程。同时，联系网络安全专家进行深入调查，以确定是否有其他潜在的安全威胁。&quot;,&quot;key&quot;:&quot;处置建议&quot;}]</p>
             */
            public Builder analysisResult(String analysisResult) {
                this.analysisResult = analysisResult;
                return this;
            }

            /**
             * <p>Alarm handling time.</p>
             * 
             * <strong>example:</strong>
             * <p>1732515522000</p>
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>Alarm level.</p>
             * 
             * <strong>example:</strong>
             * <p>suspicious</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>Ticket primary key id.</p>
             * 
             * <strong>example:</strong>
             * <p>9947</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>shells-azhou</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.99.188.31</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>Private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.109.130</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>First occurrence time.</p>
             * 
             * <strong>example:</strong>
             * <p>该字段暂未使用，有问题请联系管理员</p>
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * <p>Owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Disposal method.</p>
             * 
             * <strong>example:</strong>
             * <p>处理完成</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Handling status.</p>
             * 
             * <strong>example:</strong>
             * <p>未处理</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventPageResponseBody</p>
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
             * <p>The current page number in pagination queries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of items displayed per page in the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of query results.</p>
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

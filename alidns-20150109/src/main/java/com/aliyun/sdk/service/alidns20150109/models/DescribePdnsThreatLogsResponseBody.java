// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsThreatLogsResponseBody</p>
 */
public class DescribePdnsThreatLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List < Logs> logs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePdnsThreatLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsThreatLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Logs> logs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Logs.
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePdnsThreatLogsResponseBody build() {
            return new DescribePdnsThreatLogsResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatTime")
        private String threatTime;

        @com.aliyun.core.annotation.NameInMap("ThreatType")
        private String threatType;

        private Logs(Builder builder) {
            this.sourceIp = builder.sourceIp;
            this.subDomain = builder.subDomain;
            this.threatLevel = builder.threatLevel;
            this.threatTime = builder.threatTime;
            this.threatType = builder.threatType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatTime
         */
        public String getThreatTime() {
            return this.threatTime;
        }

        /**
         * @return threatType
         */
        public String getThreatType() {
            return this.threatType;
        }

        public static final class Builder {
            private String sourceIp; 
            private String subDomain; 
            private String threatLevel; 
            private String threatTime; 
            private String threatType; 

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * SubDomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * ThreatLevel.
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * ThreatTime.
             */
            public Builder threatTime(String threatTime) {
                this.threatTime = threatTime;
                return this;
            }

            /**
             * ThreatType.
             */
            public Builder threatType(String threatType) {
                this.threatType = threatType;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}

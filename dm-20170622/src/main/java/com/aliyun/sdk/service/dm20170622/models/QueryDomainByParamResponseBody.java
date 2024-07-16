// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainByParamResponseBody</p>
 */
public class QueryDomainByParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryDomainByParamResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainByParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryDomainByParamResponseBody build() {
            return new QueryDomainByParamResponseBody(this);
        } 

    } 

    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnameAuthStatus")
        private String cnameAuthStatus;

        @com.aliyun.core.annotation.NameInMap("ConfirmStatus")
        private String confirmStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainRecord")
        private String domainRecord;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("IcpStatus")
        private String icpStatus;

        @com.aliyun.core.annotation.NameInMap("MxAuthStatus")
        private String mxAuthStatus;

        @com.aliyun.core.annotation.NameInMap("SpfAuthStatus")
        private String spfAuthStatus;

        @com.aliyun.core.annotation.NameInMap("UtcCreateTime")
        private Long utcCreateTime;

        private Domain(Builder builder) {
            this.cnameAuthStatus = builder.cnameAuthStatus;
            this.confirmStatus = builder.confirmStatus;
            this.createTime = builder.createTime;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.domainRecord = builder.domainRecord;
            this.domainStatus = builder.domainStatus;
            this.icpStatus = builder.icpStatus;
            this.mxAuthStatus = builder.mxAuthStatus;
            this.spfAuthStatus = builder.spfAuthStatus;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return cnameAuthStatus
         */
        public String getCnameAuthStatus() {
            return this.cnameAuthStatus;
        }

        /**
         * @return confirmStatus
         */
        public String getConfirmStatus() {
            return this.confirmStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainRecord
         */
        public String getDomainRecord() {
            return this.domainRecord;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return icpStatus
         */
        public String getIcpStatus() {
            return this.icpStatus;
        }

        /**
         * @return mxAuthStatus
         */
        public String getMxAuthStatus() {
            return this.mxAuthStatus;
        }

        /**
         * @return spfAuthStatus
         */
        public String getSpfAuthStatus() {
            return this.spfAuthStatus;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private String cnameAuthStatus; 
            private String confirmStatus; 
            private String createTime; 
            private String domainId; 
            private String domainName; 
            private String domainRecord; 
            private String domainStatus; 
            private String icpStatus; 
            private String mxAuthStatus; 
            private String spfAuthStatus; 
            private Long utcCreateTime; 

            /**
             * CnameAuthStatus.
             */
            public Builder cnameAuthStatus(String cnameAuthStatus) {
                this.cnameAuthStatus = cnameAuthStatus;
                return this;
            }

            /**
             * ConfirmStatus.
             */
            public Builder confirmStatus(String confirmStatus) {
                this.confirmStatus = confirmStatus;
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
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainRecord.
             */
            public Builder domainRecord(String domainRecord) {
                this.domainRecord = domainRecord;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * IcpStatus.
             */
            public Builder icpStatus(String icpStatus) {
                this.icpStatus = icpStatus;
                return this;
            }

            /**
             * MxAuthStatus.
             */
            public Builder mxAuthStatus(String mxAuthStatus) {
                this.mxAuthStatus = mxAuthStatus;
                return this;
            }

            /**
             * SpfAuthStatus.
             */
            public Builder spfAuthStatus(String spfAuthStatus) {
                this.spfAuthStatus = spfAuthStatus;
                return this;
            }

            /**
             * UtcCreateTime.
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private java.util.List < Domain> domain;

        private Data(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < Domain> domain; 

            /**
             * domain.
             */
            public Builder domain(java.util.List < Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDomainByParamResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8C90CCD3-627C-4F87-AD8C-2F03146071EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>List of domains</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryDomainByParamResponseBody build() {
            return new QueryDomainByParamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByParamResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Domain model) {
                this.cnameAuthStatus = model.cnameAuthStatus;
                this.confirmStatus = model.confirmStatus;
                this.createTime = model.createTime;
                this.domainId = model.domainId;
                this.domainName = model.domainName;
                this.domainRecord = model.domainRecord;
                this.domainStatus = model.domainStatus;
                this.icpStatus = model.icpStatus;
                this.mxAuthStatus = model.mxAuthStatus;
                this.spfAuthStatus = model.spfAuthStatus;
                this.utcCreateTime = model.utcCreateTime;
            } 

            /**
             * <p>Track verification</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cnameAuthStatus(String cnameAuthStatus) {
                this.cnameAuthStatus = cnameAuthStatus;
                return this;
            }

            /**
             * <p>CName verification status, success: 0; failure: 1</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder confirmStatus(String confirmStatus) {
                this.confirmStatus = confirmStatus;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-29T13:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Domain ID</p>
             * 
             * <strong>example:</strong>
             * <p>158923</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>Domain name</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Domain record</p>
             * 
             * <strong>example:</strong>
             * <p>6bd86901b9fe4618a046</p>
             */
            public Builder domainRecord(String domainRecord) {
                this.domainRecord = domainRecord;
                return this;
            }

            /**
             * <p>Domain status.</p>
             * <ul>
             * <li>0: Available, verified</li>
             * <li>1: Unavailable, verification failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>ICP filing status.</p>
             * <ul>
             * <li>1 indicates filed</li>
             * <li>0 indicates not filed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder icpStatus(String icpStatus) {
                this.icpStatus = icpStatus;
                return this;
            }

            /**
             * <p>MX authentication status, success: 0, failure: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mxAuthStatus(String mxAuthStatus) {
                this.mxAuthStatus = mxAuthStatus;
                return this;
            }

            /**
             * <p>SPF authentication status, success: 0, failure: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spfAuthStatus(String spfAuthStatus) {
                this.spfAuthStatus = spfAuthStatus;
                return this;
            }

            /**
             * <p>Creation time in UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>1569734892</p>
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
    /**
     * 
     * {@link QueryDomainByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainByParamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private java.util.List<Domain> domain;

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
        public java.util.List<Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List<Domain> domain; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domain = model.domain;
            } 

            /**
             * domain.
             */
            public Builder domain(java.util.List<Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

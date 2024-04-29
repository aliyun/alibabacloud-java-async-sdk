// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulListPageResponseBody</p>
 */
public class DescribeVulListPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulListPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The response parameters.
         */
        public Builder data(java.util.List < Data> data) {
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

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulListPageResponseBody build() {
            return new DescribeVulListPageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("ExtAegis")
        private String extAegis;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsAegis")
        private Integer isAegis;

        @com.aliyun.core.annotation.NameInMap("IsSas")
        private Integer isSas;

        @com.aliyun.core.annotation.NameInMap("OtherId")
        private String otherId;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.cveId = builder.cveId;
            this.extAegis = builder.extAegis;
            this.id = builder.id;
            this.isAegis = builder.isAegis;
            this.isSas = builder.isSas;
            this.otherId = builder.otherId;
            this.releaseTime = builder.releaseTime;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return extAegis
         */
        public String getExtAegis() {
            return this.extAegis;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isAegis
         */
        public Integer getIsAegis() {
            return this.isAegis;
        }

        /**
         * @return isSas
         */
        public Integer getIsSas() {
            return this.isSas;
        }

        /**
         * @return otherId
         */
        public String getOtherId() {
            return this.otherId;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cveId; 
            private String extAegis; 
            private Long id; 
            private Integer isAegis; 
            private Integer isSas; 
            private String otherId; 
            private Long releaseTime; 
            private String title; 

            /**
             * The common vulnerabilities and exposures (CVE) ID of the vulnerability.
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * The extended field for Server Guard.
             */
            public Builder extAegis(String extAegis) {
                this.extAegis = extAegis;
                return this;
            }

            /**
             * The primary key ID of the database.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the vulnerability was detected based on version comparison. Valid values:
             * <p>
             * 
             * *   1: The vulnerability was detected based on version comparison.
             * *   0: The vulnerability was not detected based on version comparison.
             */
            public Builder isAegis(Integer isAegis) {
                this.isAegis = isAegis;
                return this;
            }

            /**
             * Indicates whether the vulnerability was detected based on proof of concept (POC) verification. Valid values:
             * <p>
             * 
             * *   1: The vulnerability was detected based on POC verification.
             * *   0: The vulnerability was not detected based on POC verification.
             */
            public Builder isSas(Integer isSas) {
                this.isSas = isSas;
                return this;
            }

            /**
             * The ID of the vulnerability.
             */
            public Builder otherId(String otherId) {
                this.otherId = otherId;
                return this;
            }

            /**
             * The time when the vulnerability was disclosed.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

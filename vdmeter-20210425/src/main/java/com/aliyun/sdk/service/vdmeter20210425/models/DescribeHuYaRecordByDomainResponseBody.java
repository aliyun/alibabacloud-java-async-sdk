// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHuYaRecordByDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHuYaRecordByDomainResponseBody</p>
 */
public class DescribeHuYaRecordByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("ResultDesc")
    private java.util.List < ResultDesc> resultDesc;

    @NameInMap("Status")
    private Integer status;

    private DescribeHuYaRecordByDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultDesc = builder.resultDesc;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHuYaRecordByDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return resultDesc
     */
    public java.util.List < ResultDesc> getResultDesc() {
        return this.resultDesc;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private java.util.List < ResultDesc> resultDesc; 
        private Integer status; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * ResultDesc.
         */
        public Builder resultDesc(java.util.List < ResultDesc> resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeHuYaRecordByDomainResponseBody build() {
            return new DescribeHuYaRecordByDomainResponseBody(this);
        } 

    } 

    public static class ResultDesc extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("RecordDuration")
        private Long recordDuration;

        @NameInMap("RecordNum")
        private Long recordNum;

        @NameInMap("RecordType")
        private String recordType;

        @NameInMap("Time")
        private String time;

        private ResultDesc(Builder builder) {
            this.businessType = builder.businessType;
            this.domain = builder.domain;
            this.recordDuration = builder.recordDuration;
            this.recordNum = builder.recordNum;
            this.recordType = builder.recordType;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultDesc create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return recordDuration
         */
        public Long getRecordDuration() {
            return this.recordDuration;
        }

        /**
         * @return recordNum
         */
        public Long getRecordNum() {
            return this.recordNum;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String businessType; 
            private String domain; 
            private Long recordDuration; 
            private Long recordNum; 
            private String recordType; 
            private String time; 

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * RecordDuration.
             */
            public Builder recordDuration(Long recordDuration) {
                this.recordDuration = recordDuration;
                return this;
            }

            /**
             * RecordNum.
             */
            public Builder recordNum(Long recordNum) {
                this.recordNum = recordNum;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ResultDesc build() {
                return new ResultDesc(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHuYaTranscodeByDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHuYaTranscodeByDomainResponseBody</p>
 */
public class DescribeHuYaTranscodeByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("ResultDesc")
    private java.util.List < ResultDesc> resultDesc;

    @NameInMap("Status")
    private Integer status;

    private DescribeHuYaTranscodeByDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultDesc = builder.resultDesc;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHuYaTranscodeByDomainResponseBody create() {
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

        public DescribeHuYaTranscodeByDomainResponseBody build() {
            return new DescribeHuYaTranscodeByDomainResponseBody(this);
        } 

    } 

    public static class ResultDesc extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Time")
        private String time;

        @NameInMap("TranscodeDuration")
        private Long transcodeDuration;

        @NameInMap("TranscodeNum")
        private Long transcodeNum;

        @NameInMap("TranscodeType")
        private String transcodeType;

        private ResultDesc(Builder builder) {
            this.businessType = builder.businessType;
            this.domain = builder.domain;
            this.time = builder.time;
            this.transcodeDuration = builder.transcodeDuration;
            this.transcodeNum = builder.transcodeNum;
            this.transcodeType = builder.transcodeType;
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
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return transcodeDuration
         */
        public Long getTranscodeDuration() {
            return this.transcodeDuration;
        }

        /**
         * @return transcodeNum
         */
        public Long getTranscodeNum() {
            return this.transcodeNum;
        }

        /**
         * @return transcodeType
         */
        public String getTranscodeType() {
            return this.transcodeType;
        }

        public static final class Builder {
            private String businessType; 
            private String domain; 
            private String time; 
            private Long transcodeDuration; 
            private Long transcodeNum; 
            private String transcodeType; 

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
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * TranscodeDuration.
             */
            public Builder transcodeDuration(Long transcodeDuration) {
                this.transcodeDuration = transcodeDuration;
                return this;
            }

            /**
             * TranscodeNum.
             */
            public Builder transcodeNum(Long transcodeNum) {
                this.transcodeNum = transcodeNum;
                return this;
            }

            /**
             * TranscodeType.
             */
            public Builder transcodeType(String transcodeType) {
                this.transcodeType = transcodeType;
                return this;
            }

            public ResultDesc build() {
                return new ResultDesc(this);
            } 

        } 

    }
}

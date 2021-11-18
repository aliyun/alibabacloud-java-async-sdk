// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoTagScanSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanSummaryResponseBody</p>
 */
public class GetRepoTagScanSummaryResponseBody extends TeaModel {
    @NameInMap("UnknownSeverity")
    private Integer unknownSeverity;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSeverity")
    private Integer totalSeverity;

    @NameInMap("Code")
    private String code;

    @NameInMap("MediumSeverity")
    private Integer mediumSeverity;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("HighSeverity")
    private Integer highSeverity;

    @NameInMap("LowSeverity")
    private Integer lowSeverity;


    private GetRepoTagScanSummaryResponseBody(Builder builder) {
        this.unknownSeverity = builder.unknownSeverity;
        this.requestId = builder.requestId;
        this.totalSeverity = builder.totalSeverity;
        this.code = builder.code;
        this.mediumSeverity = builder.mediumSeverity;
        this.isSuccess = builder.isSuccess;
        this.highSeverity = builder.highSeverity;
        this.lowSeverity = builder.lowSeverity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return unknownSeverity
     */
    public Integer getUnknownSeverity() {
        return this.unknownSeverity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSeverity
     */
    public Integer getTotalSeverity() {
        return this.totalSeverity;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return mediumSeverity
     */
    public Integer getMediumSeverity() {
        return this.mediumSeverity;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return highSeverity
     */
    public Integer getHighSeverity() {
        return this.highSeverity;
    }

    /**
     * @return lowSeverity
     */
    public Integer getLowSeverity() {
        return this.lowSeverity;
    }

    public static final class Builder {
        private Integer unknownSeverity; 
        private String requestId; 
        private Integer totalSeverity; 
        private String code; 
        private Integer mediumSeverity; 
        private Boolean isSuccess; 
        private Integer highSeverity; 
        private Integer lowSeverity; 

        /**
         * <p>Unknown vulnerabilities</p>
         */
        public Builder unknownSeverity(Integer unknownSeverity) {
            this.unknownSeverity = unknownSeverity;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total vulnerabilities</p>
         */
        public Builder totalSeverity(Integer totalSeverity) {
            this.totalSeverity = totalSeverity;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Moderate vulnerabilities</p>
         */
        public Builder mediumSeverity(Integer mediumSeverity) {
            this.mediumSeverity = mediumSeverity;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>High-risk vulnerabilities</p>
         */
        public Builder highSeverity(Integer highSeverity) {
            this.highSeverity = highSeverity;
            return this;
        }

        /**
         * <p>Low-risk vulnerabilities</p>
         */
        public Builder lowSeverity(Integer lowSeverity) {
            this.lowSeverity = lowSeverity;
            return this;
        }

        public GetRepoTagScanSummaryResponseBody build() {
            return new GetRepoTagScanSummaryResponseBody(this);
        } 

    } 

}

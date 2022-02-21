// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagScanSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanSummaryResponseBody</p>
 */
public class GetRepoTagScanSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HighSeverity")
    private Integer highSeverity;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("LowSeverity")
    private Integer lowSeverity;

    @NameInMap("MediumSeverity")
    private Integer mediumSeverity;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSeverity")
    private Integer totalSeverity;

    @NameInMap("UnknownSeverity")
    private Integer unknownSeverity;

    private GetRepoTagScanSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.highSeverity = builder.highSeverity;
        this.isSuccess = builder.isSuccess;
        this.lowSeverity = builder.lowSeverity;
        this.mediumSeverity = builder.mediumSeverity;
        this.requestId = builder.requestId;
        this.totalSeverity = builder.totalSeverity;
        this.unknownSeverity = builder.unknownSeverity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return highSeverity
     */
    public Integer getHighSeverity() {
        return this.highSeverity;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return lowSeverity
     */
    public Integer getLowSeverity() {
        return this.lowSeverity;
    }

    /**
     * @return mediumSeverity
     */
    public Integer getMediumSeverity() {
        return this.mediumSeverity;
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
     * @return unknownSeverity
     */
    public Integer getUnknownSeverity() {
        return this.unknownSeverity;
    }

    public static final class Builder {
        private String code; 
        private Integer highSeverity; 
        private Boolean isSuccess; 
        private Integer lowSeverity; 
        private Integer mediumSeverity; 
        private String requestId; 
        private Integer totalSeverity; 
        private Integer unknownSeverity; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HighSeverity.
         */
        public Builder highSeverity(Integer highSeverity) {
            this.highSeverity = highSeverity;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * LowSeverity.
         */
        public Builder lowSeverity(Integer lowSeverity) {
            this.lowSeverity = lowSeverity;
            return this;
        }

        /**
         * MediumSeverity.
         */
        public Builder mediumSeverity(Integer mediumSeverity) {
            this.mediumSeverity = mediumSeverity;
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
         * TotalSeverity.
         */
        public Builder totalSeverity(Integer totalSeverity) {
            this.totalSeverity = totalSeverity;
            return this;
        }

        /**
         * UnknownSeverity.
         */
        public Builder unknownSeverity(Integer unknownSeverity) {
            this.unknownSeverity = unknownSeverity;
            return this;
        }

        public GetRepoTagScanSummaryResponseBody build() {
            return new GetRepoTagScanSummaryResponseBody(this);
        } 

    } 

}

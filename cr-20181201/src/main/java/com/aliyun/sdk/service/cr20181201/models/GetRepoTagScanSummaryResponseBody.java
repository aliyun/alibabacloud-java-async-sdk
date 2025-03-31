// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetRepoTagScanSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanSummaryResponseBody</p>
 */
public class GetRepoTagScanSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HighSeverity")
    private Integer highSeverity;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("LowSeverity")
    private Integer lowSeverity;

    @com.aliyun.core.annotation.NameInMap("MediumSeverity")
    private Integer mediumSeverity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalSeverity")
    private Integer totalSeverity;

    @com.aliyun.core.annotation.NameInMap("UnknownSeverity")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRepoTagScanSummaryResponseBody model) {
            this.code = model.code;
            this.highSeverity = model.highSeverity;
            this.isSuccess = model.isSuccess;
            this.lowSeverity = model.lowSeverity;
            this.mediumSeverity = model.mediumSeverity;
            this.requestId = model.requestId;
            this.totalSeverity = model.totalSeverity;
            this.unknownSeverity = model.unknownSeverity;
        } 

        /**
         * <p>The number of medium-severity vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of low-severity vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder highSeverity(Integer highSeverity) {
            this.highSeverity = highSeverity;
            return this;
        }

        /**
         * <p>The number of high-severity vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        public Builder mediumSeverity(Integer mediumSeverity) {
            this.mediumSeverity = mediumSeverity;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities detected on images.</p>
         * 
         * <strong>example:</strong>
         * <p>BC648259-91A7-4502-BED3-EDF64361FA83</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        public Builder totalSeverity(Integer totalSeverity) {
            this.totalSeverity = totalSeverity;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetReportResponseResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportResponseResponseBody</p>
 */
public class GetReportResponseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("outRequestNo")
    private String outRequestNo;

    @com.aliyun.core.annotation.NameInMap("reportUrl")
    private String reportUrl;

    private GetReportResponseResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.outRequestNo = builder.outRequestNo;
        this.reportUrl = builder.reportUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportResponseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * @return reportUrl
     */
    public String getReportUrl() {
        return this.reportUrl;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String outRequestNo; 
        private String reportUrl; 

        private Builder() {
        } 

        private Builder(GetReportResponseResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.outRequestNo = model.outRequestNo;
            this.reportUrl = model.reportUrl;
        } 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * outRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }

        /**
         * reportUrl.
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        public GetReportResponseResponseBody build() {
            return new GetReportResponseResponseBody(this);
        } 

    } 

}

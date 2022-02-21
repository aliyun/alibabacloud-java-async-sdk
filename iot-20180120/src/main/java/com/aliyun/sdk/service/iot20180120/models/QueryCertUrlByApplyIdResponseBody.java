// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCertUrlByApplyIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCertUrlByApplyIdResponseBody</p>
 */
public class QueryCertUrlByApplyIdResponseBody extends TeaModel {
    @NameInMap("CertUrl")
    private String certUrl;

    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryCertUrlByApplyIdResponseBody(Builder builder) {
        this.certUrl = builder.certUrl;
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCertUrlByApplyIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return certUrl
     */
    public String getCertUrl() {
        return this.certUrl;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String certUrl; 
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * CertUrl.
         */
        public Builder certUrl(String certUrl) {
            this.certUrl = certUrl;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCertUrlByApplyIdResponseBody build() {
            return new QueryCertUrlByApplyIdResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnosisVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnosisVersionResponseBody</p>
 */
public class DiagnosisVersionResponseBody extends TeaModel {
    @NameInMap("DiagnosisResult")
    private String diagnosisResult;

    @NameInMap("RequestId")
    private String requestId;

    private DiagnosisVersionResponseBody(Builder builder) {
        this.diagnosisResult = builder.diagnosisResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnosisVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosisResult
     */
    public String getDiagnosisResult() {
        return this.diagnosisResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String diagnosisResult; 
        private String requestId; 

        /**
         * DiagnosisResult.
         */
        public Builder diagnosisResult(String diagnosisResult) {
            this.diagnosisResult = diagnosisResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DiagnosisVersionResponseBody build() {
            return new DiagnosisVersionResponseBody(this);
        } 

    } 

}

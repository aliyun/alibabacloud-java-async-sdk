// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectTextAnomalyResponseBody} extends {@link TeaModel}
 *
 * <p>DetectTextAnomalyResponseBody</p>
 */
public class DetectTextAnomalyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Suggestion")
    private String suggestion;

    private DetectTextAnomalyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suggestion = builder.suggestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectTextAnomalyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    public static final class Builder {
        private String requestId; 
        private String suggestion; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91AC8C98-0F36-49D2-8290-742E24DF*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the text contains anomalies. Valid values:</p>
         * <ul>
         * <li>pass: the text does not contain anomalies.</li>
         * <li>block: the text contains anomalies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        public DetectTextAnomalyResponseBody build() {
            return new DetectTextAnomalyResponseBody(this);
        } 

    } 

}

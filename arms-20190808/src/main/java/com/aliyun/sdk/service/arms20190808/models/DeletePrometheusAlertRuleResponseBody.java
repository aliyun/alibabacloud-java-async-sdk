// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePrometheusAlertRuleResponseBody</p>
 */
public class DeletePrometheusAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeletePrometheusAlertRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusAlertRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status code. 200 means success, other status codes are exceptions.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * More Information.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the alert rule was deleted. Valid values:
         * <p>
         * 
         * *   `true`: The alert rule was deleted.
         * *   `false`: The alert rule failed to be deleted.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeletePrometheusAlertRuleResponseBody build() {
            return new DeletePrometheusAlertRuleResponseBody(this);
        } 

    } 

}

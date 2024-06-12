// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopConfigurationRecorderResponseBody} extends {@link TeaModel}
 *
 * <p>StopConfigurationRecorderResponseBody</p>
 */
public class StopConfigurationRecorderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StopConfigurationRecorderResult")
    private Boolean stopConfigurationRecorderResult;

    private StopConfigurationRecorderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stopConfigurationRecorderResult = builder.stopConfigurationRecorderResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopConfigurationRecorderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stopConfigurationRecorderResult
     */
    public Boolean getStopConfigurationRecorderResult() {
        return this.stopConfigurationRecorderResult;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean stopConfigurationRecorderResult; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder stopConfigurationRecorderResult(Boolean stopConfigurationRecorderResult) {
            this.stopConfigurationRecorderResult = stopConfigurationRecorderResult;
            return this;
        }

        public StopConfigurationRecorderResponseBody build() {
            return new StopConfigurationRecorderResponseBody(this);
        } 

    } 

}

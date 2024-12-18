// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AB2E892E-8A43-5B0F-8FE3-B53ADA53CB2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

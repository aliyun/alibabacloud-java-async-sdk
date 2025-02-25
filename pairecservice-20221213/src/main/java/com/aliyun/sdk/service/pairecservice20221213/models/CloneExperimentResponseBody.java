// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>CloneExperimentResponseBody</p>
 */
public class CloneExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneExperimentResponseBody(Builder builder) {
        this.experimentId = builder.experimentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String experimentId; 
        private String requestId; 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneExperimentResponseBody build() {
            return new CloneExperimentResponseBody(this);
        } 

    } 

}

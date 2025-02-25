// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExperimentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExperimentVersionResponseBody</p>
 */
public class CreateExperimentVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
    private String experimentVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExperimentVersionResponseBody(Builder builder) {
        this.experimentVersionId = builder.experimentVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return experimentVersionId
     */
    public String getExperimentVersionId() {
        return this.experimentVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String experimentVersionId; 
        private String requestId; 

        /**
         * ExperimentVersionId.
         */
        public Builder experimentVersionId(String experimentVersionId) {
            this.experimentVersionId = experimentVersionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExperimentVersionResponseBody build() {
            return new CreateExperimentVersionResponseBody(this);
        } 

    } 

}

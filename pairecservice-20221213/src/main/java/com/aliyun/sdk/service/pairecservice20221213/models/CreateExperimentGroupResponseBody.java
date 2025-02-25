// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExperimentGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExperimentGroupResponseBody</p>
 */
public class CreateExperimentGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExperimentGroupResponseBody(Builder builder) {
        this.experimentGroupId = builder.experimentGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String experimentGroupId; 
        private String requestId; 

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExperimentGroupResponseBody build() {
            return new CreateExperimentGroupResponseBody(this);
        } 

    } 

}

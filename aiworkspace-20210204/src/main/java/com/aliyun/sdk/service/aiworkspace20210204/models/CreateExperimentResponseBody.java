// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExperimentResponseBody</p>
 */
public class CreateExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExperimentResponseBody(Builder builder) {
        this.experimentId = builder.experimentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateExperimentResponseBody model) {
            this.experimentId = model.experimentId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data. If the operation is asynchronously implemented, the job ID is returned.</p>
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExperimentResponseBody build() {
            return new CreateExperimentResponseBody(this);
        } 

    } 

}

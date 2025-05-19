// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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

        private Builder(CloneExperimentResponseBody model) {
            this.experimentId = model.experimentId;
            this.requestId = model.requestId;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
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

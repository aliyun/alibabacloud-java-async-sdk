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
 * {@link CloneExperimentGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CloneExperimentGroupResponseBody</p>
 */
public class CloneExperimentGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneExperimentGroupResponseBody(Builder builder) {
        this.experimentGroupId = builder.experimentGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneExperimentGroupResponseBody create() {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>12A65C6C-AFA1-59B2-9A66-A9E0BB73F0E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneExperimentGroupResponseBody build() {
            return new CloneExperimentGroupResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link AttachDataQualityRulesToEvaluationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>AttachDataQualityRulesToEvaluationTaskResponseBody</p>
 */
public class AttachDataQualityRulesToEvaluationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AttachDataQualityRulesToEvaluationTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDataQualityRulesToEvaluationTaskResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD8-4870-A6A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The value of the association is as follows:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: the call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AttachDataQualityRulesToEvaluationTaskResponseBody build() {
            return new AttachDataQualityRulesToEvaluationTaskResponseBody(this);
        } 

    } 

}

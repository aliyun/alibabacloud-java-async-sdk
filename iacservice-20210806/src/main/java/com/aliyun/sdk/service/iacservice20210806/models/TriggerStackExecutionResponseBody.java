// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link TriggerStackExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerStackExecutionResponseBody</p>
 */
public class TriggerStackExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("triggerId")
    private String triggerId;

    private TriggerStackExecutionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.triggerId = builder.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerStackExecutionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    public static final class Builder {
        private String requestId; 
        private String triggerId; 

        private Builder() {
        } 

        private Builder(TriggerStackExecutionResponseBody model) {
            this.requestId = model.requestId;
            this.triggerId = model.triggerId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * triggerId.
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public TriggerStackExecutionResponseBody build() {
            return new TriggerStackExecutionResponseBody(this);
        } 

    } 

}

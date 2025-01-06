// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateFlowlogResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowlogResponseBody</p>
 */
public class CreateFlowlogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowLogId")
    private String flowLogId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateFlowlogResponseBody(Builder builder) {
        this.flowLogId = builder.flowLogId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowlogResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowLogId
     */
    public String getFlowLogId() {
        return this.flowLogId;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String flowLogId; 
        private String requestId; 
        private String success; 

        /**
         * <p>The ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-m5evbtbpt****</p>
         */
        public Builder flowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateFlowlogResponseBody build() {
            return new CreateFlowlogResponseBody(this);
        } 

    } 

}

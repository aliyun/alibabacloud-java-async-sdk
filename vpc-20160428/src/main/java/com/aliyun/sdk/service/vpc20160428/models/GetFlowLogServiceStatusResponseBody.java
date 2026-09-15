// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link GetFlowLogServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowLogServiceStatusResponseBody</p>
 */
public class GetFlowLogServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFlowLogServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowLogServiceStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFlowLogServiceStatusResponseBody model) {
            this.enabled = model.enabled;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the flow log service is activated. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The flow log service is activated.</p>
         * </li>
         * <li><p><strong>false</strong>: The flow log service is not activated. You can call the <a href="https://help.aliyun.com/document_detail/449637.html">OpenFlowLogService</a> operation to activate the flow log service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-06F83A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowLogServiceStatusResponseBody build() {
            return new GetFlowLogServiceStatusResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CreateEdgeMachineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeMachineResponseBody</p>
 */
public class CreateEdgeMachineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("edge_machine_id")
    private String edgeMachineId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private CreateEdgeMachineResponseBody(Builder builder) {
        this.edgeMachineId = builder.edgeMachineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return edgeMachineId
     */
    public String getEdgeMachineId() {
        return this.edgeMachineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String edgeMachineId; 
        private String requestId; 

        /**
         * <p>The ID of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>cc0725ddf688744979cd98445f67e****</p>
         */
        public Builder edgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;request_id&quot;: &quot;6e7b377a-c5ed-4388-8026-689e1b34****&quot;,</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEdgeMachineResponseBody build() {
            return new CreateEdgeMachineResponseBody(this);
        } 

    } 

}

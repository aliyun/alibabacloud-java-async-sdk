// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyInstanceRAGConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceRAGConfigResponseBody</p>
 */
public class ModifyInstanceRAGConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyInstanceRAGConfigResponseBody(Builder builder) {
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceRAGConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String instanceName; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ModifyInstanceRAGConfigResponseBody model) {
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the RAG agent.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ModifyInstanceRAGConfigResponseBody build() {
            return new ModifyInstanceRAGConfigResponseBody(this);
        } 

    } 

}

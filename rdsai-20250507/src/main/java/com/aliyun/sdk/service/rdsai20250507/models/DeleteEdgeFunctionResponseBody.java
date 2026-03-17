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
 * {@link DeleteEdgeFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEdgeFunctionResponseBody</p>
 */
public class DeleteEdgeFunctionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EdgeFunctionName")
    private String edgeFunctionName;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteEdgeFunctionResponseBody(Builder builder) {
        this.edgeFunctionName = builder.edgeFunctionName;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeFunctionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeFunctionName
     */
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
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

    public static final class Builder {
        private String edgeFunctionName; 
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteEdgeFunctionResponseBody model) {
            this.edgeFunctionName = model.edgeFunctionName;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>fc-xxxx</p>
         * 
         * <strong>example:</strong>
         * <p>ef-****</p>
         */
        public Builder edgeFunctionName(String edgeFunctionName) {
            this.edgeFunctionName = edgeFunctionName;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteEdgeFunctionResponseBody build() {
            return new DeleteEdgeFunctionResponseBody(this);
        } 

    } 

}

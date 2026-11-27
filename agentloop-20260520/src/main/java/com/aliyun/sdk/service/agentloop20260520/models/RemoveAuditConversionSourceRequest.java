// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link RemoveAuditConversionSourceRequest} extends {@link RequestModel}
 *
 * <p>RemoveAuditConversionSourceRequest</p>
 */
public class RemoveAuditConversionSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceID;

    private RemoveAuditConversionSourceRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.type = builder.type;
        this.instanceID = builder.instanceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAuditConversionSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    public static final class Builder extends Request.Builder<RemoveAuditConversionSourceRequest, Builder> {
        private String agentSpace; 
        private String type; 
        private String instanceID; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAuditConversionSourceRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.type = request.type;
            this.instanceID = request.instanceID;
        } 

        /**
         * <p>The AgentSpace from which the transformation object is to be removed. The service verifies access permissions and region matching based on the user identity and region passed by the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The transformation type. A value of gateway indicates the gateway instance transformation list, and a value of trace indicates the service transition list. Only the list of the specified type is modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the transformation object. When the type is gateway, this parameter specifies the gateway instance ID. When the type is trace, this parameter specifies the service name. The value must be encoded as a single URL path segment. After decoding, leading and trailing whitespace is removed, and intermediate spaces are retained. The normalized value cannot be empty, can be up to 256 UTF-8 bytes in length, and is case-sensitive. For example, cluster A must be encoded as cluster%20A, and %20cluster%20A%20 is normalized to cluster A. A plus sign (+) in the path represents a literal plus sign and cannot be used as a space. If the value contains only whitespace or exceeds the byte limit, a 400 InvalidParameter.Config error is returned. Byte limits and normalization are verified by the backend.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-A</p>
         */
        public Builder instanceID(String instanceID) {
            this.putPathParameter("instanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        @Override
        public RemoveAuditConversionSourceRequest build() {
            return new RemoveAuditConversionSourceRequest(this);
        } 

    } 

}

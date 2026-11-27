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
 * {@link AddAuditConversionSourceRequest} extends {@link RequestModel}
 *
 * <p>AddAuditConversionSourceRequest</p>
 */
public class AddAuditConversionSourceRequest extends Request {
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

    private AddAuditConversionSourceRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.type = builder.type;
        this.instanceID = builder.instanceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuditConversionSourceRequest create() {
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

    public static final class Builder extends Request.Builder<AddAuditConversionSourceRequest, Builder> {
        private String agentSpace; 
        private String type; 
        private String instanceID; 

        private Builder() {
            super();
        } 

        private Builder(AddAuditConversionSourceRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.type = request.type;
            this.instanceID = request.instanceID;
        } 

        /**
         * <p>The AgentSpace to which the transformation object is added. The service verifies access permissions and region matching based on the user identity and region passed by the gateway.</p>
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
         * <p>gateway indicates the gateway instance transform list, and trace indicates the service transform list. Only the list of the selected type is modified.</p>
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
         * <p>The ID of the transformation object. If the type is gateway, this parameter specifies the gateway instance ID. If the type is trace, this parameter specifies the service name. The value is encoded as a single URL path segment. After decoding, leading and trailing whitespace is removed, and intermediate spaces are retained. The normalized value cannot be empty, can be up to 256 UTF-8 bytes in length, and is case-sensitive. For example, cluster A must be encoded as cluster%20A, and %20cluster%20A%20 is normalized to cluster A. A plus sign (+) in the path represents a literal plus sign and cannot be used as a space. If the value contains only whitespace or exceeds the byte limit, a 400 InvalidParameter.Config error is returned. The byte limit and normalization are verified by the backend.</p>
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
        public AddAuditConversionSourceRequest build() {
            return new AddAuditConversionSourceRequest(this);
        } 

    } 

}

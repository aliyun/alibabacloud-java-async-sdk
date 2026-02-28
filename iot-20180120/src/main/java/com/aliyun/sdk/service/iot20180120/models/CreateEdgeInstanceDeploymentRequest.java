// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeInstanceDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeInstanceDeploymentRequest</p>
 */
public class CreateEdgeInstanceDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateEdgeInstanceDeploymentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceDeploymentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateEdgeInstanceDeploymentRequest, Builder> {
        private String instanceId; 
        private String iotInstanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeInstanceDeploymentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance for which you want to create a deployment task and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PgEfYupSn6Pvhfkx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The type of the deployment task.</p>
         * <ul>
         * <li>deploy: deploys the edge instance.</li>
         * <li>reset: resets the edge instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateEdgeInstanceDeploymentRequest build() {
            return new CreateEdgeInstanceDeploymentRequest(this);
        } 

    } 

}

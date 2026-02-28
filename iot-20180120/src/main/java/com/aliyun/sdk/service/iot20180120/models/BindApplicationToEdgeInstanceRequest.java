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
 * {@link BindApplicationToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindApplicationToEdgeInstanceRequest</p>
 */
public class BindApplicationToEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BindApplicationToEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationVersion = builder.applicationVersion;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindApplicationToEdgeInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationVersion
     */
    public String getApplicationVersion() {
        return this.applicationVersion;
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

    public static final class Builder extends Request.Builder<BindApplicationToEdgeInstanceRequest, Builder> {
        private String applicationId; 
        private String applicationVersion; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BindApplicationToEdgeInstanceRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationVersion = request.applicationVersion;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361368ba5a094da9bf5625d092******</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3.7</p>
         */
        public Builder applicationVersion(String applicationVersion) {
            this.putQueryParameter("ApplicationVersion", applicationVersion);
            this.applicationVersion = applicationVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tb4r9k3GWHJFWv******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BindApplicationToEdgeInstanceRequest build() {
            return new BindApplicationToEdgeInstanceRequest(this);
        } 

    } 

}

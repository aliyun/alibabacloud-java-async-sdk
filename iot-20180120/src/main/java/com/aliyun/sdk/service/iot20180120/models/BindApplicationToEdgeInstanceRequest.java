// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindApplicationToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindApplicationToEdgeInstanceRequest</p>
 */
public class BindApplicationToEdgeInstanceRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("ApplicationVersion")
    @Validation(required = true)
    private String applicationVersion;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
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

        private Builder(BindApplicationToEdgeInstanceRequest response) {
            super(response);
            this.applicationId = response.applicationId;
            this.applicationVersion = response.applicationVersion;
            this.instanceId = response.instanceId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ApplicationVersion.
         */
        public Builder applicationVersion(String applicationVersion) {
            this.putQueryParameter("ApplicationVersion", applicationVersion);
            this.applicationVersion = applicationVersion;
            return this;
        }

        /**
         * InstanceId.
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

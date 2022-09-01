// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateDeviceCodeRequest} extends {@link RequestModel}
 *
 * <p>GenerateDeviceCodeRequest</p>
 */
public class GenerateDeviceCodeRequest extends Request {
    @Host
    @NameInMap("regionId")
    private String regionId;

    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("scope")
    private String scope;

    private GenerateDeviceCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDeviceCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<GenerateDeviceCodeRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDeviceCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.scope = request.scope;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * scope范围
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public GenerateDeviceCodeRequest build() {
            return new GenerateDeviceCodeRequest(this);
        } 

    } 

}

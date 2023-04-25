// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNameRequest</p>
 */
public class ModifyInstanceNameRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyInstanceNameRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNameRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNameRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNameRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * The region ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The name of the instance. Valid values:
         * <p>
         * 
         * *   The name can contain only letters, digits, hyphens (-), and underscores (\_).
         * *   The name must be 3 to 64 characters in length. If the name that you specify contains more than 64 characters, the system automatically truncates the name to 64 characters.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyInstanceNameRequest build() {
            return new ModifyInstanceNameRequest(this);
        } 

    } 

}

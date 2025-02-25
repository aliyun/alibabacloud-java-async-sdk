// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetLoginPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetLoginPasswordRequest</p>
 */
public class ResetLoginPasswordRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    private ResetLoginPasswordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetLoginPasswordRequest create() {
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<ResetLoginPasswordRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(ResetLoginPasswordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.password = request.password;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new password that you specify to log on to the instance. The password must be 8 to 32 bits in length, and must contain at least two of the following character types: letters, special characters, and digits.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public ResetLoginPasswordRequest build() {
            return new ResetLoginPasswordRequest(this);
        } 

    } 

}

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
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ResetLoginPasswordRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetLoginPasswordRequest, Builder> {
        private String instanceId; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetLoginPasswordRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.password = response.password;
            this.regionId = response.regionId;
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetLoginPasswordRequest build() {
            return new ResetLoginPasswordRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private ResetLoginPasswordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.password = builder.password;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetLoginPasswordRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String password; 
        private String instanceId; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Logon password</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        public ResetLoginPasswordRequest build() {
            return new ResetLoginPasswordRequest(this);
        } 

    } 

}

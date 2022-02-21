// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProxyRequest} extends {@link RequestModel}
 *
 * <p>CreateProxyRequest</p>
 */
public class CreateProxyRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private Long instanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateProxyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
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

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateProxyRequest, Builder> {
        private Long instanceId; 
        private String password; 
        private String regionId; 
        private Long tid; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateProxyRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.password = response.password;
            this.regionId = response.regionId;
            this.tid = response.tid;
            this.username = response.username;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
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

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateProxyRequest build() {
            return new CreateProxyRequest(this);
        } 

    } 

}

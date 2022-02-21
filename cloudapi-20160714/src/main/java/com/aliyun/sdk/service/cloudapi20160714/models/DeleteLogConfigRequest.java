// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogConfigRequest</p>
 */
public class DeleteLogConfigRequest extends Request {
    @Query
    @NameInMap("LogType")
    private String logType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteLogConfigRequest(Builder builder) {
        super(builder);
        this.logType = builder.logType;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteLogConfigRequest, Builder> {
        private String logType; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogConfigRequest response) {
            super(response);
            this.logType = response.logType;
            this.regionId = response.regionId;
            this.securityToken = response.securityToken;
        } 

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteLogConfigRequest build() {
            return new DeleteLogConfigRequest(this);
        } 

    } 

}

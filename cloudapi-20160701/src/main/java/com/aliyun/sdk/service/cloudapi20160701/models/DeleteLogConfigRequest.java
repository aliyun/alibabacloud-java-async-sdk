// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("LogType")
    private String logType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteLogConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.logType = builder.logType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteLogConfigRequest, Builder> {
        private String regionId; 
        private String logType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.logType = request.logType;
            this.securityToken = request.securityToken;
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
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
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

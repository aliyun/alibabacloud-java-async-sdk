// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogConfigRequest</p>
 */
public class DescribeLogConfigRequest extends Request {
    @Query
    @NameInMap("LogType")
    private String logType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeLogConfigRequest(Builder builder) {
        super(builder);
        this.logType = builder.logType;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLogConfigRequest, Builder> {
        private String logType; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogConfigRequest request) {
            super(request);
            this.logType = request.logType;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
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
        public DescribeLogConfigRequest build() {
            return new DescribeLogConfigRequest(this);
        } 

    } 

}

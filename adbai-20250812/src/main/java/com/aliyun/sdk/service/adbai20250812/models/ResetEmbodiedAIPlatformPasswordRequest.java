// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResetEmbodiedAIPlatformPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetEmbodiedAIPlatformPasswordRequest</p>
 */
public class ResetEmbodiedAIPlatformPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platformName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ResetEmbodiedAIPlatformPasswordRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.password = builder.password;
        this.platformName = builder.platformName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetEmbodiedAIPlatformPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return platformName
     */
    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetEmbodiedAIPlatformPasswordRequest, Builder> {
        private String DBClusterId; 
        private String password; 
        private String platformName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetEmbodiedAIPlatformPasswordRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.password = request.password;
            this.platformName = request.platformName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123*******</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>platform1</p>
         */
        public Builder platformName(String platformName) {
            this.putQueryParameter("PlatformName", platformName);
            this.platformName = platformName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetEmbodiedAIPlatformPasswordRequest build() {
            return new ResetEmbodiedAIPlatformPasswordRequest(this);
        } 

    } 

}

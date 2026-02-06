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
 * {@link DeleteEmbodiedAIPlatformRequest} extends {@link RequestModel}
 *
 * <p>DeleteEmbodiedAIPlatformRequest</p>
 */
public class DeleteEmbodiedAIPlatformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platformName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteEmbodiedAIPlatformRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.platformName = builder.platformName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEmbodiedAIPlatformRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEmbodiedAIPlatformRequest, Builder> {
        private String DBClusterId; 
        private String platformName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEmbodiedAIPlatformRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
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
        public DeleteEmbodiedAIPlatformRequest build() {
            return new DeleteEmbodiedAIPlatformRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGwConsumerOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateGwConsumerOrderRequest</p>
 */
public class CreateGwConsumerOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer keyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateGwConsumerOrderRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.expireTime = builder.expireTime;
        this.gatewayId = builder.gatewayId;
        this.keyCount = builder.keyCount;
        this.packageSpec = builder.packageSpec;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGwConsumerOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return keyCount
     */
    public Integer getKeyCount() {
        return this.keyCount;
    }

    /**
     * @return packageSpec
     */
    public String getPackageSpec() {
        return this.packageSpec;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateGwConsumerOrderRequest, Builder> {
        private String clientToken; 
        private String expireTime; 
        private String gatewayId; 
        private Integer keyCount; 
        private String packageSpec; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGwConsumerOrderRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.expireTime = request.expireTime;
            this.gatewayId = request.gatewayId;
            this.keyCount = request.keyCount;
            this.packageSpec = request.packageSpec;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-2ze24rr575j5b18cg</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder keyCount(Integer keyCount) {
            this.putQueryParameter("KeyCount", keyCount);
            this.keyCount = keyCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder packageSpec(String packageSpec) {
            this.putQueryParameter("PackageSpec", packageSpec);
            this.packageSpec = packageSpec;
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
        public CreateGwConsumerOrderRequest build() {
            return new CreateGwConsumerOrderRequest(this);
        } 

    } 

}

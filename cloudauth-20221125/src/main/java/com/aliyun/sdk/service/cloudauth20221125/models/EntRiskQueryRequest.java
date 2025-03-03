// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

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
 * {@link EntRiskQueryRequest} extends {@link RequestModel}
 *
 * <p>EntRiskQueryRequest</p>
 */
public class EntRiskQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamValue")
    private String paramValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAuthorization")
    private String userAuthorization;

    private EntRiskQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.paramType = builder.paramType;
        this.paramValue = builder.paramValue;
        this.sceneCode = builder.sceneCode;
        this.userAuthorization = builder.userAuthorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntRiskQueryRequest create() {
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
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return paramValue
     */
    public String getParamValue() {
        return this.paramValue;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return userAuthorization
     */
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

    public static final class Builder extends Request.Builder<EntRiskQueryRequest, Builder> {
        private String regionId; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String paramType; 
        private String paramValue; 
        private String sceneCode; 
        private String userAuthorization; 

        private Builder() {
            super();
        } 

        private Builder(EntRiskQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.paramType = request.paramType;
            this.paramValue = request.paramValue;
            this.sceneCode = request.sceneCode;
            this.userAuthorization = request.userAuthorization;
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
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * MerchantUserId.
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * ParamValue.
         */
        public Builder paramValue(String paramValue) {
            this.putQueryParameter("ParamValue", paramValue);
            this.paramValue = paramValue;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * UserAuthorization.
         */
        public Builder userAuthorization(String userAuthorization) {
            this.putQueryParameter("UserAuthorization", userAuthorization);
            this.userAuthorization = userAuthorization;
            return this;
        }

        @Override
        public EntRiskQueryRequest build() {
            return new EntRiskQueryRequest(this);
        } 

    } 

}

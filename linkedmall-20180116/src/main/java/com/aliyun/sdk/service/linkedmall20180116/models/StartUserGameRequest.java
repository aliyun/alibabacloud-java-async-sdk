// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link StartUserGameRequest} extends {@link RequestModel}
 *
 * <p>StartUserGameRequest</p>
 */
public class StartUserGameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GameId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gameId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    private String routeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserApp")
    private String userApp;

    private StartUserGameRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.activityId = builder.activityId;
        this.bizId = builder.bizId;
        this.extInfo = builder.extInfo;
        this.gameId = builder.gameId;
        this.routeId = builder.routeId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.userApp = builder.userApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartUserGameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extInfo
     */
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return gameId
     */
    public String getGameId() {
        return this.gameId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return userApp
     */
    public String getUserApp() {
        return this.userApp;
    }

    public static final class Builder extends Request.Builder<StartUserGameRequest, Builder> {
        private String accountType; 
        private String activityId; 
        private String bizId; 
        private java.util.Map<String, ?> extInfo; 
        private String gameId; 
        private String routeId; 
        private String thirdPartyUserId; 
        private String userApp; 

        private Builder() {
            super();
        } 

        private Builder(StartUserGameRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.activityId = request.activityId;
            this.bizId = request.bizId;
            this.extInfo = request.extInfo;
            this.gameId = request.gameId;
            this.routeId = request.routeId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.userApp = request.userApp;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>671091829240653825</p>
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20288*****003</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>673474835708274689</p>
         */
        public Builder gameId(String gameId) {
            this.putQueryParameter("GameId", gameId);
            this.gameId = gameId;
            return this;
        }

        /**
         * RouteId.
         */
        public Builder routeId(String routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UserApp.
         */
        public Builder userApp(String userApp) {
            this.putQueryParameter("UserApp", userApp);
            this.userApp = userApp;
            return this;
        }

        @Override
        public StartUserGameRequest build() {
            return new StartUserGameRequest(this);
        } 

    } 

}

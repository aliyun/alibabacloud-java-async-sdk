// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityGameInfoRequest} extends {@link RequestModel}
 *
 * <p>GetActivityGameInfoRequest</p>
 */
public class GetActivityGameInfoRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("ActivityId")
    @Validation(required = true)
    private String activityId;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("ExtInfo")
    private java.util.Map < String, ? > extInfo;

    @Query
    @NameInMap("GameId")
    @Validation(required = true)
    private String gameId;

    @Query
    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    private String thirdPartyUserId;

    private GetActivityGameInfoRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.activityId = builder.activityId;
        this.bizId = builder.bizId;
        this.extInfo = builder.extInfo;
        this.gameId = builder.gameId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActivityGameInfoRequest create() {
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
    public java.util.Map < String, ? > getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return gameId
     */
    public String getGameId() {
        return this.gameId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<GetActivityGameInfoRequest, Builder> {
        private String accountType; 
        private String activityId; 
        private String bizId; 
        private java.util.Map < String, ? > extInfo; 
        private String gameId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetActivityGameInfoRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.activityId = request.activityId;
            this.bizId = request.bizId;
            this.extInfo = request.extInfo;
            this.gameId = request.gameId;
            this.thirdPartyUserId = request.thirdPartyUserId;
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
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map < String, ? > extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * GameId.
         */
        public Builder gameId(String gameId) {
            this.putQueryParameter("GameId", gameId);
            this.gameId = gameId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public GetActivityGameInfoRequest build() {
            return new GetActivityGameInfoRequest(this);
        } 

    } 

}

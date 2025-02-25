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
 * {@link ListActivityAtmosphereRequest} extends {@link RequestModel}
 *
 * <p>ListActivityAtmosphereRequest</p>
 */
public class ListActivityAtmosphereRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GameId")
    private String gameId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    private ListActivityAtmosphereRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.activityId = builder.activityId;
        this.bizId = builder.bizId;
        this.gameId = builder.gameId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActivityAtmosphereRequest create() {
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
     * @return gameId
     */
    public String getGameId() {
        return this.gameId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<ListActivityAtmosphereRequest, Builder> {
        private String accountType; 
        private String activityId; 
        private String bizId; 
        private String gameId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListActivityAtmosphereRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.activityId = request.activityId;
            this.bizId = request.bizId;
            this.gameId = request.gameId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******364</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public ListActivityAtmosphereRequest build() {
            return new ListActivityAtmosphereRequest(this);
        } 

    } 

}

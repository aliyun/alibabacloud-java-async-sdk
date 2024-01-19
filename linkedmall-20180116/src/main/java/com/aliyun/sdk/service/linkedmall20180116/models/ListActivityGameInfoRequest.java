// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActivityGameInfoRequest} extends {@link RequestModel}
 *
 * <p>ListActivityGameInfoRequest</p>
 */
public class ListActivityGameInfoRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("ActivityId")
    private String activityId;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("GameId")
    private String gameId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Statuses")
    private String statuses;

    @Query
    @NameInMap("SubType")
    private String subType;

    @Query
    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    private String thirdPartyUserId;

    @Query
    @NameInMap("Type")
    private String type;

    private ListActivityGameInfoRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.activityId = builder.activityId;
        this.bizId = builder.bizId;
        this.endTime = builder.endTime;
        this.gameId = builder.gameId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statuses = builder.statuses;
        this.subType = builder.subType;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActivityGameInfoRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statuses
     */
    public String getStatuses() {
        return this.statuses;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListActivityGameInfoRequest, Builder> {
        private String accountType; 
        private String activityId; 
        private String bizId; 
        private Long endTime; 
        private String gameId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTime; 
        private String status; 
        private String statuses; 
        private String subType; 
        private String thirdPartyUserId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListActivityGameInfoRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.activityId = request.activityId;
            this.bizId = request.bizId;
            this.endTime = request.endTime;
            this.gameId = request.gameId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.statuses = request.statuses;
            this.subType = request.subType;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.type = request.type;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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
         * Statuses.
         */
        public Builder statuses(String statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListActivityGameInfoRequest build() {
            return new ListActivityGameInfoRequest(this);
        } 

    } 

}

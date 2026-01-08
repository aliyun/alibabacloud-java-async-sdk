// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetDownloadExcelListRequest} extends {@link RequestModel}
 *
 * <p>GetDownloadExcelListRequest</p>
 */
public class GetDownloadExcelListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryNames")
    private java.util.List<String> countryNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private GetDownloadExcelListRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.condition = builder.condition;
        this.countryNames = builder.countryNames;
        this.endDate = builder.endDate;
        this.groupId = builder.groupId;
        this.groupIds = builder.groupIds;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadExcelListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizExtend
     */
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return countryNames
     */
    public java.util.List<String> getCountryNames() {
        return this.countryNames;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetDownloadExcelListRequest, Builder> {
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String condition; 
        private java.util.List<String> countryNames; 
        private String endDate; 
        private String groupId; 
        private java.util.List<String> groupIds; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetDownloadExcelListRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.condition = request.condition;
            this.countryNames = request.countryNames;
            this.endDate = request.endDate;
            this.groupId = request.groupId;
            this.groupIds = request.groupIds;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startDate = request.startDate;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * BizExtend.
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * CountryNames.
         */
        public Builder countryNames(java.util.List<String> countryNames) {
            String countryNamesShrink = shrink(countryNames, "CountryNames", "json");
            this.putQueryParameter("CountryNames", countryNamesShrink);
            this.countryNames = countryNames;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            String groupIdsShrink = shrink(groupIds, "GroupIds", "json");
            this.putQueryParameter("GroupIds", groupIdsShrink);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetDownloadExcelListRequest build() {
            return new GetDownloadExcelListRequest(this);
        } 

    } 

}

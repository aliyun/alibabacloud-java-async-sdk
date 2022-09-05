// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertContactGroupRequest</p>
 */
public class SearchAlertContactGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @Query
    @NameInMap("ContactGroupName")
    private String contactGroupName;

    @Query
    @NameInMap("ContactId")
    private Long contactId;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("IsDetail")
    private Boolean isDetail;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SearchAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.contactGroupName = builder.contactGroupName;
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.isDetail = builder.isDetail;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupIds
     */
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SearchAlertContactGroupRequest, Builder> {
        private String contactGroupIds; 
        private String contactGroupName; 
        private Long contactId; 
        private String contactName; 
        private Boolean isDetail; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SearchAlertContactGroupRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.contactGroupName = request.contactGroupName;
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.isDetail = request.isDetail;
            this.regionId = request.regionId;
        } 

        /**
         * ContactGroupIds.
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * ContactGroupName.
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * IsDetail.
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SearchAlertContactGroupRequest build() {
            return new SearchAlertContactGroupRequest(this);
        } 

    } 

}

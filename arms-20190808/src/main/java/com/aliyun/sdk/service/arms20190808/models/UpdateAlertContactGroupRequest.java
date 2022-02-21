// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertContactGroupRequest</p>
 */
public class UpdateAlertContactGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroupId")
    @Validation(required = true)
    private Long contactGroupId;

    @Query
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    private String contactGroupName;

    @Query
    @NameInMap("ContactIds")
    private String contactIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupId = builder.contactGroupId;
        this.contactGroupName = builder.contactGroupName;
        this.contactIds = builder.contactIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupId
     */
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAlertContactGroupRequest, Builder> {
        private Long contactGroupId; 
        private String contactGroupName; 
        private String contactIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertContactGroupRequest response) {
            super(response);
            this.contactGroupId = response.contactGroupId;
            this.contactGroupName = response.contactGroupName;
            this.contactIds = response.contactIds;
            this.regionId = response.regionId;
        } 

        /**
         * ContactGroupId.
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putQueryParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
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
         * ContactIds.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
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
        public UpdateAlertContactGroupRequest build() {
            return new UpdateAlertContactGroupRequest(this);
        } 

    } 

}

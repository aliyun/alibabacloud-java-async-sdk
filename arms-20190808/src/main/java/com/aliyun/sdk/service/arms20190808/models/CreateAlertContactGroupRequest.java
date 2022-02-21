// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertContactGroupRequest</p>
 */
public class CreateAlertContactGroupRequest extends Request {
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

    private CreateAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupName = builder.contactGroupName;
        this.contactIds = builder.contactIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateAlertContactGroupRequest, Builder> {
        private String contactGroupName; 
        private String contactIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertContactGroupRequest response) {
            super(response);
            this.contactGroupName = response.contactGroupName;
            this.contactIds = response.contactIds;
            this.regionId = response.regionId;
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
        public CreateAlertContactGroupRequest build() {
            return new CreateAlertContactGroupRequest(this);
        } 

    } 

}

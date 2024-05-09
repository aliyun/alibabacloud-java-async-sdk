// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertContactGroupRequest</p>
 */
public class UpdateAlertContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIds")
    private String contactIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(UpdateAlertContactGroupRequest request) {
            super(request);
            this.contactGroupId = request.contactGroupId;
            this.contactGroupName = request.contactGroupName;
            this.contactIds = request.contactIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the alert contact group.
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putQueryParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * The name of the alert contact group.
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * The ID of the alert contact.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * The ID of the region.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateContactGroupRequest</p>
 */
public class CreateOrUpdateContactGroupRequest extends Request {
    @Body
    @NameInMap("ContactGroupId")
    private Long contactGroupId;

    @Body
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    private String contactGroupName;

    @Body
    @NameInMap("ContactIds")
    private String contactIds;

    private CreateOrUpdateContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupId = builder.contactGroupId;
        this.contactGroupName = builder.contactGroupName;
        this.contactIds = builder.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateContactGroupRequest create() {
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

    public static final class Builder extends Request.Builder<CreateOrUpdateContactGroupRequest, Builder> {
        private Long contactGroupId; 
        private String contactGroupName; 
        private String contactIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateContactGroupRequest response) {
            super(response);
            this.contactGroupId = response.contactGroupId;
            this.contactGroupName = response.contactGroupName;
            this.contactIds = response.contactIds;
        } 

        /**
         * 告警联系人组ID
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putBodyParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * 告警联系人组名称
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putBodyParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * 告警联系人ids
         */
        public Builder contactIds(String contactIds) {
            this.putBodyParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        @Override
        public CreateOrUpdateContactGroupRequest build() {
            return new CreateOrUpdateContactGroupRequest(this);
        } 

    } 

}

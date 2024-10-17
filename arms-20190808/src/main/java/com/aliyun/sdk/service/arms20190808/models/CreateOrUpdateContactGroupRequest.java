// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOrUpdateContactGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateContactGroupRequest</p>
 */
public class CreateOrUpdateContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactGroupId")
    private Long contactGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactIds")
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

        private Builder(CreateOrUpdateContactGroupRequest request) {
            super(request);
            this.contactGroupId = request.contactGroupId;
            this.contactGroupName = request.contactGroupName;
            this.contactIds = request.contactIds;
        } 

        /**
         * <p>The ID of the alert contact group.</p>
         * <ul>
         * <li>If you do not specify this parameter, an alert contact group is created.</li>
         * <li>If you specify this parameter, the specified alert contact group is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putBodyParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * <p>The name of the alert contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putBodyParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The ID of the contact that you want to add to the contact group. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3]</p>
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

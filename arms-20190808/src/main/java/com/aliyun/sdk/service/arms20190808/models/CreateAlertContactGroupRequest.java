// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertContactGroupRequest</p>
 */
public class CreateAlertContactGroupRequest extends Request {
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

        private Builder(CreateAlertContactGroupRequest request) {
            super(request);
            this.contactGroupName = request.contactGroupName;
            this.contactIds = request.contactIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the alert contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The IDs of contacts in the contact group. Separate multiple contact IDs with spaces. You can call the SearchAlertContact operation to query the contact IDs. For more information, see <a href="https://help.aliyun.com/document_detail/130703.html">SearchAlertContact</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>12* 23* 34*</p>
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * <p>The region ID. Default value: <code>cn-hangzhou</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

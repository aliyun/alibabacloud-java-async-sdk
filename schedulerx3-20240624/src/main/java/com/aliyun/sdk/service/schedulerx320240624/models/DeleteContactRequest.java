// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link DeleteContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactRequest</p>
 */
public class DeleteContactRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactName;

    private DeleteContactRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactName = builder.contactName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    public static final class Builder extends Request.Builder<DeleteContactRequest, Builder> {
        private String regionId; 
        private String contactName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactName = request.contactName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        @Override
        public DeleteContactRequest build() {
            return new DeleteContactRequest(this);
        } 

    } 

}

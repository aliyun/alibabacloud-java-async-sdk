// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ResendVerifyActivateRequest} extends {@link RequestModel}
 *
 * <p>ResendVerifyActivateRequest</p>
 */
public class ResendVerifyActivateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channelType")
    private String channelType;

    private ResendVerifyActivateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactId = builder.contactId;
        this.channelType = builder.channelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendVerifyActivateRequest create() {
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
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    public static final class Builder extends Request.Builder<ResendVerifyActivateRequest, Builder> {
        private String regionId; 
        private String contactId; 
        private String channelType; 

        private Builder() {
            super();
        } 

        private Builder(ResendVerifyActivateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactId = request.contactId;
            this.channelType = request.channelType;
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
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder contactId(String contactId) {
            this.putPathParameter("contactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("channelType", channelType);
            this.channelType = channelType;
            return this;
        }

        @Override
        public ResendVerifyActivateRequest build() {
            return new ResendVerifyActivateRequest(this);
        } 

    } 

}

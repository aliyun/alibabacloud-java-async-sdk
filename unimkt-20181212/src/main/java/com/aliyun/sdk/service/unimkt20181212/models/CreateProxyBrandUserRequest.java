// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link CreateProxyBrandUserRequest} extends {@link RequestModel}
 *
 * <p>CreateProxyBrandUserRequest</p>
 */
public class CreateProxyBrandUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserNick")
    @com.aliyun.core.annotation.Validation(required = true)
    private String brandUserNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Company")
    @com.aliyun.core.annotation.Validation(required = true)
    private String company;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactPhone")
    private String contactPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Industry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyUserId;

    private CreateProxyBrandUserRequest(Builder builder) {
        super(builder);
        this.brandUserNick = builder.brandUserNick;
        this.channelId = builder.channelId;
        this.clientToken = builder.clientToken;
        this.company = builder.company;
        this.contactName = builder.contactName;
        this.contactPhone = builder.contactPhone;
        this.industry = builder.industry;
        this.proxyUserId = builder.proxyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProxyBrandUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandUserNick
     */
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactPhone
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public static final class Builder extends Request.Builder<CreateProxyBrandUserRequest, Builder> {
        private String brandUserNick; 
        private String channelId; 
        private String clientToken; 
        private String company; 
        private String contactName; 
        private String contactPhone; 
        private String industry; 
        private Long proxyUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProxyBrandUserRequest request) {
            super(request);
            this.brandUserNick = request.brandUserNick;
            this.channelId = request.channelId;
            this.clientToken = request.clientToken;
            this.company = request.company;
            this.contactName = request.contactName;
            this.contactPhone = request.contactPhone;
            this.industry = request.industry;
            this.proxyUserId = request.proxyUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder brandUserNick(String brandUserNick) {
            this.putQueryParameter("BrandUserNick", brandUserNick);
            this.brandUserNick = brandUserNick;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder company(String company) {
            this.putQueryParameter("Company", company);
            this.company = company;
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
         * ContactPhone.
         */
        public Builder contactPhone(String contactPhone) {
            this.putQueryParameter("ContactPhone", contactPhone);
            this.contactPhone = contactPhone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        @Override
        public CreateProxyBrandUserRequest build() {
            return new CreateProxyBrandUserRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link SaveTaskForUpdatingContactByTemplateIdRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForUpdatingContactByTemplateIdRequest</p>
 */
public class SaveTaskForUpdatingContactByTemplateIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddTransferLock")
    private Boolean addTransferLock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveTaskForUpdatingContactByTemplateIdRequest(Builder builder) {
        super(builder);
        this.addTransferLock = builder.addTransferLock;
        this.contactTemplateId = builder.contactTemplateId;
        this.contactType = builder.contactType;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.saleId = builder.saleId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForUpdatingContactByTemplateIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addTransferLock
     */
    public Boolean getAddTransferLock() {
        return this.addTransferLock;
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return contactType
     */
    public String getContactType() {
        return this.contactType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveTaskForUpdatingContactByTemplateIdRequest, Builder> {
        private Boolean addTransferLock; 
        private Long contactTemplateId; 
        private String contactType; 
        private String domainName; 
        private String lang; 
        private String saleId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForUpdatingContactByTemplateIdRequest request) {
            super(request);
            this.addTransferLock = request.addTransferLock;
            this.contactTemplateId = request.contactTemplateId;
            this.contactType = request.contactType;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.saleId = request.saleId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * AddTransferLock.
         */
        public Builder addTransferLock(Boolean addTransferLock) {
            this.putQueryParameter("AddTransferLock", addTransferLock);
            this.addTransferLock = addTransferLock;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactType(String contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SaleId.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveTaskForUpdatingContactByTemplateIdRequest build() {
            return new SaveTaskForUpdatingContactByTemplateIdRequest(this);
        } 

    } 

}

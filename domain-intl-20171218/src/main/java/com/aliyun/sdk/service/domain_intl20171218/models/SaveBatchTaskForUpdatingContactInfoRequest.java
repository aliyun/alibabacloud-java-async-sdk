// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForUpdatingContactInfoRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForUpdatingContactInfoRequest</p>
 */
public class SaveBatchTaskForUpdatingContactInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddTransferLock")
    private Boolean addTransferLock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registrantProfileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForUpdatingContactInfoRequest(Builder builder) {
        super(builder);
        this.addTransferLock = builder.addTransferLock;
        this.contactType = builder.contactType;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.registrantProfileId = builder.registrantProfileId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForUpdatingContactInfoRequest create() {
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
     * @return contactType
     */
    public String getContactType() {
        return this.contactType;
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForUpdatingContactInfoRequest, Builder> {
        private Boolean addTransferLock; 
        private String contactType; 
        private java.util.List < String > domainName; 
        private String lang; 
        private Long registrantProfileId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForUpdatingContactInfoRequest request) {
            super(request);
            this.addTransferLock = request.addTransferLock;
            this.contactType = request.contactType;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.registrantProfileId = request.registrantProfileId;
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
         * ContactType.
         */
        public Builder contactType(String contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
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
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
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
        public SaveBatchTaskForUpdatingContactInfoRequest build() {
            return new SaveBatchTaskForUpdatingContactInfoRequest(this);
        } 

    } 

}

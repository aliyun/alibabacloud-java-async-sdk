// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest</p>
 */
public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest extends Request {
    @Query
    @NameInMap("ContactType")
    @Validation(required = true)
    private String contactType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegistrantProfileId")
    @Validation(required = true)
    private Long registrantProfileId;

    @Query
    @NameInMap("TransferOutProhibited")
    private Boolean transferOutProhibited;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest(Builder builder) {
        super(builder);
        this.contactType = builder.contactType;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.registrantProfileId = builder.registrantProfileId;
        this.transferOutProhibited = builder.transferOutProhibited;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return transferOutProhibited
     */
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest, Builder> {
        private String contactType; 
        private java.util.List < String > domainName; 
        private String lang; 
        private Long registrantProfileId; 
        private Boolean transferOutProhibited; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request) {
            super(request);
            this.contactType = request.contactType;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.registrantProfileId = request.registrantProfileId;
            this.transferOutProhibited = request.transferOutProhibited;
            this.userClientIp = request.userClientIp;
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
         * TransferOutProhibited.
         */
        public Builder transferOutProhibited(Boolean transferOutProhibited) {
            this.putQueryParameter("TransferOutProhibited", transferOutProhibited);
            this.transferOutProhibited = transferOutProhibited;
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
        public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest build() {
            return new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForUpdatingContactInfoRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForUpdatingContactInfoRequest</p>
 */
public class SaveSingleTaskForUpdatingContactInfoRequest extends Request {
    @Query
    @NameInMap("AddTransferLock")
    private Boolean addTransferLock;

    @Query
    @NameInMap("ContactType")
    @Validation(required = true)
    private String contactType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegistrantProfileId")
    @Validation(required = true)
    private Long registrantProfileId;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForUpdatingContactInfoRequest(Builder builder) {
        super(builder);
        this.addTransferLock = builder.addTransferLock;
        this.contactType = builder.contactType;
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.registrantProfileId = builder.registrantProfileId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForUpdatingContactInfoRequest create() {
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
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForUpdatingContactInfoRequest, Builder> {
        private Boolean addTransferLock; 
        private String contactType; 
        private String domainName; 
        private String instanceId; 
        private String lang; 
        private Long registrantProfileId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForUpdatingContactInfoRequest response) {
            super(response);
            this.addTransferLock = response.addTransferLock;
            this.contactType = response.contactType;
            this.domainName = response.domainName;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.registrantProfileId = response.registrantProfileId;
            this.userClientIp = response.userClientIp;
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
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public SaveSingleTaskForUpdatingContactInfoRequest build() {
            return new SaveSingleTaskForUpdatingContactInfoRequest(this);
        } 

    } 

}

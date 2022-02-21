// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDVOrderAuditRequest} extends {@link RequestModel}
 *
 * <p>CreateDVOrderAuditRequest</p>
 */
public class CreateDVOrderAuditRequest extends Request {
    @Query
    @NameInMap("City")
    @Validation(required = true)
    private String city;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("DomainVerifyType")
    @Validation(required = true)
    private String domainVerifyType;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Mobile")
    @Validation(required = true)
    private String mobile;

    @Query
    @NameInMap("Province")
    @Validation(required = true)
    private String province;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateDVOrderAuditRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.domain = builder.domain;
        this.domainVerifyType = builder.domainVerifyType;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.mobile = builder.mobile;
        this.province = builder.province;
        this.sourceIp = builder.sourceIp;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDVOrderAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainVerifyType
     */
    public String getDomainVerifyType() {
        return this.domainVerifyType;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateDVOrderAuditRequest, Builder> {
        private String city; 
        private String domain; 
        private String domainVerifyType; 
        private String email; 
        private String instanceId; 
        private String lang; 
        private String mobile; 
        private String province; 
        private String sourceIp; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateDVOrderAuditRequest response) {
            super(response);
            this.city = response.city;
            this.domain = response.domain;
            this.domainVerifyType = response.domainVerifyType;
            this.email = response.email;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.mobile = response.mobile;
            this.province = response.province;
            this.sourceIp = response.sourceIp;
            this.username = response.username;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * DomainVerifyType.
         */
        public Builder domainVerifyType(String domainVerifyType) {
            this.putQueryParameter("DomainVerifyType", domainVerifyType);
            this.domainVerifyType = domainVerifyType;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
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
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateDVOrderAuditRequest build() {
            return new CreateDVOrderAuditRequest(this);
        } 

    } 

}

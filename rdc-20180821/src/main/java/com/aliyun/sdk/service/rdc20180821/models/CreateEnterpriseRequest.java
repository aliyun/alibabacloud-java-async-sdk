// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnterpriseRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseRequest</p>
 */
public class CreateEnterpriseRequest extends Request {
    @Query
    @NameInMap("CreatorStaffId")
    @Validation(required = true)
    private String creatorStaffId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Emails")
    private java.util.Map < String, ? > emails;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateEnterpriseRequest(Builder builder) {
        super(builder);
        this.creatorStaffId = builder.creatorStaffId;
        this.description = builder.description;
        this.domain = builder.domain;
        this.emails = builder.emails;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorStaffId
     */
    public String getCreatorStaffId() {
        return this.creatorStaffId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return emails
     */
    public java.util.Map < String, ? > getEmails() {
        return this.emails;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateEnterpriseRequest, Builder> {
        private String creatorStaffId; 
        private String description; 
        private String domain; 
        private java.util.Map < String, ? > emails; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseRequest response) {
            super(response);
            this.creatorStaffId = response.creatorStaffId;
            this.description = response.description;
            this.domain = response.domain;
            this.emails = response.emails;
            this.name = response.name;
        } 

        /**
         * CreatorStaffId.
         */
        public Builder creatorStaffId(String creatorStaffId) {
            this.putQueryParameter("CreatorStaffId", creatorStaffId);
            this.creatorStaffId = creatorStaffId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Emails.
         */
        public Builder emails(java.util.Map < String, ? > emails) {
            this.putQueryParameter("Emails", emails);
            this.emails = emails;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateEnterpriseRequest build() {
            return new CreateEnterpriseRequest(this);
        } 

    } 

}

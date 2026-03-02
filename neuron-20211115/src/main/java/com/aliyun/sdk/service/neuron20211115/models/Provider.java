// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link Provider} extends {@link TeaModel}
 *
 * <p>Provider</p>
 */
public class Provider extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("company")
    private String company;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("team")
    private String team;

    @com.aliyun.core.annotation.NameInMap("teamId")
    private Long teamId;

    private Provider(Builder builder) {
        this.company = builder.company;
        this.companyId = builder.companyId;
        this.contact = builder.contact;
        this.email = builder.email;
        this.team = builder.team;
        this.teamId = builder.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Provider create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return team
     */
    public String getTeam() {
        return this.team;
    }

    /**
     * @return teamId
     */
    public Long getTeamId() {
        return this.teamId;
    }

    public static final class Builder {
        private String company; 
        private Long companyId; 
        private String contact; 
        private String email; 
        private String team; 
        private Long teamId; 

        private Builder() {
        } 

        private Builder(Provider model) {
            this.company = model.company;
            this.companyId = model.companyId;
            this.contact = model.contact;
            this.email = model.email;
            this.team = model.team;
            this.teamId = model.teamId;
        } 

        /**
         * company.
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * contact.
         */
        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * team.
         */
        public Builder team(String team) {
            this.team = team;
            return this;
        }

        /**
         * teamId.
         */
        public Builder teamId(Long teamId) {
            this.teamId = teamId;
            return this;
        }

        public Provider build() {
            return new Provider(this);
        } 

    } 

}

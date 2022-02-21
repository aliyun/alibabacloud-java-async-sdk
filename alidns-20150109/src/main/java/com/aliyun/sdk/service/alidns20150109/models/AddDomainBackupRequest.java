// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainBackupRequest} extends {@link RequestModel}
 *
 * <p>AddDomainBackupRequest</p>
 */
public class AddDomainBackupRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PeriodType")
    @Validation(required = true)
    private String periodType;

    private AddDomainBackupRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.periodType = builder.periodType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainBackupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    public static final class Builder extends Request.Builder<AddDomainBackupRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String periodType; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainBackupRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.lang = response.lang;
            this.periodType = response.periodType;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PeriodType.
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        @Override
        public AddDomainBackupRequest build() {
            return new AddDomainBackupRequest(this);
        } 

    } 

}

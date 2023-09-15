// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckDomainRequest</p>
 */
public class CheckDomainRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FeeCommand")
    private String feeCommand;

    @Query
    @NameInMap("FeeCurrency")
    private String feeCurrency;

    @Query
    @NameInMap("FeePeriod")
    private Integer feePeriod;

    @Query
    @NameInMap("Lang")
    private String lang;

    private CheckDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.feeCommand = builder.feeCommand;
        this.feeCurrency = builder.feeCurrency;
        this.feePeriod = builder.feePeriod;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainRequest create() {
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
     * @return feeCommand
     */
    public String getFeeCommand() {
        return this.feeCommand;
    }

    /**
     * @return feeCurrency
     */
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

    /**
     * @return feePeriod
     */
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CheckDomainRequest, Builder> {
        private String domainName; 
        private String feeCommand; 
        private String feeCurrency; 
        private Integer feePeriod; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CheckDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.feeCommand = request.feeCommand;
            this.feeCurrency = request.feeCurrency;
            this.feePeriod = request.feePeriod;
            this.lang = request.lang;
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
         * FeeCommand.
         */
        public Builder feeCommand(String feeCommand) {
            this.putQueryParameter("FeeCommand", feeCommand);
            this.feeCommand = feeCommand;
            return this;
        }

        /**
         * FeeCurrency.
         */
        public Builder feeCurrency(String feeCurrency) {
            this.putQueryParameter("FeeCurrency", feeCurrency);
            this.feeCurrency = feeCurrency;
            return this;
        }

        /**
         * FeePeriod.
         */
        public Builder feePeriod(Integer feePeriod) {
            this.putQueryParameter("FeePeriod", feePeriod);
            this.feePeriod = feePeriod;
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

        @Override
        public CheckDomainRequest build() {
            return new CheckDomainRequest(this);
        } 

    } 

}

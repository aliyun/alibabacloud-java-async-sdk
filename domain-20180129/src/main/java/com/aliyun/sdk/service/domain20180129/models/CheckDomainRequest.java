// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link CheckDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckDomainRequest</p>
 */
public class CheckDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeeCommand")
    private String feeCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeeCurrency")
    private String feeCurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeePeriod")
    private Integer feePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * <p>Domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test**.xin</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Operation command. Valid values:  </p>
         * <ul>
         * <li><strong>create</strong>: Purchase.  </li>
         * <li><strong>renew</strong>: Renewal.  </li>
         * <li><strong>transfer</strong>: Transfer-in.  </li>
         * <li><strong>restore</strong>: Redeem.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>create</p>
         */
        public Builder feeCommand(String feeCommand) {
            this.putQueryParameter("FeeCommand", feeCommand);
            this.feeCommand = feeCommand;
            return this;
        }

        /**
         * <p>Currency type. Valid value: <strong>USD</strong> (US Dollar).</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        public Builder feeCurrency(String feeCurrency) {
            this.putQueryParameter("FeeCurrency", feeCurrency);
            this.feeCurrency = feeCurrency;
            return this;
        }

        /**
         * <p>Registration period in years. Unit: <strong>year</strong>. Valid range: <strong>1</strong> to <strong>10</strong> years.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder feePeriod(Integer feePeriod) {
            this.putQueryParameter("FeePeriod", feePeriod);
            this.feePeriod = feePeriod;
            return this;
        }

        /**
         * <p>Language of error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
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

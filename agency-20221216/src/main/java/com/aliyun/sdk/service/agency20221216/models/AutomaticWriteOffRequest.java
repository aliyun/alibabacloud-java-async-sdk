// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link AutomaticWriteOffRequest} extends {@link RequestModel}
 *
 * <p>AutomaticWriteOffRequest</p>
 */
public class AutomaticWriteOffRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutomaticWriteOffAmount")
    private Long automaticWriteOffAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutomaticWriteOffEnabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean automaticWriteOffEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private AutomaticWriteOffRequest(Builder builder) {
        super(builder);
        this.automaticWriteOffAmount = builder.automaticWriteOffAmount;
        this.automaticWriteOffEnabled = builder.automaticWriteOffEnabled;
        this.customerUid = builder.customerUid;
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutomaticWriteOffRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return automaticWriteOffAmount
     */
    public Long getAutomaticWriteOffAmount() {
        return this.automaticWriteOffAmount;
    }

    /**
     * @return automaticWriteOffEnabled
     */
    public Boolean getAutomaticWriteOffEnabled() {
        return this.automaticWriteOffEnabled;
    }

    /**
     * @return customerUid
     */
    public Long getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<AutomaticWriteOffRequest, Builder> {
        private Long automaticWriteOffAmount; 
        private Boolean automaticWriteOffEnabled; 
        private Long customerUid; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(AutomaticWriteOffRequest request) {
            super(request);
            this.automaticWriteOffAmount = request.automaticWriteOffAmount;
            this.automaticWriteOffEnabled = request.automaticWriteOffEnabled;
            this.customerUid = request.customerUid;
            this.language = request.language;
        } 

        /**
         * AutomaticWriteOffAmount.
         */
        public Builder automaticWriteOffAmount(Long automaticWriteOffAmount) {
            this.putQueryParameter("AutomaticWriteOffAmount", automaticWriteOffAmount);
            this.automaticWriteOffAmount = automaticWriteOffAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder automaticWriteOffEnabled(Boolean automaticWriteOffEnabled) {
            this.putQueryParameter("AutomaticWriteOffEnabled", automaticWriteOffEnabled);
            this.automaticWriteOffEnabled = automaticWriteOffEnabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder customerUid(Long customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public AutomaticWriteOffRequest build() {
            return new AutomaticWriteOffRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmRecoveryPlanAvailableConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmRecoveryPlanAvailableConfigRequest</p>
 */
public class DescribeGtmRecoveryPlanAvailableConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeGtmRecoveryPlanAvailableConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmRecoveryPlanAvailableConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeGtmRecoveryPlanAvailableConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmRecoveryPlanAvailableConfigRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * <p>The language in which the returned results are displayed. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
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
        public DescribeGtmRecoveryPlanAvailableConfigRequest build() {
            return new DescribeGtmRecoveryPlanAvailableConfigRequest(this);
        } 

    } 

}

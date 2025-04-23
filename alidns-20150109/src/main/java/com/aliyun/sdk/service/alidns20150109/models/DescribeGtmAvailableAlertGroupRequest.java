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
 * {@link DescribeGtmAvailableAlertGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmAvailableAlertGroupRequest</p>
 */
public class DescribeGtmAvailableAlertGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeGtmAvailableAlertGroupRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmAvailableAlertGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeGtmAvailableAlertGroupRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmAvailableAlertGroupRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * <p>The language used by the user.</p>
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
        public DescribeGtmAvailableAlertGroupRequest build() {
            return new DescribeGtmAvailableAlertGroupRequest(this);
        } 

    } 

}

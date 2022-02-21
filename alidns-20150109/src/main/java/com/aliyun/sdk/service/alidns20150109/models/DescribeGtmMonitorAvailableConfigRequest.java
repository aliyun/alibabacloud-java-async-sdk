// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmMonitorAvailableConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmMonitorAvailableConfigRequest</p>
 */
public class DescribeGtmMonitorAvailableConfigRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeGtmMonitorAvailableConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmMonitorAvailableConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeGtmMonitorAvailableConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmMonitorAvailableConfigRequest response) {
            super(response);
            this.lang = response.lang;
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
        public DescribeGtmMonitorAvailableConfigRequest build() {
            return new DescribeGtmMonitorAvailableConfigRequest(this);
        } 

    } 

}

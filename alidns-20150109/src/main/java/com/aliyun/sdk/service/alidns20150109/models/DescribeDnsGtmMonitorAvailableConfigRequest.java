// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmMonitorAvailableConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmMonitorAvailableConfigRequest</p>
 */
public class DescribeDnsGtmMonitorAvailableConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeDnsGtmMonitorAvailableConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmMonitorAvailableConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDnsGtmMonitorAvailableConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmMonitorAvailableConfigRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDnsGtmMonitorAvailableConfigRequest build() {
            return new DescribeDnsGtmMonitorAvailableConfigRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WafQuotaString} extends {@link TeaModel}
 *
 * <p>WafQuotaString</p>
 */
public class WafQuotaString extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regexp")
    private String regexp;

    private WafQuotaString(Builder builder) {
        this.regexp = builder.regexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafQuotaString create() {
        return builder().build();
    }

    /**
     * @return regexp
     */
    public String getRegexp() {
        return this.regexp;
    }

    public static final class Builder {
        private String regexp; 

        /**
         * Regexp.
         */
        public Builder regexp(String regexp) {
            this.regexp = regexp;
            return this;
        }

        public WafQuotaString build() {
            return new WafQuotaString(this);
        } 

    } 

}

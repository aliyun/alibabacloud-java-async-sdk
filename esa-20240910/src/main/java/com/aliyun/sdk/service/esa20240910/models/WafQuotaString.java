// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regexp
     */
    public String getRegexp() {
        return this.regexp;
    }

    public static final class Builder {
        private String regexp; 

        private Builder() {
        } 

        private Builder(WafQuotaString model) {
            this.regexp = model.regexp;
        } 

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

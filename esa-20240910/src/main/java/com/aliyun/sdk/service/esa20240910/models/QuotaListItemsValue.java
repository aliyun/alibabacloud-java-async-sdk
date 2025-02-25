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
 * {@link QuotaListItemsValue} extends {@link TeaModel}
 *
 * <p>QuotaListItemsValue</p>
 */
public class QuotaListItemsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Value")
    private WafQuotaString value;

    private QuotaListItemsValue(Builder builder) {
        this.enable = builder.enable;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaListItemsValue create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return value
     */
    public WafQuotaString getValue() {
        return this.value;
    }

    public static final class Builder {
        private Boolean enable; 
        private WafQuotaString value; 

        /**
         * <p>The switch for the type of item in the custom list.</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Format restrictions for the type of item in the custom list.</p>
         */
        public Builder value(WafQuotaString value) {
            this.value = value;
            return this;
        }

        public QuotaListItemsValue build() {
            return new QuotaListItemsValue(this);
        } 

    } 

}

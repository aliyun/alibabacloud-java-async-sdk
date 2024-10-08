// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuotaPageContentTypesValue} extends {@link TeaModel}
 *
 * <p>QuotaPageContentTypesValue</p>
 */
public class QuotaPageContentTypesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("ContentLength")
    private WafQuotaInteger contentLength;

    private QuotaPageContentTypesValue(Builder builder) {
        this.enable = builder.enable;
        this.contentLength = builder.contentLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaPageContentTypesValue create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return contentLength
     */
    public WafQuotaInteger getContentLength() {
        return this.contentLength;
    }

    public static final class Builder {
        private Boolean enable; 
        private WafQuotaInteger contentLength; 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * ContentLength.
         */
        public Builder contentLength(WafQuotaInteger contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        public QuotaPageContentTypesValue build() {
            return new QuotaPageContentTypesValue(this);
        } 

    } 

}

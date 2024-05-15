// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostpayTrafficTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribePostpayTrafficTotalRequest</p>
 */
public class DescribePostpayTrafficTotalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribePostpayTrafficTotalRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficTotalRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePostpayTrafficTotalRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribePostpayTrafficTotalRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribePostpayTrafficTotalRequest build() {
            return new DescribePostpayTrafficTotalRequest(this);
        } 

    } 

}

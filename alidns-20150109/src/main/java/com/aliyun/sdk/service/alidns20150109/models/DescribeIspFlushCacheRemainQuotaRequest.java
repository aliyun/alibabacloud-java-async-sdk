// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIspFlushCacheRemainQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribeIspFlushCacheRemainQuotaRequest</p>
 */
public class DescribeIspFlushCacheRemainQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeIspFlushCacheRemainQuotaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspFlushCacheRemainQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeIspFlushCacheRemainQuotaRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIspFlushCacheRemainQuotaRequest request) {
            super(request);
            this.lang = request.lang;
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
        public DescribeIspFlushCacheRemainQuotaRequest build() {
            return new DescribeIspFlushCacheRemainQuotaRequest(this);
        } 

    } 

}

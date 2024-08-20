// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnBlockedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnBlockedRegionsRequest</p>
 */
public class DescribeDcdnBlockedRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    private DescribeDcdnBlockedRegionsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnBlockedRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnBlockedRegionsRequest, Builder> {
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnBlockedRegionsRequest request) {
            super(request);
            this.language = request.language;
        } 

        /**
         * The language. Valid values: zh, en, and jp.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public DescribeDcdnBlockedRegionsRequest build() {
            return new DescribeDcdnBlockedRegionsRequest(this);
        } 

    } 

}

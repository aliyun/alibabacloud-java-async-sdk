// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafGeoInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafGeoInfoRequest</p>
 */
public class DescribeDcdnWafGeoInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    private DescribeDcdnWafGeoInfoRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafGeoInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafGeoInfoRequest, Builder> {
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafGeoInfoRequest request) {
            super(request);
            this.language = request.language;
        } 

        /**
         * The language of the information to return. Valid values:
         * <p>
         * 
         * *   cn: Chinese
         * *   en: English
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public DescribeDcdnWafGeoInfoRequest build() {
            return new DescribeDcdnWafGeoInfoRequest(this);
        } 

    } 

}

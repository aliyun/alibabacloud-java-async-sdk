// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnAclFieldsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnAclFieldsRequest</p>
 */
public class DescribeDcdnAclFieldsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    private DescribeDcdnAclFieldsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnAclFieldsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnAclFieldsRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnAclFieldsRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * <p>The access language. Default value: en. Valid values:</p>
         * <ul>
         * <li><strong>en</strong>: English</li>
         * <li><strong>zh</strong>: Chinese</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDcdnAclFieldsRequest build() {
            return new DescribeDcdnAclFieldsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotAuthRequest} extends {@link RequestModel}
 *
 * <p>DescribeHoneyPotAuthRequest</p>
 */
public class DescribeHoneyPotAuthRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeHoneyPotAuthRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotAuthRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHoneyPotAuthRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHoneyPotAuthRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeHoneyPotAuthRequest build() {
            return new DescribeHoneyPotAuthRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiListRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiListRequest</p>
 */
public class DescribeApiListRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeApiListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApiListRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiListRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeApiListRequest build() {
            return new DescribeApiListRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllGroupsRequest</p>
 */
public class DescribeAllGroupsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeAllGroupsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAllGroupsRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAllGroupsRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the request and the response. Default value: **zh**. Valid values:
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
        public DescribeAllGroupsRequest build() {
            return new DescribeAllGroupsRequest(this);
        } 

    } 

}

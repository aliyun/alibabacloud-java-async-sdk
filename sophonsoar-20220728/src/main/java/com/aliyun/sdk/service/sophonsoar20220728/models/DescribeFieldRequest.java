// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldRequest} extends {@link RequestModel}
 *
 * <p>DescribeFieldRequest</p>
 */
public class DescribeFieldRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("QueryKey")
    @Validation(required = true)
    private String queryKey;

    private DescribeFieldRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.queryKey = builder.queryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldRequest create() {
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

    /**
     * @return queryKey
     */
    public String getQueryKey() {
        return this.queryKey;
    }

    public static final class Builder extends Request.Builder<DescribeFieldRequest, Builder> {
        private String lang; 
        private String queryKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFieldRequest request) {
            super(request);
            this.lang = request.lang;
            this.queryKey = request.queryKey;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * QueryKey.
         */
        public Builder queryKey(String queryKey) {
            this.putQueryParameter("QueryKey", queryKey);
            this.queryKey = queryKey;
            return this;
        }

        @Override
        public DescribeFieldRequest build() {
            return new DescribeFieldRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldRequest} extends {@link RequestModel}
 *
 * <p>DescribeFieldRequest</p>
 */
public class DescribeFieldRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryKey")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The language of the content within the request and response. Valid values:
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

        /**
         * The key of the global configuration. Valid values:
         * <p>
         * 
         * *   **soar_filed_tags**: queries the input template of the playbook.
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

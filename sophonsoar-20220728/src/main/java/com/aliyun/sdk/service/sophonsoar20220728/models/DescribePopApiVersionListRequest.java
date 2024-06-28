// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiVersionListRequest} extends {@link RequestModel}
 *
 * <p>DescribePopApiVersionListRequest</p>
 */
public class DescribePopApiVersionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PopCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String popCode;

    private DescribePopApiVersionListRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.lang = builder.lang;
        this.popCode = builder.popCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiVersionListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return popCode
     */
    public String getPopCode() {
        return this.popCode;
    }

    public static final class Builder extends Request.Builder<DescribePopApiVersionListRequest, Builder> {
        private String env; 
        private String lang; 
        private String popCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePopApiVersionListRequest request) {
            super(request);
            this.env = request.env;
            this.lang = request.lang;
            this.popCode = request.popCode;
        } 

        /**
         * The environment in which the API operation parameters are used. Set the value to **online**.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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

        /**
         * The POP code of the Alibaba Cloud service.
         * <p>
         * 
         * >  You can call the [DescribeApiList](~~DescribeApiList~~) operation to query the POP code.
         */
        public Builder popCode(String popCode) {
            this.putQueryParameter("PopCode", popCode);
            this.popCode = popCode;
            return this;
        }

        @Override
        public DescribePopApiVersionListRequest build() {
            return new DescribePopApiVersionListRequest(this);
        } 

    } 

}

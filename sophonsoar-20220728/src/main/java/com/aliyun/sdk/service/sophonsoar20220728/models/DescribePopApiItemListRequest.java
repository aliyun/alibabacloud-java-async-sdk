// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePopApiItemListRequest} extends {@link RequestModel}
 *
 * <p>DescribePopApiItemListRequest</p>
 */
public class DescribePopApiItemListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

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

    private DescribePopApiItemListRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.apiVersion = builder.apiVersion;
        this.env = builder.env;
        this.lang = builder.lang;
        this.popCode = builder.popCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
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

    public static final class Builder extends Request.Builder<DescribePopApiItemListRequest, Builder> {
        private String apiName; 
        private String apiVersion; 
        private String env; 
        private String lang; 
        private String popCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePopApiItemListRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.apiVersion = request.apiVersion;
            this.env = request.env;
            this.lang = request.lang;
            this.popCode = request.popCode;
        } 

        /**
         * <p>The API operation name of the Alibaba Cloud service. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribePopApiItemList</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>The version number of the API.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePopApiVersionList~~">DescribePopApiVersionList</a> operation to query the version number.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-03</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The environment in which the API operation parameters are used. Set the value to online.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The POP code of the Alibaba Cloud service.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeApiList~~">DescribeApiList</a> operation to query the POP code.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sas</p>
         */
        public Builder popCode(String popCode) {
            this.putQueryParameter("PopCode", popCode);
            this.popCode = popCode;
            return this;
        }

        @Override
        public DescribePopApiItemListRequest build() {
            return new DescribePopApiItemListRequest(this);
        } 

    } 

}

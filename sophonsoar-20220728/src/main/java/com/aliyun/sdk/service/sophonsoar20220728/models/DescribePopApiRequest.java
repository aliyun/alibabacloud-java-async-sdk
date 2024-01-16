// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiRequest} extends {@link RequestModel}
 *
 * <p>DescribePopApiRequest</p>
 */
public class DescribePopApiRequest extends Request {
    @Query
    @NameInMap("ApiName")
    @Validation(required = true)
    private String apiName;

    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("Env")
    @Validation(required = true)
    private String env;

    @Query
    @NameInMap("PopCode")
    @Validation(required = true)
    private String popCode;

    private DescribePopApiRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.apiVersion = builder.apiVersion;
        this.env = builder.env;
        this.popCode = builder.popCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiRequest create() {
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
     * @return popCode
     */
    public String getPopCode() {
        return this.popCode;
    }

    public static final class Builder extends Request.Builder<DescribePopApiRequest, Builder> {
        private String apiName; 
        private String apiVersion; 
        private String env; 
        private String popCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePopApiRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.apiVersion = request.apiVersion;
            this.env = request.env;
            this.popCode = request.popCode;
        } 

        /**
         * The operation name of the Alibaba Cloud service.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The version number of the API.
         * <p>
         * 
         * >  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the version number.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * The environment in which the API operation parameter is used. Set the value to online.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
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
        public DescribePopApiRequest build() {
            return new DescribePopApiRequest(this);
        } 

    } 

}

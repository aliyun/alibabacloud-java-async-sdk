// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOpenApiInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeOpenApiInfoRequest</p>
 */
public class DescribeOpenApiInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PopCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String popCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private DescribeOpenApiInfoRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.apiVersion = builder.apiVersion;
        this.lang = builder.lang;
        this.popCode = builder.popCode;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiInfoRequest create() {
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

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeOpenApiInfoRequest, Builder> {
        private String apiName; 
        private String apiVersion; 
        private String lang; 
        private String popCode; 
        private Long roleFor; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOpenApiInfoRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.apiVersion = request.apiVersion;
            this.lang = request.lang;
            this.popCode = request.popCode;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
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

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeOpenApiInfoRequest build() {
            return new DescribeOpenApiInfoRequest(this);
        } 

    } 

}

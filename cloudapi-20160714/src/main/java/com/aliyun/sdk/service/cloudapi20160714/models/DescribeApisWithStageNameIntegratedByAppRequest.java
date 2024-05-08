// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisWithStageNameIntegratedByAppRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisWithStageNameIntegratedByAppRequest</p>
 */
public class DescribeApisWithStageNameIntegratedByAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiUid")
    private String apiUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeApisWithStageNameIntegratedByAppRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.apiUid = builder.apiUid;
        this.appId = builder.appId;
        this.description = builder.description;
        this.method = builder.method;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisWithStageNameIntegratedByAppRequest create() {
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
     * @return apiUid
     */
    public String getApiUid() {
        return this.apiUid;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeApisWithStageNameIntegratedByAppRequest, Builder> {
        private String apiName; 
        private String apiUid; 
        private Long appId; 
        private String description; 
        private String method; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisWithStageNameIntegratedByAppRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.apiUid = request.apiUid;
            this.appId = request.appId;
            this.description = request.description;
            this.method = request.method;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.securityToken = request.securityToken;
        } 

        /**
         * The API name.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The API ID.
         */
        public Builder apiUid(String apiUid) {
            this.putQueryParameter("ApiUid", apiUid);
            this.apiUid = apiUid;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The API description. The description can be up to 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The request HTTP method of the API.
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * The page number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request path of the API.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeApisWithStageNameIntegratedByAppRequest build() {
            return new DescribeApisWithStageNameIntegratedByAppRequest(this);
        } 

    } 

}

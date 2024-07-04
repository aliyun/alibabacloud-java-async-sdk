// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizationsRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizationsRequest</p>
 */
public class ListAuthorizationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizationId")
    private String authorizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListAuthorizationsRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
        this.authorizationType = builder.authorizationType;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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

    public static final class Builder extends Request.Builder<ListAuthorizationsRequest, Builder> {
        private String authorizationId; 
        private String authorizationType; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizationsRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
            this.authorizationType = request.authorizationType;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * authorizationId.
         */
        public Builder authorizationId(String authorizationId) {
            this.putQueryParameter("authorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * authorizationType.
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("authorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAuthorizationsRequest build() {
            return new ListAuthorizationsRequest(this);
        } 

    } 

}

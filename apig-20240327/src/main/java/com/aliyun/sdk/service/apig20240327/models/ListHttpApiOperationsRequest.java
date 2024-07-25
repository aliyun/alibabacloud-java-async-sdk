// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHttpApiOperationsRequest} extends {@link RequestModel}
 *
 * <p>ListHttpApiOperationsRequest</p>
 */
public class ListHttpApiOperationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pathLike")
    private String pathLike;

    private ListHttpApiOperationsRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.method = builder.method;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pathLike = builder.pathLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpApiOperationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
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
     * @return pathLike
     */
    public String getPathLike() {
        return this.pathLike;
    }

    public static final class Builder extends Request.Builder<ListHttpApiOperationsRequest, Builder> {
        private String httpApiId; 
        private String method; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pathLike; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApiOperationsRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.method = request.method;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pathLike = request.pathLike;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.putQueryParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
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

        /**
         * pathLike.
         */
        public Builder pathLike(String pathLike) {
            this.putQueryParameter("pathLike", pathLike);
            this.pathLike = pathLike;
            return this;
        }

        @Override
        public ListHttpApiOperationsRequest build() {
            return new ListHttpApiOperationsRequest(this);
        } 

    } 

}

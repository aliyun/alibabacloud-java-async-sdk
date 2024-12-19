// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryMovieCommentsRequest} extends {@link RequestModel}
 *
 * <p>QueryMovieCommentsRequest</p>
 */
public class QueryMovieCommentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MovieId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long movieId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    private QueryMovieCommentsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extJson = builder.extJson;
        this.movieId = builder.movieId;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieCommentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return movieId
     */
    public Long getMovieId() {
        return this.movieId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<QueryMovieCommentsRequest, Builder> {
        private String bizId; 
        private String extJson; 
        private Long movieId; 
        private Long pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryMovieCommentsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extJson = request.extJson;
            this.movieId = request.movieId;
            this.pageNumber = request.pageNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder movieId(Long movieId) {
            this.putQueryParameter("MovieId", movieId);
            this.movieId = movieId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public QueryMovieCommentsRequest build() {
            return new QueryMovieCommentsRequest(this);
        } 

    } 

}

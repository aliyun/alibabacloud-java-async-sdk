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
 * {@link QueryMovieSchedulesRequest} extends {@link RequestModel}
 *
 * <p>QueryMovieSchedulesRequest</p>
 */
public class QueryMovieSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CinemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cinemaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    private QueryMovieSchedulesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.cinemaId = builder.cinemaId;
        this.extJson = builder.extJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieSchedulesRequest create() {
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
     * @return cinemaId
     */
    public Long getCinemaId() {
        return this.cinemaId;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    public static final class Builder extends Request.Builder<QueryMovieSchedulesRequest, Builder> {
        private String bizId; 
        private Long cinemaId; 
        private String extJson; 

        private Builder() {
            super();
        } 

        private Builder(QueryMovieSchedulesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.cinemaId = request.cinemaId;
            this.extJson = request.extJson;
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
         * <p>This parameter is required.</p>
         */
        public Builder cinemaId(Long cinemaId) {
            this.putQueryParameter("CinemaId", cinemaId);
            this.cinemaId = cinemaId;
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

        @Override
        public QueryMovieSchedulesRequest build() {
            return new QueryMovieSchedulesRequest(this);
        } 

    } 

}

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
 * {@link QueryUpcomingMoviesRequest} extends {@link RequestModel}
 *
 * <p>QueryUpcomingMoviesRequest</p>
 */
public class QueryUpcomingMoviesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private java.util.Map<String, ?> extJson;

    private QueryUpcomingMoviesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.cityCode = builder.cityCode;
        this.extJson = builder.extJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUpcomingMoviesRequest create() {
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
     * @return cityCode
     */
    public Long getCityCode() {
        return this.cityCode;
    }

    /**
     * @return extJson
     */
    public java.util.Map<String, ?> getExtJson() {
        return this.extJson;
    }

    public static final class Builder extends Request.Builder<QueryUpcomingMoviesRequest, Builder> {
        private String bizId; 
        private Long cityCode; 
        private java.util.Map<String, ?> extJson; 

        private Builder() {
            super();
        } 

        private Builder(QueryUpcomingMoviesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.cityCode = request.cityCode;
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
         * 
         * <strong>example:</strong>
         * <p>110100</p>
         */
        public Builder cityCode(Long cityCode) {
            this.putQueryParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(java.util.Map<String, ?> extJson) {
            String extJsonShrink = shrink(extJson, "ExtJson", "json");
            this.putQueryParameter("ExtJson", extJsonShrink);
            this.extJson = extJson;
            return this;
        }

        @Override
        public QueryUpcomingMoviesRequest build() {
            return new QueryUpcomingMoviesRequest(this);
        } 

    } 

}

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
 * {@link QueryMovieSeatsRequest} extends {@link RequestModel}
 *
 * <p>QueryMovieSeatsRequest</p>
 */
public class QueryMovieSeatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scheduleId;

    private QueryMovieSeatsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extJson = builder.extJson;
        this.scheduleId = builder.scheduleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieSeatsRequest create() {
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
     * @return scheduleId
     */
    public Long getScheduleId() {
        return this.scheduleId;
    }

    public static final class Builder extends Request.Builder<QueryMovieSeatsRequest, Builder> {
        private String bizId; 
        private String extJson; 
        private Long scheduleId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMovieSeatsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extJson = request.extJson;
            this.scheduleId = request.scheduleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******004</p>
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
         * <p>9******5</p>
         */
        public Builder scheduleId(Long scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        @Override
        public QueryMovieSeatsRequest build() {
            return new QueryMovieSeatsRequest(this);
        } 

    } 

}

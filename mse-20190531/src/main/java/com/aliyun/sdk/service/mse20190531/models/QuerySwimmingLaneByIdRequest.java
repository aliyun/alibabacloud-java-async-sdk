// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySwimmingLaneByIdRequest} extends {@link RequestModel}
 *
 * <p>QuerySwimmingLaneByIdRequest</p>
 */
public class QuerySwimmingLaneByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long laneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    private QuerySwimmingLaneByIdRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.laneId = builder.laneId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySwimmingLaneByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<QuerySwimmingLaneByIdRequest, Builder> {
        private String acceptLanguage; 
        private Long laneId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(QuerySwimmingLaneByIdRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.laneId = request.laneId;
            this.namespace = request.namespace;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the lane.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * The name of the Microservices Engine (MSE) namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public QuerySwimmingLaneByIdRequest build() {
            return new QuerySwimmingLaneByIdRequest(this);
        } 

    } 

}

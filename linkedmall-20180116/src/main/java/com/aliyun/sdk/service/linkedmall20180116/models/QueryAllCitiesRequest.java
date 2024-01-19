// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllCitiesRequest} extends {@link RequestModel}
 *
 * <p>QueryAllCitiesRequest</p>
 */
public class QueryAllCitiesRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ExtJson")
    private java.util.Map < String, ? > extJson;

    private QueryAllCitiesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extJson = builder.extJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllCitiesRequest create() {
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
    public java.util.Map < String, ? > getExtJson() {
        return this.extJson;
    }

    public static final class Builder extends Request.Builder<QueryAllCitiesRequest, Builder> {
        private String bizId; 
        private java.util.Map < String, ? > extJson; 

        private Builder() {
            super();
        } 

        private Builder(QueryAllCitiesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extJson = request.extJson;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(java.util.Map < String, ? > extJson) {
            String extJsonShrink = shrink(extJson, "ExtJson", "json");
            this.putQueryParameter("ExtJson", extJsonShrink);
            this.extJson = extJson;
            return this;
        }

        @Override
        public QueryAllCitiesRequest build() {
            return new QueryAllCitiesRequest(this);
        } 

    } 

}

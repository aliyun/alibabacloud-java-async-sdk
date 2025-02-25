// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEcoRelationRequest} extends {@link RequestModel}
 *
 * <p>QueryEcoRelationRequest</p>
 */
public class QueryEcoRelationRequest extends Request {
    @Body
    @NameInMap("RelationTime")
    private String relationTime;

    @Body
    @NameInMap("Uid")
    private Long uid;

    private QueryEcoRelationRequest(Builder builder) {
        super(builder);
        this.relationTime = builder.relationTime;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEcoRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationTime
     */
    public String getRelationTime() {
        return this.relationTime;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<QueryEcoRelationRequest, Builder> {
        private String relationTime; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(QueryEcoRelationRequest request) {
            super(request);
            this.relationTime = request.relationTime;
            this.uid = request.uid;
        } 

        /**
         * RelationTime.
         */
        public Builder relationTime(String relationTime) {
            this.putBodyParameter("RelationTime", relationTime);
            this.relationTime = relationTime;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public QueryEcoRelationRequest build() {
            return new QueryEcoRelationRequest(this);
        } 

    } 

}

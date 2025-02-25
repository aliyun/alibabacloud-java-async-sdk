// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelationRequest} extends {@link RequestModel}
 *
 * <p>GetRelationRequest</p>
 */
public class GetRelationRequest extends Request {
    @Query
    @NameInMap("RelationTime")
    @Validation(maximum = 9999956549000D)
    private Long relationTime;

    @Query
    @NameInMap("Uid")
    @Validation()
    private Long uid;

    private GetRelationRequest(Builder builder) {
        super(builder);
        this.relationTime = builder.relationTime;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationTime
     */
    public Long getRelationTime() {
        return this.relationTime;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetRelationRequest, Builder> {
        private Long relationTime; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetRelationRequest request) {
            super(request);
            this.relationTime = request.relationTime;
            this.uid = request.uid;
        } 

        /**
         * RelationTime.
         */
        public Builder relationTime(Long relationTime) {
            this.putQueryParameter("RelationTime", relationTime);
            this.relationTime = relationTime;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetRelationRequest build() {
            return new GetRelationRequest(this);
        } 

    } 

}

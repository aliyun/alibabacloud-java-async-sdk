// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>GetAccountRelationRequest</p>
 */
public class GetAccountRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationId")
    private Long relationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountRelationRequest(Builder builder) {
        super(builder);
        this.relationId = builder.relationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationId
     */
    public Long getRelationId() {
        return this.relationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<GetAccountRelationRequest, Builder> {
        private Long relationId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountRelationRequest request) {
            super(request);
            this.relationId = request.relationId;
            this.requestId = request.requestId;
        } 

        /**
         * The ID of the financial relationship. Value returned by calling the AddAccountRelation operation.
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        /**
         * The unique ID of the request. The ID is used to mark a request and troubleshoot a problem.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public GetAccountRelationRequest build() {
            return new GetAccountRelationRequest(this);
        } 

    } 

}

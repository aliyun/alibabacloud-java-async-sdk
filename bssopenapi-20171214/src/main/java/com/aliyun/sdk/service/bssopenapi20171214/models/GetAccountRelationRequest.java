// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
         * <p>The account linking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        /**
         * <p>The unique request ID, used to identify the request and facilitate troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
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

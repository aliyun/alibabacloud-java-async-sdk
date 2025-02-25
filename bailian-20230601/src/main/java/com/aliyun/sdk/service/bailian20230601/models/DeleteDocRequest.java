// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDocRequest} extends {@link RequestModel}
 *
 * <p>DeleteDocRequest</p>
 */
public class DeleteDocRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DocId")
    @Validation(required = true)
    private String docId;

    private DeleteDocRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.docId = builder.docId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    public static final class Builder extends Request.Builder<DeleteDocRequest, Builder> {
        private String agentKey; 
        private String docId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDocRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.docId = request.docId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DocId.
         */
        public Builder docId(String docId) {
            this.putQueryParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        @Override
        public DeleteDocRequest build() {
            return new DeleteDocRequest(this);
        } 

    } 

}

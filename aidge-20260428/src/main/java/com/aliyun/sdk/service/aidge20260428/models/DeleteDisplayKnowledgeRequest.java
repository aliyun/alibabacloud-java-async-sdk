// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link DeleteDisplayKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>DeleteDisplayKnowledgeRequest</p>
 */
public class DeleteDisplayKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ragId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> recordIds;

    private DeleteDisplayKnowledgeRequest(Builder builder) {
        super(builder);
        this.ragId = builder.ragId;
        this.recordIds = builder.recordIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDisplayKnowledgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ragId
     */
    public String getRagId() {
        return this.ragId;
    }

    /**
     * @return recordIds
     */
    public java.util.List<Long> getRecordIds() {
        return this.recordIds;
    }

    public static final class Builder extends Request.Builder<DeleteDisplayKnowledgeRequest, Builder> {
        private String ragId; 
        private java.util.List<Long> recordIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDisplayKnowledgeRequest request) {
            super(request);
            this.ragId = request.ragId;
            this.recordIds = request.recordIds;
        } 

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_x x x</p>
         */
        public Builder ragId(String ragId) {
            this.putQueryParameter("RagId", ragId);
            this.ragId = ragId;
            return this;
        }

        /**
         * <p>The IDs of the records to delete. You can specify up to 500 record IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordIds(java.util.List<Long> recordIds) {
            String recordIdsShrink = shrink(recordIds, "RecordIds", "json");
            this.putQueryParameter("RecordIds", recordIdsShrink);
            this.recordIds = recordIds;
            return this;
        }

        @Override
        public DeleteDisplayKnowledgeRequest build() {
            return new DeleteDisplayKnowledgeRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteRecordRequest</p>
 */
public class DeleteRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    private DeleteRecordRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DeleteRecordRequest, Builder> {
        private Long recordId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRecordRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * <p>The record ID, which can be obtained by calling <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DeleteRecordRequest build() {
            return new DeleteRecordRequest(this);
        } 

    } 

}

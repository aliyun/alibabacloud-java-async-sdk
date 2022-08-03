// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInvalidCloudAccountRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteInvalidCloudAccountRecordRequest</p>
 */
public class DeleteInvalidCloudAccountRecordRequest extends Request {
    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    private DeleteInvalidCloudAccountRecordRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInvalidCloudAccountRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DeleteInvalidCloudAccountRecordRequest, Builder> {
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInvalidCloudAccountRecordRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DeleteInvalidCloudAccountRecordRequest build() {
            return new DeleteInvalidCloudAccountRecordRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateMmsFetchMetadataJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMmsFetchMetadataJobRequest</p>
 */
public class CreateMmsFetchMetadataJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    private CreateMmsFetchMetadataJobRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsFetchMetadataJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<CreateMmsFetchMetadataJobRequest, Builder> {
        private Long sourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMmsFetchMetadataJobRequest request) {
            super(request);
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000021</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public CreateMmsFetchMetadataJobRequest build() {
            return new CreateMmsFetchMetadataJobRequest(this);
        } 

    } 

}

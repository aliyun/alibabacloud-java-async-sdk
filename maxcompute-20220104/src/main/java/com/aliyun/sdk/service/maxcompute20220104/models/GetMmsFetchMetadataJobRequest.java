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
 * {@link GetMmsFetchMetadataJobRequest} extends {@link RequestModel}
 *
 * <p>GetMmsFetchMetadataJobRequest</p>
 */
public class GetMmsFetchMetadataJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanId;

    private GetMmsFetchMetadataJobRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.scanId = builder.scanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsFetchMetadataJobRequest create() {
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

    /**
     * @return scanId
     */
    public Long getScanId() {
        return this.scanId;
    }

    public static final class Builder extends Request.Builder<GetMmsFetchMetadataJobRequest, Builder> {
        private Long sourceId; 
        private Long scanId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsFetchMetadataJobRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.scanId = request.scanId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002</p>
         */
        public Builder scanId(Long scanId) {
            this.putPathParameter("scanId", scanId);
            this.scanId = scanId;
            return this;
        }

        @Override
        public GetMmsFetchMetadataJobRequest build() {
            return new GetMmsFetchMetadataJobRequest(this);
        } 

    } 

}

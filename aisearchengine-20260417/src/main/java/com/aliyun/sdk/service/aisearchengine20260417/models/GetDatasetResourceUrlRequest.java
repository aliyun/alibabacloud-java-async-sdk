// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link GetDatasetResourceUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDatasetResourceUrlRequest</p>
 */
public class GetDatasetResourceUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("primaryKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryKey;

    private GetDatasetResourceUrlRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.primaryKey = builder.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetResourceUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public Long getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public static final class Builder extends Request.Builder<GetDatasetResourceUrlRequest, Builder> {
        private Long datasetId; 
        private String primaryKey; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasetResourceUrlRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.primaryKey = request.primaryKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        public Builder datasetId(Long datasetId) {
            this.putBodyParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01KQCJBPM9JVDTXWV50G2AKXXX</p>
         */
        public Builder primaryKey(String primaryKey) {
            this.putBodyParameter("primaryKey", primaryKey);
            this.primaryKey = primaryKey;
            return this;
        }

        @Override
        public GetDatasetResourceUrlRequest build() {
            return new GetDatasetResourceUrlRequest(this);
        } 

    } 

}

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
 * {@link GetMmsTableRequest} extends {@link RequestModel}
 *
 * <p>GetMmsTableRequest</p>
 */
public class GetMmsTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tableId;

    private GetMmsTableRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.tableId = builder.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsTableRequest create() {
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
     * @return tableId
     */
    public Long getTableId() {
        return this.tableId;
    }

    public static final class Builder extends Request.Builder<GetMmsTableRequest, Builder> {
        private Long sourceId; 
        private Long tableId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsTableRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.tableId = request.tableId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12323</p>
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
         * <p>22</p>
         */
        public Builder tableId(Long tableId) {
            this.putPathParameter("tableId", tableId);
            this.tableId = tableId;
            return this;
        }

        @Override
        public GetMmsTableRequest build() {
            return new GetMmsTableRequest(this);
        } 

    } 

}

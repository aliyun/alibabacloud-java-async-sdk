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
 * {@link GetMmsDbRequest} extends {@link RequestModel}
 *
 * <p>GetMmsDbRequest</p>
 */
public class GetMmsDbRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dbId;

    private GetMmsDbRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.dbId = builder.dbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsDbRequest create() {
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
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    public static final class Builder extends Request.Builder<GetMmsDbRequest, Builder> {
        private Long sourceId; 
        private Long dbId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsDbRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.dbId = request.dbId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000017</p>
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
         * <p>1232</p>
         */
        public Builder dbId(Long dbId) {
            this.putPathParameter("dbId", dbId);
            this.dbId = dbId;
            return this;
        }

        @Override
        public GetMmsDbRequest build() {
            return new GetMmsDbRequest(this);
        } 

    } 

}

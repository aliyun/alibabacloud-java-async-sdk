// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecDataCheckGenerateReportRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckGenerateReportRequest</p>
 */
public class ExecDataCheckGenerateReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    private ExecDataCheckGenerateReportRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckGenerateReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    public static final class Builder extends Request.Builder<ExecDataCheckGenerateReportRequest, Builder> {
        private Long batchId; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckGenerateReportRequest request) {
            super(request);
            this.batchId = request.batchId;
        } 

        /**
         * <p>The batch ID returned by the ExecDataCheckSaveTask operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(Long batchId) {
            this.putQueryParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        @Override
        public ExecDataCheckGenerateReportRequest build() {
            return new ExecDataCheckGenerateReportRequest(this);
        } 

    } 

}

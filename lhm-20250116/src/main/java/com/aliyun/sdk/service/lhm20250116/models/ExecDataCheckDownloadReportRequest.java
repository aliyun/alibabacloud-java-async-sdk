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
 * {@link ExecDataCheckDownloadReportRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckDownloadReportRequest</p>
 */
public class ExecDataCheckDownloadReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    private ExecDataCheckDownloadReportRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckDownloadReportRequest create() {
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

    public static final class Builder extends Request.Builder<ExecDataCheckDownloadReportRequest, Builder> {
        private Long batchId; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckDownloadReportRequest request) {
            super(request);
            this.batchId = request.batchId;
        } 

        /**
         * <p>The batch ID. Prerequisite: the report status must be 2 (Generated).</p>
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
        public ExecDataCheckDownloadReportRequest build() {
            return new ExecDataCheckDownloadReportRequest(this);
        } 

    } 

}

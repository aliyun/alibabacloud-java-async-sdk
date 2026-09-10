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
 * {@link ExecDataCheckRunRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckRunRequest</p>
 */
public class ExecDataCheckRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchId")
    private Long batchId;

    private ExecDataCheckRunRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckRunRequest create() {
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

    public static final class Builder extends Request.Builder<ExecDataCheckRunRequest, Builder> {
        private Long batchId; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckRunRequest request) {
            super(request);
            this.batchId = request.batchId;
        } 

        /**
         * <p>The check job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(Long batchId) {
            this.putBodyParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        @Override
        public ExecDataCheckRunRequest build() {
            return new ExecDataCheckRunRequest(this);
        } 

    } 

}

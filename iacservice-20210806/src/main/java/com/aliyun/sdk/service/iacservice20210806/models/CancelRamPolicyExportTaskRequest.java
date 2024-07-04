// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRamPolicyExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelRamPolicyExportTaskRequest</p>
 */
public class CancelRamPolicyExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramPolicyExportTaskId;

    private CancelRamPolicyExportTaskRequest(Builder builder) {
        super(builder);
        this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRamPolicyExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ramPolicyExportTaskId
     */
    public String getRamPolicyExportTaskId() {
        return this.ramPolicyExportTaskId;
    }

    public static final class Builder extends Request.Builder<CancelRamPolicyExportTaskRequest, Builder> {
        private String ramPolicyExportTaskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRamPolicyExportTaskRequest request) {
            super(request);
            this.ramPolicyExportTaskId = request.ramPolicyExportTaskId;
        } 

        /**
         * ramPolicyExportTaskId.
         */
        public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.putPathParameter("ramPolicyExportTaskId", ramPolicyExportTaskId);
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }

        @Override
        public CancelRamPolicyExportTaskRequest build() {
            return new CancelRamPolicyExportTaskRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRamPolicyExportTaskRequest} extends {@link RequestModel}
 *
 * <p>GetRamPolicyExportTaskRequest</p>
 */
public class GetRamPolicyExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramPolicyExportTaskId;

    private GetRamPolicyExportTaskRequest(Builder builder) {
        super(builder);
        this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRamPolicyExportTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetRamPolicyExportTaskRequest, Builder> {
        private String ramPolicyExportTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetRamPolicyExportTaskRequest request) {
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
        public GetRamPolicyExportTaskRequest build() {
            return new GetRamPolicyExportTaskRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetPADiagnosisTaskRequest} extends {@link RequestModel}
 *
 * <p>GetPADiagnosisTaskRequest</p>
 */
public class GetPADiagnosisTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnoseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diagnoseId;

    private GetPADiagnosisTaskRequest(Builder builder) {
        super(builder);
        this.diagnoseId = builder.diagnoseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPADiagnosisTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public static final class Builder extends Request.Builder<GetPADiagnosisTaskRequest, Builder> {
        private String diagnoseId; 

        private Builder() {
            super();
        } 

        private Builder(GetPADiagnosisTaskRequest request) {
            super(request);
            this.diagnoseId = request.diagnoseId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>diag-58d0750e8786919a</p>
         */
        public Builder diagnoseId(String diagnoseId) {
            this.putQueryParameter("DiagnoseId", diagnoseId);
            this.diagnoseId = diagnoseId;
            return this;
        }

        @Override
        public GetPADiagnosisTaskRequest build() {
            return new GetPADiagnosisTaskRequest(this);
        } 

    } 

}

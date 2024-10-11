// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLatestDataDiagnoseTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetLatestDataDiagnoseTaskStatusRequest</p>
 */
public class GetLatestDataDiagnoseTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetLatestDataDiagnoseTaskStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLatestDataDiagnoseTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetLatestDataDiagnoseTaskStatusRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetLatestDataDiagnoseTaskStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>A short description of struct</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-shdjkgkeog</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetLatestDataDiagnoseTaskStatusRequest build() {
            return new GetLatestDataDiagnoseTaskStatusRequest(this);
        } 

    } 

}

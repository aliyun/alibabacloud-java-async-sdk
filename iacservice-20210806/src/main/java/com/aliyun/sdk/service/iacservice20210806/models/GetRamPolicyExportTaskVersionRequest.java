// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRamPolicyExportTaskVersionRequest} extends {@link RequestModel}
 *
 * <p>GetRamPolicyExportTaskVersionRequest</p>
 */
public class GetRamPolicyExportTaskVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramPolicyExportTaskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportVersion;

    private GetRamPolicyExportTaskVersionRequest(Builder builder) {
        super(builder);
        this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
        this.exportVersion = builder.exportVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRamPolicyExportTaskVersionRequest create() {
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

    /**
     * @return exportVersion
     */
    public String getExportVersion() {
        return this.exportVersion;
    }

    public static final class Builder extends Request.Builder<GetRamPolicyExportTaskVersionRequest, Builder> {
        private String ramPolicyExportTaskId; 
        private String exportVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetRamPolicyExportTaskVersionRequest request) {
            super(request);
            this.ramPolicyExportTaskId = request.ramPolicyExportTaskId;
            this.exportVersion = request.exportVersion;
        } 

        /**
         * ramPolicyExportTaskId.
         */
        public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.putPathParameter("ramPolicyExportTaskId", ramPolicyExportTaskId);
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }

        /**
         * exportVersion.
         */
        public Builder exportVersion(String exportVersion) {
            this.putPathParameter("exportVersion", exportVersion);
            this.exportVersion = exportVersion;
            return this;
        }

        @Override
        public GetRamPolicyExportTaskVersionRequest build() {
            return new GetRamPolicyExportTaskVersionRequest(this);
        } 

    } 

}

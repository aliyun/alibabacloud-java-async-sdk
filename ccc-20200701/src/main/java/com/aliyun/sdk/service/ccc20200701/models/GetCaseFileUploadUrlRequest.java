// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCaseFileUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetCaseFileUploadUrlRequest</p>
 */
public class GetCaseFileUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetCaseFileUploadUrlRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaseFileUploadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCaseFileUploadUrlRequest, Builder> {
        private String fileName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCaseFileUploadUrlRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>case.csv</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetCaseFileUploadUrlRequest build() {
            return new GetCaseFileUploadUrlRequest(this);
        } 

    } 

}

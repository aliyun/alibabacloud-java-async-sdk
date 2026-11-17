// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateAiModelSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiModelSourceRequest</p>
 */
public class UpdateAiModelSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    private UpdateAiModelSourceRequest(Builder builder) {
        super(builder);
        this.modelSourceId = builder.modelSourceId;
        this.displayName = builder.displayName;
        this.expectedVersion = builder.expectedVersion;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiModelSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelSourceId
     */
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<UpdateAiModelSourceRequest, Builder> {
        private String modelSourceId; 
        private String displayName; 
        private Long expectedVersion; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiModelSourceRequest request) {
            super(request);
            this.modelSourceId = request.modelSourceId;
            this.displayName = request.displayName;
            this.expectedVersion = request.expectedVersion;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The model source ID. Use the modelSourceId returned by CreateAiModelSource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-d00000000000000000000</p>
         */
        public Builder modelSourceId(String modelSourceId) {
            this.putPathParameter("modelSourceId", modelSourceId);
            this.modelSourceId = modelSourceId;
            return this;
        }

        /**
         * <p>The display name of the model source or model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Model Studio model source</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The expected object version. Use the version returned by the most recent query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The ID of the actual AI service bound to the model source.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-d00000000000000000000</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public UpdateAiModelSourceRequest build() {
            return new UpdateAiModelSourceRequest(this);
        } 

    } 

}

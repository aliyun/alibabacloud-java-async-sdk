// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAnalysisTaskRequest</p>
 */
public class CreateCustomAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateCustomAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAnalysisTaskRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCustomAnalysisTaskRequest, Builder> {
        private String instanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAnalysisTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * <p>16B78383-2803-4964-9605-37B30C073B0E</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ITEM_CUSTOM</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCustomAnalysisTaskRequest build() {
            return new CreateCustomAnalysisTaskRequest(this);
        } 

    } 

}

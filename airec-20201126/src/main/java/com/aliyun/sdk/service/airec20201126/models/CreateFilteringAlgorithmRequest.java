// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFilteringAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>CreateFilteringAlgorithmRequest</p>
 */
public class CreateFilteringAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private String dryRun;

    private CreateFilteringAlgorithmRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFilteringAlgorithmRequest create() {
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateFilteringAlgorithmRequest, Builder> {
        private String instanceId; 
        private String dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateFilteringAlgorithmRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The state of the filtering table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>xxx</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateFilteringAlgorithmRequest build() {
            return new CreateFilteringAlgorithmRequest(this);
        } 

    } 

}

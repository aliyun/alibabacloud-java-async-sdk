// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>ExportCustomCallTaggingRequest</p>
 */
public class ExportCustomCallTaggingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ExportCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCustomCallTaggingRequest create() {
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

    public static final class Builder extends Request.Builder<ExportCustomCallTaggingRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ExportCustomCallTaggingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ExportCustomCallTaggingRequest build() {
            return new ExportCustomCallTaggingRequest(this);
        } 

    } 

}

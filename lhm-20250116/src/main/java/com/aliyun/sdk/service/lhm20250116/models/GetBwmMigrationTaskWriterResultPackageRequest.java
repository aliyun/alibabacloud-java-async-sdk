// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationTaskWriterResultPackageRequest} extends {@link RequestModel}
 *
 * <p>GetBwmMigrationTaskWriterResultPackageRequest</p>
 */
public class GetBwmMigrationTaskWriterResultPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetBwmMigrationTaskWriterResultPackageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationTaskWriterResultPackageRequest create() {
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

    public static final class Builder extends Request.Builder<GetBwmMigrationTaskWriterResultPackageRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetBwmMigrationTaskWriterResultPackageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The submit instance ID of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetBwmMigrationTaskWriterResultPackageRequest build() {
            return new GetBwmMigrationTaskWriterResultPackageRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKibanaSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeKibanaSettingsRequest</p>
 */
public class DescribeKibanaSettingsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeKibanaSettingsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKibanaSettingsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeKibanaSettingsRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKibanaSettingsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeKibanaSettingsRequest build() {
            return new DescribeKibanaSettingsRequest(this);
        } 

    } 

}

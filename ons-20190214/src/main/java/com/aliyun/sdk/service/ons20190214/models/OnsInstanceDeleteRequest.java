// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceDeleteRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceDeleteRequest</p>
 */
public class OnsInstanceDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private OnsInstanceDeleteRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceDeleteRequest create() {
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

    public static final class Builder extends Request.Builder<OnsInstanceDeleteRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceDeleteRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsInstanceDeleteRequest build() {
            return new OnsInstanceDeleteRequest(this);
        } 

    } 

}

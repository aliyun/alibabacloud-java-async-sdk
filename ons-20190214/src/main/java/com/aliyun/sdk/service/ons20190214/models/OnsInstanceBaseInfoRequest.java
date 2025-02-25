// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceBaseInfoRequest</p>
 */
public class OnsInstanceBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private OnsInstanceBaseInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceBaseInfoRequest create() {
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

    public static final class Builder extends Request.Builder<OnsInstanceBaseInfoRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceBaseInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the instance that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_138015630679****_BAAy1Hac</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsInstanceBaseInfoRequest build() {
            return new OnsInstanceBaseInfoRequest(this);
        } 

    } 

}

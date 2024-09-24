// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigInstanceRemarkRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceRemarkRequest</p>
 */
public class ConfigInstanceRemarkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    private ConfigInstanceRemarkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceRemarkRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceRemarkRequest, Builder> {
        private String instanceId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceRemarkRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.remark = request.remark;
        } 

        /**
         * The HSM ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The description.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ConfigInstanceRemarkRequest build() {
            return new ConfigInstanceRemarkRequest(this);
        } 

    } 

}

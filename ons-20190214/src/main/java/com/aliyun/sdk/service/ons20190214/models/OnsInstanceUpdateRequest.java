// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceUpdateRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceUpdateRequest</p>
 */
public class OnsInstanceUpdateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private OnsInstanceUpdateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceUpdateRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<OnsInstanceUpdateRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceUpdateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.remark = request.remark;
        } 

        /**
         * <p>The ID of the instance whose name or description you want to update.</p>
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

        /**
         * <p>The new name of the instance. The name must meet the following rules:</p>
         * <ul>
         * <li>The name of the instance must be unique in the region where the instance is deployed.</li>
         * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), underscores (_), and Chinese characters.</li>
         * <li>If you do not configure this parameter, the instance name remains unchanged.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Updatedname</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The updated description of the instance. If you do not configure this parameter, the instance description remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>Updateddescription</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public OnsInstanceUpdateRequest build() {
            return new OnsInstanceUpdateRequest(this);
        } 

    } 

}

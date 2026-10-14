// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ManageAICLoginRequest} extends {@link RequestModel}
 *
 * <p>ManageAICLoginRequest</p>
 */
public class ManageAICLoginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyGroup")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String keyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String keyName;

    private ManageAICLoginRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.instanceId = builder.instanceId;
        this.keyGroup = builder.keyGroup;
        this.keyName = builder.keyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAICLoginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyGroup
     */
    public String getKeyGroup() {
        return this.keyGroup;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    public static final class Builder extends Request.Builder<ManageAICLoginRequest, Builder> {
        private String actionName; 
        private String instanceId; 
        private String keyGroup; 
        private String keyName; 

        private Builder() {
            super();
        } 

        private Builder(ManageAICLoginRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.instanceId = request.instanceId;
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
        } 

        /**
         * <p>The management action.
         * When this parameter is set to open, the AIC instance must be in the running state. You can call DescribeAICInstances to query the state.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-xxx-1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The group of the public key.
         * When you set ActionName to open and use the public key to log on, you must first upload the public key by calling UploadAICPublicKey and provide the corresponding KeyName and KeyGroup.</p>
         * 
         * <strong>example:</strong>
         * <p>g-test</p>
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * <p>The name of the public key.
         * When you set ActionName to open and use the public key to log on, you must first upload the public key by calling UploadAICPublicKey and provide the corresponding KeyName and KeyGroup.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        @Override
        public ManageAICLoginRequest build() {
            return new ManageAICLoginRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ManageLoginRequest} extends {@link RequestModel}
 *
 * <p>ManageLoginRequest</p>
 */
public class ManageLoginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyGroup")
    private String keyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private ManageLoginRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.keyGroup = builder.keyGroup;
        this.keyName = builder.keyName;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageLoginRequest create() {
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

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<ManageLoginRequest, Builder> {
        private String actionName; 
        private String keyGroup; 
        private String keyName; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ManageLoginRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <p>Name of the management action. Valid values:</p>
         * <ol>
         * <li><p>open — Activate the public key. This is the default value.</p>
         * </li>
         * <li><p>close — Deactivate the public key.</p>
         * </li>
         * </ol>
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
         * <p>Name of the public key group. If you do not specify KeyName, all public keys in this group are applied.</p>
         * 
         * <strong>example:</strong>
         * <p>mygroup</p>
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * <p>Name of the public key. You must specify either KeyName or KeyGroup.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>ID of the Cloud Application Service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public ManageLoginRequest build() {
            return new ManageLoginRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachEnsInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachEnsInstancesRequest</p>
 */
public class AttachEnsInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scripts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scripts;

    private AttachEnsInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scripts = builder.scripts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEnsInstancesRequest create() {
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
     * @return scripts
     */
    public String getScripts() {
        return this.scripts;
    }

    public static final class Builder extends Request.Builder<AttachEnsInstancesRequest, Builder> {
        private String instanceId; 
        private String scripts; 

        private Builder() {
            super();
        } 

        private Builder(AttachEnsInstancesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scripts = request.scripts;
        } 

        /**
         * <p>The ID of the instance. You can specify only one instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstacneId</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The command that you want to execute on the instance. The command must be encoded in Base64 or UTF-8.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wget d2dldCBodHRwOi8vYWxpYWNzLWs4cy1jbxxxx</p>
         */
        public Builder scripts(String scripts) {
            this.putQueryParameter("Scripts", scripts);
            this.scripts = scripts;
            return this;
        }

        @Override
        public AttachEnsInstancesRequest build() {
            return new AttachEnsInstancesRequest(this);
        } 

    } 

}

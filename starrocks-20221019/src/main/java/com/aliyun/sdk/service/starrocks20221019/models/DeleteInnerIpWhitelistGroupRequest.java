// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DeleteInnerIpWhitelistGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteInnerIpWhitelistGroupRequest</p>
 */
public class DeleteInnerIpWhitelistGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InnerIpWhitelistGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 120, minLength = 2)
    private String innerIpWhitelistGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteInnerIpWhitelistGroupRequest(Builder builder) {
        super(builder);
        this.innerIpWhitelistGroupId = builder.innerIpWhitelistGroupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInnerIpWhitelistGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return innerIpWhitelistGroupId
     */
    public String getInnerIpWhitelistGroupId() {
        return this.innerIpWhitelistGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteInnerIpWhitelistGroupRequest, Builder> {
        private String innerIpWhitelistGroupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInnerIpWhitelistGroupRequest request) {
            super(request);
            this.innerIpWhitelistGroupId = request.innerIpWhitelistGroupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-g1</p>
         */
        public Builder innerIpWhitelistGroupId(String innerIpWhitelistGroupId) {
            this.putBodyParameter("InnerIpWhitelistGroupId", innerIpWhitelistGroupId);
            this.innerIpWhitelistGroupId = innerIpWhitelistGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-0104730e9de40215</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteInnerIpWhitelistGroupRequest build() {
            return new DeleteInnerIpWhitelistGroupRequest(this);
        } 

    } 

}

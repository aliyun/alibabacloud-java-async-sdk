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
 * {@link UpdateInnerIpWhitelistGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateInnerIpWhitelistGroupRequest</p>
 */
public class UpdateInnerIpWhitelistGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CidrIpList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> cidrIpList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InnerIpWhitelistGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 120, minLength = 2)
    private String innerIpWhitelistGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UpdateInnerIpWhitelistGroupRequest(Builder builder) {
        super(builder);
        this.cidrIpList = builder.cidrIpList;
        this.innerIpWhitelistGroupId = builder.innerIpWhitelistGroupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInnerIpWhitelistGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrIpList
     */
    public java.util.List<String> getCidrIpList() {
        return this.cidrIpList;
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

    public static final class Builder extends Request.Builder<UpdateInnerIpWhitelistGroupRequest, Builder> {
        private java.util.List<String> cidrIpList; 
        private String innerIpWhitelistGroupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInnerIpWhitelistGroupRequest request) {
            super(request);
            this.cidrIpList = request.cidrIpList;
            this.innerIpWhitelistGroupId = request.innerIpWhitelistGroupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cidrIpList(java.util.List<String> cidrIpList) {
            this.putBodyParameter("CidrIpList", cidrIpList);
            this.cidrIpList = cidrIpList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-28sjsi12bs1</p>
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
        public UpdateInnerIpWhitelistGroupRequest build() {
            return new UpdateInnerIpWhitelistGroupRequest(this);
        } 

    } 

}

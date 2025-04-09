// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ChangeCloudPhoneNodeRequest} extends {@link RequestModel}
 *
 * <p>ChangeCloudPhoneNodeRequest</p>
 */
public class ChangeCloudPhoneNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneCount")
    private Integer phoneCount;

    private ChangeCloudPhoneNodeRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
        this.nodeId = builder.nodeId;
        this.phoneCount = builder.phoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCloudPhoneNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return phoneCount
     */
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    public static final class Builder extends Request.Builder<ChangeCloudPhoneNodeRequest, Builder> {
        private String instanceType; 
        private String nodeId; 
        private Integer phoneCount; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCloudPhoneNodeRequest request) {
            super(request);
            this.instanceType = request.instanceType;
            this.nodeId = request.nodeId;
            this.phoneCount = request.phoneCount;
        } 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * PhoneCount.
         */
        public Builder phoneCount(Integer phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        @Override
        public ChangeCloudPhoneNodeRequest build() {
            return new ChangeCloudPhoneNodeRequest(this);
        } 

    } 

}

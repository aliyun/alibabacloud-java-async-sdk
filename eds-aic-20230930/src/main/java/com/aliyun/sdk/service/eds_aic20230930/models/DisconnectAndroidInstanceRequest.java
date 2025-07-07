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
 * {@link DisconnectAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>DisconnectAndroidInstanceRequest</p>
 */
public class DisconnectAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    private DisconnectAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisconnectAndroidInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DisconnectAndroidInstanceRequest, Builder> {
        private String endUserId; 
        private java.util.List<String> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DisconnectAndroidInstanceRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DisconnectAndroidInstanceRequest build() {
            return new DisconnectAndroidInstanceRequest(this);
        } 

    } 

}

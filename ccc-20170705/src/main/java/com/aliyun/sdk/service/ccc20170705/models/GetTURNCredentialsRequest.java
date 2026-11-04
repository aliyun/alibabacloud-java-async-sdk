// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetTURNCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetTURNCredentialsRequest</p>
 */
public class GetTURNCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private GetTURNCredentialsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTURNCredentialsRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GetTURNCredentialsRequest, Builder> {
        private String instanceId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GetTURNCredentialsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GetTURNCredentialsRequest build() {
            return new GetTURNCredentialsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceAccountRequest</p>
 */
public class GetInstanceAccountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private GetInstanceAccountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAccountRequest create() {
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<GetInstanceAccountRequest, Builder> {
        private String instanceId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceAccountRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.username = request.username;
        } 

        /**
         * A short description of struct
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public GetInstanceAccountRequest build() {
            return new GetInstanceAccountRequest(this);
        } 

    } 

}

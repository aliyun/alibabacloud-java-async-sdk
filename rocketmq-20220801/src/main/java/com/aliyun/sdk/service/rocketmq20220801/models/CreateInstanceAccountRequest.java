// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceAccountRequest</p>
 */
public class CreateInstanceAccountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateInstanceAccountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceAccountRequest create() {
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateInstanceAccountRequest, Builder> {
        private String instanceId; 
        private String password; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceAccountRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.username = request.username;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateInstanceAccountRequest build() {
            return new CreateInstanceAccountRequest(this);
        } 

    } 

}

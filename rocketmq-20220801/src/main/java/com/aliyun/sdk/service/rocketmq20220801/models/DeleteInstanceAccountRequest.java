// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceAccountRequest</p>
 */
public class DeleteInstanceAccountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private DeleteInstanceAccountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceAccountRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteInstanceAccountRequest, Builder> {
        private String instanceId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceAccountRequest request) {
            super(request);
            this.instanceId = request.instanceId;
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
         * username.
         */
        public Builder username(String username) {
            this.putPathParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public DeleteInstanceAccountRequest build() {
            return new DeleteInstanceAccountRequest(this);
        } 

    } 

}

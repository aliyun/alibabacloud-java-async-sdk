// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersRequest</p>
 */
public class RemoveUsersRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private java.util.List < String > userId;

    private RemoveUsersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersRequest create() {
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
     * @return userId
     */
    public java.util.List < String > getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveUsersRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.userId = response.userId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(java.util.List < String > userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RemoveUsersRequest build() {
            return new RemoveUsersRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLoginInfoRequest} extends {@link RequestModel}
 *
 * <p>RequestLoginInfoRequest</p>
 */
public class RequestLoginInfoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UserId")
    private String userId;

    private RequestLoginInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLoginInfoRequest create() {
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
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RequestLoginInfoRequest, Builder> {
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RequestLoginInfoRequest response) {
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
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RequestLoginInfoRequest build() {
            return new RequestLoginInfoRequest(this);
        } 

    } 

}

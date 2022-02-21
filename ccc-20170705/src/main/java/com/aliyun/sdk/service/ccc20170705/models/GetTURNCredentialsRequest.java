// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTURNCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetTURNCredentialsRequest</p>
 */
public class GetTURNCredentialsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
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

        private Builder(GetTURNCredentialsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.userName = response.userName;
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
         * UserName.
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

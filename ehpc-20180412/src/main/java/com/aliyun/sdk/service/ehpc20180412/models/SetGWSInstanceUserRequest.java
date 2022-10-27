// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGWSInstanceUserRequest} extends {@link RequestModel}
 *
 * <p>SetGWSInstanceUserRequest</p>
 */
public class SetGWSInstanceUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("UserUid")
    private String userUid;

    private SetGWSInstanceUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userName = builder.userName;
        this.userUid = builder.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGWSInstanceUserRequest create() {
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

    /**
     * @return userUid
     */
    public String getUserUid() {
        return this.userUid;
    }

    public static final class Builder extends Request.Builder<SetGWSInstanceUserRequest, Builder> {
        private String instanceId; 
        private String userName; 
        private String userUid; 

        private Builder() {
            super();
        } 

        private Builder(SetGWSInstanceUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.userName = request.userName;
            this.userUid = request.userUid;
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

        /**
         * UserUid.
         */
        public Builder userUid(String userUid) {
            this.putQueryParameter("UserUid", userUid);
            this.userUid = userUid;
            return this;
        }

        @Override
        public SetGWSInstanceUserRequest build() {
            return new SetGWSInstanceUserRequest(this);
        } 

    } 

}

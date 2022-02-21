// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceUserRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceUserRequest</p>
 */
public class SetInstanceUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Query
    @NameInMap("UserUid")
    @Validation(required = true)
    private Long userUid;

    private SetInstanceUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userName = builder.userName;
        this.userUid = builder.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceUserRequest create() {
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
    public Long getUserUid() {
        return this.userUid;
    }

    public static final class Builder extends Request.Builder<SetInstanceUserRequest, Builder> {
        private String instanceId; 
        private String userName; 
        private Long userUid; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceUserRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.userName = response.userName;
            this.userUid = response.userUid;
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
        public Builder userUid(Long userUid) {
            this.putQueryParameter("UserUid", userUid);
            this.userUid = userUid;
            return this;
        }

        @Override
        public SetInstanceUserRequest build() {
            return new SetInstanceUserRequest(this);
        } 

    } 

}

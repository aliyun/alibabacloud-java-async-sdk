// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link DropUserRequest} extends {@link RequestModel}
 *
 * <p>DropUserRequest</p>
 */
public class DropUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("superUser")
    private String superUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private DropUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.superUser = builder.superUser;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DropUserRequest create() {
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
     * @return superUser
     */
    public String getSuperUser() {
        return this.superUser;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DropUserRequest, Builder> {
        private String instanceId; 
        private String superUser; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DropUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.superUser = request.superUser;
            this.userName = request.userName;
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
         * superUser.
         */
        public Builder superUser(String superUser) {
            this.putBodyParameter("superUser", superUser);
            this.superUser = superUser;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DropUserRequest build() {
            return new DropUserRequest(this);
        } 

    } 

}

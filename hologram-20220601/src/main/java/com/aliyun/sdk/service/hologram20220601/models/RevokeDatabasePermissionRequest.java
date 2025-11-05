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
 * {@link RevokeDatabasePermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeDatabasePermissionRequest</p>
 */
public class RevokeDatabasePermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("privileges")
    private java.util.List<String> privileges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private RevokeDatabasePermissionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.databaseName = builder.databaseName;
        this.privileges = builder.privileges;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeDatabasePermissionRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return privileges
     */
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RevokeDatabasePermissionRequest, Builder> {
        private String instanceId; 
        private String databaseName; 
        private java.util.List<String> privileges; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RevokeDatabasePermissionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.databaseName = request.databaseName;
            this.privileges = request.privileges;
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
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * privileges.
         */
        public Builder privileges(java.util.List<String> privileges) {
            this.putBodyParameter("privileges", privileges);
            this.privileges = privileges;
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
        public RevokeDatabasePermissionRequest build() {
            return new RevokeDatabasePermissionRequest(this);
        } 

    } 

}

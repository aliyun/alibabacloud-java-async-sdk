// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link RemoveUsersRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersRequest</p>
 */
public class RemoveUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationEmail")
    private String notificationEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    private String userIdList;

    private RemoveUsersRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.notificationEmail = builder.notificationEmail;
        this.userIdList = builder.userIdList;
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
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return notificationEmail
     */
    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * @return userIdList
     */
    public String getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<RemoveUsersRequest, Builder> {
        private String filePath; 
        private Boolean force; 
        private String instanceId; 
        private String notificationEmail; 
        private String userIdList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.notificationEmail = request.notificationEmail;
            this.userIdList = request.userIdList;
        } 

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NotificationEmail.
         */
        public Builder notificationEmail(String notificationEmail) {
            this.putQueryParameter("NotificationEmail", notificationEmail);
            this.notificationEmail = notificationEmail;
            return this;
        }

        /**
         * UserIdList.
         */
        public Builder userIdList(String userIdList) {
            this.putQueryParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public RemoveUsersRequest build() {
            return new RemoveUsersRequest(this);
        } 

    } 

}

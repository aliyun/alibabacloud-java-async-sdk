// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserProvisioningEventRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserProvisioningEventRequest</p>
 */
public class DeleteUserProvisioningEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private DeleteUserProvisioningEventRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.eventId = builder.eventId;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserProvisioningEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<DeleteUserProvisioningEventRequest, Builder> {
        private String directoryId; 
        private String eventId; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserProvisioningEventRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.eventId = request.eventId;
            this.userProvisioningId = request.userProvisioningId;
        } 

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the RAM user provisioning event.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2636305.html">ListUserProvisioningEvents</a> operation to query the value of <code>EventId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>upe-wjKyNDmZvyZOiRcJ****</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The ID of the RAM user provisioning.</p>
         * 
         * <strong>example:</strong>
         * <p>up-002axzhapcbz6e63****</p>
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public DeleteUserProvisioningEventRequest build() {
            return new DeleteUserProvisioningEventRequest(this);
        } 

    } 

}

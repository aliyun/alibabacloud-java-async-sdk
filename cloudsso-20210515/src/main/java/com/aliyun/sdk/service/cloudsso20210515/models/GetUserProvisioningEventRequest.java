// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserProvisioningEventRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningEventRequest</p>
 */
public class GetUserProvisioningEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    private GetUserProvisioningEventRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningEventRequest create() {
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

    public static final class Builder extends Request.Builder<GetUserProvisioningEventRequest, Builder> {
        private String directoryId; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserProvisioningEventRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.eventId = request.eventId;
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

        @Override
        public GetUserProvisioningEventRequest build() {
            return new GetUserProvisioningEventRequest(this);
        } 

    } 

}

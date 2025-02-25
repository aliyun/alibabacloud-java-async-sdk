// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RetryUserProvisioningEventRequest} extends {@link RequestModel}
 *
 * <p>RetryUserProvisioningEventRequest</p>
 */
public class RetryUserProvisioningEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicationStrategy")
    private String duplicationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    private RetryUserProvisioningEventRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.duplicationStrategy = builder.duplicationStrategy;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryUserProvisioningEventRequest create() {
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
     * @return duplicationStrategy
     */
    public String getDuplicationStrategy() {
        return this.duplicationStrategy;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    public static final class Builder extends Request.Builder<RetryUserProvisioningEventRequest, Builder> {
        private String directoryId; 
        private String duplicationStrategy; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(RetryUserProvisioningEventRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.duplicationStrategy = request.duplicationStrategy;
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
         * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
         * <ul>
         * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
         * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepBoth</p>
         */
        public Builder duplicationStrategy(String duplicationStrategy) {
            this.putQueryParameter("DuplicationStrategy", duplicationStrategy);
            this.duplicationStrategy = duplicationStrategy;
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
        public RetryUserProvisioningEventRequest build() {
            return new RetryUserProvisioningEventRequest(this);
        } 

    } 

}

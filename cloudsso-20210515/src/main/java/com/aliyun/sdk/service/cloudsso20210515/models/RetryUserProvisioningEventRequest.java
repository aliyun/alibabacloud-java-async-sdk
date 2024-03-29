// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryUserProvisioningEventRequest} extends {@link RequestModel}
 *
 * <p>RetryUserProvisioningEventRequest</p>
 */
public class RetryUserProvisioningEventRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("DuplicationStrategy")
    private String duplicationStrategy;

    @Query
    @NameInMap("EventId")
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
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:
         * <p>
         * 
         * *   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.
         * *   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.
         */
        public Builder duplicationStrategy(String duplicationStrategy) {
            this.putQueryParameter("DuplicationStrategy", duplicationStrategy);
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }

        /**
         * The ID of the RAM user provisioning event.
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

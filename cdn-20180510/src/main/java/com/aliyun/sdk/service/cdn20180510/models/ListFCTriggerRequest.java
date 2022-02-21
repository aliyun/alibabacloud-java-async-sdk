// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>ListFCTriggerRequest</p>
 */
public class ListFCTriggerRequest extends Request {
    @Query
    @NameInMap("EventMetaName")
    @Validation(required = true)
    private String eventMetaName;

    @Query
    @NameInMap("EventMetaVersion")
    @Validation(required = true)
    private String eventMetaVersion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private ListFCTriggerRequest(Builder builder) {
        super(builder);
        this.eventMetaName = builder.eventMetaName;
        this.eventMetaVersion = builder.eventMetaVersion;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFCTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventMetaName
     */
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    /**
     * @return eventMetaVersion
     */
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ListFCTriggerRequest, Builder> {
        private String eventMetaName; 
        private String eventMetaVersion; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ListFCTriggerRequest response) {
            super(response);
            this.eventMetaName = response.eventMetaName;
            this.eventMetaVersion = response.eventMetaVersion;
            this.ownerId = response.ownerId;
        } 

        /**
         * EventMetaName.
         */
        public Builder eventMetaName(String eventMetaName) {
            this.putQueryParameter("EventMetaName", eventMetaName);
            this.eventMetaName = eventMetaName;
            return this;
        }

        /**
         * EventMetaVersion.
         */
        public Builder eventMetaVersion(String eventMetaVersion) {
            this.putQueryParameter("EventMetaVersion", eventMetaVersion);
            this.eventMetaVersion = eventMetaVersion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ListFCTriggerRequest build() {
            return new ListFCTriggerRequest(this);
        } 

    } 

}

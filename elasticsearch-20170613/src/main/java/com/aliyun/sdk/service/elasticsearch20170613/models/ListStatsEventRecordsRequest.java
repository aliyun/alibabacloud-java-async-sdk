// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListStatsEventRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListStatsEventRecordsRequest</p>
 */
public class ListStatsEventRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListStatsEventRecordsRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.level = builder.level;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatsEventRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListStatsEventRecordsRequest, Builder> {
        private String eventType; 
        private String level; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListStatsEventRecordsRequest request) {
            super(request);
            this.eventType = request.eventType;
            this.level = request.level;
            this.status = request.status;
        } 

        /**
         * eventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListStatsEventRecordsRequest build() {
            return new ListStatsEventRecordsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWaitingRoomEventsRequest} extends {@link RequestModel}
 *
 * <p>ListWaitingRoomEventsRequest</p>
 */
public class ListWaitingRoomEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
    private Long waitingRoomEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomId;

    private ListWaitingRoomEventsRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.waitingRoomEventId = builder.waitingRoomEventId;
        this.waitingRoomId = builder.waitingRoomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return waitingRoomEventId
     */
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

    /**
     * @return waitingRoomId
     */
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public static final class Builder extends Request.Builder<ListWaitingRoomEventsRequest, Builder> {
        private Long siteId; 
        private Long waitingRoomEventId; 
        private String waitingRoomId; 

        private Builder() {
            super();
        } 

        private Builder(ListWaitingRoomEventsRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.waitingRoomEventId = request.waitingRoomEventId;
            this.waitingRoomId = request.waitingRoomId;
        } 

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7096621098****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The ID of the waiting room event. This parameter is optional. You can specify this parameter to query a specific waiting room event.</p>
         * 
         * <strong>example:</strong>
         * <p>89677721098****</p>
         */
        public Builder waitingRoomEventId(Long waitingRoomEventId) {
            this.putQueryParameter("WaitingRoomEventId", waitingRoomEventId);
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }

        /**
         * <p>The unique ID of the waiting room, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRooms</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6a51d5bc6460887abd129****</p>
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        @Override
        public ListWaitingRoomEventsRequest build() {
            return new ListWaitingRoomEventsRequest(this);
        } 

    } 

}

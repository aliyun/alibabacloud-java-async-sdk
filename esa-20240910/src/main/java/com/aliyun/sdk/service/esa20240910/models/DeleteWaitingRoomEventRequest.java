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
 * {@link DeleteWaitingRoomEventRequest} extends {@link RequestModel}
 *
 * <p>DeleteWaitingRoomEventRequest</p>
 */
public class DeleteWaitingRoomEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long waitingRoomEventId;

    private DeleteWaitingRoomEventRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.waitingRoomEventId = builder.waitingRoomEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWaitingRoomEventRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteWaitingRoomEventRequest, Builder> {
        private Long siteId; 
        private Long waitingRoomEventId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWaitingRoomEventRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.waitingRoomEventId = request.waitingRoomEventId;
        } 

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The ID of the waiting room event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>302909890***</p>
         */
        public Builder waitingRoomEventId(Long waitingRoomEventId) {
            this.putQueryParameter("WaitingRoomEventId", waitingRoomEventId);
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }

        @Override
        public DeleteWaitingRoomEventRequest build() {
            return new DeleteWaitingRoomEventRequest(this);
        } 

    } 

}

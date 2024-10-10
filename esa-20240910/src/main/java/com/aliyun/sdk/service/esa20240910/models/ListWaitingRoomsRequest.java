// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWaitingRoomsRequest} extends {@link RequestModel}
 *
 * <p>ListWaitingRoomsRequest</p>
 */
public class ListWaitingRoomsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    private String waitingRoomId;

    private ListWaitingRoomsRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.waitingRoomId = builder.waitingRoomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomsRequest create() {
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
     * @return waitingRoomId
     */
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public static final class Builder extends Request.Builder<ListWaitingRoomsRequest, Builder> {
        private Long siteId; 
        private String waitingRoomId; 

        private Builder() {
            super();
        } 

        private Builder(ListWaitingRoomsRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.waitingRoomId = request.waitingRoomId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120876698010528</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * WaitingRoomId.
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        @Override
        public ListWaitingRoomsRequest build() {
            return new ListWaitingRoomsRequest(this);
        } 

    } 

}

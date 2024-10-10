// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWaitingRoomRequest} extends {@link RequestModel}
 *
 * <p>DeleteWaitingRoomRequest</p>
 */
public class DeleteWaitingRoomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomId;

    private DeleteWaitingRoomRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.waitingRoomId = builder.waitingRoomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWaitingRoomRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteWaitingRoomRequest, Builder> {
        private Long siteId; 
        private String waitingRoomId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWaitingRoomRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.waitingRoomId = request.waitingRoomId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25133f536f1b1f6b6091f6a92c614dd4</p>
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        @Override
        public DeleteWaitingRoomRequest build() {
            return new DeleteWaitingRoomRequest(this);
        } 

    } 

}

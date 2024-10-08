// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWaitingRoomRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteWaitingRoomRuleRequest</p>
 */
public class DeleteWaitingRoomRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomRuleId")
    private Long waitingRoomRuleId;

    private DeleteWaitingRoomRuleRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.waitingRoomRuleId = builder.waitingRoomRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWaitingRoomRuleRequest create() {
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
     * @return waitingRoomRuleId
     */
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteWaitingRoomRuleRequest, Builder> {
        private Long siteId; 
        private Long waitingRoomRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWaitingRoomRuleRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.waitingRoomRuleId = request.waitingRoomRuleId;
        } 

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * WaitingRoomRuleId.
         */
        public Builder waitingRoomRuleId(Long waitingRoomRuleId) {
            this.putQueryParameter("WaitingRoomRuleId", waitingRoomRuleId);
            this.waitingRoomRuleId = waitingRoomRuleId;
            return this;
        }

        @Override
        public DeleteWaitingRoomRuleRequest build() {
            return new DeleteWaitingRoomRuleRequest(this);
        } 

    } 

}

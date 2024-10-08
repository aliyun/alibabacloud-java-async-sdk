// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWaitingRoomRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWaitingRoomRulesRequest</p>
 */
public class ListWaitingRoomRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waitingRoomId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomRuleId")
    private Long waitingRoomRuleId;

    private ListWaitingRoomRulesRequest(Builder builder) {
        super(builder);
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.waitingRoomId = builder.waitingRoomId;
        this.waitingRoomRuleId = builder.waitingRoomRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingRoomRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
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

    /**
     * @return waitingRoomRuleId
     */
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

    public static final class Builder extends Request.Builder<ListWaitingRoomRulesRequest, Builder> {
        private String ruleName; 
        private Long siteId; 
        private String waitingRoomId; 
        private Long waitingRoomRuleId; 

        private Builder() {
            super();
        } 

        private Builder(ListWaitingRoomRulesRequest request) {
            super(request);
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.waitingRoomId = request.waitingRoomId;
            this.waitingRoomRuleId = request.waitingRoomRuleId;
        } 

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
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
         * WaitingRoomId.
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.putQueryParameter("WaitingRoomId", waitingRoomId);
            this.waitingRoomId = waitingRoomId;
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
        public ListWaitingRoomRulesRequest build() {
            return new ListWaitingRoomRulesRequest(this);
        } 

    } 

}

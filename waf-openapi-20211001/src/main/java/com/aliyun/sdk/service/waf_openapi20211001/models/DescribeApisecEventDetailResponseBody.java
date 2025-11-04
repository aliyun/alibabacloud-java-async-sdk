// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecEventDetailResponseBody</p>
 */
public class DescribeApisecEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackCnt")
    private String attackCnt;

    @com.aliyun.core.annotation.NameInMap("AttackerList")
    private java.util.List<String> attackerList;

    @com.aliyun.core.annotation.NameInMap("DetailValue")
    private String detailValue;

    @com.aliyun.core.annotation.NameInMap("EndTs")
    private String endTs;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("EventLevel")
    private String eventLevel;

    @com.aliyun.core.annotation.NameInMap("EventScope")
    private String eventScope;

    @com.aliyun.core.annotation.NameInMap("EventTag")
    private String eventTag;

    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTs")
    private String startTs;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private DescribeApisecEventDetailResponseBody(Builder builder) {
        this.attackCnt = builder.attackCnt;
        this.attackerList = builder.attackerList;
        this.detailValue = builder.detailValue;
        this.endTs = builder.endTs;
        this.eventId = builder.eventId;
        this.eventLevel = builder.eventLevel;
        this.eventScope = builder.eventScope;
        this.eventTag = builder.eventTag;
        this.note = builder.note;
        this.origin = builder.origin;
        this.requestId = builder.requestId;
        this.startTs = builder.startTs;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecEventDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackCnt
     */
    public String getAttackCnt() {
        return this.attackCnt;
    }

    /**
     * @return attackerList
     */
    public java.util.List<String> getAttackerList() {
        return this.attackerList;
    }

    /**
     * @return detailValue
     */
    public String getDetailValue() {
        return this.detailValue;
    }

    /**
     * @return endTs
     */
    public String getEndTs() {
        return this.endTs;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventLevel
     */
    public String getEventLevel() {
        return this.eventLevel;
    }

    /**
     * @return eventScope
     */
    public String getEventScope() {
        return this.eventScope;
    }

    /**
     * @return eventTag
     */
    public String getEventTag() {
        return this.eventTag;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTs
     */
    public String getStartTs() {
        return this.startTs;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder {
        private String attackCnt; 
        private java.util.List<String> attackerList; 
        private String detailValue; 
        private String endTs; 
        private String eventId; 
        private String eventLevel; 
        private String eventScope; 
        private String eventTag; 
        private String note; 
        private String origin; 
        private String requestId; 
        private String startTs; 
        private String userStatus; 

        private Builder() {
        } 

        private Builder(DescribeApisecEventDetailResponseBody model) {
            this.attackCnt = model.attackCnt;
            this.attackerList = model.attackerList;
            this.detailValue = model.detailValue;
            this.endTs = model.endTs;
            this.eventId = model.eventId;
            this.eventLevel = model.eventLevel;
            this.eventScope = model.eventScope;
            this.eventTag = model.eventTag;
            this.note = model.note;
            this.origin = model.origin;
            this.requestId = model.requestId;
            this.startTs = model.startTs;
            this.userStatus = model.userStatus;
        } 

        /**
         * AttackCnt.
         */
        public Builder attackCnt(String attackCnt) {
            this.attackCnt = attackCnt;
            return this;
        }

        /**
         * AttackerList.
         */
        public Builder attackerList(java.util.List<String> attackerList) {
            this.attackerList = attackerList;
            return this;
        }

        /**
         * DetailValue.
         */
        public Builder detailValue(String detailValue) {
            this.detailValue = detailValue;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(String endTs) {
            this.endTs = endTs;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * EventLevel.
         */
        public Builder eventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * EventScope.
         */
        public Builder eventScope(String eventScope) {
            this.eventScope = eventScope;
            return this;
        }

        /**
         * EventTag.
         */
        public Builder eventTag(String eventTag) {
            this.eventTag = eventTag;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(String startTs) {
            this.startTs = startTs;
            return this;
        }

        /**
         * UserStatus.
         */
        public Builder userStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public DescribeApisecEventDetailResponseBody build() {
            return new DescribeApisecEventDetailResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link HandleObjectScanEventRequest} extends {@link RequestModel}
 *
 * <p>HandleObjectScanEventRequest</p>
 */
public class HandleObjectScanEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchType")
    private String batchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<Long> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConditionList")
    private java.util.List<RuleConditionList> ruleConditionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private HandleObjectScanEventRequest(Builder builder) {
        super(builder);
        this.batchType = builder.batchType;
        this.eventId = builder.eventId;
        this.eventIdList = builder.eventIdList;
        this.lang = builder.lang;
        this.remark = builder.remark;
        this.ruleConditionList = builder.ruleConditionList;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleObjectScanEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchType
     */
    public String getBatchType() {
        return this.batchType;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventIdList
     */
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return ruleConditionList
     */
    public java.util.List<RuleConditionList> getRuleConditionList() {
        return this.ruleConditionList;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<HandleObjectScanEventRequest, Builder> {
        private String batchType; 
        private String eventId; 
        private java.util.List<Long> eventIdList; 
        private String lang; 
        private String remark; 
        private java.util.List<RuleConditionList> ruleConditionList; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(HandleObjectScanEventRequest request) {
            super(request);
            this.batchType = request.batchType;
            this.eventId = request.eventId;
            this.eventIdList = request.eventIdList;
            this.lang = request.lang;
            this.remark = request.remark;
            this.ruleConditionList = request.ruleConditionList;
            this.status = request.status;
        } 

        /**
         * BatchType.
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<Long> eventIdList) {
            this.putQueryParameter("EventIdList", eventIdList);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * RuleConditionList.
         */
        public Builder ruleConditionList(java.util.List<RuleConditionList> ruleConditionList) {
            this.putQueryParameter("RuleConditionList", ruleConditionList);
            this.ruleConditionList = ruleConditionList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public HandleObjectScanEventRequest build() {
            return new HandleObjectScanEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link HandleObjectScanEventRequest} extends {@link TeaModel}
     *
     * <p>HandleObjectScanEventRequest</p>
     */
    public static class RuleConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operate")
        private String operate;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuleConditionList(Builder builder) {
            this.key = builder.key;
            this.operate = builder.operate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditionList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operate; 
            private String value; 

            private Builder() {
            } 

            private Builder(RuleConditionList model) {
                this.key = model.key;
                this.operate = model.operate;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operate.
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleConditionList build() {
                return new RuleConditionList(this);
            } 

        } 

    }
}

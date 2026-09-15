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
         * <p>The type for batch handling of similar alerts. Valid values:</p>
         * <ul>
         * <li><strong>sha256</strong>: by file content.</li>
         * <li><strong>eventName</strong>: by alert name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sha256</p>
         */
        public Builder batchType(String batchType) {
            this.putQueryParameter("BatchType", batchType);
            this.batchType = batchType;
            return this;
        }

        /**
         * <p>The event ID. You must specify at least one of EventId and EventIdList to identify the target scan events to handle.</p>
         * 
         * <strong>example:</strong>
         * <p>81****</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The list of event IDs. You must specify at least one of EventId and EventIdList to identify the target scan events to handle.</p>
         */
        public Builder eventIdList(java.util.List<Long> eventIdList) {
            this.putQueryParameter("EventIdList", eventIdList);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The list of whitelisting rules. This parameter takes effect only when the alert is whitelisted.</p>
         */
        public Builder ruleConditionList(java.util.List<RuleConditionList> ruleConditionList) {
            this.putQueryParameter("RuleConditionList", ruleConditionList);
            this.ruleConditionList = ruleConditionList;
            return this;
        }

        /**
         * <p>The target status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unhandled.</li>
         * <li><strong>1</strong>: Manually handled.</li>
         * <li><strong>2</strong>: Whitelisted.</li>
         * <li><strong>3</strong>: Ignored.</li>
         * <li><strong>4</strong>: Access denied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
             * <p>The whitelisting field. Valid values:</p>
             * <ul>
             * <li><strong>ossKey</strong>: file path.</li>
             * <li><strong>bucketName</strong>: bucket name.</li>
             * <li><strong>md5</strong>: file MD5.</li>
             * <li><strong>sha256</strong>: file SHA-256.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ossKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * <ul>
             * <li><strong>contains</strong>: contains.</li>
             * <li><strong>not_contains</strong>: does not contain.</li>
             * <li><strong>str_equal</strong>: equals.</li>
             * <li><strong>str_not_equal</strong>: does not equal.</li>
             * <li><strong>regex</strong>: regular expression.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * <p>The value to match.</p>
             * 
             * <strong>example:</strong>
             * <p>sshe</p>
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

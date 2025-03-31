// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListEventCenterRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventCenterRecordResponseBody</p>
 */
public class ListEventCenterRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEventCenterRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventCenterRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEventCenterRecordResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of historical events.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>665C7A5E-BAEC-5BCD-AF9F-5F9260D672BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total entries of historical events.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventCenterRecordResponseBody build() {
            return new ListEventCenterRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventCenterRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventCenterRecordResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EventChannel")
        private String eventChannel;

        @com.aliyun.core.annotation.NameInMap("EventNotifyId")
        private String eventNotifyId;

        @com.aliyun.core.annotation.NameInMap("EventNotifyMethod")
        private String eventNotifyMethod;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Records(Builder builder) {
            this.createTime = builder.createTime;
            this.eventChannel = builder.eventChannel;
            this.eventNotifyId = builder.eventNotifyId;
            this.eventNotifyMethod = builder.eventNotifyMethod;
            this.eventType = builder.eventType;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.recordId = builder.recordId;
            this.repoName = builder.repoName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.tag = builder.tag;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eventChannel
         */
        public String getEventChannel() {
            return this.eventChannel;
        }

        /**
         * @return eventNotifyId
         */
        public String getEventNotifyId() {
            return this.eventNotifyId;
        }

        /**
         * @return eventNotifyMethod
         */
        public String getEventNotifyMethod() {
            return this.eventNotifyMethod;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String eventChannel; 
            private String eventNotifyId; 
            private String eventNotifyMethod; 
            private String eventType; 
            private String instanceId; 
            private String namespace; 
            private String recordId; 
            private String repoName; 
            private String ruleId; 
            private String ruleName; 
            private String tag; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.createTime = model.createTime;
                this.eventChannel = model.eventChannel;
                this.eventNotifyId = model.eventNotifyId;
                this.eventNotifyMethod = model.eventNotifyMethod;
                this.eventType = model.eventType;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.recordId = model.recordId;
                this.repoName = model.repoName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.tag = model.tag;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the event was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1638188622000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The event notification channel.</p>
             * 
             * <strong>example:</strong>
             * <p>EVENT_BRIDGE</p>
             */
            public Builder eventChannel(String eventChannel) {
                this.eventChannel = eventChannel;
                return this;
            }

            /**
             * <p>The ID of the event notification.</p>
             * 
             * <strong>example:</strong>
             * <p>7d478419-61df-49e5-b92b-30ce730c2127</p>
             */
            public Builder eventNotifyId(String eventNotifyId) {
                this.eventNotifyId = eventNotifyId;
                return this;
            }

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li><code>http</code>: The notification is sent over HTTP.</li>
             * <li><code>https</code>: The notification is sent over HTTPS.</li>
             * <li><code>dingding</code>: The notification is sent by using DingTalk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder eventNotifyMethod(String eventNotifyMethod) {
                this.eventNotifyMethod = eventNotifyMethod;
                return this;
            }

            /**
             * <p>The type of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>cr:Artifact:DeliveryChainCompleted</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-gl34plsa****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>mychain</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The ID of the event record.</p>
             * 
             * <strong>example:</strong>
             * <p>crecrr-ctdbzwtkpr*****</p>
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>ruby-2.4.0</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The ID of the event notification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>crecr-n6pbhgjxtla*****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the event notification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>chain-demo</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>ruby-2.4.0</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The time when the event was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1638188622000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}

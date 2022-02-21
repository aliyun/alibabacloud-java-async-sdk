// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventCenterRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventCenterRecordResponseBody</p>
 */
public class ListEventCenterRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < Records> getRecords() {
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
        private java.util.List < Records> records; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventCenterRecordResponseBody build() {
            return new ListEventCenterRecordResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EventChannel")
        private String eventChannel;

        @NameInMap("EventNotifyId")
        private String eventNotifyId;

        @NameInMap("EventNotifyMethod")
        private String eventNotifyMethod;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("UpdateTime")
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

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EventChannel.
             */
            public Builder eventChannel(String eventChannel) {
                this.eventChannel = eventChannel;
                return this;
            }

            /**
             * EventNotifyId.
             */
            public Builder eventNotifyId(String eventNotifyId) {
                this.eventNotifyId = eventNotifyId;
                return this;
            }

            /**
             * EventNotifyMethod.
             */
            public Builder eventNotifyMethod(String eventNotifyMethod) {
                this.eventNotifyMethod = eventNotifyMethod;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * UpdateTime.
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

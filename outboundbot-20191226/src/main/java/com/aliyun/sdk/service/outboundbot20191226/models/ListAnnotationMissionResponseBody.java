// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListAnnotationMissionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationMissionResponseBody</p>
 */
public class ListAnnotationMissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAnnotationMissionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationMissionResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAnnotationMissionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAnnotationMissionResponseBody build() {
            return new ListAnnotationMissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnnotationMissionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionResponseBody</p>
     */
    public static class AnnotationMissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionDataSourceType")
        private Integer annotationMissionDataSourceType;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionDebugDataSourceList")
        private java.util.List<Integer> annotationMissionDebugDataSourceList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionName")
        private String annotationMissionName;

        @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
        private Integer annotationStatus;

        @com.aliyun.core.annotation.NameInMap("ConversationTimeEndFilter")
        private Long conversationTimeEndFilter;

        @com.aliyun.core.annotation.NameInMap("ConversationTimeStartFilter")
        private Long conversationTimeStartFilter;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExcludeOtherMissionSession")
        private Boolean excludeOtherMissionSession;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SamplingCount")
        private Integer samplingCount;

        @com.aliyun.core.annotation.NameInMap("SamplingDescription")
        private String samplingDescription;

        @com.aliyun.core.annotation.NameInMap("SamplingRate")
        private Integer samplingRate;

        @com.aliyun.core.annotation.NameInMap("SamplingType")
        private Integer samplingType;

        @com.aliyun.core.annotation.NameInMap("SessionEndReasonFilterList")
        private java.util.List<Integer> sessionEndReasonFilterList;

        @com.aliyun.core.annotation.NameInMap("SessionFinishCount")
        private Integer sessionFinishCount;

        @com.aliyun.core.annotation.NameInMap("SessionTotalCount")
        private Integer sessionTotalCount;

        private AnnotationMissionList(Builder builder) {
            this.annotationMissionDataSourceType = builder.annotationMissionDataSourceType;
            this.annotationMissionDebugDataSourceList = builder.annotationMissionDebugDataSourceList;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionName = builder.annotationMissionName;
            this.annotationStatus = builder.annotationStatus;
            this.conversationTimeEndFilter = builder.conversationTimeEndFilter;
            this.conversationTimeStartFilter = builder.conversationTimeStartFilter;
            this.createTime = builder.createTime;
            this.excludeOtherMissionSession = builder.excludeOtherMissionSession;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.samplingCount = builder.samplingCount;
            this.samplingDescription = builder.samplingDescription;
            this.samplingRate = builder.samplingRate;
            this.samplingType = builder.samplingType;
            this.sessionEndReasonFilterList = builder.sessionEndReasonFilterList;
            this.sessionFinishCount = builder.sessionFinishCount;
            this.sessionTotalCount = builder.sessionTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionDataSourceType
         */
        public Integer getAnnotationMissionDataSourceType() {
            return this.annotationMissionDataSourceType;
        }

        /**
         * @return annotationMissionDebugDataSourceList
         */
        public java.util.List<Integer> getAnnotationMissionDebugDataSourceList() {
            return this.annotationMissionDebugDataSourceList;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionName
         */
        public String getAnnotationMissionName() {
            return this.annotationMissionName;
        }

        /**
         * @return annotationStatus
         */
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        /**
         * @return conversationTimeEndFilter
         */
        public Long getConversationTimeEndFilter() {
            return this.conversationTimeEndFilter;
        }

        /**
         * @return conversationTimeStartFilter
         */
        public Long getConversationTimeStartFilter() {
            return this.conversationTimeStartFilter;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return excludeOtherMissionSession
         */
        public Boolean getExcludeOtherMissionSession() {
            return this.excludeOtherMissionSession;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return samplingCount
         */
        public Integer getSamplingCount() {
            return this.samplingCount;
        }

        /**
         * @return samplingDescription
         */
        public String getSamplingDescription() {
            return this.samplingDescription;
        }

        /**
         * @return samplingRate
         */
        public Integer getSamplingRate() {
            return this.samplingRate;
        }

        /**
         * @return samplingType
         */
        public Integer getSamplingType() {
            return this.samplingType;
        }

        /**
         * @return sessionEndReasonFilterList
         */
        public java.util.List<Integer> getSessionEndReasonFilterList() {
            return this.sessionEndReasonFilterList;
        }

        /**
         * @return sessionFinishCount
         */
        public Integer getSessionFinishCount() {
            return this.sessionFinishCount;
        }

        /**
         * @return sessionTotalCount
         */
        public Integer getSessionTotalCount() {
            return this.sessionTotalCount;
        }

        public static final class Builder {
            private Integer annotationMissionDataSourceType; 
            private java.util.List<Integer> annotationMissionDebugDataSourceList; 
            private String annotationMissionId; 
            private String annotationMissionName; 
            private Integer annotationStatus; 
            private Long conversationTimeEndFilter; 
            private Long conversationTimeStartFilter; 
            private Long createTime; 
            private Boolean excludeOtherMissionSession; 
            private Long finishTime; 
            private String instanceId; 
            private Integer samplingCount; 
            private String samplingDescription; 
            private Integer samplingRate; 
            private Integer samplingType; 
            private java.util.List<Integer> sessionEndReasonFilterList; 
            private Integer sessionFinishCount; 
            private Integer sessionTotalCount; 

            private Builder() {
            } 

            private Builder(AnnotationMissionList model) {
                this.annotationMissionDataSourceType = model.annotationMissionDataSourceType;
                this.annotationMissionDebugDataSourceList = model.annotationMissionDebugDataSourceList;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionName = model.annotationMissionName;
                this.annotationStatus = model.annotationStatus;
                this.conversationTimeEndFilter = model.conversationTimeEndFilter;
                this.conversationTimeStartFilter = model.conversationTimeStartFilter;
                this.createTime = model.createTime;
                this.excludeOtherMissionSession = model.excludeOtherMissionSession;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.samplingCount = model.samplingCount;
                this.samplingDescription = model.samplingDescription;
                this.samplingRate = model.samplingRate;
                this.samplingType = model.samplingType;
                this.sessionEndReasonFilterList = model.sessionEndReasonFilterList;
                this.sessionFinishCount = model.sessionFinishCount;
                this.sessionTotalCount = model.sessionTotalCount;
            } 

            /**
             * AnnotationMissionDataSourceType.
             */
            public Builder annotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
                this.annotationMissionDataSourceType = annotationMissionDataSourceType;
                return this;
            }

            /**
             * AnnotationMissionDebugDataSourceList.
             */
            public Builder annotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
                this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionName.
             */
            public Builder annotationMissionName(String annotationMissionName) {
                this.annotationMissionName = annotationMissionName;
                return this;
            }

            /**
             * AnnotationStatus.
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * ConversationTimeEndFilter.
             */
            public Builder conversationTimeEndFilter(Long conversationTimeEndFilter) {
                this.conversationTimeEndFilter = conversationTimeEndFilter;
                return this;
            }

            /**
             * ConversationTimeStartFilter.
             */
            public Builder conversationTimeStartFilter(Long conversationTimeStartFilter) {
                this.conversationTimeStartFilter = conversationTimeStartFilter;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExcludeOtherMissionSession.
             */
            public Builder excludeOtherMissionSession(Boolean excludeOtherMissionSession) {
                this.excludeOtherMissionSession = excludeOtherMissionSession;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
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
             * SamplingCount.
             */
            public Builder samplingCount(Integer samplingCount) {
                this.samplingCount = samplingCount;
                return this;
            }

            /**
             * SamplingDescription.
             */
            public Builder samplingDescription(String samplingDescription) {
                this.samplingDescription = samplingDescription;
                return this;
            }

            /**
             * SamplingRate.
             */
            public Builder samplingRate(Integer samplingRate) {
                this.samplingRate = samplingRate;
                return this;
            }

            /**
             * SamplingType.
             */
            public Builder samplingType(Integer samplingType) {
                this.samplingType = samplingType;
                return this;
            }

            /**
             * SessionEndReasonFilterList.
             */
            public Builder sessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
                this.sessionEndReasonFilterList = sessionEndReasonFilterList;
                return this;
            }

            /**
             * SessionFinishCount.
             */
            public Builder sessionFinishCount(Integer sessionFinishCount) {
                this.sessionFinishCount = sessionFinishCount;
                return this;
            }

            /**
             * SessionTotalCount.
             */
            public Builder sessionTotalCount(Integer sessionTotalCount) {
                this.sessionTotalCount = sessionTotalCount;
                return this;
            }

            public AnnotationMissionList build() {
                return new AnnotationMissionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionList")
        private java.util.List<AnnotationMissionList> annotationMissionList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPageCount")
        private Long totalPageCount;

        private Data(Builder builder) {
            this.annotationMissionList = builder.annotationMissionList;
            this.message = builder.message;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotationMissionList
         */
        public java.util.List<AnnotationMissionList> getAnnotationMissionList() {
            return this.annotationMissionList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private java.util.List<AnnotationMissionList> annotationMissionList; 
            private String message; 
            private Long pageIndex; 
            private Long pageSize; 
            private Boolean success; 
            private Long totalCount; 
            private Long totalPageCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotationMissionList = model.annotationMissionList;
                this.message = model.message;
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.success = model.success;
                this.totalCount = model.totalCount;
                this.totalPageCount = model.totalPageCount;
            } 

            /**
             * AnnotationMissionList.
             */
            public Builder annotationMissionList(java.util.List<AnnotationMissionList> annotationMissionList) {
                this.annotationMissionList = annotationMissionList;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Long totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

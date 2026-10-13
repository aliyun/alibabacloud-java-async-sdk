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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The additional information. If the request is successful, success is returned. If the request fails, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>CDR \&quot;job-c7b8a817-b8e8-40f3-b7ad-f28dcea218ff\&quot; doesn\&quot;t exists.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values: true: The call was successful. false: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The data source of the annotation task. Valid values: 1: Outbound call. 2: Navigation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder annotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
                this.annotationMissionDataSourceType = annotationMissionDataSourceType;
                return this;
            }

            /**
             * <p>The list of debug data sources for the annotation task.</p>
             * <blockquote>
             * <p>Note: An additional 0 is included in the response. The return values are [0,1], [0,2], or [0,1,2].</p>
             * </blockquote>
             */
            public Builder annotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
                this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Experience scenario - Move vehicle - Annotation task - 20230220-141347</p>
             */
            public Builder annotationMissionName(String annotationMissionName) {
                this.annotationMissionName = annotationMissionName;
                return this;
            }

            /**
             * <p>The annotation status. Valid values:</p>
             * <ul>
             * <li>1: In progress.</li>
             * <li>2: Completed.</li>
             * <li>3: Closed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * <p>The end time of the conversation time query condition for the annotation task.</p>
             * 
             * <strong>example:</strong>
             * <p>1684511999000</p>
             */
            public Builder conversationTimeEndFilter(Long conversationTimeEndFilter) {
                this.conversationTimeEndFilter = conversationTimeEndFilter;
                return this;
            }

            /**
             * <p>The start time of the conversation time query condition for the annotation task.</p>
             * 
             * <strong>example:</strong>
             * <p>1683216000000</p>
             */
            public Builder conversationTimeStartFilter(Long conversationTimeStartFilter) {
                this.conversationTimeStartFilter = conversationTimeStartFilter;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1676170339515</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether to exclude call records that have been annotated in other tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder excludeOtherMissionSession(Boolean excludeOtherMissionSession) {
                this.excludeOtherMissionSession = excludeOtherMissionSession;
                return this;
            }

            /**
             * <p>The completion time of the annotation task. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683443903785</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>32be9d94-1346-4c4a-a4d0-ccd379f87013</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum limit for the sampling count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder samplingCount(Integer samplingCount) {
                this.samplingCount = samplingCount;
                return this;
            }

            /**
             * <p>The sampling description.</p>
             * 
             * <strong>example:</strong>
             * <p>Annotation</p>
             */
            public Builder samplingDescription(String samplingDescription) {
                this.samplingDescription = samplingDescription;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder samplingRate(Integer samplingRate) {
                this.samplingRate = samplingRate;
                return this;
            }

            /**
             * <p>The sampling type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder samplingType(Integer samplingType) {
                this.samplingType = samplingType;
                return this;
            }

            /**
             * <p>The list of call end reasons used to create the task. Valid values:</p>
             * <ul>
             * <li>1: Normal completion.</li>
             * <li>2: Hang up by the robot after unrecognized input.</li>
             * <li>3: Hang up due to silence timeout.</li>
             * <li>4: Hang up by the user after unrecognized input.</li>
             * <li>5: Hang up by the user without a reason.</li>
             * <li>6: Transfer to a human agent due to intent match.</li>
             * <li>7: Transfer to a human agent after unrecognized input.</li>
             * <li>8: No interaction on the user side.</li>
             * <li>9: Interruption due to a system exception.</li>
             * <li>10: Transfer to IVR due to intent match.</li>
             * <li>11: Transfer to IVR after unrecognized input.</li>
             * </ul>
             */
            public Builder sessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
                this.sessionEndReasonFilterList = sessionEndReasonFilterList;
                return this;
            }

            /**
             * <p>The number of completed sessions in the annotation task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sessionFinishCount(Integer sessionFinishCount) {
                this.sessionFinishCount = sessionFinishCount;
                return this;
            }

            /**
             * <p>The total number of sessions in the annotation task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The list of annotation tasks.</p>
             */
            public Builder annotationMissionList(java.util.List<AnnotationMissionList> annotationMissionList) {
                this.annotationMissionList = annotationMissionList;
                return this;
            }

            /**
             * <p>The additional information. If the request is successful, success is returned. If the request fails, a specific error code is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CDR \&quot;job-c7b8a817-b8e8-40f3-b7ad-f28dcea218ff\&quot; doesn\&quot;t exists.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful. Valid values: true: The call was successful. false: The call failed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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

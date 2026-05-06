// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTaskGroupResponseBody</p>
 */
public class CreateTaskGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CreateTaskGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskGroupResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CreateTaskGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateTaskGroupResponseBody build() {
            return new CreateTaskGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTaskGroupResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private Integer creatorUserId;

        @com.aliyun.core.annotation.NameInMap("GroupStatus")
        private String groupStatus;

        @com.aliyun.core.annotation.NameInMap("SampleNames")
        private java.util.List<String> sampleNames;

        @com.aliyun.core.annotation.NameInMap("SubTaskCount")
        private Integer subTaskCount;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("TaskGroupId")
        private Integer taskGroupId;

        @com.aliyun.core.annotation.NameInMap("TaskGroupName")
        private String taskGroupName;

        private ResultObject(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorUserId = builder.creatorUserId;
            this.groupStatus = builder.groupStatus;
            this.sampleNames = builder.sampleNames;
            this.subTaskCount = builder.subTaskCount;
            this.tab = builder.tab;
            this.taskGroupId = builder.taskGroupId;
            this.taskGroupName = builder.taskGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorUserId
         */
        public Integer getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return groupStatus
         */
        public String getGroupStatus() {
            return this.groupStatus;
        }

        /**
         * @return sampleNames
         */
        public java.util.List<String> getSampleNames() {
            return this.sampleNames;
        }

        /**
         * @return subTaskCount
         */
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return taskGroupId
         */
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        /**
         * @return taskGroupName
         */
        public String getTaskGroupName() {
            return this.taskGroupName;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer creatorUserId; 
            private String groupStatus; 
            private java.util.List<String> sampleNames; 
            private Integer subTaskCount; 
            private String tab; 
            private Integer taskGroupId; 
            private String taskGroupName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.createTime = model.createTime;
                this.creatorUserId = model.creatorUserId;
                this.groupStatus = model.groupStatus;
                this.sampleNames = model.sampleNames;
                this.subTaskCount = model.subTaskCount;
                this.tab = model.tab;
                this.taskGroupId = model.taskGroupId;
                this.taskGroupName = model.taskGroupName;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(Integer creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * GroupStatus.
             */
            public Builder groupStatus(String groupStatus) {
                this.groupStatus = groupStatus;
                return this;
            }

            /**
             * SampleNames.
             */
            public Builder sampleNames(java.util.List<String> sampleNames) {
                this.sampleNames = sampleNames;
                return this;
            }

            /**
             * SubTaskCount.
             */
            public Builder subTaskCount(Integer subTaskCount) {
                this.subTaskCount = subTaskCount;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * TaskGroupId.
             */
            public Builder taskGroupId(Integer taskGroupId) {
                this.taskGroupId = taskGroupId;
                return this;
            }

            /**
             * TaskGroupName.
             */
            public Builder taskGroupName(String taskGroupName) {
                this.taskGroupName = taskGroupName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}

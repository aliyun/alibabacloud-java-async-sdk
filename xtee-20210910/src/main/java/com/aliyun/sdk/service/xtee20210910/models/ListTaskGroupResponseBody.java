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
 * {@link ListTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskGroupResponseBody</p>
 */
public class ListTaskGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListTaskGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskGroupResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String httpStatusCode; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListTaskGroupResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * TotalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListTaskGroupResponseBody build() {
            return new ListTaskGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskGroupResponseBody</p>
     */
    public static class SubTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HideViewResultButton")
        private Boolean hideViewResultButton;

        @com.aliyun.core.annotation.NameInMap("IsCharge")
        private Boolean isCharge;

        @com.aliyun.core.annotation.NameInMap("ModelScene")
        private String modelScene;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private Integer sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SubTaskId")
        private Integer subTaskId;

        @com.aliyun.core.annotation.NameInMap("SupportCancel")
        private Boolean supportCancel;

        @com.aliyun.core.annotation.NameInMap("SupportDownload")
        private Boolean supportDownload;

        @com.aliyun.core.annotation.NameInMap("SupportMergeSelect")
        private Boolean supportMergeSelect;

        @com.aliyun.core.annotation.NameInMap("SupportView")
        private Boolean supportView;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("TaskGroupId")
        private Integer taskGroupId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private SubTaskList(Builder builder) {
            this.finishTime = builder.finishTime;
            this.groupName = builder.groupName;
            this.hideViewResultButton = builder.hideViewResultButton;
            this.isCharge = builder.isCharge;
            this.modelScene = builder.modelScene;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.subTaskId = builder.subTaskId;
            this.supportCancel = builder.supportCancel;
            this.supportDownload = builder.supportDownload;
            this.supportMergeSelect = builder.supportMergeSelect;
            this.supportView = builder.supportView;
            this.tab = builder.tab;
            this.taskGroupId = builder.taskGroupId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTaskList create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hideViewResultButton
         */
        public Boolean getHideViewResultButton() {
            return this.hideViewResultButton;
        }

        /**
         * @return isCharge
         */
        public Boolean getIsCharge() {
            return this.isCharge;
        }

        /**
         * @return modelScene
         */
        public String getModelScene() {
            return this.modelScene;
        }

        /**
         * @return sampleId
         */
        public Integer getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return subTaskId
         */
        public Integer getSubTaskId() {
            return this.subTaskId;
        }

        /**
         * @return supportCancel
         */
        public Boolean getSupportCancel() {
            return this.supportCancel;
        }

        /**
         * @return supportDownload
         */
        public Boolean getSupportDownload() {
            return this.supportDownload;
        }

        /**
         * @return supportMergeSelect
         */
        public Boolean getSupportMergeSelect() {
            return this.supportMergeSelect;
        }

        /**
         * @return supportView
         */
        public Boolean getSupportView() {
            return this.supportView;
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
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private Long finishTime; 
            private String groupName; 
            private Boolean hideViewResultButton; 
            private Boolean isCharge; 
            private String modelScene; 
            private Integer sampleId; 
            private String sampleName; 
            private String serviceCode; 
            private String serviceName; 
            private Integer subTaskId; 
            private Boolean supportCancel; 
            private Boolean supportDownload; 
            private Boolean supportMergeSelect; 
            private Boolean supportView; 
            private String tab; 
            private Integer taskGroupId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(SubTaskList model) {
                this.finishTime = model.finishTime;
                this.groupName = model.groupName;
                this.hideViewResultButton = model.hideViewResultButton;
                this.isCharge = model.isCharge;
                this.modelScene = model.modelScene;
                this.sampleId = model.sampleId;
                this.sampleName = model.sampleName;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.subTaskId = model.subTaskId;
                this.supportCancel = model.supportCancel;
                this.supportDownload = model.supportDownload;
                this.supportMergeSelect = model.supportMergeSelect;
                this.supportView = model.supportView;
                this.tab = model.tab;
                this.taskGroupId = model.taskGroupId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HideViewResultButton.
             */
            public Builder hideViewResultButton(Boolean hideViewResultButton) {
                this.hideViewResultButton = hideViewResultButton;
                return this;
            }

            /**
             * IsCharge.
             */
            public Builder isCharge(Boolean isCharge) {
                this.isCharge = isCharge;
                return this;
            }

            /**
             * ModelScene.
             */
            public Builder modelScene(String modelScene) {
                this.modelScene = modelScene;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(Integer sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SubTaskId.
             */
            public Builder subTaskId(Integer subTaskId) {
                this.subTaskId = subTaskId;
                return this;
            }

            /**
             * SupportCancel.
             */
            public Builder supportCancel(Boolean supportCancel) {
                this.supportCancel = supportCancel;
                return this;
            }

            /**
             * SupportDownload.
             */
            public Builder supportDownload(Boolean supportDownload) {
                this.supportDownload = supportDownload;
                return this;
            }

            /**
             * SupportMergeSelect.
             */
            public Builder supportMergeSelect(Boolean supportMergeSelect) {
                this.supportMergeSelect = supportMergeSelect;
                return this;
            }

            /**
             * SupportView.
             */
            public Builder supportView(Boolean supportView) {
                this.supportView = supportView;
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
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public SubTaskList build() {
                return new SubTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskGroupResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private Long creatorUserId;

        @com.aliyun.core.annotation.NameInMap("GroupStatus")
        private String groupStatus;

        @com.aliyun.core.annotation.NameInMap("SampleNames")
        private java.util.List<String> sampleNames;

        @com.aliyun.core.annotation.NameInMap("SubTaskCount")
        private Integer subTaskCount;

        @com.aliyun.core.annotation.NameInMap("SubTaskList")
        private java.util.List<SubTaskList> subTaskList;

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
            this.subTaskList = builder.subTaskList;
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
        public Long getCreatorUserId() {
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
         * @return subTaskList
         */
        public java.util.List<SubTaskList> getSubTaskList() {
            return this.subTaskList;
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
            private Long creatorUserId; 
            private String groupStatus; 
            private java.util.List<String> sampleNames; 
            private Integer subTaskCount; 
            private java.util.List<SubTaskList> subTaskList; 
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
                this.subTaskList = model.subTaskList;
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
            public Builder creatorUserId(Long creatorUserId) {
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
             * SubTaskList.
             */
            public Builder subTaskList(java.util.List<SubTaskList> subTaskList) {
                this.subTaskList = subTaskList;
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

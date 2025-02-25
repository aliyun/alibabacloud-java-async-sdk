// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ListUserGameProcessResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGameProcessResponseBody</p>
 */
public class ListUserGameProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListUserGameProcessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGameProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List<Model> getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Model> model; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(java.util.List<Model> model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserGameProcessResponseBody build() {
            return new ListUserGameProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGameProcessResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGameProcessResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentShowContent")
        private String currentShowContent;

        @com.aliyun.core.annotation.NameInMap("CurrentStepId")
        private String currentStepId;

        @com.aliyun.core.annotation.NameInMap("CurrentStepStatus")
        private String currentStepStatus;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("GameId")
        private String gameId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private String routeId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Model(Builder builder) {
            this.activityId = builder.activityId;
            this.createTime = builder.createTime;
            this.currentShowContent = builder.currentShowContent;
            this.currentStepId = builder.currentStepId;
            this.currentStepStatus = builder.currentStepStatus;
            this.desc = builder.desc;
            this.extInfo = builder.extInfo;
            this.gameId = builder.gameId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.processId = builder.processId;
            this.routeId = builder.routeId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentShowContent
         */
        public String getCurrentShowContent() {
            return this.currentShowContent;
        }

        /**
         * @return currentStepId
         */
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        /**
         * @return currentStepStatus
         */
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return gameId
         */
        public String getGameId() {
            return this.gameId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String activityId; 
            private Long createTime; 
            private String currentShowContent; 
            private String currentStepId; 
            private String currentStepStatus; 
            private String desc; 
            private String extInfo; 
            private String gameId; 
            private Long modifyTime; 
            private String name; 
            private String processId; 
            private String routeId; 
            private String status; 
            private String type; 

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
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
             * CurrentShowContent.
             */
            public Builder currentShowContent(String currentShowContent) {
                this.currentShowContent = currentShowContent;
                return this;
            }

            /**
             * CurrentStepId.
             */
            public Builder currentStepId(String currentStepId) {
                this.currentStepId = currentStepId;
                return this;
            }

            /**
             * CurrentStepStatus.
             */
            public Builder currentStepStatus(String currentStepStatus) {
                this.currentStepStatus = currentStepStatus;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * GameId.
             */
            public Builder gameId(String gameId) {
                this.gameId = gameId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGameProcessResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserGameProcessResponseBody</p>
 */
public class QueryUserGameProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private QueryUserGameProcessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGameProcessResponseBody create() {
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
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

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
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUserGameProcessResponseBody build() {
            return new QueryUserGameProcessResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CurrentShowContent")
        private String currentShowContent;

        @NameInMap("CurrentStepId")
        private String currentStepId;

        @NameInMap("CurrentStepStatus")
        private String currentStepStatus;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("ExtInfo")
        private String extInfo;

        @NameInMap("GameId")
        private String gameId;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("RouteId")
        private String routeId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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

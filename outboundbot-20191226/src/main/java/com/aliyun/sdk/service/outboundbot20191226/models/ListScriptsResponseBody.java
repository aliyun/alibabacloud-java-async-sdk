// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptsResponseBody</p>
 */
public class ListScriptsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scripts")
    private Scripts scripts;

    @NameInMap("Success")
    private Boolean success;

    private ListScriptsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scripts = builder.scripts;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptsResponseBody create() {
        return builder().build();
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
     * @return scripts
     */
    public Scripts getScripts() {
        return this.scripts;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Scripts scripts; 
        private Boolean success; 

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
         * Scripts.
         */
        public Builder scripts(Scripts scripts) {
            this.scripts = scripts;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScriptsResponseBody build() {
            return new ListScriptsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("DebugStatus")
        private String debugStatus;

        @NameInMap("EmotionEnable")
        private Boolean emotionEnable;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        private Boolean isDrafted;

        @NameInMap("IsPreset")
        private Boolean isPreset;

        @NameInMap("LongWaitEnable")
        private Boolean longWaitEnable;

        @NameInMap("MiniPlaybackEnable")
        private Boolean miniPlaybackEnable;

        @NameInMap("NewBargeInEnable")
        private Boolean newBargeInEnable;

        @NameInMap("RejectReason")
        private String rejectReason;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("ScriptDescription")
        private String scriptDescription;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private List(Builder builder) {
            this.debugStatus = builder.debugStatus;
            this.emotionEnable = builder.emotionEnable;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.isPreset = builder.isPreset;
            this.longWaitEnable = builder.longWaitEnable;
            this.miniPlaybackEnable = builder.miniPlaybackEnable;
            this.newBargeInEnable = builder.newBargeInEnable;
            this.rejectReason = builder.rejectReason;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return emotionEnable
         */
        public Boolean getEmotionEnable() {
            return this.emotionEnable;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        /**
         * @return isPreset
         */
        public Boolean getIsPreset() {
            return this.isPreset;
        }

        /**
         * @return longWaitEnable
         */
        public Boolean getLongWaitEnable() {
            return this.longWaitEnable;
        }

        /**
         * @return miniPlaybackEnable
         */
        public Boolean getMiniPlaybackEnable() {
            return this.miniPlaybackEnable;
        }

        /**
         * @return newBargeInEnable
         */
        public Boolean getNewBargeInEnable() {
            return this.newBargeInEnable;
        }

        /**
         * @return rejectReason
         */
        public String getRejectReason() {
            return this.rejectReason;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scriptDescription
         */
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String debugStatus; 
            private Boolean emotionEnable; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private Boolean isPreset; 
            private Boolean longWaitEnable; 
            private Boolean miniPlaybackEnable; 
            private Boolean newBargeInEnable; 
            private String rejectReason; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String scriptName; 
            private String status; 
            private Long updateTime; 

            /**
             * DebugStatus.
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * EmotionEnable.
             */
            public Builder emotionEnable(Boolean emotionEnable) {
                this.emotionEnable = emotionEnable;
                return this;
            }

            /**
             * Industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * IsDebugDrafted.
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * IsDrafted.
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * IsPreset.
             */
            public Builder isPreset(Boolean isPreset) {
                this.isPreset = isPreset;
                return this;
            }

            /**
             * LongWaitEnable.
             */
            public Builder longWaitEnable(Boolean longWaitEnable) {
                this.longWaitEnable = longWaitEnable;
                return this;
            }

            /**
             * MiniPlaybackEnable.
             */
            public Builder miniPlaybackEnable(Boolean miniPlaybackEnable) {
                this.miniPlaybackEnable = miniPlaybackEnable;
                return this;
            }

            /**
             * NewBargeInEnable.
             */
            public Builder newBargeInEnable(Boolean newBargeInEnable) {
                this.newBargeInEnable = newBargeInEnable;
                return this;
            }

            /**
             * RejectReason.
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * ScriptDescription.
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
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
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Scripts extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Scripts(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scripts create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
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
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Scripts build() {
                return new Scripts(this);
            } 

        } 

    }
}

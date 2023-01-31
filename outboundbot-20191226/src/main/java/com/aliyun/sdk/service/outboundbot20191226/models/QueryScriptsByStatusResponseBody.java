// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScriptsByStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScriptsByStatusResponseBody</p>
 */
public class QueryScriptsByStatusResponseBody extends TeaModel {
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

    private QueryScriptsByStatusResponseBody(Builder builder) {
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

    public static QueryScriptsByStatusResponseBody create() {
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

        public QueryScriptsByStatusResponseBody build() {
            return new QueryScriptsByStatusResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AppliedVersion")
        private String appliedVersion;

        @NameInMap("DebugStatus")
        private String debugStatus;

        @NameInMap("DebugVersion")
        private String debugVersion;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        private Boolean isDrafted;

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
            this.appliedVersion = builder.appliedVersion;
            this.debugStatus = builder.debugStatus;
            this.debugVersion = builder.debugVersion;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
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
         * @return appliedVersion
         */
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return debugVersion
         */
        public String getDebugVersion() {
            return this.debugVersion;
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
            private String appliedVersion; 
            private String debugStatus; 
            private String debugVersion; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String scriptName; 
            private String status; 
            private Long updateTime; 

            /**
             * AppliedVersion.
             */
            public Builder appliedVersion(String appliedVersion) {
                this.appliedVersion = appliedVersion;
                return this;
            }

            /**
             * DebugStatus.
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * DebugVersion.
             */
            public Builder debugVersion(String debugVersion) {
                this.debugVersion = debugVersion;
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

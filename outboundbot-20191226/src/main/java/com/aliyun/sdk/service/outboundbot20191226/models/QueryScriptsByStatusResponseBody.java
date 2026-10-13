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
 * {@link QueryScriptsByStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScriptsByStatusResponseBody</p>
 */
public class QueryScriptsByStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scripts")
    private Scripts scripts;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryScriptsByStatusResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scripts = model.scripts;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
         * <p>The list of scenarios.</p>
         */
        public Builder scripts(Scripts scripts) {
            this.scripts = scripts;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryScriptsByStatusResponseBody build() {
            return new QueryScriptsByStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryScriptsByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryScriptsByStatusResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedVersion")
        private String appliedVersion;

        @com.aliyun.core.annotation.NameInMap("DebugStatus")
        private String debugStatus;

        @com.aliyun.core.annotation.NameInMap("DebugVersion")
        private String debugVersion;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @com.aliyun.core.annotation.NameInMap("IsDrafted")
        private Boolean isDrafted;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ScriptDescription")
        private String scriptDescription;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(List model) {
                this.appliedVersion = model.appliedVersion;
                this.debugStatus = model.debugStatus;
                this.debugVersion = model.debugVersion;
                this.industry = model.industry;
                this.isDebugDrafted = model.isDebugDrafted;
                this.isDrafted = model.isDrafted;
                this.scene = model.scene;
                this.scriptDescription = model.scriptDescription;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1579055782000</p>
             */
            public Builder appliedVersion(String appliedVersion) {
                this.appliedVersion = appliedVersion;
                return this;
            }

            /**
             * <p>The debug status.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>The debug version.</p>
             * 
             * <strong>example:</strong>
             * <p>01bb2df2-a273-42bb-a214-d3c626b13296</p>
             */
            public Builder debugVersion(String debugVersion) {
                this.debugVersion = debugVersion;
                return this;
            }

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>Indicates whether the debug version is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * <p>Indicates whether the version is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Telemarketing</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The script description.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales script</p>
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales script</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The status of the application version. Valid values:</p>
             * <ul>
             * <li><strong>DRAFTED</strong>: Draft.</li>
             * <li><strong>INITIALIZE_IN_PROGRESS</strong>: Initializing.</li>
             * <li><strong>PUBLISHED</strong>: Published.</li>
             * <li><strong>PUBLISH_IN_PROGRESS</strong>: Publishing.</li>
             * <li><strong>ROLLBACK_IN_PROGRESS</strong>: Rolling back.</li>
             * <li><strong>EXAMINE_IN_PROGRESS</strong>: Pending review.</li>
             * <li><strong>PUBLISHED_AND_EXAMINE_IN_PROGRESS</strong>: Published and pending review.</li>
             * <li><strong>PUBLISH_FAILED</strong>: Publish failed.</li>
             * <li><strong>ROLLBACK_FAILED</strong>: Rollback failed.</li>
             * <li><strong>IMPORT_IN_PROGRESS</strong>: Importing.</li>
             * <li><strong>IMPORT_FAILED</strong>: Import failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579055782000</p>
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
    /**
     * 
     * {@link QueryScriptsByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryScriptsByStatusResponseBody</p>
     */
    public static class Scripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Scripts model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of scenario details.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptPublishHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptPublishHistoriesResponseBody</p>
 */
public class ListScriptPublishHistoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScriptPublishHistories")
    private ScriptPublishHistories scriptPublishHistories;

    @NameInMap("Success")
    private Boolean success;

    private ListScriptPublishHistoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scriptPublishHistories = builder.scriptPublishHistories;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptPublishHistoriesResponseBody create() {
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
     * @return scriptPublishHistories
     */
    public ScriptPublishHistories getScriptPublishHistories() {
        return this.scriptPublishHistories;
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
        private ScriptPublishHistories scriptPublishHistories; 
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
         * ScriptPublishHistories.
         */
        public Builder scriptPublishHistories(ScriptPublishHistories scriptPublishHistories) {
            this.scriptPublishHistories = scriptPublishHistories;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScriptPublishHistoriesResponseBody build() {
            return new ListScriptPublishHistoriesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PublishTime")
        private Long publishTime;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptVersion")
        private String scriptVersion;

        private List(Builder builder) {
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.publishTime = builder.publishTime;
            this.scriptId = builder.scriptId;
            this.scriptVersion = builder.scriptVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return publishTime
         */
        public Long getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public static final class Builder {
            private String description; 
            private String instanceId; 
            private Long publishTime; 
            private String scriptId; 
            private String scriptVersion; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * PublishTime.
             */
            public Builder publishTime(Long publishTime) {
                this.publishTime = publishTime;
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
             * ScriptVersion.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class ScriptPublishHistories extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private ScriptPublishHistories(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptPublishHistories create() {
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

            public ScriptPublishHistories build() {
                return new ScriptPublishHistories(this);
            } 

        } 

    }
}

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
 * {@link ListScriptVoiceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptVoiceConfigsResponseBody</p>
 */
public class ListScriptVoiceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScriptVoiceConfigs")
    private ScriptVoiceConfigs scriptVoiceConfigs;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListScriptVoiceConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scriptVoiceConfigs = builder.scriptVoiceConfigs;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptVoiceConfigsResponseBody create() {
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
     * @return scriptVoiceConfigs
     */
    public ScriptVoiceConfigs getScriptVoiceConfigs() {
        return this.scriptVoiceConfigs;
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
        private ScriptVoiceConfigs scriptVoiceConfigs; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListScriptVoiceConfigsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scriptVoiceConfigs = model.scriptVoiceConfigs;
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
         * ScriptVoiceConfigs.
         */
        public Builder scriptVoiceConfigs(ScriptVoiceConfigs scriptVoiceConfigs) {
            this.scriptVoiceConfigs = scriptVoiceConfigs;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScriptVoiceConfigsResponseBody build() {
            return new ListScriptVoiceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScriptVoiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListScriptVoiceConfigsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        private String scriptContent;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptVoiceConfigId")
        private String scriptVoiceConfigId;

        @com.aliyun.core.annotation.NameInMap("ScriptWaveformRelation")
        private String scriptWaveformRelation;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.instanceId = builder.instanceId;
            this.scriptContent = builder.scriptContent;
            this.scriptId = builder.scriptId;
            this.scriptVoiceConfigId = builder.scriptVoiceConfigId;
            this.scriptWaveformRelation = builder.scriptWaveformRelation;
            this.source = builder.source;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptVoiceConfigId
         */
        public String getScriptVoiceConfigId() {
            return this.scriptVoiceConfigId;
        }

        /**
         * @return scriptWaveformRelation
         */
        public String getScriptWaveformRelation() {
            return this.scriptWaveformRelation;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String scriptContent; 
            private String scriptId; 
            private String scriptVoiceConfigId; 
            private String scriptWaveformRelation; 
            private String source; 
            private String type; 

            private Builder() {
            } 

            private Builder(List model) {
                this.instanceId = model.instanceId;
                this.scriptContent = model.scriptContent;
                this.scriptId = model.scriptId;
                this.scriptVoiceConfigId = model.scriptVoiceConfigId;
                this.scriptWaveformRelation = model.scriptWaveformRelation;
                this.source = model.source;
                this.type = model.type;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ScriptContent.
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
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
             * ScriptVoiceConfigId.
             */
            public Builder scriptVoiceConfigId(String scriptVoiceConfigId) {
                this.scriptVoiceConfigId = scriptVoiceConfigId;
                return this;
            }

            /**
             * ScriptWaveformRelation.
             */
            public Builder scriptWaveformRelation(String scriptWaveformRelation) {
                this.scriptWaveformRelation = scriptWaveformRelation;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScriptVoiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListScriptVoiceConfigsResponseBody</p>
     */
    public static class ScriptVoiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ScriptVoiceConfigs(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptVoiceConfigs create() {
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

            private Builder(ScriptVoiceConfigs model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
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

            public ScriptVoiceConfigs build() {
                return new ScriptVoiceConfigs(this);
            } 

        } 

    }
}

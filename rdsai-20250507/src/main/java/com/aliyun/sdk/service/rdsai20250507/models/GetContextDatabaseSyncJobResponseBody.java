// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseSyncJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncJobResponseBody</p>
 */
public class GetContextDatabaseSyncJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetContextDatabaseSyncJobResponseBody(Builder builder) {
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

    public static GetContextDatabaseSyncJobResponseBody create() {
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
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseSyncJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContextDatabaseSyncJobResponseBody build() {
            return new GetContextDatabaseSyncJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncJobResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exclude")
        private java.util.List<String> exclude;

        @com.aliyun.core.annotation.NameInMap("ExcludedDocumentIds")
        private java.util.List<String> excludedDocumentIds;

        @com.aliyun.core.annotation.NameInMap("Include")
        private java.util.List<String> include;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        @com.aliyun.core.annotation.NameInMap("TypeAllowlist")
        private java.util.List<String> typeAllowlist;

        private Filters(Builder builder) {
            this.exclude = builder.exclude;
            this.excludedDocumentIds = builder.excludedDocumentIds;
            this.include = builder.include;
            this.sizeLimit = builder.sizeLimit;
            this.typeAllowlist = builder.typeAllowlist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return exclude
         */
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

        /**
         * @return excludedDocumentIds
         */
        public java.util.List<String> getExcludedDocumentIds() {
            return this.excludedDocumentIds;
        }

        /**
         * @return include
         */
        public java.util.List<String> getInclude() {
            return this.include;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        /**
         * @return typeAllowlist
         */
        public java.util.List<String> getTypeAllowlist() {
            return this.typeAllowlist;
        }

        public static final class Builder {
            private java.util.List<String> exclude; 
            private java.util.List<String> excludedDocumentIds; 
            private java.util.List<String> include; 
            private Long sizeLimit; 
            private java.util.List<String> typeAllowlist; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.exclude = model.exclude;
                this.excludedDocumentIds = model.excludedDocumentIds;
                this.include = model.include;
                this.sizeLimit = model.sizeLimit;
                this.typeAllowlist = model.typeAllowlist;
            } 

            /**
             * <p>The list of exclusion rules.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/Archived documents&quot;]</p>
             */
            public Builder exclude(java.util.List<String> exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The list of excluded document IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;doc-as1llqmkol****&quot;]</p>
             */
            public Builder excludedDocumentIds(java.util.List<String> excludedDocumentIds) {
                this.excludedDocumentIds = excludedDocumentIds;
                return this;
            }

            /**
             * <p>The list of inclusion rules.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/R&amp;D documents&quot;]</p>
             */
            public Builder include(java.util.List<String> include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The size limit in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2147483648</p>
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            /**
             * <p>The list of allowed document types.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;docx&quot;, &quot;pdf&quot;]</p>
             */
            public Builder typeAllowlist(java.util.List<String> typeAllowlist) {
                this.typeAllowlist = typeAllowlist;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextDatabaseSyncJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPauseReason")
        private String autoPauseReason;

        @com.aliyun.core.annotation.NameInMap("AutoPaused")
        private Boolean autoPaused;

        @com.aliyun.core.annotation.NameInMap("ConfigVersion")
        private Integer configVersion;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private Filters filters;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        private Data(Builder builder) {
            this.autoPauseReason = builder.autoPauseReason;
            this.autoPaused = builder.autoPaused;
            this.configVersion = builder.configVersion;
            this.enabled = builder.enabled;
            this.filters = builder.filters;
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.name = builder.name;
            this.nextRunAt = builder.nextRunAt;
            this.scheduleType = builder.scheduleType;
            this.sourceId = builder.sourceId;
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoPauseReason
         */
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        /**
         * @return autoPaused
         */
        public Boolean getAutoPaused() {
            return this.autoPaused;
        }

        /**
         * @return configVersion
         */
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return filters
         */
        public Filters getFilters() {
            return this.filters;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private String autoPauseReason; 
            private Boolean autoPaused; 
            private Integer configVersion; 
            private Boolean enabled; 
            private Filters filters; 
            private String id; 
            private String knowledgeBaseId; 
            private String name; 
            private String nextRunAt; 
            private String scheduleType; 
            private String sourceId; 
            private String targetId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoPauseReason = model.autoPauseReason;
                this.autoPaused = model.autoPaused;
                this.configVersion = model.configVersion;
                this.enabled = model.enabled;
                this.filters = model.filters;
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.name = model.name;
                this.nextRunAt = model.nextRunAt;
                this.scheduleType = model.scheduleType;
                this.sourceId = model.sourceId;
                this.targetId = model.targetId;
            } 

            /**
             * <p>The reason for the automatic pause.</p>
             * 
             * <strong>example:</strong>
             * <p>3 consecutive execution failures</p>
             */
            public Builder autoPauseReason(String autoPauseReason) {
                this.autoPauseReason = autoPauseReason;
                return this;
            }

            /**
             * <p>Indicates whether the job is automatically paused.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPaused(Boolean autoPaused) {
                this.autoPaused = autoPaused;
                return this;
            }

            /**
             * <p>The configuration version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder configVersion(Integer configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * <p>Indicates whether the job is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;include&quot;:[&quot;/R&amp;D documents/<strong>&quot;],&quot;exclude&quot;:[&quot;/Archived documents/</strong>&quot;],&quot;excludedDocumentIds&quot;:[],&quot;sizeLimit&quot;:2147483648,&quot;typeAllowlist&quot;:[&quot;docx&quot;,&quot;pdf&quot;]}</p>
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The job ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The target knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-as1llqmkol****</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D team document import</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * <p>The schedule type. Valid values: interval and daily-times.</p>
             * 
             * <strong>example:</strong>
             * <p>daily-times</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The data source ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The target ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

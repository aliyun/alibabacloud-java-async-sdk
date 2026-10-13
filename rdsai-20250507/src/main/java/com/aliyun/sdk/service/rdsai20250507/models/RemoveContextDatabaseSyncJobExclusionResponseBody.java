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
 * {@link RemoveContextDatabaseSyncJobExclusionResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveContextDatabaseSyncJobExclusionResponseBody</p>
 */
public class RemoveContextDatabaseSyncJobExclusionResponseBody extends TeaModel {
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

    private RemoveContextDatabaseSyncJobExclusionResponseBody(Builder builder) {
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

    public static RemoveContextDatabaseSyncJobExclusionResponseBody create() {
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

        private Builder(RemoveContextDatabaseSyncJobExclusionResponseBody model) {
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
         * <p>Example value</p>
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
         * <p>Example value</p>
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

        public RemoveContextDatabaseSyncJobExclusionResponseBody build() {
            return new RemoveContextDatabaseSyncJobExclusionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveContextDatabaseSyncJobExclusionResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveContextDatabaseSyncJobExclusionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Changed")
        private Boolean changed;

        @com.aliyun.core.annotation.NameInMap("ConfigVersion")
        private Integer configVersion;

        @com.aliyun.core.annotation.NameInMap("DocumentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("Excluded")
        private Boolean excluded;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private Data(Builder builder) {
            this.changed = builder.changed;
            this.configVersion = builder.configVersion;
            this.documentId = builder.documentId;
            this.excluded = builder.excluded;
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changed
         */
        public Boolean getChanged() {
            return this.changed;
        }

        /**
         * @return configVersion
         */
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return excluded
         */
        public Boolean getExcluded() {
            return this.excluded;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private Boolean changed; 
            private Integer configVersion; 
            private String documentId; 
            private Boolean excluded; 
            private String jobId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changed = model.changed;
                this.configVersion = model.configVersion;
                this.documentId = model.documentId;
                this.excluded = model.excluded;
                this.jobId = model.jobId;
            } 

            /**
             * <p>Indicates whether the data has changed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
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
             * <p>The document ID.</p>
             * 
             * <strong>example:</strong>
             * <p>doc-as1llqmkol****</p>
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>Indicates whether the item is excluded.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder excluded(Boolean excluded) {
                this.excluded = excluded;
                return this;
            }

            /**
             * <p>The job ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

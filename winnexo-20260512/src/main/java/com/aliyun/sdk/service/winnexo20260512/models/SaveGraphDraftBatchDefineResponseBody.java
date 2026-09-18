// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SaveGraphDraftBatchDefineResponseBody} extends {@link TeaModel}
 *
 * <p>SaveGraphDraftBatchDefineResponseBody</p>
 */
public class SaveGraphDraftBatchDefineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("saveMode")
    private String saveMode;

    @com.aliyun.core.annotation.NameInMap("savedCount")
    private Integer savedCount;

    private SaveGraphDraftBatchDefineResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.saveMode = builder.saveMode;
        this.savedCount = builder.savedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGraphDraftBatchDefineResponseBody create() {
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
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return saveMode
     */
    public String getSaveMode() {
        return this.saveMode;
    }

    /**
     * @return savedCount
     */
    public Integer getSavedCount() {
        return this.savedCount;
    }

    public static final class Builder {
        private String code; 
        private String graphName; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private String saveMode; 
        private Integer savedCount; 

        private Builder() {
        } 

        private Builder(SaveGraphDraftBatchDefineResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.saveMode = model.saveMode;
            this.savedCount = model.savedCount;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The graph name.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The list of MCP cards.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The save mode.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL_YAML</p>
         */
        public Builder saveMode(String saveMode) {
            this.saveMode = saveMode;
            return this;
        }

        /**
         * <p>The number of saved items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder savedCount(Integer savedCount) {
            this.savedCount = savedCount;
            return this;
        }

        public SaveGraphDraftBatchDefineResponseBody build() {
            return new SaveGraphDraftBatchDefineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SaveGraphDraftBatchDefineResponseBody} extends {@link TeaModel}
     *
     * <p>SaveGraphDraftBatchDefineResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseContentHash")
        private String baseContentHash;

        @com.aliyun.core.annotation.NameInMap("baseSchemaVersion")
        private String baseSchemaVersion;

        @com.aliyun.core.annotation.NameInMap("draftChangeId")
        private Long draftChangeId;

        @com.aliyun.core.annotation.NameInMap("draftContentHash")
        private String draftContentHash;

        @com.aliyun.core.annotation.NameInMap("elementType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String elementType;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("resourceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private Items(Builder builder) {
            this.baseContentHash = builder.baseContentHash;
            this.baseSchemaVersion = builder.baseSchemaVersion;
            this.draftChangeId = builder.draftChangeId;
            this.draftContentHash = builder.draftContentHash;
            this.elementType = builder.elementType;
            this.gmtModified = builder.gmtModified;
            this.operationType = builder.operationType;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return baseContentHash
         */
        public String getBaseContentHash() {
            return this.baseContentHash;
        }

        /**
         * @return baseSchemaVersion
         */
        public String getBaseSchemaVersion() {
            return this.baseSchemaVersion;
        }

        /**
         * @return draftChangeId
         */
        public Long getDraftChangeId() {
            return this.draftChangeId;
        }

        /**
         * @return draftContentHash
         */
        public String getDraftContentHash() {
            return this.draftContentHash;
        }

        /**
         * @return elementType
         */
        public String getElementType() {
            return this.elementType;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String baseContentHash; 
            private String baseSchemaVersion; 
            private Long draftChangeId; 
            private String draftContentHash; 
            private String elementType; 
            private String gmtModified; 
            private String operationType; 
            private String resourceName; 
            private String resourceType; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.baseContentHash = model.baseContentHash;
                this.baseSchemaVersion = model.baseSchemaVersion;
                this.draftChangeId = model.draftChangeId;
                this.draftContentHash = model.draftContentHash;
                this.elementType = model.elementType;
                this.gmtModified = model.gmtModified;
                this.operationType = model.operationType;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The hash of the draft content itself, a 64-character SHA-256 hexadecimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e</p>
             */
            public Builder baseContentHash(String baseContentHash) {
                this.baseContentHash = baseContentHash;
                return this;
            }

            /**
             * <p>The active schema version number on which the draft is based.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.3</p>
             */
            public Builder baseSchemaVersion(String baseSchemaVersion) {
                this.baseSchemaVersion = baseSchemaVersion;
                return this;
            }

            /**
             * <p>The unique draft change ID, referenced when revoking drafts or publishing.</p>
             * 
             * <strong>example:</strong>
             * <p>401001</p>
             */
            public Builder draftChangeId(Long draftChangeId) {
                this.draftChangeId = draftChangeId;
                return this;
            }

            /**
             * <p>The online content hash on which the draft save is based (draft starting point), a 64-character SHA-256 hexadecimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder draftContentHash(String draftContentHash) {
                this.draftContentHash = draftContentHash;
                return this;
            }

            /**
             * <p>The element type. Currently, only text is supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>object_type</p>
             */
            public Builder elementType(String elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-11T10:30:00+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The resource name of the agent runtime.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>object</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>BATCH_DEFINE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}

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
 * {@link ListGraphDraftResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGraphDraftResourcesResponseBody</p>
 */
public class ListGraphDraftResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGraphDraftResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphDraftResourcesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGraphDraftResourcesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>The MCP card list.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The prompt message.</p>
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

        public ListGraphDraftResourcesResponseBody build() {
            return new ListGraphDraftResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGraphDraftResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGraphDraftResourcesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseContentHash")
        private String baseContentHash;

        @com.aliyun.core.annotation.NameInMap("baseSchemaVersion")
        private String baseSchemaVersion;

        @com.aliyun.core.annotation.NameInMap("draftChangeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long draftChangeId;

        @com.aliyun.core.annotation.NameInMap("draftContentHash")
        private String draftContentHash;

        @com.aliyun.core.annotation.NameInMap("editMode")
        private String editMode;

        @com.aliyun.core.annotation.NameInMap("effectiveOperation")
        private String effectiveOperation;

        @com.aliyun.core.annotation.NameInMap("elementType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String elementType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("hasOnlineChanged")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean hasOnlineChanged;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("resourceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private Items(Builder builder) {
            this.baseContentHash = builder.baseContentHash;
            this.baseSchemaVersion = builder.baseSchemaVersion;
            this.draftChangeId = builder.draftChangeId;
            this.draftContentHash = builder.draftContentHash;
            this.editMode = builder.editMode;
            this.effectiveOperation = builder.effectiveOperation;
            this.elementType = builder.elementType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasOnlineChanged = builder.hasOnlineChanged;
            this.operationType = builder.operationType;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.risk = builder.risk;
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
         * @return editMode
         */
        public String getEditMode() {
            return this.editMode;
        }

        /**
         * @return effectiveOperation
         */
        public String getEffectiveOperation() {
            return this.effectiveOperation;
        }

        /**
         * @return elementType
         */
        public String getElementType() {
            return this.elementType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasOnlineChanged
         */
        public Boolean getHasOnlineChanged() {
            return this.hasOnlineChanged;
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
         * @return risk
         */
        public String getRisk() {
            return this.risk;
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
            private String editMode; 
            private String effectiveOperation; 
            private String elementType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasOnlineChanged; 
            private String operationType; 
            private String resourceName; 
            private String resourceType; 
            private String risk; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.baseContentHash = model.baseContentHash;
                this.baseSchemaVersion = model.baseSchemaVersion;
                this.draftChangeId = model.draftChangeId;
                this.draftContentHash = model.draftContentHash;
                this.editMode = model.editMode;
                this.effectiveOperation = model.effectiveOperation;
                this.elementType = model.elementType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hasOnlineChanged = model.hasOnlineChanged;
                this.operationType = model.operationType;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.risk = model.risk;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The hash of the draft content itself. The value is a 64-character SHA-256 hexadecimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder baseContentHash(String baseContentHash) {
                this.baseContentHash = baseContentHash;
                return this;
            }

            /**
             * <p>The active schema version number on which the draft is based.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.0</p>
             */
            public Builder baseSchemaVersion(String baseSchemaVersion) {
                this.baseSchemaVersion = baseSchemaVersion;
                return this;
            }

            /**
             * <p>The unique ID of the draft change. This ID is referenced when you revoke a draft or publish changes.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>401001</p>
             */
            public Builder draftChangeId(Long draftChangeId) {
                this.draftChangeId = draftChangeId;
                return this;
            }

            /**
             * <p>The hash of the online content on which the draft was based when it was saved (draft starting point). The value is a 64-character SHA-256 hexadecimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e</p>
             */
            public Builder draftContentHash(String draftContentHash) {
                this.draftContentHash = draftContentHash;
                return this;
            }

            /**
             * <p>The edit mode. In the current implementation, the value is always YAML, which corresponds to sourceType.</p>
             * 
             * <strong>example:</strong>
             * <p>ADVANCED</p>
             */
            public Builder editMode(String editMode) {
                this.editMode = editMode;
                return this;
            }

            /**
             * <p>The actual publish effect relative to the current online state. After a draft is saved, the online graph may have changed, and the operation intent is adjusted based on the current online state.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder effectiveOperation(String effectiveOperation) {
                this.effectiveOperation = effectiveOperation;
                return this;
            }

            /**
             * <p>The element type. Currently, only text is supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>indicator</p>
             */
            public Builder elementType(String elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T09:00:00+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T10:30:00+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the draft baseline has expired. The value is true if the hash of the online content at the time the draft was saved is inconsistent with the hash of the current active content. The ONLINE_CHANGED risk is prompted during publishing.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder hasOnlineChanged(Boolean hasOnlineChanged) {
                this.hasOnlineChanged = hasOnlineChanged;
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
             * <p>The resource name of the agent at runtime.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>customer_contract_amount</p>
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
             * <p>element</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The online risk aggregation JSON text (risk_code / risk_message). The value is null if no risk exists.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;risk_code&quot;: &quot;ONLINE_CHANGED&quot;, &quot;risk_message&quot;: &quot;The online content has changed.&quot;}</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The skill source type.</p>
             * 
             * <strong>example:</strong>
             * <p>YAML</p>
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

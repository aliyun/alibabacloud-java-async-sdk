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
 * {@link GetGraphSchemaDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGraphSchemaDetailResponseBody</p>
 */
public class GetGraphSchemaDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("businessProfile")
    private String businessProfile;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("contentHash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("graphStatus")
    private String graphStatus;

    @com.aliyun.core.annotation.NameInMap("hasDraft")
    private Boolean hasDraft;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    private String yamlEdit;

    private GetGraphSchemaDetailResponseBody(Builder builder) {
        this.businessProfile = builder.businessProfile;
        this.code = builder.code;
        this.contentHash = builder.contentHash;
        this.createdBy = builder.createdBy;
        this.displayName = builder.displayName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.graphName = builder.graphName;
        this.graphStatus = builder.graphStatus;
        this.hasDraft = builder.hasDraft;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemaVersion = builder.schemaVersion;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphSchemaDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessProfile
     */
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contentHash
     */
    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return graphStatus
     */
    public String getGraphStatus() {
        return this.graphStatus;
    }

    /**
     * @return hasDraft
     */
    public Boolean getHasDraft() {
        return this.hasDraft;
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
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return yamlEdit
     */
    public String getYamlEdit() {
        return this.yamlEdit;
    }

    public static final class Builder {
        private String businessProfile; 
        private String code; 
        private String contentHash; 
        private String createdBy; 
        private String displayName; 
        private String gmtCreate; 
        private String gmtModified; 
        private String graphName; 
        private String graphStatus; 
        private Boolean hasDraft; 
        private String message; 
        private String requestId; 
        private String schemaVersion; 
        private String yamlEdit; 

        private Builder() {
        } 

        private Builder(GetGraphSchemaDetailResponseBody model) {
            this.businessProfile = model.businessProfile;
            this.code = model.code;
            this.contentHash = model.contentHash;
            this.createdBy = model.createdBy;
            this.displayName = model.displayName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.graphName = model.graphName;
            this.graphStatus = model.graphStatus;
            this.hasDraft = model.hasDraft;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schemaVersion = model.schemaVersion;
            this.yamlEdit = model.yamlEdit;
        } 

        /**
         * <p>The business description of the graph. An empty string is returned if this parameter is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer domain semantic graph</p>
         */
        public Builder businessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
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
         * <p>The hash fingerprint of the schema content.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3</p>
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>u001</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>CRM Graph</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T10:00:00+00:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T11:30:00+00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The name of the graph.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The status of the semantic graph.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHING: A publish task is in progress for this graph.
         * DEVELOPING: An active draft exists for this graph (being edited, not yet published).
         * PUBLISHED: Normal status</p>
         */
        public Builder graphStatus(String graphStatus) {
            this.graphStatus = graphStatus;
            return this;
        }

        /**
         * <p>Indicates whether the graph contains a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasDraft(Boolean hasDraft) {
            this.hasDraft = hasDraft;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The original YAML text of the graph schema trimmed by READ permission. The $ref references within the authorized subgraph are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>name: crm_graph</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.yamlEdit = yamlEdit;
            return this;
        }

        public GetGraphSchemaDetailResponseBody build() {
            return new GetGraphSchemaDetailResponseBody(this);
        } 

    } 

}

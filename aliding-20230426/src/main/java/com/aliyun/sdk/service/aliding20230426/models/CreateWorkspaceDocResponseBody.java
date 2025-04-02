// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateWorkspaceDocResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceDocResponseBody</p>
 */
public class CreateWorkspaceDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dentryUuid")
    private String dentryUuid;

    @com.aliyun.core.annotation.NameInMap("docKey")
    private String docKey;

    @com.aliyun.core.annotation.NameInMap("nodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private CreateWorkspaceDocResponseBody(Builder builder) {
        this.dentryUuid = builder.dentryUuid;
        this.docKey = builder.docKey;
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
        this.url = builder.url;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceDocResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return docKey
     */
    public String getDocKey() {
        return this.docKey;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String dentryUuid; 
        private String docKey; 
        private String nodeId; 
        private String requestId; 
        private String url; 
        private String vendorRequestId; 
        private String vendorType; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateWorkspaceDocResponseBody model) {
            this.dentryUuid = model.dentryUuid;
            this.docKey = model.docKey;
            this.nodeId = model.nodeId;
            this.requestId = model.requestId;
            this.url = model.url;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * dentryUuid.
         */
        public Builder dentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * docKey.
         */
        public Builder docKey(String docKey) {
            this.docKey = docKey;
            return this;
        }

        /**
         * nodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateWorkspaceDocResponseBody build() {
            return new CreateWorkspaceDocResponseBody(this);
        } 

    } 

}

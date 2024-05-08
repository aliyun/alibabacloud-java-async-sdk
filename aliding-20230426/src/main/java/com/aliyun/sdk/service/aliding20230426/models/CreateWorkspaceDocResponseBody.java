// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceDocResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceDocResponseBody</p>
 */
public class CreateWorkspaceDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("docKey")
    private String docKey;

    @com.aliyun.core.annotation.NameInMap("nodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private CreateWorkspaceDocResponseBody(Builder builder) {
        this.docKey = builder.docKey;
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
        this.url = builder.url;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceDocResponseBody create() {
        return builder().build();
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String docKey; 
        private String nodeId; 
        private String requestId; 
        private String url; 
        private String workspaceId; 

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
         * requestId
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

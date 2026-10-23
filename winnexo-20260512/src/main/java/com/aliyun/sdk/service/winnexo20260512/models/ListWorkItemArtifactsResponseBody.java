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
 * {@link ListWorkItemArtifactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkItemArtifactsResponseBody</p>
 */
public class ListWorkItemArtifactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListWorkItemArtifactsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemArtifactsResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkItemArtifactsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of historical artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
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
         * <p>The total number of returned artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkItemArtifactsResponseBody build() {
            return new ListWorkItemArtifactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkItemArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkItemArtifactsResponseBody</p>
     */
    public static class Ref extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Ref(Builder builder) {
            this.id = builder.id;
            this.kind = builder.kind;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ref create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String kind; 
            private String url; 

            private Builder() {
            } 

            private Builder(Ref model) {
                this.id = model.id;
                this.kind = model.kind;
                this.url = model.url;
            } 

            /**
             * <p>The artifact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The reference data type.</p>
             * 
             * <strong>example:</strong>
             * <p>WORK_ITEM_ARTIFACT</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The OpenAPI artifact access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Ref build() {
                return new Ref(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkItemArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkItemArtifactsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("artifactKey")
        private String artifactKey;

        @com.aliyun.core.annotation.NameInMap("attemptSeq")
        private Long attemptSeq;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("nodeKey")
        private String nodeKey;

        @com.aliyun.core.annotation.NameInMap("planId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("ref")
        private Ref ref;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("sha256")
        private String sha256;

        @com.aliyun.core.annotation.NameInMap("sizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("turnSeq")
        private Long turnSeq;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("workItemId")
        private String workItemId;

        private Items(Builder builder) {
            this.artifactId = builder.artifactId;
            this.artifactKey = builder.artifactKey;
            this.attemptSeq = builder.attemptSeq;
            this.contentType = builder.contentType;
            this.createdAt = builder.createdAt;
            this.nodeKey = builder.nodeKey;
            this.planId = builder.planId;
            this.ref = builder.ref;
            this.runId = builder.runId;
            this.sha256 = builder.sha256;
            this.sizeBytes = builder.sizeBytes;
            this.summary = builder.summary;
            this.title = builder.title;
            this.turnSeq = builder.turnSeq;
            this.type = builder.type;
            this.workItemId = builder.workItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return artifactKey
         */
        public String getArtifactKey() {
            return this.artifactKey;
        }

        /**
         * @return attemptSeq
         */
        public Long getAttemptSeq() {
            return this.attemptSeq;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return nodeKey
         */
        public String getNodeKey() {
            return this.nodeKey;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return ref
         */
        public Ref getRef() {
            return this.ref;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return turnSeq
         */
        public Long getTurnSeq() {
            return this.turnSeq;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workItemId
         */
        public String getWorkItemId() {
            return this.workItemId;
        }

        public static final class Builder {
            private String artifactId; 
            private String artifactKey; 
            private Long attemptSeq; 
            private String contentType; 
            private String createdAt; 
            private String nodeKey; 
            private String planId; 
            private Ref ref; 
            private String runId; 
            private String sha256; 
            private Long sizeBytes; 
            private String summary; 
            private String title; 
            private Long turnSeq; 
            private String type; 
            private String workItemId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.artifactId = model.artifactId;
                this.artifactKey = model.artifactKey;
                this.attemptSeq = model.attemptSeq;
                this.contentType = model.contentType;
                this.createdAt = model.createdAt;
                this.nodeKey = model.nodeKey;
                this.planId = model.planId;
                this.ref = model.ref;
                this.runId = model.runId;
                this.sha256 = model.sha256;
                this.sizeBytes = model.sizeBytes;
                this.summary = model.summary;
                this.title = model.title;
                this.turnSeq = model.turnSeq;
                this.type = model.type;
                this.workItemId = model.workItemId;
            } 

            /**
             * <p>The artifact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * <p>The artifact key.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder artifactKey(String artifactKey) {
                this.artifactKey = artifactKey;
                return this;
            }

            /**
             * <p>The node attempt sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attemptSeq(Long attemptSeq) {
                this.attemptSeq = attemptSeq;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The node key.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder nodeKey(String nodeKey) {
                this.nodeKey = nodeKey;
                return this;
            }

            /**
             * <p>The plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The reference information.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder ref(Ref ref) {
                this.ref = ref;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The SHA-256 hash of the content.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * <p>The artifact size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The artifact summary.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The artifact title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The session turn sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder turnSeq(Long turnSeq) {
                this.turnSeq = turnSeq;
                return this;
            }

            /**
             * <p>The artifact type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The work item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder workItemId(String workItemId) {
                this.workItemId = workItemId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}

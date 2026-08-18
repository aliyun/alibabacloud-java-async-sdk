// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotResponseBody</p>
 */
public class GetSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Snapshot")
    private Snapshot snapshot;

    private GetSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshot
     */
    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    public static final class Builder {
        private String requestId; 
        private Snapshot snapshot; 

        private Builder() {
        } 

        private Builder(GetSnapshotResponseBody model) {
            this.requestId = model.requestId;
            this.snapshot = model.snapshot;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0bc14115-1234-5678-ABCD-159376359</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(Snapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public GetSnapshotResponseBody build() {
            return new GetSnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("StageCode")
        private String stageCode;

        private Content(Builder builder) {
            this.content = builder.content;
            this.spec = builder.spec;
            this.stageCode = builder.stageCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return stageCode
         */
        public String getStageCode() {
            return this.stageCode;
        }

        public static final class Builder {
            private String content; 
            private String spec; 
            private String stageCode; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.content = model.content;
                this.spec = model.spec;
                this.stageCode = model.stageCode;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>FlowSpec JSON</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;version&quot;:&quot;1.1.0&quot;}</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * StageCode.
             */
            public Builder stageCode(String stageCode) {
                this.stageCode = stageCode;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("ContentUrl")
        private String contentUrl;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Snapshot(Builder builder) {
            this.comment = builder.comment;
            this.content = builder.content;
            this.contentUrl = builder.contentUrl;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.id = builder.id;
            this.namespace = builder.namespace;
            this.objectId = builder.objectId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return contentUrl
         */
        public String getContentUrl() {
            return this.contentUrl;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String comment; 
            private Content content; 
            private String contentUrl; 
            private Long createTime; 
            private String creator; 
            private String id; 
            private String namespace; 
            private String objectId; 
            private String type; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Snapshot model) {
                this.comment = model.comment;
                this.content = model.content;
                this.contentUrl = model.contentUrl;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.id = model.id;
                this.namespace = model.namespace;
                this.objectId = model.objectId;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * ContentUrl.
             */
            public Builder contentUrl(String contentUrl) {
                this.contentUrl = contentUrl;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
}

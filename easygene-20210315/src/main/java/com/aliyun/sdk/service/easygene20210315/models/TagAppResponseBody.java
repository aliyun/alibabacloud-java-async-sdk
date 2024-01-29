// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagAppResponseBody} extends {@link TeaModel}
 *
 * <p>TagAppResponseBody</p>
 */
public class TagAppResponseBody extends TeaModel {
    @NameInMap("AppName")
    private String appName;

    @NameInMap("AppRevision")
    private String appRevision;

    @NameInMap("FormerRevision")
    private String formerRevision;

    @NameInMap("FormerTag")
    private String formerTag;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RevisionTag")
    private String revisionTag;

    @NameInMap("Workspace")
    private String workspace;

    private TagAppResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.appRevision = builder.appRevision;
        this.formerRevision = builder.formerRevision;
        this.formerTag = builder.formerTag;
        this.requestId = builder.requestId;
        this.revisionTag = builder.revisionTag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appRevision
     */
    public String getAppRevision() {
        return this.appRevision;
    }

    /**
     * @return formerRevision
     */
    public String getFormerRevision() {
        return this.formerRevision;
    }

    /**
     * @return formerTag
     */
    public String getFormerTag() {
        return this.formerTag;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revisionTag
     */
    public String getRevisionTag() {
        return this.revisionTag;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String appName; 
        private String appRevision; 
        private String formerRevision; 
        private String formerTag; 
        private String requestId; 
        private String revisionTag; 
        private String workspace; 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppRevision.
         */
        public Builder appRevision(String appRevision) {
            this.appRevision = appRevision;
            return this;
        }

        /**
         * FormerRevision.
         */
        public Builder formerRevision(String formerRevision) {
            this.formerRevision = formerRevision;
            return this;
        }

        /**
         * FormerTag.
         */
        public Builder formerTag(String formerTag) {
            this.formerTag = formerTag;
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
         * RevisionTag.
         */
        public Builder revisionTag(String revisionTag) {
            this.revisionTag = revisionTag;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public TagAppResponseBody build() {
            return new TagAppResponseBody(this);
        } 

    } 

}

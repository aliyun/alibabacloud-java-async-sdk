// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResponseBody</p>
 */
public class CreateAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Revision")
    private String revision;

    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    private String revisionTag;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private CreateAppResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.revisionTag = builder.revisionTag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public String getRevision() {
        return this.revision;
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
        private String hostId; 
        private String requestId; 
        private String revision; 
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
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * Revision.
         */
        public Builder revision(String revision) {
            this.revision = revision;
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

        public CreateAppResponseBody build() {
            return new CreateAppResponseBody(this);
        } 

    } 

}

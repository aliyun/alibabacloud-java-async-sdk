// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListAppReleaseStageExecutionIntegratedMetadataResponse} extends {@link TeaModel}
 *
 * <p>ListAppReleaseStageExecutionIntegratedMetadataResponse</p>
 */
public class ListAppReleaseStageExecutionIntegratedMetadataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body;

    private ListAppReleaseStageExecutionIntegratedMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAppReleaseStageExecutionIntegratedMetadataResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppReleaseStageExecutionIntegratedMetadataResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body);

        @Override
        ListAppReleaseStageExecutionIntegratedMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppReleaseStageExecutionIntegratedMetadataResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppReleaseStageExecutionIntegratedMetadataResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<ListAppReleaseStageExecutionIntegratedMetadataResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppReleaseStageExecutionIntegratedMetadataResponse build() {
            return new ListAppReleaseStageExecutionIntegratedMetadataResponse(this);
        } 

    } 

    /**
     * 
     * {@link ListAppReleaseStageExecutionIntegratedMetadataResponse} extends {@link TeaModel}
     *
     * <p>ListAppReleaseStageExecutionIntegratedMetadataResponse</p>
     */
    public static class ChangeRequests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("branchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("commitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("ownerAccountId")
        private String ownerAccountId;

        private ChangeRequests(Builder builder) {
            this.sn = builder.sn;
            this.name = builder.name;
            this.branchName = builder.branchName;
            this.commitId = builder.commitId;
            this.ownerAccountId = builder.ownerAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRequests create() {
            return builder().build();
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return ownerAccountId
         */
        public String getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public static final class Builder {
            private String sn; 
            private String name; 
            private String branchName; 
            private String commitId; 
            private String ownerAccountId; 

            /**
             * sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * branchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * commitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * ownerAccountId.
             */
            public Builder ownerAccountId(String ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            public ChangeRequests build() {
                return new ChangeRequests(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppReleaseStageExecutionIntegratedMetadataResponse} extends {@link TeaModel}
     *
     * <p>ListAppReleaseStageExecutionIntegratedMetadataResponse</p>
     */
    public static class ListAppReleaseStageExecutionIntegratedMetadataResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("releaseBranch")
        private String releaseBranch;

        @com.aliyun.core.annotation.NameInMap("releaseRevision")
        private String releaseRevision;

        @com.aliyun.core.annotation.NameInMap("repoUrl")
        private String repoUrl;

        @com.aliyun.core.annotation.NameInMap("repoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("changeRequests")
        private java.util.List<ChangeRequests> changeRequests;

        private ListAppReleaseStageExecutionIntegratedMetadataResponseBody(Builder builder) {
            this.releaseBranch = builder.releaseBranch;
            this.releaseRevision = builder.releaseRevision;
            this.repoUrl = builder.repoUrl;
            this.repoType = builder.repoType;
            this.changeRequests = builder.changeRequests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAppReleaseStageExecutionIntegratedMetadataResponseBody create() {
            return builder().build();
        }

        /**
         * @return releaseBranch
         */
        public String getReleaseBranch() {
            return this.releaseBranch;
        }

        /**
         * @return releaseRevision
         */
        public String getReleaseRevision() {
            return this.releaseRevision;
        }

        /**
         * @return repoUrl
         */
        public String getRepoUrl() {
            return this.repoUrl;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return changeRequests
         */
        public java.util.List<ChangeRequests> getChangeRequests() {
            return this.changeRequests;
        }

        public static final class Builder {
            private String releaseBranch; 
            private String releaseRevision; 
            private String repoUrl; 
            private String repoType; 
            private java.util.List<ChangeRequests> changeRequests; 

            /**
             * releaseBranch.
             */
            public Builder releaseBranch(String releaseBranch) {
                this.releaseBranch = releaseBranch;
                return this;
            }

            /**
             * releaseRevision.
             */
            public Builder releaseRevision(String releaseRevision) {
                this.releaseRevision = releaseRevision;
                return this;
            }

            /**
             * repoUrl.
             */
            public Builder repoUrl(String repoUrl) {
                this.repoUrl = repoUrl;
                return this;
            }

            /**
             * repoType.
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * changeRequests.
             */
            public Builder changeRequests(java.util.List<ChangeRequests> changeRequests) {
                this.changeRequests = changeRequests;
                return this;
            }

            public ListAppReleaseStageExecutionIntegratedMetadataResponseBody build() {
                return new ListAppReleaseStageExecutionIntegratedMetadataResponseBody(this);
            } 

        } 

    }
}

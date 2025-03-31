// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRuleResponseBody</p>
 */
public class ListRepoBuildRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildRules")
    private java.util.List<BuildRules> buildRules;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRepoBuildRuleResponseBody(Builder builder) {
        this.buildRules = builder.buildRules;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRules
     */
    public java.util.List<BuildRules> getBuildRules() {
        return this.buildRules;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BuildRules> buildRules; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRepoBuildRuleResponseBody model) {
            this.buildRules = model.buildRules;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of image building rules.</p>
         */
        public Builder buildRules(java.util.List<BuildRules> buildRules) {
            this.buildRules = buildRules;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42D782C8-E8F6-4A32-BEA0-6A6AC854C22A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRuleResponseBody build() {
            return new ListRepoBuildRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoBuildRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoBuildRuleResponseBody</p>
     */
    public static class BuildRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildArgs")
        private java.util.List<String> buildArgs;

        @com.aliyun.core.annotation.NameInMap("BuildRuleId")
        private String buildRuleId;

        @com.aliyun.core.annotation.NameInMap("DockerfileLocation")
        private String dockerfileLocation;

        @com.aliyun.core.annotation.NameInMap("DockerfileName")
        private String dockerfileName;

        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("Platforms")
        private java.util.List<String> platforms;

        @com.aliyun.core.annotation.NameInMap("PushName")
        private String pushName;

        @com.aliyun.core.annotation.NameInMap("PushType")
        private String pushType;

        private BuildRules(Builder builder) {
            this.buildArgs = builder.buildArgs;
            this.buildRuleId = builder.buildRuleId;
            this.dockerfileLocation = builder.dockerfileLocation;
            this.dockerfileName = builder.dockerfileName;
            this.imageTag = builder.imageTag;
            this.platforms = builder.platforms;
            this.pushName = builder.pushName;
            this.pushType = builder.pushType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRules create() {
            return builder().build();
        }

        /**
         * @return buildArgs
         */
        public java.util.List<String> getBuildArgs() {
            return this.buildArgs;
        }

        /**
         * @return buildRuleId
         */
        public String getBuildRuleId() {
            return this.buildRuleId;
        }

        /**
         * @return dockerfileLocation
         */
        public String getDockerfileLocation() {
            return this.dockerfileLocation;
        }

        /**
         * @return dockerfileName
         */
        public String getDockerfileName() {
            return this.dockerfileName;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return platforms
         */
        public java.util.List<String> getPlatforms() {
            return this.platforms;
        }

        /**
         * @return pushName
         */
        public String getPushName() {
            return this.pushName;
        }

        /**
         * @return pushType
         */
        public String getPushType() {
            return this.pushType;
        }

        public static final class Builder {
            private java.util.List<String> buildArgs; 
            private String buildRuleId; 
            private String dockerfileLocation; 
            private String dockerfileName; 
            private String imageTag; 
            private java.util.List<String> platforms; 
            private String pushName; 
            private String pushType; 

            private Builder() {
            } 

            private Builder(BuildRules model) {
                this.buildArgs = model.buildArgs;
                this.buildRuleId = model.buildRuleId;
                this.dockerfileLocation = model.dockerfileLocation;
                this.dockerfileName = model.dockerfileName;
                this.imageTag = model.imageTag;
                this.platforms = model.platforms;
                this.pushName = model.pushName;
                this.pushType = model.pushType;
            } 

            /**
             * BuildArgs.
             */
            public Builder buildArgs(java.util.List<String> buildArgs) {
                this.buildArgs = buildArgs;
                return this;
            }

            /**
             * <p>The ID of the image building rule.</p>
             * 
             * <strong>example:</strong>
             * <p>crbr-khys0nd3asbe****</p>
             */
            public Builder buildRuleId(String buildRuleId) {
                this.buildRuleId = buildRuleId;
                return this;
            }

            /**
             * <p>The directory of the Dockerfile.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder dockerfileLocation(String dockerfileLocation) {
                this.dockerfileLocation = dockerfileLocation;
                return this;
            }

            /**
             * <p>The name of the Dockerfile.</p>
             * 
             * <strong>example:</strong>
             * <p>Dockerfile</p>
             */
            public Builder dockerfileName(String dockerfileName) {
                this.dockerfileName = dockerfileName;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * Platforms.
             */
            public Builder platforms(java.util.List<String> platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * <p>The name of the push that triggers the building rule.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1</p>
             */
            public Builder pushName(String pushName) {
                this.pushName = pushName;
                return this;
            }

            /**
             * <p>The type of the push that triggers the image building rule. Valid values:</p>
             * <ul>
             * <li>GIT_BRANCH: branch push</li>
             * <li>GIT_TAG: tag push</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GIT_BRANCH</p>
             */
            public Builder pushType(String pushType) {
                this.pushType = pushType;
                return this;
            }

            public BuildRules build() {
                return new BuildRules(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRuleResponseBody</p>
 */
public class ListRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("BuildRules")
    private java.util.List < BuildRules> buildRules;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return buildRules
     */
    public java.util.List < BuildRules> getBuildRules() {
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
        private java.util.List < BuildRules> buildRules; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The list of image building rules.
         */
        public Builder buildRules(java.util.List < BuildRules> buildRules) {
            this.buildRules = buildRules;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   `true`: The request is successful.
         * *   `false`: The request fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRuleResponseBody build() {
            return new ListRepoBuildRuleResponseBody(this);
        } 

    } 

    public static class BuildRules extends TeaModel {
        @NameInMap("BuildArgs")
        private java.util.List < String > buildArgs;

        @NameInMap("BuildRuleId")
        private String buildRuleId;

        @NameInMap("DockerfileLocation")
        private String dockerfileLocation;

        @NameInMap("DockerfileName")
        private String dockerfileName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("Platforms")
        private java.util.List < String > platforms;

        @NameInMap("PushName")
        private String pushName;

        @NameInMap("PushType")
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
        public java.util.List < String > getBuildArgs() {
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
        public java.util.List < String > getPlatforms() {
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
            private java.util.List < String > buildArgs; 
            private String buildRuleId; 
            private String dockerfileLocation; 
            private String dockerfileName; 
            private String imageTag; 
            private java.util.List < String > platforms; 
            private String pushName; 
            private String pushType; 

            /**
             * BuildArgs.
             */
            public Builder buildArgs(java.util.List < String > buildArgs) {
                this.buildArgs = buildArgs;
                return this;
            }

            /**
             * The ID of the image building rule.
             */
            public Builder buildRuleId(String buildRuleId) {
                this.buildRuleId = buildRuleId;
                return this;
            }

            /**
             * The directory of the Dockerfile.
             */
            public Builder dockerfileLocation(String dockerfileLocation) {
                this.dockerfileLocation = dockerfileLocation;
                return this;
            }

            /**
             * The name of the Dockerfile.
             */
            public Builder dockerfileName(String dockerfileName) {
                this.dockerfileName = dockerfileName;
                return this;
            }

            /**
             * The tag of the image.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * Platforms.
             */
            public Builder platforms(java.util.List < String > platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * The name of the push that triggers the building rule.
             */
            public Builder pushName(String pushName) {
                this.pushName = pushName;
                return this;
            }

            /**
             * The type of the push that triggers the image building rule. Valid values:
             * <p>
             * 
             * *   GIT_BRANCH: branch push
             * *   GIT_TAG: tag push
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

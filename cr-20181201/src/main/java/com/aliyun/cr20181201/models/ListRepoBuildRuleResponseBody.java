// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRuleResponseBody</p>
 */
public class ListRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("BuildRules")
    private java.util.List < BuildRules> buildRules;


    private ListRepoBuildRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.buildRules = builder.buildRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return buildRules
     */
    public java.util.List < BuildRules> getBuildRules() {
        return this.buildRules;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < BuildRules> buildRules; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Build rule list</p>
         */
        public Builder buildRules(java.util.List < BuildRules> buildRules) {
            this.buildRules = buildRules;
            return this;
        }

        public ListRepoBuildRuleResponseBody build() {
            return new ListRepoBuildRuleResponseBody(this);
        } 

    } 

    public static class BuildRules extends TeaModel {
        @NameInMap("DockerfileLocation")
        private String dockerfileLocation;

        @NameInMap("BuildRuleId")
        private String buildRuleId;

        @NameInMap("PushType")
        private String pushType;

        @NameInMap("PushName")
        private String pushName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("DockerfileName")
        private String dockerfileName;

        @NameInMap("Platforms")
        private java.util.List < String > platforms;

        @NameInMap("BuildArgs")
        private java.util.List < String > buildArgs;


        private BuildRules(Builder builder) {
            this.dockerfileLocation = builder.dockerfileLocation;
            this.buildRuleId = builder.buildRuleId;
            this.pushType = builder.pushType;
            this.pushName = builder.pushName;
            this.imageTag = builder.imageTag;
            this.dockerfileName = builder.dockerfileName;
            this.platforms = builder.platforms;
            this.buildArgs = builder.buildArgs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRules create() {
            return builder().build();
        }

        /**
         * @return dockerfileLocation
         */
        public String getDockerfileLocation() {
            return this.dockerfileLocation;
        }

        /**
         * @return buildRuleId
         */
        public String getBuildRuleId() {
            return this.buildRuleId;
        }

        /**
         * @return pushType
         */
        public String getPushType() {
            return this.pushType;
        }

        /**
         * @return pushName
         */
        public String getPushName() {
            return this.pushName;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return dockerfileName
         */
        public String getDockerfileName() {
            return this.dockerfileName;
        }

        /**
         * @return platforms
         */
        public java.util.List < String > getPlatforms() {
            return this.platforms;
        }

        /**
         * @return buildArgs
         */
        public java.util.List < String > getBuildArgs() {
            return this.buildArgs;
        }

        public static final class Builder {
            private String dockerfileLocation; 
            private String buildRuleId; 
            private String pushType; 
            private String pushName; 
            private String imageTag; 
            private String dockerfileName; 
            private java.util.List < String > platforms; 
            private java.util.List < String > buildArgs; 

            /**
             * <p>Dockerfile Directory</p>
             */
            public Builder dockerfileLocation(String dockerfileLocation) {
                this.dockerfileLocation = dockerfileLocation;
                return this;
            }

            /**
             * <p>Build Rules ID</p>
             */
            public Builder buildRuleId(String buildRuleId) {
                this.buildRuleId = buildRuleId;
                return this;
            }

            /**
             * <p>The type of the source code push trigger build. Valid values:

-GIT_BRANCH: push source code from Branch

-GIT_TAG: push source code from the Tag</p>
             */
            public Builder pushType(String pushType) {
                this.pushType = pushType;
                return this;
            }

            /**
             * <p>Code push trigger build name</p>
             */
            public Builder pushName(String pushName) {
                this.pushName = pushName;
                return this;
            }

            /**
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>Dockerfile file name</p>
             */
            public Builder dockerfileName(String dockerfileName) {
                this.dockerfileName = dockerfileName;
                return this;
            }

            /**
             * <p>Platforms.</p>
             */
            public Builder platforms(java.util.List < String > platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * <p>BuildArgs.</p>
             */
            public Builder buildArgs(java.util.List < String > buildArgs) {
                this.buildArgs = buildArgs;
                return this;
            }

            public BuildRules build() {
                return new BuildRules(this);
            } 

        } 

    }
}

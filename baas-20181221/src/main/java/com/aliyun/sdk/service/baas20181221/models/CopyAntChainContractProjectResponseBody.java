// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyAntChainContractProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CopyAntChainContractProjectResponseBody</p>
 */
public class CopyAntChainContractProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CopyAntChainContractProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyAntChainContractProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CopyAntChainContractProjectResponseBody build() {
            return new CopyAntChainContractProjectResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ProjectDescription")
        private String projectDescription;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectVersion")
        private String projectVersion;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.consortiumId = builder.consortiumId;
            this.createTime = builder.createTime;
            this.projectDescription = builder.projectDescription;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectVersion = builder.projectVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return projectDescription
         */
        public String getProjectDescription() {
            return this.projectDescription;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectVersion
         */
        public String getProjectVersion() {
            return this.projectVersion;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String consortiumId; 
            private Long createTime; 
            private String projectDescription; 
            private String projectId; 
            private String projectName; 
            private String projectVersion; 
            private Long updateTime; 

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
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
             * ProjectDescription.
             */
            public Builder projectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ProjectVersion.
             */
            public Builder projectVersion(String projectVersion) {
                this.projectVersion = projectVersion;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

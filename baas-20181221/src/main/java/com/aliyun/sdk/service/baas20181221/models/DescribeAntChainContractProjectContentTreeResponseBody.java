// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainContractProjectContentTreeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainContractProjectContentTreeResponseBody</p>
 */
public class DescribeAntChainContractProjectContentTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainContractProjectContentTreeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainContractProjectContentTreeResponseBody create() {
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

        public DescribeAntChainContractProjectContentTreeResponseBody build() {
            return new DescribeAntChainContractProjectContentTreeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Children")
        private java.util.List < java.util.Map<String, ?>> children;

        @NameInMap("ProjectDescription")
        private String projectDescription;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectVersion")
        private String projectVersion;

        private Result(Builder builder) {
            this.children = builder.children;
            this.projectDescription = builder.projectDescription;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectVersion = builder.projectVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < java.util.Map<String, ?>> getChildren() {
            return this.children;
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

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> children; 
            private String projectDescription; 
            private String projectId; 
            private String projectName; 
            private String projectVersion; 

            /**
             * Children.
             */
            public Builder children(java.util.List < java.util.Map<String, ?>> children) {
                this.children = children;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

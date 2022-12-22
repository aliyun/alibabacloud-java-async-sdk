// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVersionsResponseBody</p>
 */
public class ListVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Versions")
    private java.util.List < Versions> versions;

    private ListVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVersionsResponseBody create() {
        return builder().build();
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return versions
     */
    public java.util.List < Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Versions> versions; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of versions of the workflow.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of the versions.
         */
        public Builder versions(java.util.List < Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListVersionsResponseBody build() {
            return new ListVersionsResponseBody(this);
        } 

    } 

    public static class Versions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VersionId")
        private String versionId;

        @NameInMap("VersionName")
        private String versionName;

        @NameInMap("VersionNumber")
        private Integer versionNumber;

        @NameInMap("VersionStatus")
        private String versionStatus;

        private Versions(Builder builder) {
            this.createTime = builder.createTime;
            this.flowId = builder.flowId;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
            this.versionName = builder.versionName;
            this.versionNumber = builder.versionNumber;
            this.versionStatus = builder.versionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return versionNumber
         */
        public Integer getVersionNumber() {
            return this.versionNumber;
        }

        /**
         * @return versionStatus
         */
        public String getVersionStatus() {
            return this.versionStatus;
        }

        public static final class Builder {
            private String createTime; 
            private String flowId; 
            private String updateTime; 
            private String versionId; 
            private String versionName; 
            private Integer versionNumber; 
            private String versionStatus; 

            /**
             * The time when the version was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the workflow to which the version belongs.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The time when the version was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * The name of the version.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * The number of the version. Increment from 1.
             */
            public Builder versionNumber(Integer versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            /**
             * The status of the version. **Enabled** indicates that the version is enabled.
             */
            public Builder versionStatus(String versionStatus) {
                this.versionStatus = versionStatus;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}

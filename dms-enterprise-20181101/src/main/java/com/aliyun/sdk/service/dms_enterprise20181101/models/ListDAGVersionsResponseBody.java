// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDAGVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDAGVersionsResponseBody</p>
 */
public class ListDAGVersionsResponseBody extends TeaModel {
    @NameInMap("DagVersionList")
    private DagVersionList dagVersionList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDAGVersionsResponseBody(Builder builder) {
        this.dagVersionList = builder.dagVersionList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDAGVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dagVersionList
     */
    public DagVersionList getDagVersionList() {
        return this.dagVersionList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DagVersionList dagVersionList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The information about the published versions.
         */
        public Builder dagVersionList(DagVersionList dagVersionList) {
            this.dagVersionList = dagVersionList;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDAGVersionsResponseBody build() {
            return new ListDAGVersionsResponseBody(this);
        } 

    } 

    public static class DagVersion extends TeaModel {
        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagOwnerId")
        private String dagOwnerId;

        @NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @NameInMap("LastVersionId")
        private Long lastVersionId;

        @NameInMap("VersionComments")
        private String versionComments;

        @NameInMap("VersionId")
        private Long versionId;

        private DagVersion(Builder builder) {
            this.dagName = builder.dagName;
            this.dagOwnerId = builder.dagOwnerId;
            this.dagOwnerNickName = builder.dagOwnerNickName;
            this.lastVersionId = builder.lastVersionId;
            this.versionComments = builder.versionComments;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagVersion create() {
            return builder().build();
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return dagOwnerId
         */
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        /**
         * @return dagOwnerNickName
         */
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        /**
         * @return lastVersionId
         */
        public Long getLastVersionId() {
            return this.lastVersionId;
        }

        /**
         * @return versionComments
         */
        public String getVersionComments() {
            return this.versionComments;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String dagName; 
            private String dagOwnerId; 
            private String dagOwnerNickName; 
            private Long lastVersionId; 
            private String versionComments; 
            private Long versionId; 

            /**
             * The name of the task flow.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * The ID of the task flow owner.
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * The name of the task flow owner.
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * The ID of the previously published version.
             */
            public Builder lastVersionId(Long lastVersionId) {
                this.lastVersionId = lastVersionId;
                return this;
            }

            /**
             * The description of the version.
             */
            public Builder versionComments(String versionComments) {
                this.versionComments = versionComments;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public DagVersion build() {
                return new DagVersion(this);
            } 

        } 

    }
    public static class DagVersionList extends TeaModel {
        @NameInMap("DagVersion")
        private java.util.List < DagVersion> dagVersion;

        private DagVersionList(Builder builder) {
            this.dagVersion = builder.dagVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagVersionList create() {
            return builder().build();
        }

        /**
         * @return dagVersion
         */
        public java.util.List < DagVersion> getDagVersion() {
            return this.dagVersion;
        }

        public static final class Builder {
            private java.util.List < DagVersion> dagVersion; 

            /**
             * DagVersion.
             */
            public Builder dagVersion(java.util.List < DagVersion> dagVersion) {
                this.dagVersion = dagVersion;
                return this;
            }

            public DagVersionList build() {
                return new DagVersionList(this);
            } 

        } 

    }
}

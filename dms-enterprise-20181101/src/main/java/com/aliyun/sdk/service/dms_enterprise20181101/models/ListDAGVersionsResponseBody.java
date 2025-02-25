// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDAGVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDAGVersionsResponseBody</p>
 */
public class ListDAGVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DagVersionList")
    private DagVersionList dagVersionList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information about the published versions.</p>
         */
        public Builder dagVersionList(DagVersionList dagVersionList) {
            this.dagVersionList = dagVersionList;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7775630-7901-51B9-8782-9B585EC0799A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDAGVersionsResponseBody build() {
            return new ListDAGVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDAGVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDAGVersionsResponseBody</p>
     */
    public static class DagVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerId")
        private String dagOwnerId;

        @com.aliyun.core.annotation.NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @com.aliyun.core.annotation.NameInMap("LastVersionId")
        private Long lastVersionId;

        @com.aliyun.core.annotation.NameInMap("VersionComments")
        private String versionComments;

        @com.aliyun.core.annotation.NameInMap("VersionId")
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
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark SQL</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The ID of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * <p>The name of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * <p>The ID of the previously published version.</p>
             * 
             * <strong>example:</strong>
             * <p>2****</p>
             */
            public Builder lastVersionId(Long lastVersionId) {
                this.lastVersionId = lastVersionId;
                return this;
            }

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>test_OSS</p>
             */
            public Builder versionComments(String versionComments) {
                this.versionComments = versionComments;
                return this;
            }

            /**
             * <p>The ID of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>2****</p>
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
    /**
     * 
     * {@link ListDAGVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDAGVersionsResponseBody</p>
     */
    public static class DagVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagVersion")
        private java.util.List<DagVersion> dagVersion;

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
        public java.util.List<DagVersion> getDagVersion() {
            return this.dagVersion;
        }

        public static final class Builder {
            private java.util.List<DagVersion> dagVersion; 

            /**
             * DagVersion.
             */
            public Builder dagVersion(java.util.List<DagVersion> dagVersion) {
                this.dagVersion = dagVersion;
                return this;
            }

            public DagVersionList build() {
                return new DagVersionList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineCodeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineCodeVersionsResponseBody</p>
 */
public class ListRoutineCodeVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersions")
    private java.util.List<CodeVersions> codeVersions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRoutineCodeVersionsResponseBody(Builder builder) {
        this.codeVersions = builder.codeVersions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineCodeVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersions
     */
    public java.util.List<CodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CodeVersions> codeVersions; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRoutineCodeVersionsResponseBody model) {
            this.codeVersions = model.codeVersions;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CodeVersions.
         */
        public Builder codeVersions(java.util.List<CodeVersions> codeVersions) {
            this.codeVersions = codeVersions;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRoutineCodeVersionsResponseBody build() {
            return new ListRoutineCodeVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineCodeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineCodeVersionsResponseBody</p>
     */
    public static class ConfOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotFoundStrategy")
        private String notFoundStrategy;

        private ConfOptions(Builder builder) {
            this.notFoundStrategy = builder.notFoundStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfOptions create() {
            return builder().build();
        }

        /**
         * @return notFoundStrategy
         */
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

        public static final class Builder {
            private String notFoundStrategy; 

            private Builder() {
            } 

            private Builder(ConfOptions model) {
                this.notFoundStrategy = model.notFoundStrategy;
            } 

            /**
             * NotFoundStrategy.
             */
            public Builder notFoundStrategy(String notFoundStrategy) {
                this.notFoundStrategy = notFoundStrategy;
                return this;
            }

            public ConfOptions build() {
                return new ConfOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRoutineCodeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineCodeVersionsResponseBody</p>
     */
    public static class CodeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildId")
        private Long buildId;

        @com.aliyun.core.annotation.NameInMap("CodeDescription")
        private String codeDescription;

        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("ConfOptions")
        private ConfOptions confOptions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CodeVersions(Builder builder) {
            this.buildId = builder.buildId;
            this.codeDescription = builder.codeDescription;
            this.codeVersion = builder.codeVersion;
            this.confOptions = builder.confOptions;
            this.createTime = builder.createTime;
            this.extraInfo = builder.extraInfo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeVersions create() {
            return builder().build();
        }

        /**
         * @return buildId
         */
        public Long getBuildId() {
            return this.buildId;
        }

        /**
         * @return codeDescription
         */
        public String getCodeDescription() {
            return this.codeDescription;
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return confOptions
         */
        public ConfOptions getConfOptions() {
            return this.confOptions;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long buildId; 
            private String codeDescription; 
            private String codeVersion; 
            private ConfOptions confOptions; 
            private String createTime; 
            private String extraInfo; 
            private String status; 

            private Builder() {
            } 

            private Builder(CodeVersions model) {
                this.buildId = model.buildId;
                this.codeDescription = model.codeDescription;
                this.codeVersion = model.codeVersion;
                this.confOptions = model.confOptions;
                this.createTime = model.createTime;
                this.extraInfo = model.extraInfo;
                this.status = model.status;
            } 

            /**
             * BuildId.
             */
            public Builder buildId(Long buildId) {
                this.buildId = buildId;
                return this;
            }

            /**
             * CodeDescription.
             */
            public Builder codeDescription(String codeDescription) {
                this.codeDescription = codeDescription;
                return this;
            }

            /**
             * CodeVersion.
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * ConfOptions.
             */
            public Builder confOptions(ConfOptions confOptions) {
                this.confOptions = confOptions;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CodeVersions build() {
                return new CodeVersions(this);
            } 

        } 

    }
}

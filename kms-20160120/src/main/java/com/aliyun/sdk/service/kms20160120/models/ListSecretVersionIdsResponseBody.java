// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ListSecretVersionIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretVersionIdsResponseBody</p>
 */
public class ListSecretVersionIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VersionIds")
    private VersionIds versionIds;

    private ListSecretVersionIdsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
        this.totalCount = builder.totalCount;
        this.versionIds = builder.versionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretVersionIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return versionIds
     */
    public VersionIds getVersionIds() {
        return this.versionIds;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String secretName; 
        private Integer totalCount; 
        private VersionIds versionIds; 

        private Builder() {
        } 

        private Builder(ListSecretVersionIdsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.secretName = model.secretName;
            this.totalCount = model.totalCount;
            this.versionIds = model.versionIds;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5b75d8b1-5b6a-4ec0-8e0c-c08befdfad47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of secret versions.</p>
         */
        public Builder versionIds(VersionIds versionIds) {
            this.versionIds = versionIds;
            return this;
        }

        public ListSecretVersionIdsResponseBody build() {
            return new ListSecretVersionIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretVersionIdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretVersionIdsResponseBody</p>
     */
    public static class VersionStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionStage")
        private java.util.List<String> versionStage;

        private VersionStages(Builder builder) {
            this.versionStage = builder.versionStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionStages create() {
            return builder().build();
        }

        /**
         * @return versionStage
         */
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List<String> versionStage; 

            private Builder() {
            } 

            private Builder(VersionStages model) {
                this.versionStage = model.versionStage;
            } 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List<String> versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretVersionIdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretVersionIdsResponseBody</p>
     */
    public static class VersionId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        @com.aliyun.core.annotation.NameInMap("VersionStages")
        private VersionStages versionStages;

        private VersionId(Builder builder) {
            this.createTime = builder.createTime;
            this.versionId = builder.versionId;
            this.versionStages = builder.versionStages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionId create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionStages
         */
        public VersionStages getVersionStages() {
            return this.versionStages;
        }

        public static final class Builder {
            private String createTime; 
            private String versionId; 
            private VersionStages versionStages; 

            private Builder() {
            } 

            private Builder(VersionId model) {
                this.createTime = model.createTime;
                this.versionId = model.versionId;
                this.versionStages = model.versionStages;
            } 

            /**
             * <p>The time when the secret version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-21T15:39:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000000000000000000000000000203</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>The stage labels that mark the secret version.</p>
             */
            public Builder versionStages(VersionStages versionStages) {
                this.versionStages = versionStages;
                return this;
            }

            public VersionId build() {
                return new VersionId(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretVersionIdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretVersionIdsResponseBody</p>
     */
    public static class VersionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionId")
        private java.util.List<VersionId> versionId;

        private VersionIds(Builder builder) {
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionIds create() {
            return builder().build();
        }

        /**
         * @return versionId
         */
        public java.util.List<VersionId> getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private java.util.List<VersionId> versionId; 

            private Builder() {
            } 

            private Builder(VersionIds model) {
                this.versionId = model.versionId;
            } 

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000000000000000000000000000203</p>
             */
            public Builder versionId(java.util.List<VersionId> versionId) {
                this.versionId = versionId;
                return this;
            }

            public VersionIds build() {
                return new VersionIds(this);
            } 

        } 

    }
}

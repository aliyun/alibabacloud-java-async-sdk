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
 * {@link ListManagedDataKeyVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListManagedDataKeyVersionsResponseBody</p>
 */
public class ListManagedDataKeyVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataKeyName")
    private String dataKeyName;

    @com.aliyun.core.annotation.NameInMap("ManagedDataKeyVersions")
    private ManagedDataKeyVersions managedDataKeyVersions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListManagedDataKeyVersionsResponseBody(Builder builder) {
        this.dataKeyName = builder.dataKeyName;
        this.managedDataKeyVersions = builder.managedDataKeyVersions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManagedDataKeyVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataKeyName
     */
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    /**
     * @return managedDataKeyVersions
     */
    public ManagedDataKeyVersions getManagedDataKeyVersions() {
        return this.managedDataKeyVersions;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String dataKeyName; 
        private ManagedDataKeyVersions managedDataKeyVersions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListManagedDataKeyVersionsResponseBody model) {
            this.dataKeyName = model.dataKeyName;
            this.managedDataKeyVersions = model.managedDataKeyVersions;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataKeyName.
         */
        public Builder dataKeyName(String dataKeyName) {
            this.dataKeyName = dataKeyName;
            return this;
        }

        /**
         * ManagedDataKeyVersions.
         */
        public Builder managedDataKeyVersions(ManagedDataKeyVersions managedDataKeyVersions) {
            this.managedDataKeyVersions = managedDataKeyVersions;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListManagedDataKeyVersionsResponseBody build() {
            return new ListManagedDataKeyVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListManagedDataKeyVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedDataKeyVersionsResponseBody</p>
     */
    public static class ManagedDataKeyVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataKeyVersionId")
        private String dataKeyVersionId;

        @com.aliyun.core.annotation.NameInMap("DataKeyVersionName")
        private String dataKeyVersionName;

        private ManagedDataKeyVersion(Builder builder) {
            this.dataKeyVersionId = builder.dataKeyVersionId;
            this.dataKeyVersionName = builder.dataKeyVersionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedDataKeyVersion create() {
            return builder().build();
        }

        /**
         * @return dataKeyVersionId
         */
        public String getDataKeyVersionId() {
            return this.dataKeyVersionId;
        }

        /**
         * @return dataKeyVersionName
         */
        public String getDataKeyVersionName() {
            return this.dataKeyVersionName;
        }

        public static final class Builder {
            private String dataKeyVersionId; 
            private String dataKeyVersionName; 

            private Builder() {
            } 

            private Builder(ManagedDataKeyVersion model) {
                this.dataKeyVersionId = model.dataKeyVersionId;
                this.dataKeyVersionName = model.dataKeyVersionName;
            } 

            /**
             * DataKeyVersionId.
             */
            public Builder dataKeyVersionId(String dataKeyVersionId) {
                this.dataKeyVersionId = dataKeyVersionId;
                return this;
            }

            /**
             * DataKeyVersionName.
             */
            public Builder dataKeyVersionName(String dataKeyVersionName) {
                this.dataKeyVersionName = dataKeyVersionName;
                return this;
            }

            public ManagedDataKeyVersion build() {
                return new ManagedDataKeyVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListManagedDataKeyVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedDataKeyVersionsResponseBody</p>
     */
    public static class ManagedDataKeyVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ManagedDataKeyVersion")
        private java.util.List<ManagedDataKeyVersion> managedDataKeyVersion;

        private ManagedDataKeyVersions(Builder builder) {
            this.managedDataKeyVersion = builder.managedDataKeyVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedDataKeyVersions create() {
            return builder().build();
        }

        /**
         * @return managedDataKeyVersion
         */
        public java.util.List<ManagedDataKeyVersion> getManagedDataKeyVersion() {
            return this.managedDataKeyVersion;
        }

        public static final class Builder {
            private java.util.List<ManagedDataKeyVersion> managedDataKeyVersion; 

            private Builder() {
            } 

            private Builder(ManagedDataKeyVersions model) {
                this.managedDataKeyVersion = model.managedDataKeyVersion;
            } 

            /**
             * ManagedDataKeyVersion.
             */
            public Builder managedDataKeyVersion(java.util.List<ManagedDataKeyVersion> managedDataKeyVersion) {
                this.managedDataKeyVersion = managedDataKeyVersion;
                return this;
            }

            public ManagedDataKeyVersions build() {
                return new ManagedDataKeyVersions(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKmsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKmsInstancesResponseBody</p>
 */
public class ListKmsInstancesResponseBody extends TeaModel {
    @NameInMap("KmsInstances")
    private KmsInstances kmsInstances;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListKmsInstancesResponseBody(Builder builder) {
        this.kmsInstances = builder.kmsInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKmsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return kmsInstances
     */
    public KmsInstances getKmsInstances() {
        return this.kmsInstances;
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
        private KmsInstances kmsInstances; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * KmsInstances.
         */
        public Builder kmsInstances(KmsInstances kmsInstances) {
            this.kmsInstances = kmsInstances;
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
         * RequestId.
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

        public ListKmsInstancesResponseBody build() {
            return new ListKmsInstancesResponseBody(this);
        } 

    } 

    public static class KmsInstance extends TeaModel {
        @NameInMap("KmsInstanceArn")
        private String kmsInstanceArn;

        @NameInMap("KmsInstanceId")
        private String kmsInstanceId;

        private KmsInstance(Builder builder) {
            this.kmsInstanceArn = builder.kmsInstanceArn;
            this.kmsInstanceId = builder.kmsInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsInstance create() {
            return builder().build();
        }

        /**
         * @return kmsInstanceArn
         */
        public String getKmsInstanceArn() {
            return this.kmsInstanceArn;
        }

        /**
         * @return kmsInstanceId
         */
        public String getKmsInstanceId() {
            return this.kmsInstanceId;
        }

        public static final class Builder {
            private String kmsInstanceArn; 
            private String kmsInstanceId; 

            /**
             * KmsInstanceArn.
             */
            public Builder kmsInstanceArn(String kmsInstanceArn) {
                this.kmsInstanceArn = kmsInstanceArn;
                return this;
            }

            /**
             * KmsInstanceId.
             */
            public Builder kmsInstanceId(String kmsInstanceId) {
                this.kmsInstanceId = kmsInstanceId;
                return this;
            }

            public KmsInstance build() {
                return new KmsInstance(this);
            } 

        } 

    }
    public static class KmsInstances extends TeaModel {
        @NameInMap("KmsInstance")
        private java.util.List < KmsInstance> kmsInstance;

        private KmsInstances(Builder builder) {
            this.kmsInstance = builder.kmsInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsInstances create() {
            return builder().build();
        }

        /**
         * @return kmsInstance
         */
        public java.util.List < KmsInstance> getKmsInstance() {
            return this.kmsInstance;
        }

        public static final class Builder {
            private java.util.List < KmsInstance> kmsInstance; 

            /**
             * KmsInstance.
             */
            public Builder kmsInstance(java.util.List < KmsInstance> kmsInstance) {
                this.kmsInstance = kmsInstance;
                return this;
            }

            public KmsInstances build() {
                return new KmsInstances(this);
            } 

        } 

    }
}

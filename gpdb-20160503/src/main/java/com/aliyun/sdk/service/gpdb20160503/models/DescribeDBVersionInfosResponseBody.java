// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBVersionInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBVersionInfosResponseBody</p>
 */
public class DescribeDBVersionInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionDetails")
    private VersionDetails versionDetails;

    private DescribeDBVersionInfosResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionDetails = builder.versionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBVersionInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionDetails
     */
    public VersionDetails getVersionDetails() {
        return this.versionDetails;
    }

    public static final class Builder {
        private String requestId; 
        private VersionDetails versionDetails; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried minor versions.
         */
        public Builder versionDetails(VersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }

        public DescribeDBVersionInfosResponseBody build() {
            return new DescribeDBVersionInfosResponseBody(this);
        } 

    } 

    public static class VersionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Serverless")
        private Object serverless;

        @com.aliyun.core.annotation.NameInMap("StorageElastic")
        private Object storageElastic;

        private VersionDetails(Builder builder) {
            this.serverless = builder.serverless;
            this.storageElastic = builder.storageElastic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetails create() {
            return builder().build();
        }

        /**
         * @return serverless
         */
        public Object getServerless() {
            return this.serverless;
        }

        /**
         * @return storageElastic
         */
        public Object getStorageElastic() {
            return this.storageElastic;
        }

        public static final class Builder {
            private Object serverless; 
            private Object storageElastic; 

            /**
             * The queried minor version information about the instance in Serverless mode.
             */
            public Builder serverless(Object serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * The queried minor version information about the instance in elastic storage mode.
             */
            public Builder storageElastic(Object storageElastic) {
                this.storageElastic = storageElastic;
                return this;
            }

            public VersionDetails build() {
                return new VersionDetails(this);
            } 

        } 

    }
}

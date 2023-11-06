// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBVersionInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBVersionInfosResponseBody</p>
 */
public class DescribeDBVersionInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VersionDetails")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionDetails.
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
        @NameInMap("Serverless")
        private Object serverless;

        @NameInMap("StorageElastic")
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
             * Serverless.
             */
            public Builder serverless(Object serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * StorageElastic.
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

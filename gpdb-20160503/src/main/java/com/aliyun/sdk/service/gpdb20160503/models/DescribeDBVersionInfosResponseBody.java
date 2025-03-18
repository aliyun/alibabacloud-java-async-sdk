// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBVersionInfosResponseBody model) {
            this.requestId = model.requestId;
            this.versionDetails = model.versionDetails;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried minor versions.</p>
         */
        public Builder versionDetails(VersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }

        public DescribeDBVersionInfosResponseBody build() {
            return new DescribeDBVersionInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBVersionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBVersionInfosResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VersionDetails model) {
                this.serverless = model.serverless;
                this.storageElastic = model.storageElastic;
            } 

            /**
             * <p>The queried minor version information about the instance in Serverless mode.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Serverless&quot;: [
             *                 {
             *                     &quot;engineVersion&quot;: &quot;6.0&quot;,
             *                     &quot;versionInfos&quot;: [
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v2.0.0.5&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-05-28T07:48Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-05-28T07:48Z&quot;
             *                         },
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v2.0.0.1&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-03-27T12:44Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-03-27T12:44Z&quot;
             *                         },
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v1.0.5.1&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-02-22T11:39Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-02-22T11:39Z&quot;
             *                         }
             *                     ]
             *                 }
             * ]</p>
             */
            public Builder serverless(Object serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * <p>The queried minor version information about the instance in elastic storage mode.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;StorageElasic&quot;: [
             *                 {
             *                     &quot;engineVersion&quot;: &quot;6.0&quot;,
             *                     &quot;versionInfos&quot;: [
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v6.3.11.2&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-08-17T09:14Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-08-17T09:14Z&quot;
             *                         }
             *           },
             *                 {
             *                     &quot;engineVersion&quot;: &quot;7.0&quot;,
             *                     &quot;versionInfos&quot;: [
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v7.0.2.0&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-08-09T06:47Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-08-09T06:47Z&quot;
             *                         },
             *                         {
             *                             &quot;kernelVersion&quot;: &quot;v7.0.1.8&quot;,
             *                             &quot;releaseDate&quot;: &quot;2023-05-25T06:56Z&quot;,
             *                             &quot;expirationDate&quot;: &quot;2026-05-25T06:56Z&quot;
             *                         }
             *                     ]
             *                 }
             * ]</p>
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

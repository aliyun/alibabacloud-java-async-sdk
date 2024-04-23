// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSignatureLibVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSignatureLibVersionResponseBody</p>
 */
public class DescribeSignatureLibVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Version")
    private java.util.List < Version> version;

    private DescribeSignatureLibVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSignatureLibVersionResponseBody create() {
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
     * @return version
     */
    public java.util.List < Version> getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Version> version; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the versions.
         */
        public Builder version(java.util.List < Version> version) {
            this.version = version;
            return this;
        }

        public DescribeSignatureLibVersionResponseBody build() {
            return new DescribeSignatureLibVersionResponseBody(this);
        } 

    } 

    public static class Version extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private String version;

        private Version(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * The type.
             * <p>
             * 
             * Valid values:
             * 
             * *   ips
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Basic Rules and Virtual Patching
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   intelligence
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Threat Intelligence
             * 
             *     <!-- -->
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}

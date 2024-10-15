// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSignatureLibVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSignatureLibVersionResponseBody</p>
 */
public class DescribeSignatureLibVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Version")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C50C2A9-4BBB-5504-8ADA-C41A79B8C946</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the versions.</p>
         */
        public Builder version(java.util.List < Version> version) {
            this.version = version;
            return this;
        }

        public DescribeSignatureLibVersionResponseBody build() {
            return new DescribeSignatureLibVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSignatureLibVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSignatureLibVersionResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>ips</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Basic Rules and Virtual Patching</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>intelligence</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Threat Intelligence</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ips</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>IPS-2307-02</p>
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

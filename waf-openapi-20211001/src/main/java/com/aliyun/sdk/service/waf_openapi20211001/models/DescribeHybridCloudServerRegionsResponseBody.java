// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridCloudServerRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudServerRegionsResponseBody</p>
 */
public class DescribeHybridCloudServerRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudServerRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudServerRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public java.util.List < Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Regions> regions; 
        private String requestId; 

        /**
         * <p>The information about the regions.</p>
         */
        public Builder regions(java.util.List < Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FBBDE11-C35F-531B-96BA-64CA****C875</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudServerRegionsResponseBody build() {
            return new DescribeHybridCloudServerRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudServerRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudServerRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Regions(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * <p>The code of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}

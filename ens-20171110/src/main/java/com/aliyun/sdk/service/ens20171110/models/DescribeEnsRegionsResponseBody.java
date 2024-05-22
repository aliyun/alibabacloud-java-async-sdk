// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionsResponseBody</p>
 */
public class DescribeEnsRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EnsRegions")
    private EnsRegions ensRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsRegionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.ensRegions = builder.ensRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ensRegions
     */
    public EnsRegions getEnsRegions() {
        return this.ensRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private EnsRegions ensRegions; 
        private String requestId; 

        /**
         * The service code. 0 is returned for a successful request. An error code is returned for a failed request.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the regions.
         */
        public Builder ensRegions(EnsRegions ensRegions) {
            this.ensRegions = ensRegions;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsRegionsResponseBody build() {
            return new DescribeEnsRegionsResponseBody(this);
        } 

    } 

    public static class EnsRegionsEnsRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private EnsRegionsEnsRegions(Builder builder) {
            this.area = builder.area;
            this.enName = builder.enName;
            this.ensRegionId = builder.ensRegionId;
            this.name = builder.name;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionsEnsRegions create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String area; 
            private String enName; 
            private String ensRegionId; 
            private String name; 
            private String province; 

            /**
             * The code of the region.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The province where the node is deployed.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public EnsRegionsEnsRegions build() {
                return new EnsRegionsEnsRegions(this);
            } 

        } 

    }
    public static class EnsRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegions")
        private java.util.List < EnsRegionsEnsRegions> ensRegions;

        private EnsRegions(Builder builder) {
            this.ensRegions = builder.ensRegions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegions create() {
            return builder().build();
        }

        /**
         * @return ensRegions
         */
        public java.util.List < EnsRegionsEnsRegions> getEnsRegions() {
            return this.ensRegions;
        }

        public static final class Builder {
            private java.util.List < EnsRegionsEnsRegions> ensRegions; 

            /**
             * The information about the regions.
             */
            public Builder ensRegions(java.util.List < EnsRegionsEnsRegions> ensRegions) {
                this.ensRegions = ensRegions;
                return this;
            }

            public EnsRegions build() {
                return new EnsRegions(this);
            } 

        } 

    }
}

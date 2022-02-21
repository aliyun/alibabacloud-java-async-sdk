// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionsResponseBody</p>
 */
public class DescribeEnsRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EnsRegions")
    private EnsRegions ensRegions;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * EnsRegions.
         */
        public Builder ensRegions(EnsRegions ensRegions) {
            this.ensRegions = ensRegions;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Area")
        private String area;

        @NameInMap("EnName")
        private String enName;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Province")
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
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Province.
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
        @NameInMap("EnsRegions")
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
             * EnsRegions.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeSafDeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafDeOrderResponseBody</p>
 */
public class DescribeSafDeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSafDeOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafDeOrderResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeSafDeOrderResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSafDeOrderResponseBody build() {
            return new DescribeSafDeOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSafDeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSafDeOrderResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationDate")
        private Long expirationDate;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("specification")
        private Integer specification;

        private Regions(Builder builder) {
            this.expirationDate = builder.expirationDate;
            this.region = builder.region;
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return expirationDate
         */
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return specification
         */
        public Integer getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private Long expirationDate; 
            private String region; 
            private Integer specification; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.expirationDate = model.expirationDate;
                this.region = model.region;
                this.specification = model.specification;
            } 

            /**
             * expirationDate.
             */
            public Builder expirationDate(Long expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * specification.
             */
            public Builder specification(Integer specification) {
                this.specification = specification;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSafDeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSafDeOrderResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationDate")
        private Long expirationDate;

        @com.aliyun.core.annotation.NameInMap("openUserType")
        private Integer openUserType;

        @com.aliyun.core.annotation.NameInMap("regions")
        private java.util.List<Regions> regions;

        private ResultObject(Builder builder) {
            this.expirationDate = builder.expirationDate;
            this.openUserType = builder.openUserType;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return expirationDate
         */
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return openUserType
         */
        public Integer getOpenUserType() {
            return this.openUserType;
        }

        /**
         * @return regions
         */
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private Long expirationDate; 
            private Integer openUserType; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.expirationDate = model.expirationDate;
                this.openUserType = model.openUserType;
                this.regions = model.regions;
            } 

            /**
             * <p>Expiration time</p>
             * 
             * <strong>example:</strong>
             * <p>1728008155799</p>
             */
            public Builder expirationDate(Long expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>Based on the product type subscribed by the customer, the console permissions are divided into three categories:</p>
             * <pre><code> 1. New Customer: Has not purchased/subscribed to any service.
             *  2. Old Customer (Subscription): Customers who have purchased the SAF product.
             *  3. Pay-As-You-Go: Customers who have purchased the SAF_BAG product or activated SAF_POS.
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder openUserType(Integer openUserType) {
                this.openUserType = openUserType;
                return this;
            }

            /**
             * regions.
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}

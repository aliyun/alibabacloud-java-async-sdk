// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHavsInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHavsInstanceTypesResponseBody</p>
 */
public class DescribeHavsInstanceTypesResponseBody extends TeaModel {
    @NameInMap("DescribeHavsInstanceTypesResponse")
    private DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHavsInstanceTypesResponseBody(Builder builder) {
        this.describeHavsInstanceTypesResponse = builder.describeHavsInstanceTypesResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHavsInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeHavsInstanceTypesResponse
     */
    public DescribeHavsInstanceTypesResponse getDescribeHavsInstanceTypesResponse() {
        return this.describeHavsInstanceTypesResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse; 
        private String requestId; 

        /**
         * DescribeHavsInstanceTypesResponse.
         */
        public Builder describeHavsInstanceTypesResponse(DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse) {
            this.describeHavsInstanceTypesResponse = describeHavsInstanceTypesResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHavsInstanceTypesResponseBody build() {
            return new DescribeHavsInstanceTypesResponseBody(this);
        } 

    } 

    public static class HavsInstanceTypes extends TeaModel {
        @NameInMap("HavsInstanceTypes")
        private java.util.List < String > havsInstanceTypes;

        private HavsInstanceTypes(Builder builder) {
            this.havsInstanceTypes = builder.havsInstanceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HavsInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return havsInstanceTypes
         */
        public java.util.List < String > getHavsInstanceTypes() {
            return this.havsInstanceTypes;
        }

        public static final class Builder {
            private java.util.List < String > havsInstanceTypes; 

            /**
             * HavsInstanceTypes.
             */
            public Builder havsInstanceTypes(java.util.List < String > havsInstanceTypes) {
                this.havsInstanceTypes = havsInstanceTypes;
                return this;
            }

            public HavsInstanceTypes build() {
                return new HavsInstanceTypes(this);
            } 

        } 

    }
    public static class DescribeHavsInstanceTypesResponse extends TeaModel {
        @NameInMap("HavsInstanceTypes")
        private HavsInstanceTypes havsInstanceTypes;

        private DescribeHavsInstanceTypesResponse(Builder builder) {
            this.havsInstanceTypes = builder.havsInstanceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeHavsInstanceTypesResponse create() {
            return builder().build();
        }

        /**
         * @return havsInstanceTypes
         */
        public HavsInstanceTypes getHavsInstanceTypes() {
            return this.havsInstanceTypes;
        }

        public static final class Builder {
            private HavsInstanceTypes havsInstanceTypes; 

            /**
             * HavsInstanceTypes.
             */
            public Builder havsInstanceTypes(HavsInstanceTypes havsInstanceTypes) {
                this.havsInstanceTypes = havsInstanceTypes;
                return this;
            }

            public DescribeHavsInstanceTypesResponse build() {
                return new DescribeHavsInstanceTypesResponse(this);
            } 

        } 

    }
}

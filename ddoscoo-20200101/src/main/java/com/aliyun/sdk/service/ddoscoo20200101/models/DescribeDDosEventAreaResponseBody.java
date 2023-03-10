// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAreaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAreaResponseBody</p>
 */
public class DescribeDDosEventAreaResponseBody extends TeaModel {
    @NameInMap("Areas")
    private java.util.List < Areas> areas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventAreaResponseBody(Builder builder) {
        this.areas = builder.areas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventAreaResponseBody create() {
        return builder().build();
    }

    /**
     * @return areas
     */
    public java.util.List < Areas> getAreas() {
        return this.areas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Areas> areas; 
        private String requestId; 

        /**
         * The information about the source region from which the volumetric attack was initiated.
         */
        public Builder areas(java.util.List < Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventAreaResponseBody build() {
            return new DescribeDDosEventAreaResponseBody(this);
        } 

    } 

    public static class Areas extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("InPkts")
        private Long inPkts;

        private Areas(Builder builder) {
            this.area = builder.area;
            this.inPkts = builder.inPkts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Areas create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        public static final class Builder {
            private String area; 
            private Long inPkts; 

            /**
             * The code or ID of the source region. For more information, see [Codes of administrative regions in China and codes of countries and areas](~~167926~~). For example, **110000** indicates Beijing, China, and **us** indicates the United States.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The number of request packets that were sent from the source region.
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            public Areas build() {
                return new Areas(this);
            } 

        } 

    }
}

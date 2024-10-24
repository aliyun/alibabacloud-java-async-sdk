// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDosEventAreaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAreaResponseBody</p>
 */
public class DescribeDDosEventAreaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Areas")
    private java.util.List < Areas> areas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the source region from which the volumetric attack was initiated.</p>
         */
        public Builder areas(java.util.List < Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>11710C9F-BC5E-481A-BEC5-C6D8FBFCA827</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventAreaResponseBody build() {
            return new DescribeDDosEventAreaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDosEventAreaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDosEventAreaResponseBody</p>
     */
    public static class Areas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("InPkts")
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
             * <p>The code or ID of the source region. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a>. For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The number of request packets that were sent from the source region.</p>
             * 
             * <strong>example:</strong>
             * <p>228</p>
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

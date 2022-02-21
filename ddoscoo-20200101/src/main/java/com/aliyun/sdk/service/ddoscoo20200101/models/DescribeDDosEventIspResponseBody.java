// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventIspResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventIspResponseBody</p>
 */
public class DescribeDDosEventIspResponseBody extends TeaModel {
    @NameInMap("Isps")
    private java.util.List < Isps> isps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventIspResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventIspResponseBody create() {
        return builder().build();
    }

    /**
     * @return isps
     */
    public java.util.List < Isps> getIsps() {
        return this.isps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Isps> isps; 
        private String requestId; 

        /**
         * Isps.
         */
        public Builder isps(java.util.List < Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventIspResponseBody build() {
            return new DescribeDDosEventIspResponseBody(this);
        } 

    } 

    public static class Isps extends TeaModel {
        @NameInMap("InPkts")
        private Long inPkts;

        @NameInMap("Isp")
        private String isp;

        private Isps(Builder builder) {
            this.inPkts = builder.inPkts;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isps create() {
            return builder().build();
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private Long inPkts; 
            private String isp; 

            /**
             * InPkts.
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public Isps build() {
                return new Isps(this);
            } 

        } 

    }
}

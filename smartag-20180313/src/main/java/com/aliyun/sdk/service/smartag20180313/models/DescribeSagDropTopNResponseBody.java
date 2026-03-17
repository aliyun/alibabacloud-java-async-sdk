// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagDropTopNResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagDropTopNResponseBody</p>
 */
public class DescribeSagDropTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DropTopN")
    private java.util.List<DropTopN> dropTopN;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSagDropTopNResponseBody(Builder builder) {
        this.dropTopN = builder.dropTopN;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagDropTopNResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dropTopN
     */
    public java.util.List<DropTopN> getDropTopN() {
        return this.dropTopN;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DropTopN> dropTopN; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSagDropTopNResponseBody model) {
            this.dropTopN = model.dropTopN;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about packets dropped by the SAG instance.</p>
         */
        public Builder dropTopN(java.util.List<DropTopN> dropTopN) {
            this.dropTopN = dropTopN;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AFF7E5A6-6897-4FDC-A5A8-1978B5B3E545</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSagDropTopNResponseBody build() {
            return new DescribeSagDropTopNResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagDropTopNResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagDropTopNResponseBody</p>
     */
    public static class DropTopN extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DropRate")
        private String dropRate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private DropTopN(Builder builder) {
            this.dropRate = builder.dropRate;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DropTopN create() {
            return builder().build();
        }

        /**
         * @return dropRate
         */
        public String getDropRate() {
            return this.dropRate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String dropRate; 
            private String instanceId; 
            private String name; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(DropTopN model) {
                this.dropRate = model.dropRate;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The packet loss rate of the SAG instance. Unit: packets per second (PPS).</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder dropRate(String dropRate) {
                this.dropRate = dropRate;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-whfn****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region where the SAG instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public DropTopN build() {
                return new DropTopN(this);
            } 

        } 

    }
}

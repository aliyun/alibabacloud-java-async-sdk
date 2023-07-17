// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceLocationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceLocationResponseBody</p>
 */
public class DescribeTraceLocationResponseBody extends TeaModel {
    @NameInMap("RegionConfigs")
    private java.util.List < RegionConfigs> regionConfigs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTraceLocationResponseBody(Builder builder) {
        this.regionConfigs = builder.regionConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceLocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionConfigs
     */
    public java.util.List < RegionConfigs> getRegionConfigs() {
        return this.regionConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RegionConfigs> regionConfigs; 
        private String requestId; 

        /**
         * RegionConfigs.
         */
        public Builder regionConfigs(java.util.List < RegionConfigs> regionConfigs) {
            this.regionConfigs = regionConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTraceLocationResponseBody build() {
            return new DescribeTraceLocationResponseBody(this);
        } 

    } 

    public static class RegionConfigs extends TeaModel {
        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("Url")
        private String url;

        private RegionConfigs(Builder builder) {
            this.regionNo = builder.regionNo;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionConfigs create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String regionNo; 
            private String url; 

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RegionConfigs build() {
                return new RegionConfigs(this);
            } 

        } 

    }
}

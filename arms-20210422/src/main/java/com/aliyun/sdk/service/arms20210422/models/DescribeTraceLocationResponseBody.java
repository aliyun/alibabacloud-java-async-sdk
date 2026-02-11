// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link DescribeTraceLocationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceLocationResponseBody</p>
 */
public class DescribeTraceLocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionConfigs")
    private java.util.List<RegionConfigs> regionConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionConfigs
     */
    public java.util.List<RegionConfigs> getRegionConfigs() {
        return this.regionConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RegionConfigs> regionConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTraceLocationResponseBody model) {
            this.regionConfigs = model.regionConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * RegionConfigs.
         */
        public Builder regionConfigs(java.util.List<RegionConfigs> regionConfigs) {
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

    /**
     * 
     * {@link DescribeTraceLocationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceLocationResponseBody</p>
     */
    public static class RegionConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(RegionConfigs model) {
                this.regionNo = model.regionNo;
                this.url = model.url;
            } 

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

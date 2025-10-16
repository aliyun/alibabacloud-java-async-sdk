// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeOpenIpAccessSrcStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenIpAccessSrcStatResponseBody</p>
 */
public class DescribeOpenIpAccessSrcStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatList")
    private java.util.List<StatList> statList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOpenIpAccessSrcStatResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statList = builder.statList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenIpAccessSrcStatResponseBody create() {
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
     * @return statList
     */
    public java.util.List<StatList> getStatList() {
        return this.statList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatList> statList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOpenIpAccessSrcStatResponseBody model) {
            this.requestId = model.requestId;
            this.statList = model.statList;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatList.
         */
        public Builder statList(java.util.List<StatList> statList) {
            this.statList = statList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpenIpAccessSrcStatResponseBody build() {
            return new DescribeOpenIpAccessSrcStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenIpAccessSrcStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenIpAccessSrcStatResponseBody</p>
     */
    public static class StatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalSrcIp")
        private Long abnormalSrcIp;

        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("NormalSrcIp")
        private Long normalSrcIp;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private StatList(Builder builder) {
            this.abnormalSrcIp = builder.abnormalSrcIp;
            this.app = builder.app;
            this.normalSrcIp = builder.normalSrcIp;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatList create() {
            return builder().build();
        }

        /**
         * @return abnormalSrcIp
         */
        public Long getAbnormalSrcIp() {
            return this.abnormalSrcIp;
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return normalSrcIp
         */
        public Long getNormalSrcIp() {
            return this.normalSrcIp;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private Long abnormalSrcIp; 
            private String app; 
            private Long normalSrcIp; 
            private String port; 

            private Builder() {
            } 

            private Builder(StatList model) {
                this.abnormalSrcIp = model.abnormalSrcIp;
                this.app = model.app;
                this.normalSrcIp = model.normalSrcIp;
                this.port = model.port;
            } 

            /**
             * AbnormalSrcIp.
             */
            public Builder abnormalSrcIp(Long abnormalSrcIp) {
                this.abnormalSrcIp = abnormalSrcIp;
                return this;
            }

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * NormalSrcIp.
             */
            public Builder normalSrcIp(Long normalSrcIp) {
                this.normalSrcIp = normalSrcIp;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public StatList build() {
                return new StatList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebReportTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebReportTopIpResponseBody</p>
 */
public class DescribeWebReportTopIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebReportTopIpResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebReportTopIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 

        /**
         * <p>The response parameters.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D21BE0C4-8E83-5E32-86C6-AA6BE9B1B5BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebReportTopIpResponseBody build() {
            return new DescribeWebReportTopIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebReportTopIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebReportTopIpResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        private DataList(Builder builder) {
            this.areaId = builder.areaId;
            this.count = builder.count;
            this.isp = builder.isp;
            this.sourceIp = builder.sourceIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        public static final class Builder {
            private String areaId; 
            private Long count; 
            private String isp; 
            private String sourceIp; 

            /**
             * <p>The ID of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>90998690</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) for the attack. Valid values:</p>
             * <ul>
             * <li><strong>100017</strong>: China Telecom</li>
             * <li><strong>100026</strong>: China Unicom</li>
             * <li><strong>100025</strong>: China Mobile</li>
             * <li><strong>100027</strong>: China Education and Research Network</li>
             * <li><strong>100020</strong>: China Mobile Tietong</li>
             * <li><strong>1000143</strong>: Dr.Peng Telecom &amp; Media Group</li>
             * <li><strong>100080</strong>: Beijing Gehua CATV Network</li>
             * <li><strong>1000139</strong>: National Radio and Television Administration</li>
             * <li><strong>100023</strong>: Oriental Cable Network</li>
             * <li><strong>100063</strong>: Founder Broadband</li>
             * <li><strong>1000337</strong>: China Internet Exchange</li>
             * <li><strong>100021</strong>: 21Vianet Group</li>
             * <li><strong>1000333</strong>: Wasu Media Holding</li>
             * <li><strong>100093</strong>: Wangsu Science &amp; Technology</li>
             * <li><strong>1000401</strong>: Tencent</li>
             * <li><strong>100099</strong>: Baidu</li>
             * <li><strong>1000323</strong>: Alibaba Cloud</li>
             * <li><strong>100098</strong>: Alibaba</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100017</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>117.186.XX.XX</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}

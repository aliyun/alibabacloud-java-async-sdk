// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebReportTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebReportTopIpResponseBody</p>
 */
public class DescribeWebReportTopIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

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
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebReportTopIpResponseBody build() {
            return new DescribeWebReportTopIpResponseBody(this);
        } 

    } 

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
             * The ID of the location.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * The number of entries returned.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The Internet service provider (ISP) for the attack. Valid values:
             * <p>
             * 
             * *   **100017**: China Telecom
             * *   **100026**: China Unicom
             * *   **100025**: China Mobile
             * *   **100027**: China Education and Research Network
             * *   **100020**: China Mobile Tietong
             * *   **1000143**: Dr.Peng Telecom & Media Group
             * *   **100080**: Beijing Gehua CATV Network
             * *   **1000139**: National Radio and Television Administration
             * *   **100023**: Oriental Cable Network
             * *   **100063**: Founder Broadband
             * *   **1000337**: China Internet Exchange
             * *   **100021**: 21Vianet Group
             * *   **1000333**: Wasu Media Holding
             * *   **100093**: Wangsu Science & Technology
             * *   **1000401**: Tencent
             * *   **100099**: Baidu
             * *   **1000323**: Alibaba Cloud
             * *   **100098**: Alibaba
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The source IP address.
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

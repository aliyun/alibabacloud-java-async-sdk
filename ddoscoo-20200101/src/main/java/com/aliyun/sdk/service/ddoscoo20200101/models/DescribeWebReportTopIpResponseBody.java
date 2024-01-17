// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebReportTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebReportTopIpResponseBody</p>
 */
public class DescribeWebReportTopIpResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("RequestId")
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
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AreaId")
        private String areaId;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("SourceIp")
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
             * AreaId.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * SourceIp.
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

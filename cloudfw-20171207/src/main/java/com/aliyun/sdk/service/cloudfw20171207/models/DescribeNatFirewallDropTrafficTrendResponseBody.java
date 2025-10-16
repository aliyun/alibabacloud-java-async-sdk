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
 * {@link DescribeNatFirewallDropTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallDropTrafficTrendResponseBody</p>
 */
public class DescribeNatFirewallDropTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DropSessionMax")
    private Long dropSessionMax;

    @com.aliyun.core.annotation.NameInMap("DropSessionMaxTime")
    private String dropSessionMaxTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatFirewallDropTrafficTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.dropSessionMax = builder.dropSessionMax;
        this.dropSessionMaxTime = builder.dropSessionMaxTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallDropTrafficTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return dropSessionMax
     */
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    /**
     * @return dropSessionMaxTime
     */
    public String getDropSessionMaxTime() {
        return this.dropSessionMaxTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long dropSessionMax; 
        private String dropSessionMaxTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallDropTrafficTrendResponseBody model) {
            this.dataList = model.dataList;
            this.dropSessionMax = model.dropSessionMax;
            this.dropSessionMaxTime = model.dropSessionMaxTime;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * DropSessionMax.
         */
        public Builder dropSessionMax(Long dropSessionMax) {
            this.dropSessionMax = dropSessionMax;
            return this;
        }

        /**
         * DropSessionMaxTime.
         */
        public Builder dropSessionMaxTime(String dropSessionMaxTime) {
            this.dropSessionMaxTime = dropSessionMaxTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNatFirewallDropTrafficTrendResponseBody build() {
            return new DescribeNatFirewallDropTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallDropTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallDropTrafficTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DropSession")
        private Long dropSession;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalSession")
        private Long totalSession;

        private DataList(Builder builder) {
            this.dropSession = builder.dropSession;
            this.time = builder.time;
            this.totalSession = builder.totalSession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return dropSession
         */
        public Long getDropSession() {
            return this.dropSession;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalSession
         */
        public Long getTotalSession() {
            return this.totalSession;
        }

        public static final class Builder {
            private Long dropSession; 
            private Long time; 
            private Long totalSession; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.dropSession = model.dropSession;
                this.time = model.time;
                this.totalSession = model.totalSession;
            } 

            /**
             * DropSession.
             */
            public Builder dropSession(Long dropSession) {
                this.dropSession = dropSession;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalSession.
             */
            public Builder totalSession(Long totalSession) {
                this.totalSession = totalSession;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}

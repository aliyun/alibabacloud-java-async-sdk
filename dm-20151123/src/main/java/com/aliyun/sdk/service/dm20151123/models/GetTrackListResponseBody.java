// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetTrackListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrackListResponseBody</p>
 */
public class GetTrackListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OffsetCreateTime")
    private String offsetCreateTime;

    @com.aliyun.core.annotation.NameInMap("OffsetCreateTimeDesc")
    private String offsetCreateTimeDesc;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private GetTrackListResponseBody(Builder builder) {
        this.offsetCreateTime = builder.offsetCreateTime;
        this.offsetCreateTimeDesc = builder.offsetCreateTimeDesc;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrackListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offsetCreateTime
     */
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    /**
     * @return offsetCreateTimeDesc
     */
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String offsetCreateTime; 
        private String offsetCreateTimeDesc; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 
        private Data data; 

        private Builder() {
        } 

        private Builder(GetTrackListResponseBody model) {
            this.offsetCreateTime = model.offsetCreateTime;
            this.offsetCreateTimeDesc = model.offsetCreateTimeDesc;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
            this.data = model.data;
        } 

        /**
         * <p>Used for pagination. Not set for the first query, but for subsequent queries, it should be set to the value of OffsetCreateTime from the previous response. (This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder offsetCreateTime(String offsetCreateTime) {
            this.offsetCreateTime = offsetCreateTime;
            return this;
        }

        /**
         * <p>(This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder offsetCreateTimeDesc(String offsetCreateTimeDesc) {
            this.offsetCreateTimeDesc = offsetCreateTimeDesc;
            return this;
        }

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Number of items per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>Tracking data records</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetTrackListResponseBody build() {
            return new GetTrackListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrackListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrackListResponseBody</p>
     */
    public static class Stat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RcptClickCount")
        private String rcptClickCount;

        @com.aliyun.core.annotation.NameInMap("RcptClickRate")
        private String rcptClickRate;

        @com.aliyun.core.annotation.NameInMap("RcptOpenCount")
        private String rcptOpenCount;

        @com.aliyun.core.annotation.NameInMap("RcptOpenRate")
        private String rcptOpenRate;

        @com.aliyun.core.annotation.NameInMap("RcptUniqueClickCount")
        private String rcptUniqueClickCount;

        @com.aliyun.core.annotation.NameInMap("RcptUniqueClickRate")
        private String rcptUniqueClickRate;

        @com.aliyun.core.annotation.NameInMap("RcptUniqueOpenCount")
        private String rcptUniqueOpenCount;

        @com.aliyun.core.annotation.NameInMap("RcptUniqueOpenRate")
        private String rcptUniqueOpenRate;

        @com.aliyun.core.annotation.NameInMap("TotalNumber")
        private String totalNumber;

        private Stat(Builder builder) {
            this.createTime = builder.createTime;
            this.rcptClickCount = builder.rcptClickCount;
            this.rcptClickRate = builder.rcptClickRate;
            this.rcptOpenCount = builder.rcptOpenCount;
            this.rcptOpenRate = builder.rcptOpenRate;
            this.rcptUniqueClickCount = builder.rcptUniqueClickCount;
            this.rcptUniqueClickRate = builder.rcptUniqueClickRate;
            this.rcptUniqueOpenCount = builder.rcptUniqueOpenCount;
            this.rcptUniqueOpenRate = builder.rcptUniqueOpenRate;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stat create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return rcptClickCount
         */
        public String getRcptClickCount() {
            return this.rcptClickCount;
        }

        /**
         * @return rcptClickRate
         */
        public String getRcptClickRate() {
            return this.rcptClickRate;
        }

        /**
         * @return rcptOpenCount
         */
        public String getRcptOpenCount() {
            return this.rcptOpenCount;
        }

        /**
         * @return rcptOpenRate
         */
        public String getRcptOpenRate() {
            return this.rcptOpenRate;
        }

        /**
         * @return rcptUniqueClickCount
         */
        public String getRcptUniqueClickCount() {
            return this.rcptUniqueClickCount;
        }

        /**
         * @return rcptUniqueClickRate
         */
        public String getRcptUniqueClickRate() {
            return this.rcptUniqueClickRate;
        }

        /**
         * @return rcptUniqueOpenCount
         */
        public String getRcptUniqueOpenCount() {
            return this.rcptUniqueOpenCount;
        }

        /**
         * @return rcptUniqueOpenRate
         */
        public String getRcptUniqueOpenRate() {
            return this.rcptUniqueOpenRate;
        }

        /**
         * @return totalNumber
         */
        public String getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private String createTime; 
            private String rcptClickCount; 
            private String rcptClickRate; 
            private String rcptOpenCount; 
            private String rcptOpenRate; 
            private String rcptUniqueClickCount; 
            private String rcptUniqueClickRate; 
            private String rcptUniqueOpenCount; 
            private String rcptUniqueOpenRate; 
            private String totalNumber; 

            private Builder() {
            } 

            private Builder(Stat model) {
                this.createTime = model.createTime;
                this.rcptClickCount = model.rcptClickCount;
                this.rcptClickRate = model.rcptClickRate;
                this.rcptOpenCount = model.rcptOpenCount;
                this.rcptOpenRate = model.rcptOpenRate;
                this.rcptUniqueClickCount = model.rcptUniqueClickCount;
                this.rcptUniqueClickRate = model.rcptUniqueClickRate;
                this.rcptUniqueOpenCount = model.rcptUniqueOpenCount;
                this.rcptUniqueOpenRate = model.rcptUniqueOpenRate;
                this.totalNumber = model.totalNumber;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-29T13:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Click count</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptClickCount(String rcptClickCount) {
                this.rcptClickCount = rcptClickCount;
                return this;
            }

            /**
             * <p>Click rate</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptClickRate(String rcptClickRate) {
                this.rcptClickRate = rcptClickRate;
                return this;
            }

            /**
             * <p>Number of Opens</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptOpenCount(String rcptOpenCount) {
                this.rcptOpenCount = rcptOpenCount;
                return this;
            }

            /**
             * <p>Open rate</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptOpenRate(String rcptOpenRate) {
                this.rcptOpenRate = rcptOpenRate;
                return this;
            }

            /**
             * <p>Unique click count</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptUniqueClickCount(String rcptUniqueClickCount) {
                this.rcptUniqueClickCount = rcptUniqueClickCount;
                return this;
            }

            /**
             * <p>Unique click rate</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptUniqueClickRate(String rcptUniqueClickRate) {
                this.rcptUniqueClickRate = rcptUniqueClickRate;
                return this;
            }

            /**
             * <p>Unique open count</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptUniqueOpenCount(String rcptUniqueOpenCount) {
                this.rcptUniqueOpenCount = rcptUniqueOpenCount;
                return this;
            }

            /**
             * <p>Unique open rate</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rcptUniqueOpenRate(String rcptUniqueOpenRate) {
                this.rcptUniqueOpenRate = rcptUniqueOpenRate;
                return this;
            }

            /**
             * <p>Total number</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalNumber(String totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public Stat build() {
                return new Stat(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTrackListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrackListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stat")
        private java.util.List<Stat> stat;

        private Data(Builder builder) {
            this.stat = builder.stat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return stat
         */
        public java.util.List<Stat> getStat() {
            return this.stat;
        }

        public static final class Builder {
            private java.util.List<Stat> stat; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.stat = model.stat;
            } 

            /**
             * stat.
             */
            public Builder stat(java.util.List<Stat> stat) {
                this.stat = stat;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

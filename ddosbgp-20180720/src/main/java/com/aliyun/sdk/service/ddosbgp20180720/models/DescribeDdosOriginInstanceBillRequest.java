// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDdosOriginInstanceBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosOriginInstanceBillRequest</p>
 */
public class DescribeDdosOriginInstanceBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsShowList")
    private Boolean isShowList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDdosOriginInstanceBillRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.isShowList = builder.isShowList;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosOriginInstanceBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return isShowList
     */
    public Boolean getIsShowList() {
        return this.isShowList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDdosOriginInstanceBillRequest, Builder> {
        private Long endTime; 
        private Boolean isShowList; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosOriginInstanceBillRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.isShowList = request.isShowList;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The end of the time range to query. The value is a timestamp. Unit: milliseconds. The time span between StartTime and EndTime cannot exceed 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1711382399410</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to display the bill details. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isShowList(Boolean isShowList) {
            this.putQueryParameter("IsShowList", isShowList);
            this.isShowList = isShowList;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1711209600410</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The bill type. Valid values:</p>
         * <ul>
         * <li><strong>flow_cn</strong>: the bill for the clean bandwidth of elastic IP addresses (EIPs) with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
         * <li><strong>flow_ov</strong>: the bill for the clean bandwidth of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
         * <li><strong>standard_assets_flow_cn</strong>: the bill for the clean bandwidth of regular Alibaba Cloud services in the Chinese mainland.</li>
         * <li><strong>standard_assets_flow_ov</strong>: the bill for the clean bandwidth of regular Alibaba Cloud services outside the Chinese mainland.</li>
         * <li><strong>function</strong>: the bill for the basic fee.</li>
         * <li><strong>ip_count</strong>: the bill for protected IP addresses.</li>
         * <li><strong>monthly_summary</strong>: the monthly summary bill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDdosOriginInstanceBillRequest build() {
            return new DescribeDdosOriginInstanceBillRequest(this);
        } 

    } 

}

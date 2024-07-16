// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardDayUsagesRequest} extends {@link RequestModel}
 *
 * <p>ListCardDayUsagesRequest</p>
 */
public class ListCardDayUsagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > iccids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatestMonthNum")
    @com.aliyun.core.annotation.Validation(maximum = 6, minimum = 1)
    private Integer latestMonthNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListCardDayUsagesRequest(Builder builder) {
        super(builder);
        this.iccids = builder.iccids;
        this.latestMonthNum = builder.latestMonthNum;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardDayUsagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return latestMonthNum
     */
    public Integer getLatestMonthNum() {
        return this.latestMonthNum;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListCardDayUsagesRequest, Builder> {
        private java.util.List < String > iccids; 
        private Integer latestMonthNum; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListCardDayUsagesRequest request) {
            super(request);
            this.iccids = request.iccids;
            this.latestMonthNum = request.latestMonthNum;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
            return this;
        }

        /**
         * LatestMonthNum.
         */
        public Builder latestMonthNum(Integer latestMonthNum) {
            this.putQueryParameter("LatestMonthNum", latestMonthNum);
            this.latestMonthNum = latestMonthNum;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public ListCardDayUsagesRequest build() {
            return new ListCardDayUsagesRequest(this);
        } 

    } 

}

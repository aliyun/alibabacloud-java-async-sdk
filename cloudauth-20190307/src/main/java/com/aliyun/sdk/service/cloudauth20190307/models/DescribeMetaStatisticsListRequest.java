// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeMetaStatisticsListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetaStatisticsListRequest</p>
 */
public class DescribeMetaStatisticsListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Api")
    @com.aliyun.core.annotation.Validation(required = true)
    private String api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    private DescribeMetaStatisticsListRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaStatisticsListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeMetaStatisticsListRequest, Builder> {
        private String api; 
        private Long endDate; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetaStatisticsListRequest request) {
            super(request);
            this.api = request.api;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The product code. Valid values:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
         * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
         * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
         * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
         * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
         * <li><strong>MOBILE_DETECT</strong>: number detection</li>
         * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
         * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MOBILE_ONLINE_LENGTH</p>
         */
        public Builder api(String api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1750694399999</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1760112000000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeMetaStatisticsListRequest build() {
            return new DescribeMetaStatisticsListRequest(this);
        } 

    } 

}

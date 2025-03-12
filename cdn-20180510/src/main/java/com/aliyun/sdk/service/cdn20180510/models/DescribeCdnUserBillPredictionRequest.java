// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnUserBillPredictionRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserBillPredictionRequest</p>
 */
public class DescribeCdnUserBillPredictionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private String dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeCdnUserBillPredictionRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillPredictionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserBillPredictionRequest, Builder> {
        private String area; 
        private String dimension; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserBillPredictionRequest request) {
            super(request);
            this.area = request.area;
            this.dimension = request.dimension;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The billable region. Valid values:</p>
         * <ul>
         * <li><strong>CN</strong>: the Chinese mainland</li>
         * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
         * <li><strong>AP1</strong>: Asia Pacific 1</li>
         * <li><strong>AP2</strong>: Asia Pacific 2</li>
         * <li><strong>AP3</strong>: Asia Pacific 3</li>
         * <li><strong>NA</strong>: North America</li>
         * <li><strong>SA</strong>: South America</li>
         * <li><strong>EU</strong>: Europe</li>
         * <li><strong>MEAA</strong>: Middle East and Africa</li>
         * </ul>
         * <p>By default, the value of this parameter is determined by the metering method that is currently used. Regions inside and outside the Chinese mainland are classified into the <strong>CN</strong> and <strong>OverSeas</strong> billable regions. Billable regions inside the Chinese mainland include <strong>CN</strong>. Billable regions outside the Chinese mainland include <strong>AP1</strong>, <strong>AP2</strong>, <strong>AP3</strong>, <strong>NA</strong>, <strong>SA</strong>, <strong>EU</strong>, and <strong>MEAA</strong>.</p>
         * <blockquote>
         * <p>For more information about billable regions, see <a href="https://help.aliyun.com/document_detail/142221.html">Billable regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CN,OverSeas</p>
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>The billable item. A value of flow specifies bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end time of the estimation. The default value is the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-10-25T10:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start time of the estimation. The default value is 00:00 on the first day of the current month. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCdnUserBillPredictionRequest build() {
            return new DescribeCdnUserBillPredictionRequest(this);
        } 

    } 

}

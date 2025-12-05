// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link AdjustJMeterSceneSpeedRequest} extends {@link RequestModel}
 *
 * <p>AdjustJMeterSceneSpeedRequest</p>
 */
public class AdjustJMeterSceneSpeedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer speed;

    private AdjustJMeterSceneSpeedRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
        this.speed = builder.speed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdjustJMeterSceneSpeedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return speed
     */
    public Integer getSpeed() {
        return this.speed;
    }

    public static final class Builder extends Request.Builder<AdjustJMeterSceneSpeedRequest, Builder> {
        private String reportId; 
        private Integer speed; 

        private Builder() {
            super();
        } 

        private Builder(AdjustJMeterSceneSpeedRequest request) {
            super(request);
            this.reportId = request.reportId;
            this.speed = request.speed;
        } 

        /**
         * <p>The ID of the report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPZIH</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The load to which you want to adjust.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder speed(Integer speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        @Override
        public AdjustJMeterSceneSpeedRequest build() {
            return new AdjustJMeterSceneSpeedRequest(this);
        } 

    } 

}

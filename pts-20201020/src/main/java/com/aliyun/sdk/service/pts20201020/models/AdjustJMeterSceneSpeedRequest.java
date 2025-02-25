// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdjustJMeterSceneSpeedRequest} extends {@link RequestModel}
 *
 * <p>AdjustJMeterSceneSpeedRequest</p>
 */
public class AdjustJMeterSceneSpeedRequest extends Request {
    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Query
    @NameInMap("Speed")
    @Validation(required = true, minimum = 1)
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
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * Speed.
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

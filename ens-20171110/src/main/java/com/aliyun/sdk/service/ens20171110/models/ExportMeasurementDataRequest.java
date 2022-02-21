// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportMeasurementDataRequest} extends {@link RequestModel}
 *
 * <p>ExportMeasurementDataRequest</p>
 */
public class ExportMeasurementDataRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ExportMeasurementDataRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportMeasurementDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ExportMeasurementDataRequest, Builder> {
        private String endDate; 
        private String startDate; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ExportMeasurementDataRequest response) {
            super(response);
            this.endDate = response.endDate;
            this.startDate = response.startDate;
            this.version = response.version;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ExportMeasurementDataRequest build() {
            return new ExportMeasurementDataRequest(this);
        } 

    } 

}

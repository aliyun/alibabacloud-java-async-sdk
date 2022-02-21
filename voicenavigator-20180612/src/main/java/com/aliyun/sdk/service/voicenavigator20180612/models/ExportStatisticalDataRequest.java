// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportStatisticalDataRequest} extends {@link RequestModel}
 *
 * <p>ExportStatisticalDataRequest</p>
 */
public class ExportStatisticalDataRequest extends Request {
    @Query
    @NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @Query
    @NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @Query
    @NameInMap("ExportType")
    @Validation(required = true)
    private String exportType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TimeUnit")
    @Validation(required = true)
    private String timeUnit;

    private ExportStatisticalDataRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.exportType = builder.exportType;
        this.instanceId = builder.instanceId;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportStatisticalDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTimeLeftRange
     */
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    /**
     * @return beginTimeRightRange
     */
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<ExportStatisticalDataRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String exportType; 
        private String instanceId; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(ExportStatisticalDataRequest response) {
            super(response);
            this.beginTimeLeftRange = response.beginTimeLeftRange;
            this.beginTimeRightRange = response.beginTimeRightRange;
            this.exportType = response.exportType;
            this.instanceId = response.instanceId;
            this.timeUnit = response.timeUnit;
        } 

        /**
         * BeginTimeLeftRange.
         */
        public Builder beginTimeLeftRange(Long beginTimeLeftRange) {
            this.putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange);
            this.beginTimeLeftRange = beginTimeLeftRange;
            return this;
        }

        /**
         * BeginTimeRightRange.
         */
        public Builder beginTimeRightRange(Long beginTimeRightRange) {
            this.putQueryParameter("BeginTimeRightRange", beginTimeRightRange);
            this.beginTimeRightRange = beginTimeRightRange;
            return this;
        }

        /**
         * ExportType.
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("TimeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public ExportStatisticalDataRequest build() {
            return new ExportStatisticalDataRequest(this);
        } 

    } 

}

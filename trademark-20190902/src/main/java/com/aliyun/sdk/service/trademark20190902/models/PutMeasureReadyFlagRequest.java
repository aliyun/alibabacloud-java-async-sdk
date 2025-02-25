// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMeasureReadyFlagRequest} extends {@link RequestModel}
 *
 * <p>PutMeasureReadyFlagRequest</p>
 */
public class PutMeasureReadyFlagRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("ReadyFlag")
    @Validation(required = true)
    private String readyFlag;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private PutMeasureReadyFlagRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.dataType = builder.dataType;
        this.endTime = builder.endTime;
        this.readyFlag = builder.readyFlag;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMeasureReadyFlagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return readyFlag
     */
    public String getReadyFlag() {
        return this.readyFlag;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PutMeasureReadyFlagRequest, Builder> {
        private String bizType; 
        private String dataType; 
        private String endTime; 
        private String readyFlag; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(PutMeasureReadyFlagRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.dataType = request.dataType;
            this.endTime = request.endTime;
            this.readyFlag = request.readyFlag;
            this.startTime = request.startTime;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ReadyFlag.
         */
        public Builder readyFlag(String readyFlag) {
            this.putQueryParameter("ReadyFlag", readyFlag);
            this.readyFlag = readyFlag;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public PutMeasureReadyFlagRequest build() {
            return new PutMeasureReadyFlagRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMeasureDataRequest} extends {@link RequestModel}
 *
 * <p>PutMeasureDataRequest</p>
 */
public class PutMeasureDataRequest extends Request {
    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Body
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private PutMeasureDataRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMeasureDataRequest create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PutMeasureDataRequest, Builder> {
        private String bizType; 
        private String data; 
        private String dataType; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(PutMeasureDataRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.data = request.data;
            this.dataType = request.dataType;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public PutMeasureDataRequest build() {
            return new PutMeasureDataRequest(this);
        } 

    } 

}

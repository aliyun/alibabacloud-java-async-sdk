// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link StartPTDetectionRequest} extends {@link RequestModel}
 *
 * <p>StartPTDetectionRequest</p>
 */
public class StartPTDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmInstanceUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmInstanceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCollectionTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataCollectionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PowerPlantsNumber")
    private Integer powerPlantsNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PowerStationUid")
    private String powerStationUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sensitivity")
    private Integer sensitivity;

    private StartPTDetectionRequest(Builder builder) {
        super(builder);
        this.algorithmInstanceUid = builder.algorithmInstanceUid;
        this.data = builder.data;
        this.dataCollectionTime = builder.dataCollectionTime;
        this.fileName = builder.fileName;
        this.iotInstanceId = builder.iotInstanceId;
        this.powerPlantsNumber = builder.powerPlantsNumber;
        this.powerStationUid = builder.powerStationUid;
        this.sensitivity = builder.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPTDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmInstanceUid
     */
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataCollectionTime
     */
    public Long getDataCollectionTime() {
        return this.dataCollectionTime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return powerPlantsNumber
     */
    public Integer getPowerPlantsNumber() {
        return this.powerPlantsNumber;
    }

    /**
     * @return powerStationUid
     */
    public String getPowerStationUid() {
        return this.powerStationUid;
    }

    /**
     * @return sensitivity
     */
    public Integer getSensitivity() {
        return this.sensitivity;
    }

    public static final class Builder extends Request.Builder<StartPTDetectionRequest, Builder> {
        private String algorithmInstanceUid; 
        private String data; 
        private Long dataCollectionTime; 
        private String fileName; 
        private String iotInstanceId; 
        private Integer powerPlantsNumber; 
        private String powerStationUid; 
        private Integer sensitivity; 

        private Builder() {
            super();
        } 

        private Builder(StartPTDetectionRequest request) {
            super(request);
            this.algorithmInstanceUid = request.algorithmInstanceUid;
            this.data = request.data;
            this.dataCollectionTime = request.dataCollectionTime;
            this.fileName = request.fileName;
            this.iotInstanceId = request.iotInstanceId;
            this.powerPlantsNumber = request.powerPlantsNumber;
            this.powerStationUid = request.powerStationUid;
            this.sensitivity = request.sensitivity;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder algorithmInstanceUid(String algorithmInstanceUid) {
            this.putQueryParameter("AlgorithmInstanceUid", algorithmInstanceUid);
            this.algorithmInstanceUid = algorithmInstanceUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataCollectionTime(Long dataCollectionTime) {
            this.putQueryParameter("DataCollectionTime", dataCollectionTime);
            this.dataCollectionTime = dataCollectionTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PowerPlantsNumber.
         */
        public Builder powerPlantsNumber(Integer powerPlantsNumber) {
            this.putQueryParameter("PowerPlantsNumber", powerPlantsNumber);
            this.powerPlantsNumber = powerPlantsNumber;
            return this;
        }

        /**
         * PowerStationUid.
         */
        public Builder powerStationUid(String powerStationUid) {
            this.putQueryParameter("PowerStationUid", powerStationUid);
            this.powerStationUid = powerStationUid;
            return this;
        }

        /**
         * Sensitivity.
         */
        public Builder sensitivity(Integer sensitivity) {
            this.putQueryParameter("Sensitivity", sensitivity);
            this.sensitivity = sensitivity;
            return this;
        }

        @Override
        public StartPTDetectionRequest build() {
            return new StartPTDetectionRequest(this);
        } 

    } 

}

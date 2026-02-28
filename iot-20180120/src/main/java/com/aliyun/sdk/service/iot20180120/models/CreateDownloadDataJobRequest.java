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
 * {@link CreateDownloadDataJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadDataJobRequest</p>
 */
public class CreateDownloadDataJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadDataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downloadDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileConfig")
    private java.util.Map<String, ?> fileConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private CreateDownloadDataJobRequest(Builder builder) {
        super(builder);
        this.downloadDataType = builder.downloadDataType;
        this.endTime = builder.endTime;
        this.fileConfig = builder.fileConfig;
        this.iotInstanceId = builder.iotInstanceId;
        this.startTime = builder.startTime;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadDataJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadDataType
     */
    public String getDownloadDataType() {
        return this.downloadDataType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileConfig
     */
    public java.util.Map<String, ?> getFileConfig() {
        return this.fileConfig;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreateDownloadDataJobRequest, Builder> {
        private String downloadDataType; 
        private Long endTime; 
        private java.util.Map<String, ?> fileConfig; 
        private String iotInstanceId; 
        private Long startTime; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadDataJobRequest request) {
            super(request);
            this.downloadDataType = request.downloadDataType;
            this.endTime = request.endTime;
            this.fileConfig = request.fileConfig;
            this.iotInstanceId = request.iotInstanceId;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder downloadDataType(String downloadDataType) {
            this.putQueryParameter("DownloadDataType", downloadDataType);
            this.downloadDataType = downloadDataType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FileConfig.
         */
        public Builder fileConfig(java.util.Map<String, ?> fileConfig) {
            String fileConfigShrink = shrink(fileConfig, "FileConfig", "json");
            this.putQueryParameter("FileConfig", fileConfigShrink);
            this.fileConfig = fileConfig;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product_info</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public CreateDownloadDataJobRequest build() {
            return new CreateDownloadDataJobRequest(this);
        } 

    } 

}

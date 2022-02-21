// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDeviceRecordRequest} extends {@link RequestModel}
 *
 * <p>UploadDeviceRecordRequest</p>
 */
public class UploadDeviceRecordRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SearchCriteria")
    @Validation(required = true)
    private String searchCriteria;

    @Query
    @NameInMap("StreamId")
    private String streamId;

    @Query
    @NameInMap("UploadId")
    private String uploadId;

    @Query
    @NameInMap("UploadMode")
    @Validation(required = true)
    private String uploadMode;

    @Query
    @NameInMap("UploadParams")
    @Validation(required = true)
    private String uploadParams;

    @Query
    @NameInMap("UploadType")
    @Validation(required = true)
    private String uploadType;

    private UploadDeviceRecordRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ownerId = builder.ownerId;
        this.searchCriteria = builder.searchCriteria;
        this.streamId = builder.streamId;
        this.uploadId = builder.uploadId;
        this.uploadMode = builder.uploadMode;
        this.uploadParams = builder.uploadParams;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDeviceRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return searchCriteria
     */
    public String getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return uploadMode
     */
    public String getUploadMode() {
        return this.uploadMode;
    }

    /**
     * @return uploadParams
     */
    public String getUploadParams() {
        return this.uploadParams;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<UploadDeviceRecordRequest, Builder> {
        private String deviceId; 
        private Long ownerId; 
        private String searchCriteria; 
        private String streamId; 
        private String uploadId; 
        private String uploadMode; 
        private String uploadParams; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(UploadDeviceRecordRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.ownerId = response.ownerId;
            this.searchCriteria = response.searchCriteria;
            this.streamId = response.streamId;
            this.uploadId = response.uploadId;
            this.uploadMode = response.uploadMode;
            this.uploadParams = response.uploadParams;
            this.uploadType = response.uploadType;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SearchCriteria.
         */
        public Builder searchCriteria(String searchCriteria) {
            this.putQueryParameter("SearchCriteria", searchCriteria);
            this.searchCriteria = searchCriteria;
            return this;
        }

        /**
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.putQueryParameter("StreamId", streamId);
            this.streamId = streamId;
            return this;
        }

        /**
         * UploadId.
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * UploadMode.
         */
        public Builder uploadMode(String uploadMode) {
            this.putQueryParameter("UploadMode", uploadMode);
            this.uploadMode = uploadMode;
            return this;
        }

        /**
         * UploadParams.
         */
        public Builder uploadParams(String uploadParams) {
            this.putQueryParameter("UploadParams", uploadParams);
            this.uploadParams = uploadParams;
            return this;
        }

        /**
         * UploadType.
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public UploadDeviceRecordRequest build() {
            return new UploadDeviceRecordRequest(this);
        } 

    } 

}

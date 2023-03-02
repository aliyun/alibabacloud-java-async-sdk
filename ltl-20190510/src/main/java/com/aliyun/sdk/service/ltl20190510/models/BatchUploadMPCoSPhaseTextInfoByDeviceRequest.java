// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseTextInfoByDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchUploadMPCoSPhaseTextInfoByDeviceRequest</p>
 */
public class BatchUploadMPCoSPhaseTextInfoByDeviceRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("IotAuthType")
    @Validation(required = true)
    private String iotAuthType;

    @Query
    @NameInMap("IotDataDigest")
    @Validation(required = true)
    private String iotDataDigest;

    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Query
    @NameInMap("IotIdServiceProvider")
    @Validation(required = true)
    private String iotIdServiceProvider;

    @Query
    @NameInMap("IotIdSource")
    @Validation(required = true)
    private String iotIdSource;

    @Query
    @NameInMap("IotSignature")
    @Validation(required = true)
    private String iotSignature;

    @Query
    @NameInMap("PhaseDataList")
    @Validation(required = true)
    private java.util.Map < String, ? > phaseDataList;

    @Query
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("PhaseId")
    @Validation(required = true)
    private String phaseId;

    private BatchUploadMPCoSPhaseTextInfoByDeviceRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.iotAuthType = builder.iotAuthType;
        this.iotDataDigest = builder.iotDataDigest;
        this.iotId = builder.iotId;
        this.iotIdServiceProvider = builder.iotIdServiceProvider;
        this.iotIdSource = builder.iotIdSource;
        this.iotSignature = builder.iotSignature;
        this.phaseDataList = builder.phaseDataList;
        this.phaseGroupId = builder.phaseGroupId;
        this.phaseId = builder.phaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUploadMPCoSPhaseTextInfoByDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return iotAuthType
     */
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    /**
     * @return iotDataDigest
     */
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotIdServiceProvider
     */
    public String getIotIdServiceProvider() {
        return this.iotIdServiceProvider;
    }

    /**
     * @return iotIdSource
     */
    public String getIotIdSource() {
        return this.iotIdSource;
    }

    /**
     * @return iotSignature
     */
    public String getIotSignature() {
        return this.iotSignature;
    }

    /**
     * @return phaseDataList
     */
    public java.util.Map < String, ? > getPhaseDataList() {
        return this.phaseDataList;
    }

    /**
     * @return phaseGroupId
     */
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    /**
     * @return phaseId
     */
    public String getPhaseId() {
        return this.phaseId;
    }

    public static final class Builder extends Request.Builder<BatchUploadMPCoSPhaseTextInfoByDeviceRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String iotAuthType; 
        private String iotDataDigest; 
        private String iotId; 
        private String iotIdServiceProvider; 
        private String iotIdSource; 
        private String iotSignature; 
        private java.util.Map < String, ? > phaseDataList; 
        private String phaseGroupId; 
        private String phaseId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUploadMPCoSPhaseTextInfoByDeviceRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.iotAuthType = request.iotAuthType;
            this.iotDataDigest = request.iotDataDigest;
            this.iotId = request.iotId;
            this.iotIdServiceProvider = request.iotIdServiceProvider;
            this.iotIdSource = request.iotIdSource;
            this.iotSignature = request.iotSignature;
            this.phaseDataList = request.phaseDataList;
            this.phaseGroupId = request.phaseGroupId;
            this.phaseId = request.phaseId;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * IotAuthType.
         */
        public Builder iotAuthType(String iotAuthType) {
            this.putQueryParameter("IotAuthType", iotAuthType);
            this.iotAuthType = iotAuthType;
            return this;
        }

        /**
         * IotDataDigest.
         */
        public Builder iotDataDigest(String iotDataDigest) {
            this.putQueryParameter("IotDataDigest", iotDataDigest);
            this.iotDataDigest = iotDataDigest;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotIdServiceProvider.
         */
        public Builder iotIdServiceProvider(String iotIdServiceProvider) {
            this.putQueryParameter("IotIdServiceProvider", iotIdServiceProvider);
            this.iotIdServiceProvider = iotIdServiceProvider;
            return this;
        }

        /**
         * IotIdSource.
         */
        public Builder iotIdSource(String iotIdSource) {
            this.putQueryParameter("IotIdSource", iotIdSource);
            this.iotIdSource = iotIdSource;
            return this;
        }

        /**
         * IotSignature.
         */
        public Builder iotSignature(String iotSignature) {
            this.putQueryParameter("IotSignature", iotSignature);
            this.iotSignature = iotSignature;
            return this;
        }

        /**
         * PhaseDataList.
         */
        public Builder phaseDataList(java.util.Map < String, ? > phaseDataList) {
            String phaseDataListShrink = shrink(phaseDataList, "PhaseDataList", "json");
            this.putQueryParameter("PhaseDataList", phaseDataListShrink);
            this.phaseDataList = phaseDataList;
            return this;
        }

        /**
         * PhaseGroupId.
         */
        public Builder phaseGroupId(String phaseGroupId) {
            this.putQueryParameter("PhaseGroupId", phaseGroupId);
            this.phaseGroupId = phaseGroupId;
            return this;
        }

        /**
         * PhaseId.
         */
        public Builder phaseId(String phaseId) {
            this.putQueryParameter("PhaseId", phaseId);
            this.phaseId = phaseId;
            return this;
        }

        @Override
        public BatchUploadMPCoSPhaseTextInfoByDeviceRequest build() {
            return new BatchUploadMPCoSPhaseTextInfoByDeviceRequest(this);
        } 

    } 

}

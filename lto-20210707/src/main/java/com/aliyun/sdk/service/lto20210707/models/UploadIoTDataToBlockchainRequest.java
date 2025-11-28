// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link UploadIoTDataToBlockchainRequest} extends {@link RequestModel}
 *
 * <p>UploadIoTDataToBlockchainRequest</p>
 */
public class UploadIoTDataToBlockchainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotAuthType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotAuthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotDataDID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotDataDID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotDataDigest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotDataDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotDataToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotDataToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotIdServiceProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotIdServiceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotIdSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotIdSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlainData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String plainData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privacyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UploadIoTDataToBlockchainRequest(Builder builder) {
        super(builder);
        this.iotAuthType = builder.iotAuthType;
        this.iotDataDID = builder.iotDataDID;
        this.iotDataDigest = builder.iotDataDigest;
        this.iotDataToken = builder.iotDataToken;
        this.iotId = builder.iotId;
        this.iotIdServiceProvider = builder.iotIdServiceProvider;
        this.iotIdSource = builder.iotIdSource;
        this.plainData = builder.plainData;
        this.privacyData = builder.privacyData;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadIoTDataToBlockchainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotAuthType
     */
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    /**
     * @return iotDataDID
     */
    public String getIotDataDID() {
        return this.iotDataDID;
    }

    /**
     * @return iotDataDigest
     */
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    /**
     * @return iotDataToken
     */
    public String getIotDataToken() {
        return this.iotDataToken;
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
     * @return plainData
     */
    public String getPlainData() {
        return this.plainData;
    }

    /**
     * @return privacyData
     */
    public String getPrivacyData() {
        return this.privacyData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UploadIoTDataToBlockchainRequest, Builder> {
        private String iotAuthType; 
        private String iotDataDID; 
        private String iotDataDigest; 
        private String iotDataToken; 
        private String iotId; 
        private String iotIdServiceProvider; 
        private String iotIdSource; 
        private String plainData; 
        private String privacyData; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UploadIoTDataToBlockchainRequest request) {
            super(request);
            this.iotAuthType = request.iotAuthType;
            this.iotDataDID = request.iotDataDID;
            this.iotDataDigest = request.iotDataDigest;
            this.iotDataToken = request.iotDataToken;
            this.iotId = request.iotId;
            this.iotIdServiceProvider = request.iotIdServiceProvider;
            this.iotIdSource = request.iotIdSource;
            this.plainData = request.plainData;
            this.privacyData = request.privacyData;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotAuthType(String iotAuthType) {
            this.putQueryParameter("IotAuthType", iotAuthType);
            this.iotAuthType = iotAuthType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotDataDID(String iotDataDID) {
            this.putQueryParameter("IotDataDID", iotDataDID);
            this.iotDataDID = iotDataDID;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotDataDigest(String iotDataDigest) {
            this.putQueryParameter("IotDataDigest", iotDataDigest);
            this.iotDataDigest = iotDataDigest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotDataToken(String iotDataToken) {
            this.putQueryParameter("IotDataToken", iotDataToken);
            this.iotDataToken = iotDataToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotIdServiceProvider(String iotIdServiceProvider) {
            this.putQueryParameter("IotIdServiceProvider", iotIdServiceProvider);
            this.iotIdServiceProvider = iotIdServiceProvider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotIdSource(String iotIdSource) {
            this.putQueryParameter("IotIdSource", iotIdSource);
            this.iotIdSource = iotIdSource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder plainData(String plainData) {
            this.putQueryParameter("PlainData", plainData);
            this.plainData = plainData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privacyData(String privacyData) {
            this.putQueryParameter("PrivacyData", privacyData);
            this.privacyData = privacyData;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UploadIoTDataToBlockchainRequest build() {
            return new UploadIoTDataToBlockchainRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataWithSignatureRequest} extends {@link RequestModel}
 *
 * <p>SetDataWithSignatureRequest</p>
 */
public class SetDataWithSignatureRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

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
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private SetDataWithSignatureRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.iotAuthType = builder.iotAuthType;
        this.iotDataDigest = builder.iotDataDigest;
        this.iotId = builder.iotId;
        this.iotIdServiceProvider = builder.iotIdServiceProvider;
        this.iotIdSource = builder.iotIdSource;
        this.iotSignature = builder.iotSignature;
        this.key = builder.key;
        this.productKey = builder.productKey;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataWithSignatureRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SetDataWithSignatureRequest, Builder> {
        private String apiVersion; 
        private String iotAuthType; 
        private String iotDataDigest; 
        private String iotId; 
        private String iotIdServiceProvider; 
        private String iotIdSource; 
        private String iotSignature; 
        private String key; 
        private String productKey; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SetDataWithSignatureRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.iotAuthType = request.iotAuthType;
            this.iotDataDigest = request.iotDataDigest;
            this.iotId = request.iotId;
            this.iotIdServiceProvider = request.iotIdServiceProvider;
            this.iotIdSource = request.iotIdSource;
            this.iotSignature = request.iotSignature;
            this.key = request.key;
            this.productKey = request.productKey;
            this.value = request.value;
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
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SetDataWithSignatureRequest build() {
            return new SetDataWithSignatureRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileVodRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceFileVodRequest</p>
 */
public class QueryDeviceFileVodRequest extends Request {
    @Query
    @NameInMap("EncryptType")
    private Integer encryptType;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Query
    @NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    private QueryDeviceFileVodRequest(Builder builder) {
        super(builder);
        this.encryptType = builder.encryptType;
        this.fileName = builder.fileName;
        this.iotId = builder.iotId;
        this.shouldEncrypt = builder.shouldEncrypt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceFileVodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptType
     */
    public Integer getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return shouldEncrypt
     */
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public static final class Builder extends Request.Builder<QueryDeviceFileVodRequest, Builder> {
        private Integer encryptType; 
        private String fileName; 
        private String iotId; 
        private Boolean shouldEncrypt; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceFileVodRequest response) {
            super(response);
            this.encryptType = response.encryptType;
            this.fileName = response.fileName;
            this.iotId = response.iotId;
            this.shouldEncrypt = response.shouldEncrypt;
        } 

        /**
         * EncryptType.
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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
         * ShouldEncrypt.
         */
        public Builder shouldEncrypt(Boolean shouldEncrypt) {
            this.putQueryParameter("ShouldEncrypt", shouldEncrypt);
            this.shouldEncrypt = shouldEncrypt;
            return this;
        }

        @Override
        public QueryDeviceFileVodRequest build() {
            return new QueryDeviceFileVodRequest(this);
        } 

    } 

}

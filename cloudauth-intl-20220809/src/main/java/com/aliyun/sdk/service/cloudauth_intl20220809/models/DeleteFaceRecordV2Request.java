// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link DeleteFaceRecordV2Request} extends {@link RequestModel}
 *
 * <p>DeleteFaceRecordV2Request</p>
 */
public class DeleteFaceRecordV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceGroupCode")
    private String faceGroupCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantUserId;

    private DeleteFaceRecordV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.faceGroupCode = builder.faceGroupCode;
        this.merchantUserId = builder.merchantUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceRecordV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return faceGroupCode
     */
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceRecordV2Request, Builder> {
        private String regionId; 
        private String faceGroupCode; 
        private String merchantUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceRecordV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.faceGroupCode = request.faceGroupCode;
            this.merchantUserId = request.merchantUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FaceGroupCode.
         */
        public Builder faceGroupCode(String faceGroupCode) {
            this.putQueryParameter("FaceGroupCode", faceGroupCode);
            this.faceGroupCode = faceGroupCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1231****</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        @Override
        public DeleteFaceRecordV2Request build() {
            return new DeleteFaceRecordV2Request(this);
        } 

    } 

}

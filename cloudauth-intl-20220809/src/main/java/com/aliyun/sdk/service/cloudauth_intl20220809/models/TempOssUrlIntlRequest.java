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
 * {@link TempOssUrlIntlRequest} extends {@link RequestModel}
 *
 * <p>TempOssUrlIntlRequest</p>
 */
public class TempOssUrlIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectName;

    private TempOssUrlIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.objectName = builder.objectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempOssUrlIntlRequest create() {
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
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    public static final class Builder extends Request.Builder<TempOssUrlIntlRequest, Builder> {
        private String regionId; 
        private String objectName; 

        private Builder() {
            super();
        } 

        private Builder(TempOssUrlIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.objectName = request.objectName;
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
         * <p>Object name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20250512/pdf/579047.pdf</p>
         */
        public Builder objectName(String objectName) {
            this.putBodyParameter("ObjectName", objectName);
            this.objectName = objectName;
            return this;
        }

        @Override
        public TempOssUrlIntlRequest build() {
            return new TempOssUrlIntlRequest(this);
        } 

    } 

}

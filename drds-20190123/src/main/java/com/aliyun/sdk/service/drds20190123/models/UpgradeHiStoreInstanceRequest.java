// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link UpgradeHiStoreInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeHiStoreInstanceRequest</p>
 */
public class UpgradeHiStoreInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HistoreInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String historeInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpgradeHiStoreInstanceRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.historeInstanceId = builder.historeInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeHiStoreInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return historeInstanceId
     */
    public String getHistoreInstanceId() {
        return this.historeInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpgradeHiStoreInstanceRequest, Builder> {
        private String drdsInstanceId; 
        private String historeInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeHiStoreInstanceRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.historeInstanceId = request.historeInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssad23sdfc</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the column-oriented storage instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hi-sesex2e</p>
         */
        public Builder historeInstanceId(String historeInstanceId) {
            this.putQueryParameter("HistoreInstanceId", historeInstanceId);
            this.historeInstanceId = historeInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpgradeHiStoreInstanceRequest build() {
            return new UpgradeHiStoreInstanceRequest(this);
        } 

    } 

}

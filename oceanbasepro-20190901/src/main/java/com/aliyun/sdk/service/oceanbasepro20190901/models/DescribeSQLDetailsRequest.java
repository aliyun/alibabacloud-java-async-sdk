// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLDetailsRequest</p>
 */
public class DescribeSQLDetailsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SQLId")
    @Validation(required = true)
    private String SQLId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DescribeSQLDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.SQLId = builder.SQLId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLDetailsRequest create() {
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
     * @return SQLId
     */
    public String getSQLId() {
        return this.SQLId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeSQLDetailsRequest, Builder> {
        private String regionId; 
        private String SQLId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSQLDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.SQLId = request.SQLId;
            this.tenantId = request.tenantId;
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
         * The SQL text.
         */
        public Builder SQLId(String SQLId) {
            this.putBodyParameter("SQLId", SQLId);
            this.SQLId = SQLId;
            return this;
        }

        /**
         * SQLID.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeSQLDetailsRequest build() {
            return new DescribeSQLDetailsRequest(this);
        } 

    } 

}

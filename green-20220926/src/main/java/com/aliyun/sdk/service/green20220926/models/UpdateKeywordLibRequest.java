// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>UpdateKeywordLibRequest</p>
 */
public class UpdateKeywordLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibName")
    private String libName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    private UpdateKeywordLibRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.libName = builder.libName;
        this.regionId = builder.regionId;
        this.tenantCode = builder.tenantCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKeywordLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return libName
     */
    public String getLibName() {
        return this.libName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    public static final class Builder extends Request.Builder<UpdateKeywordLibRequest, Builder> {
        private String libId; 
        private String libName; 
        private String regionId; 
        private String tenantCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKeywordLibRequest request) {
            super(request);
            this.libId = request.libId;
            this.libName = request.libName;
            this.regionId = request.regionId;
            this.tenantCode = request.tenantCode;
        } 

        /**
         * <p>Library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * <p>Keyword library name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试库</p>
         */
        public Builder libName(String libName) {
            this.putBodyParameter("LibName", libName);
            this.libName = libName;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TenantCode.
         */
        public Builder tenantCode(String tenantCode) {
            this.putQueryParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        @Override
        public UpdateKeywordLibRequest build() {
            return new UpdateKeywordLibRequest(this);
        } 

    } 

}

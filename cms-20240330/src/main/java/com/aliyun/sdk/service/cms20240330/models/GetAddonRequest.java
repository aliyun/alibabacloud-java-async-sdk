// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAddonRequest} extends {@link RequestModel}
 *
 * <p>GetAddonRequest</p>
 */
public class GetAddonRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("addonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private GetAddonRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addonName = builder.addonName;
        this.aliyunLang = builder.aliyunLang;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonRequest create() {
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
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetAddonRequest, Builder> {
        private String regionId; 
        private String addonName; 
        private String aliyunLang; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetAddonRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addonName = request.addonName;
            this.aliyunLang = request.aliyunLang;
            this.version = request.version;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>security-actiontrail</p>
         */
        public Builder addonName(String addonName) {
            this.putPathParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * aliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetAddonRequest build() {
            return new GetAddonRequest(this);
        } 

    } 

}

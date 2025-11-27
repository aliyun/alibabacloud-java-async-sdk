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
 * {@link GetAddonSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetAddonSchemaRequest</p>
 */
public class GetAddonSchemaRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("environmentType")
    private String environmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private GetAddonSchemaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addonName = builder.addonName;
        this.aliyunLang = builder.aliyunLang;
        this.environmentType = builder.environmentType;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonSchemaRequest create() {
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
     * @return environmentType
     */
    public String getEnvironmentType() {
        return this.environmentType;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetAddonSchemaRequest, Builder> {
        private String regionId; 
        private String addonName; 
        private String aliyunLang; 
        private String environmentType; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetAddonSchemaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addonName = request.addonName;
            this.aliyunLang = request.aliyunLang;
            this.environmentType = request.environmentType;
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
         * <p>cloud-rds-audit-log</p>
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
         * environmentType.
         */
        public Builder environmentType(String environmentType) {
            this.putQueryParameter("environmentType", environmentType);
            this.environmentType = environmentType;
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
        public GetAddonSchemaRequest build() {
            return new GetAddonSchemaRequest(this);
        } 

    } 

}

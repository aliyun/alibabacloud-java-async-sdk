// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataIngestionRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataIngestionRequest</p>
 */
public class UpdateDataIngestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionId")
    private String dataIngestionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionMode")
    private String dataIngestionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataIngestionRequest(Builder builder) {
        super(builder);
        this.dataIngestionId = builder.dataIngestionId;
        this.dataIngestionMode = builder.dataIngestionMode;
        this.dataSourceId = builder.dataSourceId;
        this.lang = builder.lang;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataIngestionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionId
     */
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    /**
     * @return dataIngestionMode
     */
    public String getDataIngestionMode() {
        return this.dataIngestionMode;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateDataIngestionRequest, Builder> {
        private String dataIngestionId; 
        private String dataIngestionMode; 
        private String dataSourceId; 
        private String lang; 
        private String normalizationRuleId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataIngestionRequest request) {
            super(request);
            this.dataIngestionId = request.dataIngestionId;
            this.dataIngestionMode = request.dataIngestionMode;
            this.dataSourceId = request.dataSourceId;
            this.lang = request.lang;
            this.normalizationRuleId = request.normalizationRuleId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataIngestionId.
         */
        public Builder dataIngestionId(String dataIngestionId) {
            this.putBodyParameter("DataIngestionId", dataIngestionId);
            this.dataIngestionId = dataIngestionId;
            return this;
        }

        /**
         * DataIngestionMode.
         */
        public Builder dataIngestionMode(String dataIngestionMode) {
            this.putBodyParameter("DataIngestionMode", dataIngestionMode);
            this.dataIngestionMode = dataIngestionMode;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateDataIngestionRequest build() {
            return new UpdateDataIngestionRequest(this);
        } 

    } 

}

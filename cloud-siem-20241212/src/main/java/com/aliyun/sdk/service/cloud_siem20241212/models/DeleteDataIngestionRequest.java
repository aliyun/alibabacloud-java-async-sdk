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
 * {@link DeleteDataIngestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataIngestionRequest</p>
 */
public class DeleteDataIngestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionId")
    private String dataIngestionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private DeleteDataIngestionRequest(Builder builder) {
        super(builder);
        this.dataIngestionId = builder.dataIngestionId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataIngestionRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<DeleteDataIngestionRequest, Builder> {
        private String dataIngestionId; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataIngestionRequest request) {
            super(request);
            this.dataIngestionId = request.dataIngestionId;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The data ingestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_netstat_ingestion_173326*******</p>
         */
        public Builder dataIngestionId(String dataIngestionId) {
            this.putBodyParameter("DataIngestionId", dataIngestionId);
            this.dataIngestionId = dataIngestionId;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region of the Management Hub for threat analysis. Select the region of the Management Hub based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of a member. This parameter allows an administrator to operate on behalf of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public DeleteDataIngestionRequest build() {
            return new DeleteDataIngestionRequest(this);
        } 

    } 

}

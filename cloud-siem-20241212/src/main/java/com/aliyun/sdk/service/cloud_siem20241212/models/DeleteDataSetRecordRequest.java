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
 * {@link DeleteDataSetRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSetRecordRequest</p>
 */
public class DeleteDataSetRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetRecordIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetRecordIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private DeleteDataSetRecordRequest(Builder builder) {
        super(builder);
        this.dataSetId = builder.dataSetId;
        this.dataSetRecordIds = builder.dataSetRecordIds;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSetRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetId
     */
    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * @return dataSetRecordIds
     */
    public String getDataSetRecordIds() {
        return this.dataSetRecordIds;
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

    public static final class Builder extends Request.Builder<DeleteDataSetRecordRequest, Builder> {
        private String dataSetId; 
        private String dataSetRecordIds; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSetRecordRequest request) {
            super(request);
            this.dataSetId = request.dataSetId;
            this.dataSetRecordIds = request.dataSetRecordIds;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-10iy8mbifnb4gniv****</p>
         */
        public Builder dataSetId(String dataSetId) {
            this.putBodyParameter("DataSetId", dataSetId);
            this.dataSetId = dataSetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,4]</p>
         */
        public Builder dataSetRecordIds(String dataSetRecordIds) {
            this.putBodyParameter("DataSetRecordIds", dataSetRecordIds);
            this.dataSetRecordIds = dataSetRecordIds;
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
        public DeleteDataSetRecordRequest build() {
            return new DeleteDataSetRecordRequest(this);
        } 

    } 

}

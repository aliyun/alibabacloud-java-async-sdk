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
 * {@link UpdateDataSetRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSetRecordRequest</p>
 */
public class UpdateDataSetRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetFileName")
    private String dataSetFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetRecords")
    private String dataSetRecords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataSetRecordRequest(Builder builder) {
        super(builder);
        this.dataSetFileName = builder.dataSetFileName;
        this.dataSetId = builder.dataSetId;
        this.dataSetRecords = builder.dataSetRecords;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSetRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetFileName
     */
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    /**
     * @return dataSetId
     */
    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * @return dataSetRecords
     */
    public String getDataSetRecords() {
        return this.dataSetRecords;
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

    public static final class Builder extends Request.Builder<UpdateDataSetRecordRequest, Builder> {
        private String dataSetFileName; 
        private String dataSetId; 
        private String dataSetRecords; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSetRecordRequest request) {
            super(request);
            this.dataSetFileName = request.dataSetFileName;
            this.dataSetId = request.dataSetId;
            this.dataSetRecords = request.dataSetRecords;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataSetFileName.
         */
        public Builder dataSetFileName(String dataSetFileName) {
            this.putBodyParameter("DataSetFileName", dataSetFileName);
            this.dataSetFileName = dataSetFileName;
            return this;
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
         * DataSetRecords.
         */
        public Builder dataSetRecords(String dataSetRecords) {
            this.putBodyParameter("DataSetRecords", dataSetRecords);
            this.dataSetRecords = dataSetRecords;
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
        public UpdateDataSetRecordRequest build() {
            return new UpdateDataSetRecordRequest(this);
        } 

    } 

}

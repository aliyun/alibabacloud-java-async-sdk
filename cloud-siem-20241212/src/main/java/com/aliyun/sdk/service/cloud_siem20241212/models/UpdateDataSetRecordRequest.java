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
         * <p>The name of the uploaded dataset file.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsiem-dataset/1358117679873357_174338773****.csv</p>
         */
        public Builder dataSetFileName(String dataSetFileName) {
            this.putBodyParameter("DataSetFileName", dataSetFileName);
            this.dataSetFileName = dataSetFileName;
            return this;
        }

        /**
         * <p>The ID of the dataset.</p>
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
         * <p>The content of the dataset records, in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userid\&quot;:\&quot;1234\&quot;,\&quot;name\&quot;:\&quot;a12401\&quot;},
         *  {\&quot;ip\&quot;:\&quot;2.2.2.2\&quot;,\&quot;userid\&quot;:\&quot;33333\&quot;,\&quot;name\&quot;:\&quot;a12401\&quot;}]</p>
         */
        public Builder dataSetRecords(String dataSetRecords) {
            this.putBodyParameter("DataSetRecords", dataSetRecords);
            this.dataSetRecords = dataSetRecords;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
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
         * <p>The region where the Data Management center for threat analysis is located. Select a region for the management center based on the region of your asset. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: The asset is in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: The asset is in a region outside China.</p>
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
         * <p>The user ID of the member. An administrator can use this parameter to switch to the perspective of a specific member.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
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

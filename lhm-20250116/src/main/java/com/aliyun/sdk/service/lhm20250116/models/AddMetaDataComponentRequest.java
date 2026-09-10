// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link AddMetaDataComponentRequest} extends {@link RequestModel}
 *
 * <p>AddMetaDataComponentRequest</p>
 */
public class AddMetaDataComponentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categoryType")
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentType")
    private Integer componentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsConfig")
    private String dsConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsDesc")
    private String dsDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsId")
    private String dsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsName")
    private String dsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsStatus")
    private Integer dsStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsType")
    private String dsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsVersion")
    private String dsVersion;

    private AddMetaDataComponentRequest(Builder builder) {
        super(builder);
        this.categoryType = builder.categoryType;
        this.componentType = builder.componentType;
        this.dsConfig = builder.dsConfig;
        this.dsDesc = builder.dsDesc;
        this.dsId = builder.dsId;
        this.dsName = builder.dsName;
        this.dsStatus = builder.dsStatus;
        this.dsType = builder.dsType;
        this.dsVersion = builder.dsVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMetaDataComponentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return componentType
     */
    public Integer getComponentType() {
        return this.componentType;
    }

    /**
     * @return dsConfig
     */
    public String getDsConfig() {
        return this.dsConfig;
    }

    /**
     * @return dsDesc
     */
    public String getDsDesc() {
        return this.dsDesc;
    }

    /**
     * @return dsId
     */
    public String getDsId() {
        return this.dsId;
    }

    /**
     * @return dsName
     */
    public String getDsName() {
        return this.dsName;
    }

    /**
     * @return dsStatus
     */
    public Integer getDsStatus() {
        return this.dsStatus;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return dsVersion
     */
    public String getDsVersion() {
        return this.dsVersion;
    }

    public static final class Builder extends Request.Builder<AddMetaDataComponentRequest, Builder> {
        private String categoryType; 
        private Integer componentType; 
        private String dsConfig; 
        private String dsDesc; 
        private String dsId; 
        private String dsName; 
        private Integer dsStatus; 
        private String dsType; 
        private String dsVersion; 

        private Builder() {
            super();
        } 

        private Builder(AddMetaDataComponentRequest request) {
            super(request);
            this.categoryType = request.categoryType;
            this.componentType = request.componentType;
            this.dsConfig = request.dsConfig;
            this.dsDesc = request.dsDesc;
            this.dsId = request.dsId;
            this.dsName = request.dsName;
            this.dsStatus = request.dsStatus;
            this.dsType = request.dsType;
            this.dsVersion = request.dsVersion;
        } 

        /**
         * <p>The data source category. Valid values: DATASET, WORKFLOW, ENGINE.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("categoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The role of the data source in the migration pipeline. Valid values:</p>
         * <ul>
         * <li>0: source.</li>
         * <li>1: destination.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder componentType(Integer componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>The datasource config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
         */
        public Builder dsConfig(String dsConfig) {
            this.putBodyParameter("dsConfig", dsConfig);
            this.dsConfig = dsConfig;
            return this;
        }

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Data source description</p>
         */
        public Builder dsDesc(String dsDesc) {
            this.putBodyParameter("dsDesc", dsDesc);
            this.dsDesc = dsDesc;
            return this;
        }

        /**
         * <p>The external ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>290</p>
         */
        public Builder dsId(String dsId) {
            this.putBodyParameter("dsId", dsId);
            this.dsId = dsId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        public Builder dsName(String dsName) {
            this.putBodyParameter("dsName", dsName);
            this.dsName = dsName;
            return this;
        }

        /**
         * <p>The connectivity status of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dsStatus(Integer dsStatus) {
            this.putBodyParameter("dsStatus", dsStatus);
            this.dsStatus = dsStatus;
            return this;
        }

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder dsType(String dsType) {
            this.putBodyParameter("dsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * <p>The version of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.0</p>
         */
        public Builder dsVersion(String dsVersion) {
            this.putBodyParameter("dsVersion", dsVersion);
            this.dsVersion = dsVersion;
            return this;
        }

        @Override
        public AddMetaDataComponentRequest build() {
            return new AddMetaDataComponentRequest(this);
        } 

    } 

}

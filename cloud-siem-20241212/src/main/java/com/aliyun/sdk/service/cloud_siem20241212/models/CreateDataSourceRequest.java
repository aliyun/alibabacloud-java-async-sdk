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
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceFrom")
    private String dataSourceFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceIds")
    private java.util.List<String> dataSourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
    private Boolean dataSourceRecognizeEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceRecognizer")
    private String dataSourceRecognizer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceReferences")
    private java.util.List<String> dataSourceReferences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceStores")
    private java.util.List<DataSourceStores> dataSourceStores;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplateId")
    private String dataSourceTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProjectName")
    private String logProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserId")
    private Long logUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceFrom = builder.dataSourceFrom;
        this.dataSourceIds = builder.dataSourceIds;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
        this.dataSourceRecognizer = builder.dataSourceRecognizer;
        this.dataSourceReferences = builder.dataSourceReferences;
        this.dataSourceStores = builder.dataSourceStores;
        this.dataSourceTemplateId = builder.dataSourceTemplateId;
        this.dataSourceType = builder.dataSourceType;
        this.lang = builder.lang;
        this.logProjectName = builder.logProjectName;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.logUserId = builder.logUserId;
        this.order = builder.order;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceFrom
     */
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    /**
     * @return dataSourceIds
     */
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceRecognizeEnabled
     */
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    /**
     * @return dataSourceRecognizer
     */
    public String getDataSourceRecognizer() {
        return this.dataSourceRecognizer;
    }

    /**
     * @return dataSourceReferences
     */
    public java.util.List<String> getDataSourceReferences() {
        return this.dataSourceReferences;
    }

    /**
     * @return dataSourceStores
     */
    public java.util.List<DataSourceStores> getDataSourceStores() {
        return this.dataSourceStores;
    }

    /**
     * @return dataSourceTemplateId
     */
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logProjectName
     */
    public String getLogProjectName() {
        return this.logProjectName;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logUserId
     */
    public Long getLogUserId() {
        return this.logUserId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String dataSourceFrom; 
        private java.util.List<String> dataSourceIds; 
        private String dataSourceName; 
        private Boolean dataSourceRecognizeEnabled; 
        private String dataSourceRecognizer; 
        private java.util.List<String> dataSourceReferences; 
        private java.util.List<DataSourceStores> dataSourceStores; 
        private String dataSourceTemplateId; 
        private String dataSourceType; 
        private String lang; 
        private String logProjectName; 
        private String logRegionId; 
        private String logStoreName; 
        private Long logUserId; 
        private String order; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.dataSourceFrom = request.dataSourceFrom;
            this.dataSourceIds = request.dataSourceIds;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceRecognizeEnabled = request.dataSourceRecognizeEnabled;
            this.dataSourceRecognizer = request.dataSourceRecognizer;
            this.dataSourceReferences = request.dataSourceReferences;
            this.dataSourceStores = request.dataSourceStores;
            this.dataSourceTemplateId = request.dataSourceTemplateId;
            this.dataSourceType = request.dataSourceType;
            this.lang = request.lang;
            this.logProjectName = request.logProjectName;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.logUserId = request.logUserId;
            this.order = request.order;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The source of the data. Valid values:</p>
         * <ul>
         * <li><p>center</p>
         * </li>
         * <li><p>custom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        public Builder dataSourceFrom(String dataSourceFrom) {
            this.putBodyParameter("DataSourceFrom", dataSourceFrom);
            this.dataSourceFrom = dataSourceFrom;
            return this;
        }

        /**
         * <p>A list of data source IDs.</p>
         */
        public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "json");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>AD_LOG</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>Specifies whether to automatically discover new data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.putBodyParameter("DataSourceRecognizeEnabled", dataSourceRecognizeEnabled);
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }

        /**
         * <p>The data source recognizer.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_waf_flow_log_1766185894104675</p>
         */
        public Builder dataSourceRecognizer(String dataSourceRecognizer) {
            this.putBodyParameter("DataSourceRecognizer", dataSourceRecognizer);
            this.dataSourceRecognizer = dataSourceRecognizer;
            return this;
        }

        /**
         * <p>The IDs of associated data access instances.</p>
         */
        public Builder dataSourceReferences(java.util.List<String> dataSourceReferences) {
            String dataSourceReferencesShrink = shrink(dataSourceReferences, "DataSourceReferences", "json");
            this.putBodyParameter("DataSourceReferences", dataSourceReferencesShrink);
            this.dataSourceReferences = dataSourceReferences;
            return this;
        }

        /**
         * <p>The list of Simple Log Service projects.</p>
         */
        public Builder dataSourceStores(java.util.List<DataSourceStores> dataSourceStores) {
            this.putBodyParameter("DataSourceStores", dataSourceStores);
            this.dataSourceStores = dataSourceStores;
            return this;
        }

        /**
         * <p>The ID of the data source template.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_alibaba_cloud_nas_audit_log_1358117679873357</p>
         */
        public Builder dataSourceTemplateId(String dataSourceTemplateId) {
            this.putBodyParameter("DataSourceTemplateId", dataSourceTemplateId);
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><p>preset</p>
         * </li>
         * <li><p>custom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
         */
        public Builder logProjectName(String logProjectName) {
            this.putBodyParameter("LogProjectName", logProjectName);
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * <p>The ID of the log storage region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.putBodyParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>mde_raw</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The user ID for data ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder logUserId(Long logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>desc: descending.</p>
         * </li>
         * <li><p>asc: ascending.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The region of the Management Hub. Select a region based on the location of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: Assets are outside China.</p>
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
         * <p>The user ID of the member whose perspective the administrator assumes.</p>
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
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class DataSourceStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceStoreFrom")
        private String dataSourceStoreFrom;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreId")
        private String dataSourceStoreId;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreStatus")
        private String dataSourceStoreStatus;

        @com.aliyun.core.annotation.NameInMap("LogProjectName")
        private String logProjectName;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        private DataSourceStores(Builder builder) {
            this.dataSourceStoreFrom = builder.dataSourceStoreFrom;
            this.dataSourceStoreId = builder.dataSourceStoreId;
            this.dataSourceStoreStatus = builder.dataSourceStoreStatus;
            this.logProjectName = builder.logProjectName;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceStores create() {
            return builder().build();
        }

        /**
         * @return dataSourceStoreFrom
         */
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        /**
         * @return dataSourceStoreId
         */
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        /**
         * @return dataSourceStoreStatus
         */
        public String getDataSourceStoreStatus() {
            return this.dataSourceStoreStatus;
        }

        /**
         * @return logProjectName
         */
        public String getLogProjectName() {
            return this.logProjectName;
        }

        /**
         * @return logRegionId
         */
        public String getLogRegionId() {
            return this.logRegionId;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public static final class Builder {
            private String dataSourceStoreFrom; 
            private String dataSourceStoreId; 
            private String dataSourceStoreStatus; 
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 

            private Builder() {
            } 

            private Builder(DataSourceStores model) {
                this.dataSourceStoreFrom = model.dataSourceStoreFrom;
                this.dataSourceStoreId = model.dataSourceStoreId;
                this.dataSourceStoreStatus = model.dataSourceStoreStatus;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
            } 

            /**
             * <p>The source of the data. Valid values:</p>
             * <ul>
             * <li><p>center</p>
             * </li>
             * <li><p>custom</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder dataSourceStoreFrom(String dataSourceStoreFrom) {
                this.dataSourceStoreFrom = dataSourceStoreFrom;
                return this;
            }

            /**
             * <p>The ID of the log storage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataSourceStoreId(String dataSourceStoreId) {
                this.dataSourceStoreId = dataSourceStoreId;
                return this;
            }

            /**
             * <p>The status of the log storage. Valid values:</p>
             * <ul>
             * <li><p>normal</p>
             * </li>
             * <li><p>abnormal</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder dataSourceStoreStatus(String dataSourceStoreStatus) {
                this.dataSourceStoreStatus = dataSourceStoreStatus;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
             */
            public Builder logProjectName(String logProjectName) {
                this.logProjectName = logProjectName;
                return this;
            }

            /**
             * <p>The ID of the log storage region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>actiontrail_management-events</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            public DataSourceStores build() {
                return new DataSourceStores(this);
            } 

        } 

    }
}

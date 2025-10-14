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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

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
        this.updateTime = builder.updateTime;
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

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
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
        private Long updateTime; 

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
            this.updateTime = request.updateTime;
        } 

        /**
         * DataSourceFrom.
         */
        public Builder dataSourceFrom(String dataSourceFrom) {
            this.putBodyParameter("DataSourceFrom", dataSourceFrom);
            this.dataSourceFrom = dataSourceFrom;
            return this;
        }

        /**
         * DataSourceIds.
         */
        public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "json");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * DataSourceRecognizeEnabled.
         */
        public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.putBodyParameter("DataSourceRecognizeEnabled", dataSourceRecognizeEnabled);
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }

        /**
         * DataSourceRecognizer.
         */
        public Builder dataSourceRecognizer(String dataSourceRecognizer) {
            this.putBodyParameter("DataSourceRecognizer", dataSourceRecognizer);
            this.dataSourceRecognizer = dataSourceRecognizer;
            return this;
        }

        /**
         * DataSourceReferences.
         */
        public Builder dataSourceReferences(java.util.List<String> dataSourceReferences) {
            String dataSourceReferencesShrink = shrink(dataSourceReferences, "DataSourceReferences", "json");
            this.putBodyParameter("DataSourceReferences", dataSourceReferencesShrink);
            this.dataSourceReferences = dataSourceReferences;
            return this;
        }

        /**
         * DataSourceStores.
         */
        public Builder dataSourceStores(java.util.List<DataSourceStores> dataSourceStores) {
            this.putBodyParameter("DataSourceStores", dataSourceStores);
            this.dataSourceStores = dataSourceStores;
            return this;
        }

        /**
         * DataSourceTemplateId.
         */
        public Builder dataSourceTemplateId(String dataSourceTemplateId) {
            this.putBodyParameter("DataSourceTemplateId", dataSourceTemplateId);
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
         * LogProjectName.
         */
        public Builder logProjectName(String logProjectName) {
            this.putBodyParameter("LogProjectName", logProjectName);
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * LogRegionId.
         */
        public Builder logRegionId(String logRegionId) {
            this.putBodyParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * LogUserId.
         */
        public Builder logUserId(Long logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
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

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.putBodyParameter("UpdateTime", updateTime);
            this.updateTime = updateTime;
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
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSourceStores(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceStoreFrom = builder.dataSourceStoreFrom;
            this.dataSourceStoreId = builder.dataSourceStoreId;
            this.dataSourceStoreStatus = builder.dataSourceStoreStatus;
            this.logProjectName = builder.logProjectName;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceStores create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String dataSourceStoreFrom; 
            private String dataSourceStoreId; 
            private String dataSourceStoreStatus; 
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSourceStores model) {
                this.createTime = model.createTime;
                this.dataSourceStoreFrom = model.dataSourceStoreFrom;
                this.dataSourceStoreId = model.dataSourceStoreId;
                this.dataSourceStoreStatus = model.dataSourceStoreStatus;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSourceStoreFrom.
             */
            public Builder dataSourceStoreFrom(String dataSourceStoreFrom) {
                this.dataSourceStoreFrom = dataSourceStoreFrom;
                return this;
            }

            /**
             * DataSourceStoreId.
             */
            public Builder dataSourceStoreId(String dataSourceStoreId) {
                this.dataSourceStoreId = dataSourceStoreId;
                return this;
            }

            /**
             * DataSourceStoreStatus.
             */
            public Builder dataSourceStoreStatus(String dataSourceStoreStatus) {
                this.dataSourceStoreStatus = dataSourceStoreStatus;
                return this;
            }

            /**
             * LogProjectName.
             */
            public Builder logProjectName(String logProjectName) {
                this.logProjectName = logProjectName;
                return this;
            }

            /**
             * LogRegionId.
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSourceStores build() {
                return new DataSourceStores(this);
            } 

        } 

    }
}

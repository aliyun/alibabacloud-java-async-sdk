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
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceFrom")
    private String dataSourceFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
    private Boolean dataSourceRecognizeEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceStores")
    private java.util.List<DataSourceStores> dataSourceStores;

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
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceFrom = builder.dataSourceFrom;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
        this.dataSourceStores = builder.dataSourceStores;
        this.lang = builder.lang;
        this.logProjectName = builder.logProjectName;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.logUserId = builder.logUserId;
        this.orderField = builder.orderField;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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
     * @return dataSourceStores
     */
    public java.util.List<DataSourceStores> getDataSourceStores() {
        return this.dataSourceStores;
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
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
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

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String dataSourceFrom; 
        private String dataSourceId; 
        private String dataSourceName; 
        private Boolean dataSourceRecognizeEnabled; 
        private java.util.List<DataSourceStores> dataSourceStores; 
        private String lang; 
        private String logProjectName; 
        private String logRegionId; 
        private String logStoreName; 
        private Long logUserId; 
        private String orderField; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
            super(request);
            this.dataSourceFrom = request.dataSourceFrom;
            this.dataSourceId = request.dataSourceId;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceRecognizeEnabled = request.dataSourceRecognizeEnabled;
            this.dataSourceStores = request.dataSourceStores;
            this.lang = request.lang;
            this.logProjectName = request.logProjectName;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.logUserId = request.logUserId;
            this.orderField = request.orderField;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
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
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
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
         * DataSourceStores.
         */
        public Builder dataSourceStores(java.util.List<DataSourceStores> dataSourceStores) {
            this.putBodyParameter("DataSourceStores", dataSourceStores);
            this.dataSourceStores = dataSourceStores;
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
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
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
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataSourceRequest</p>
     */
    public static class DataSourceStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceStoreFrom")
        private String dataSourceStoreFrom;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreId")
        private String dataSourceStoreId;

        @com.aliyun.core.annotation.NameInMap("LogProjectName")
        private String logProjectName;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        private DataSourceStores(Builder builder) {
            this.dataSourceStoreFrom = builder.dataSourceStoreFrom;
            this.dataSourceStoreId = builder.dataSourceStoreId;
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
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 

            private Builder() {
            } 

            private Builder(DataSourceStores model) {
                this.dataSourceStoreFrom = model.dataSourceStoreFrom;
                this.dataSourceStoreId = model.dataSourceStoreId;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
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

            public DataSourceStores build() {
                return new DataSourceStores(this);
            } 

        } 

    }
}

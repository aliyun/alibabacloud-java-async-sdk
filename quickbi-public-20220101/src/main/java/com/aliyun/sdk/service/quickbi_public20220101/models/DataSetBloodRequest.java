// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link DataSetBloodRequest} extends {@link RequestModel}
 *
 * <p>DataSetBloodRequest</p>
 */
public class DataSetBloodRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksType")
    private String worksType;

    private DataSetBloodRequest(Builder builder) {
        super(builder);
        this.dataSetIds = builder.dataSetIds;
        this.userId = builder.userId;
        this.worksType = builder.worksType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSetBloodRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetIds
     */
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return worksType
     */
    public String getWorksType() {
        return this.worksType;
    }

    public static final class Builder extends Request.Builder<DataSetBloodRequest, Builder> {
        private String dataSetIds; 
        private String userId; 
        private String worksType; 

        private Builder() {
            super();
        } 

        private Builder(DataSetBloodRequest request) {
            super(request);
            this.dataSetIds = request.dataSetIds;
            this.userId = request.userId;
            this.worksType = request.worksType;
        } 

        /**
         * <p>List of dataset IDs, separated by English commas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234235234,234235235,234235235</p>
         */
        public Builder dataSetIds(String dataSetIds) {
            this.putQueryParameter("DataSetIds", dataSetIds);
            this.dataSetIds = dataSetIds;
            return this;
        }

        /**
         * <p>Specify the owner of the report, which is the userId.</p>
         * 
         * <strong>example:</strong>
         * <p>dasasgaj342351</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Specify the type of report:</p>
         * <ul>
         * <li>REPORT: Workbooks</li>
         * <li>dashboardOfflineQuery: Downloads</li>
         * <li>DASHBOARD: Dashboard</li>
         * <li>ANALYSIS: Ad Hoc Analysis</li>
         * <li>SCREEN: Visualization Screen</li>
         * <li>PAGE: Old dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        @Override
        public DataSetBloodRequest build() {
            return new DataSetBloodRequest(this);
        } 

    } 

}

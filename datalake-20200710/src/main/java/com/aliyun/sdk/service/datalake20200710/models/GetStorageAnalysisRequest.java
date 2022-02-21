// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetStorageAnalysisRequest</p>
 */
public class GetStorageAnalysisRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("analysisTypeList")
    private java.util.List < String > analysisTypeList;

    @Body
    @NameInMap("date")
    private String date;

    @Body
    @NameInMap("dbName")
    private String dbName;

    @Body
    @NameInMap("tableName")
    private String tableName;

    private GetStorageAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.analysisTypeList = builder.analysisTypeList;
        this.date = builder.date;
        this.dbName = builder.dbName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return analysisTypeList
     */
    public java.util.List < String > getAnalysisTypeList() {
        return this.analysisTypeList;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetStorageAnalysisRequest, Builder> {
        private String regionId; 
        private java.util.List < String > analysisTypeList; 
        private String date; 
        private String dbName; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageAnalysisRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.analysisTypeList = response.analysisTypeList;
            this.date = response.date;
            this.dbName = response.dbName;
            this.tableName = response.tableName;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * analysisTypeList.
         */
        public Builder analysisTypeList(java.util.List < String > analysisTypeList) {
            this.putBodyParameter("analysisTypeList", analysisTypeList);
            this.analysisTypeList = analysisTypeList;
            return this;
        }

        /**
         * date.
         */
        public Builder date(String date) {
            this.putBodyParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetStorageAnalysisRequest build() {
            return new GetStorageAnalysisRequest(this);
        } 

    } 

}

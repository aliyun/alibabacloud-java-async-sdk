// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadRecordsRequest</p>
 */
public class DescribeDownloadRecordsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDownloadRecordsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public static final class Builder extends Request.Builder<DescribeDownloadRecordsRequest, Builder> {
        private String DBClusterId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadRecordsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The language of the returned data. Valid values:
         * <p>
         * 
         * *   **zh**: simplified Chinese.
         * *   **en**: English.
         * *   **ja**: Japanese.
         * *   **zh-tw**: traditional Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDownloadRecordsRequest build() {
            return new DescribeDownloadRecordsRequest(this);
        } 

    } 

}

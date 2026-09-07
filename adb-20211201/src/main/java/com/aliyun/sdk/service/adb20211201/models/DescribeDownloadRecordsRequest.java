// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDownloadRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadRecordsRequest</p>
 */
public class DescribeDownloadRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @Deprecated
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of all AnalyticDB for MySQL Lakehouse Edition (3.0) clusters in a specific region, including the cluster ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-8vb6ha79k6e****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Simplified Chinese (default).</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese.</p>
         * </li>
         * <li><p><strong>zh-tw</strong>: Traditional Chinese.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

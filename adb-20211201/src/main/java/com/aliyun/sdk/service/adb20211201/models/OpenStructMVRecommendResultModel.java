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
 * {@link OpenStructMVRecommendResultModel} extends {@link TeaModel}
 *
 * <p>OpenStructMVRecommendResultModel</p>
 */
public class OpenStructMVRecommendResultModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratedQueriesCount")
    private Long acceleratedQueriesCount;

    @com.aliyun.core.annotation.NameInMap("BaseTables")
    private java.util.List<OpenStructMvBaseTableDetailModel> baseTables;

    @com.aliyun.core.annotation.NameInMap("SavedScanbytes")
    private Long savedScanbytes;

    @com.aliyun.core.annotation.NameInMap("Subquery")
    private String subquery;

    @com.aliyun.core.annotation.NameInMap("SubqueryId")
    private Long subqueryId;

    @com.aliyun.core.annotation.NameInMap("SupportIncrementalRefresh")
    private Boolean supportIncrementalRefresh;

    private OpenStructMVRecommendResultModel(Builder builder) {
        this.acceleratedQueriesCount = builder.acceleratedQueriesCount;
        this.baseTables = builder.baseTables;
        this.savedScanbytes = builder.savedScanbytes;
        this.subquery = builder.subquery;
        this.subqueryId = builder.subqueryId;
        this.supportIncrementalRefresh = builder.supportIncrementalRefresh;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructMVRecommendResultModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratedQueriesCount
     */
    public Long getAcceleratedQueriesCount() {
        return this.acceleratedQueriesCount;
    }

    /**
     * @return baseTables
     */
    public java.util.List<OpenStructMvBaseTableDetailModel> getBaseTables() {
        return this.baseTables;
    }

    /**
     * @return savedScanbytes
     */
    public Long getSavedScanbytes() {
        return this.savedScanbytes;
    }

    /**
     * @return subquery
     */
    public String getSubquery() {
        return this.subquery;
    }

    /**
     * @return subqueryId
     */
    public Long getSubqueryId() {
        return this.subqueryId;
    }

    /**
     * @return supportIncrementalRefresh
     */
    public Boolean getSupportIncrementalRefresh() {
        return this.supportIncrementalRefresh;
    }

    public static final class Builder {
        private Long acceleratedQueriesCount; 
        private java.util.List<OpenStructMvBaseTableDetailModel> baseTables; 
        private Long savedScanbytes; 
        private String subquery; 
        private Long subqueryId; 
        private Boolean supportIncrementalRefresh; 

        private Builder() {
        } 

        private Builder(OpenStructMVRecommendResultModel model) {
            this.acceleratedQueriesCount = model.acceleratedQueriesCount;
            this.baseTables = model.baseTables;
            this.savedScanbytes = model.savedScanbytes;
            this.subquery = model.subquery;
            this.subqueryId = model.subqueryId;
            this.supportIncrementalRefresh = model.supportIncrementalRefresh;
        } 

        /**
         * <p>The number of accelerated queries.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder acceleratedQueriesCount(Long acceleratedQueriesCount) {
            this.acceleratedQueriesCount = acceleratedQueriesCount;
            return this;
        }

        /**
         * <p>The base table associated with the subquery.</p>
         */
        public Builder baseTables(java.util.List<OpenStructMvBaseTableDetailModel> baseTables) {
            this.baseTables = baseTables;
            return this;
        }

        /**
         * <p>Estimated bytes scanned reduction by current materialized view from correlated parent queries (posterior calculation).</p>
         * 
         * <strong>example:</strong>
         * <p>321321223</p>
         */
        public Builder savedScanbytes(Long savedScanbytes) {
            this.savedScanbytes = savedScanbytes;
            return this;
        }

        /**
         * <p>The extracted public subquery.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM demo.tbl</p>
         */
        public Builder subquery(String subquery) {
            this.subquery = subquery;
            return this;
        }

        /**
         * <p>The ID of the subquery.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subqueryId(Long subqueryId) {
            this.subqueryId = subqueryId;
            return this;
        }

        /**
         * <p>Whether the current subquery supports incremental refresh.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportIncrementalRefresh(Boolean supportIncrementalRefresh) {
            this.supportIncrementalRefresh = supportIncrementalRefresh;
            return this;
        }

        public OpenStructMVRecommendResultModel build() {
            return new OpenStructMVRecommendResultModel(this);
        } 

    } 

}

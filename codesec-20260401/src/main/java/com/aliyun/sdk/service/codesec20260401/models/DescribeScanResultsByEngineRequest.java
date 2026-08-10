// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link DescribeScanResultsByEngineRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanResultsByEngineRequest</p>
 */
public class DescribeScanResultsByEngineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("baselineState")
    private String baselineState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("packageName")
    private String packageName;

    private DescribeScanResultsByEngineRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.scanId = builder.scanId;
        this.engine = builder.engine;
        this.regionId = builder.regionId;
        this.baselineState = builder.baselineState;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.packageName = builder.packageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanResultsByEngineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return scanId
     */
    public Long getScanId() {
        return this.scanId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return baselineState
     */
    public String getBaselineState() {
        return this.baselineState;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    public static final class Builder extends Request.Builder<DescribeScanResultsByEngineRequest, Builder> {
        private Long projectId; 
        private Long scanId; 
        private String engine; 
        private String regionId; 
        private String baselineState; 
        private String lang; 
        private Long maxResults; 
        private String nextToken; 
        private String packageName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScanResultsByEngineRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.scanId = request.scanId;
            this.engine = request.engine;
            this.regionId = request.regionId;
            this.baselineState = request.baselineState;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.packageName = request.packageName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanId(Long scanId) {
            this.putPathParameter("scanId", scanId);
            this.scanId = scanId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder engine(String engine) {
            this.putPathParameter("engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>按 baseline_state 过滤 findings。值为 new/unchanged/absent/updated 之一。</p>
         * 
         * <strong>example:</strong>
         * <p>unchanged</p>
         */
        public Builder baselineState(String baselineState) {
            this.putQueryParameter("baselineState", baselineState);
            this.baselineState = baselineState;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * packageName.
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("packageName", packageName);
            this.packageName = packageName;
            return this;
        }

        @Override
        public DescribeScanResultsByEngineRequest build() {
            return new DescribeScanResultsByEngineRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAppPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListAppPluginsRequest</p>
 */
public class ListAppPluginsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    private ListAppPluginsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.phase = builder.phase;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPluginsRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<ListAppPluginsRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Integer maxResults; 
        private String nextToken; 
        private String phase; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(ListAppPluginsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.phase = request.phase;
            this.platform = request.platform;
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
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250820143531000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The maximum number of results to return per query.</p>
         * <p>Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to start the next query. This parameter is empty if no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status of the dataset acceleration instance. Valid values:</p>
         * <ul>
         * <li>Created: Initialized.</li>
         * <li>Running: Running.</li>
         * <li>Stopped: Stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_whitelist</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The platform.</p>
         * 
         * <strong>example:</strong>
         * <p>linux/amd64</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public ListAppPluginsRequest build() {
            return new ListAppPluginsRequest(this);
        } 

    } 

}

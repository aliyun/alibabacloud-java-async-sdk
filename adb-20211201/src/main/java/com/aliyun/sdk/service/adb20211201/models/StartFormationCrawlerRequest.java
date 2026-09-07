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
 * {@link StartFormationCrawlerRequest} extends {@link RequestModel}
 *
 * <p>StartFormationCrawlerRequest</p>
 */
public class StartFormationCrawlerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerTaskId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Long crawlerTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerTaskName")
    private String crawlerTaskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StartFormationCrawlerRequest(Builder builder) {
        super(builder);
        this.crawlerTaskId = builder.crawlerTaskId;
        this.crawlerTaskName = builder.crawlerTaskName;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartFormationCrawlerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawlerTaskId
     */
    public Long getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    /**
     * @return crawlerTaskName
     */
    public String getCrawlerTaskName() {
        return this.crawlerTaskName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartFormationCrawlerRequest, Builder> {
        private Long crawlerTaskId; 
        private String crawlerTaskName; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartFormationCrawlerRequest request) {
            super(request);
            this.crawlerTaskId = request.crawlerTaskId;
            this.crawlerTaskName = request.crawlerTaskName;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>247</p>
         */
        public Builder crawlerTaskId(Long crawlerTaskId) {
            this.putBodyParameter("CrawlerTaskId", crawlerTaskId);
            this.crawlerTaskId = crawlerTaskId;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-crawler-dbname</p>
         */
        public Builder crawlerTaskName(String crawlerTaskName) {
            this.putBodyParameter("CrawlerTaskName", crawlerTaskName);
            this.crawlerTaskName = crawlerTaskName;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1pke2pcfavw****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartFormationCrawlerRequest build() {
            return new StartFormationCrawlerRequest(this);
        } 

    } 

}

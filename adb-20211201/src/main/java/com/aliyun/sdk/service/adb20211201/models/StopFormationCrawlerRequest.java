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
 * {@link StopFormationCrawlerRequest} extends {@link RequestModel}
 *
 * <p>StopFormationCrawlerRequest</p>
 */
public class StopFormationCrawlerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long crawlerTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerTaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crawlerTaskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StopFormationCrawlerRequest(Builder builder) {
        super(builder);
        this.crawlerTaskId = builder.crawlerTaskId;
        this.crawlerTaskName = builder.crawlerTaskName;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopFormationCrawlerRequest create() {
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

    public static final class Builder extends Request.Builder<StopFormationCrawlerRequest, Builder> {
        private Long crawlerTaskId; 
        private String crawlerTaskName; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopFormationCrawlerRequest request) {
            super(request);
            this.crawlerTaskId = request.crawlerTaskId;
            this.crawlerTaskName = request.crawlerTaskName;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder crawlerTaskId(Long crawlerTaskId) {
            this.putBodyParameter("CrawlerTaskId", crawlerTaskId);
            this.crawlerTaskId = crawlerTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1xxxxxxxx47</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
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
        public StopFormationCrawlerRequest build() {
            return new StopFormationCrawlerRequest(this);
        } 

    } 

}

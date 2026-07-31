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
 * {@link UpdateFormationCrawlerRequest} extends {@link RequestModel}
 *
 * <p>UpdateFormationCrawlerRequest</p>
 */
public class UpdateFormationCrawlerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crawlerInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrawlerTaskId")
    private String crawlerTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateFormationCrawlerRequest(Builder builder) {
        super(builder);
        this.crawlerInfo = builder.crawlerInfo;
        this.crawlerTaskId = builder.crawlerTaskId;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFormationCrawlerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawlerInfo
     */
    public String getCrawlerInfo() {
        return this.crawlerInfo;
    }

    /**
     * @return crawlerTaskId
     */
    public String getCrawlerTaskId() {
        return this.crawlerTaskId;
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

    public static final class Builder extends Request.Builder<UpdateFormationCrawlerRequest, Builder> {
        private String crawlerInfo; 
        private String crawlerTaskId; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFormationCrawlerRequest request) {
            super(request);
            this.crawlerInfo = request.crawlerInfo;
            this.crawlerTaskId = request.crawlerTaskId;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder crawlerInfo(String crawlerInfo) {
            this.putBodyParameter("CrawlerInfo", crawlerInfo);
            this.crawlerInfo = crawlerInfo;
            return this;
        }

        /**
         * CrawlerTaskId.
         */
        public Builder crawlerTaskId(String crawlerTaskId) {
            this.putBodyParameter("CrawlerTaskId", crawlerTaskId);
            this.crawlerTaskId = crawlerTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1r053byu48p****</p>
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
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateFormationCrawlerRequest build() {
            return new UpdateFormationCrawlerRequest(this);
        } 

    } 

}

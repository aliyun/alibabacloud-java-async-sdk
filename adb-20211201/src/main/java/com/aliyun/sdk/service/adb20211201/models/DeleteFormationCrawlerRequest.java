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
 * {@link DeleteFormationCrawlerRequest} extends {@link RequestModel}
 *
 * <p>DeleteFormationCrawlerRequest</p>
 */
public class DeleteFormationCrawlerRequest extends Request {
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

    private DeleteFormationCrawlerRequest(Builder builder) {
        super(builder);
        this.crawlerTaskId = builder.crawlerTaskId;
        this.crawlerTaskName = builder.crawlerTaskName;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFormationCrawlerRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFormationCrawlerRequest, Builder> {
        private Long crawlerTaskId; 
        private String crawlerTaskName; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFormationCrawlerRequest request) {
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
         * <p>247</p>
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
         * <p>wz_log</p>
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
         * <p>amv-8vbc***</p>
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
        public DeleteFormationCrawlerRequest build() {
            return new DeleteFormationCrawlerRequest(this);
        } 

    } 

}

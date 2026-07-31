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
 * {@link UpdateFormationCrawlerScheduleStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateFormationCrawlerScheduleStateRequest</p>
 */
public class UpdateFormationCrawlerScheduleStateRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleState")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleState;

    private UpdateFormationCrawlerScheduleStateRequest(Builder builder) {
        super(builder);
        this.crawlerTaskId = builder.crawlerTaskId;
        this.crawlerTaskName = builder.crawlerTaskName;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.scheduleState = builder.scheduleState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFormationCrawlerScheduleStateRequest create() {
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

    /**
     * @return scheduleState
     */
    public String getScheduleState() {
        return this.scheduleState;
    }

    public static final class Builder extends Request.Builder<UpdateFormationCrawlerScheduleStateRequest, Builder> {
        private Long crawlerTaskId; 
        private String crawlerTaskName; 
        private String DBClusterId; 
        private String regionId; 
        private String scheduleState; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFormationCrawlerScheduleStateRequest request) {
            super(request);
            this.crawlerTaskId = request.crawlerTaskId;
            this.crawlerTaskName = request.crawlerTaskName;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.scheduleState = request.scheduleState;
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
         * <p>am-bp1565u55p32****</p>
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DISABLED</p>
         */
        public Builder scheduleState(String scheduleState) {
            this.putBodyParameter("ScheduleState", scheduleState);
            this.scheduleState = scheduleState;
            return this;
        }

        @Override
        public UpdateFormationCrawlerScheduleStateRequest build() {
            return new UpdateFormationCrawlerScheduleStateRequest(this);
        } 

    } 

}

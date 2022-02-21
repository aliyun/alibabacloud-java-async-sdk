// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCrawlerWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StopCrawlerWorkflowRequest</p>
 */
public class StopCrawlerWorkflowRequest extends Request {
    @Body
    @NameInMap("CrawlerId")
    private String crawlerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private StopCrawlerWorkflowRequest(Builder builder) {
        super(builder);
        this.crawlerId = builder.crawlerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCrawlerWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawlerId
     */
    public String getCrawlerId() {
        return this.crawlerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopCrawlerWorkflowRequest, Builder> {
        private String crawlerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopCrawlerWorkflowRequest response) {
            super(response);
            this.crawlerId = response.crawlerId;
            this.regionId = response.regionId;
        } 

        /**
         * CrawlerId.
         */
        public Builder crawlerId(String crawlerId) {
            this.putBodyParameter("CrawlerId", crawlerId);
            this.crawlerId = crawlerId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StopCrawlerWorkflowRequest build() {
            return new StopCrawlerWorkflowRequest(this);
        } 

    } 

}

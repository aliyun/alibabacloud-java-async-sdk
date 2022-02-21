// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetastoreCrawlerRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetastoreCrawlerRequest</p>
 */
public class DeleteMetastoreCrawlerRequest extends Request {
    @Query
    @NameInMap("CrawlerId")
    @Validation(required = true)
    private String crawlerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteMetastoreCrawlerRequest(Builder builder) {
        super(builder);
        this.crawlerId = builder.crawlerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetastoreCrawlerRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMetastoreCrawlerRequest, Builder> {
        private String crawlerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetastoreCrawlerRequest response) {
            super(response);
            this.crawlerId = response.crawlerId;
            this.regionId = response.regionId;
        } 

        /**
         * CrawlerId.
         */
        public Builder crawlerId(String crawlerId) {
            this.putQueryParameter("CrawlerId", crawlerId);
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
        public DeleteMetastoreCrawlerRequest build() {
            return new DeleteMetastoreCrawlerRequest(this);
        } 

    } 

}

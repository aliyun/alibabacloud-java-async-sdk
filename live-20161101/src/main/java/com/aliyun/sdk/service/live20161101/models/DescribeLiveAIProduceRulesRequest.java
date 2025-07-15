// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveAIProduceRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveAIProduceRulesRequest</p>
 */
public class DescribeLiveAIProduceRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RulesId")
    private String rulesId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuffixName")
    private String suffixName;

    private DescribeLiveAIProduceRulesRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.rulesId = builder.rulesId;
        this.suffixName = builder.suffixName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAIProduceRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rulesId
     */
    public String getRulesId() {
        return this.rulesId;
    }

    /**
     * @return suffixName
     */
    public String getSuffixName() {
        return this.suffixName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveAIProduceRulesRequest, Builder> {
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String rulesId; 
        private String suffixName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveAIProduceRulesRequest request) {
            super(request);
            this.app = request.app;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.rulesId = request.rulesId;
            this.suffixName = request.suffixName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>AppName</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec****</p>
         */
        public Builder rulesId(String rulesId) {
            this.putQueryParameter("RulesId", rulesId);
            this.rulesId = rulesId;
            return this;
        }

        /**
         * <p>The suffix of the subtitle rule.</p>
         * <blockquote>
         * <p>Set the value to the name of the subtitle template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sub01</p>
         */
        public Builder suffixName(String suffixName) {
            this.putQueryParameter("SuffixName", suffixName);
            this.suffixName = suffixName;
            return this;
        }

        @Override
        public DescribeLiveAIProduceRulesRequest build() {
            return new DescribeLiveAIProduceRulesRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssObjectsRequest</p>
 */
public class DescribeOssObjectsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LastScanTimeEnd")
    private Long lastScanTimeEnd;

    @Query
    @NameInMap("LastScanTimeStart")
    private Long lastScanTimeStart;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskLevelId")
    private Integer riskLevelId;

    @Query
    @NameInMap("RuleId")
    private Long ruleId;

    @Query
    @NameInMap("ServiceRegionId")
    private String serviceRegionId;

    private DescribeOssObjectsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.lastScanTimeEnd = builder.lastScanTimeEnd;
        this.lastScanTimeStart = builder.lastScanTimeStart;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lastScanTimeEnd
     */
    public Long getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

    /**
     * @return lastScanTimeStart
     */
    public Long getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskLevelId
     */
    public Integer getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeOssObjectsRequest, Builder> {
        private Integer currentPage; 
        private String instanceId; 
        private String lang; 
        private Long lastScanTimeEnd; 
        private Long lastScanTimeStart; 
        private String name; 
        private Integer pageSize; 
        private Integer riskLevelId; 
        private Long ruleId; 
        private String serviceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssObjectsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.lastScanTimeEnd = request.lastScanTimeEnd;
            this.lastScanTimeStart = request.lastScanTimeStart;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.serviceRegionId = request.serviceRegionId;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LastScanTimeEnd.
         */
        public Builder lastScanTimeEnd(Long lastScanTimeEnd) {
            this.putQueryParameter("LastScanTimeEnd", lastScanTimeEnd);
            this.lastScanTimeEnd = lastScanTimeEnd;
            return this;
        }

        /**
         * LastScanTimeStart.
         */
        public Builder lastScanTimeStart(Long lastScanTimeStart) {
            this.putQueryParameter("LastScanTimeStart", lastScanTimeStart);
            this.lastScanTimeStart = lastScanTimeStart;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskLevelId.
         */
        public Builder riskLevelId(Integer riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        @Override
        public DescribeOssObjectsRequest build() {
            return new DescribeOssObjectsRequest(this);
        } 

    } 

}

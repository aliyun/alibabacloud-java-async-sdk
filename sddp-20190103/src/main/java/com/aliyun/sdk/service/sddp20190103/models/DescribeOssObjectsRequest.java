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
    @NameInMap("FileCategoryCode")
    private Long fileCategoryCode;

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

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    private DescribeOssObjectsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fileCategoryCode = builder.fileCategoryCode;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.lastScanTimeEnd = builder.lastScanTimeEnd;
        this.lastScanTimeStart = builder.lastScanTimeStart;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.serviceRegionId = builder.serviceRegionId;
        this.templateId = builder.templateId;
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
     * @return fileCategoryCode
     */
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
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

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeOssObjectsRequest, Builder> {
        private Integer currentPage; 
        private Long fileCategoryCode; 
        private String instanceId; 
        private String lang; 
        private Long lastScanTimeEnd; 
        private Long lastScanTimeStart; 
        private String name; 
        private Integer pageSize; 
        private Integer riskLevelId; 
        private Long ruleId; 
        private String serviceRegionId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssObjectsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.fileCategoryCode = request.fileCategoryCode;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.lastScanTimeEnd = request.lastScanTimeEnd;
            this.lastScanTimeStart = request.lastScanTimeStart;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * The page number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The code of the file type.
         */
        public Builder fileCategoryCode(Long fileCategoryCode) {
            this.putQueryParameter("FileCategoryCode", fileCategoryCode);
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }

        /**
         * The ID of the instance to which the OSS object belongs.
         * <p>
         * 
         * > You can call the **DescribeInstances** operation to query the instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The end time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder lastScanTimeEnd(Long lastScanTimeEnd) {
            this.putQueryParameter("LastScanTimeEnd", lastScanTimeEnd);
            this.lastScanTimeEnd = lastScanTimeEnd;
            return this;
        }

        /**
         * The start time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder lastScanTimeStart(Long lastScanTimeStart) {
            this.putQueryParameter("LastScanTimeStart", lastScanTimeStart);
            this.lastScanTimeStart = lastScanTimeStart;
            return this;
        }

        /**
         * The search keyword. Fuzzy match is supported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The sensitivity level of the OSS object. Valid values:
         * <p>
         * 
         * *   **1**: N/A, which indicates that no sensitive data is detected.
         * *   **2**: S1, which indicates the low sensitivity level.
         * *   **3**: S2, which indicates the medium sensitivity level.
         * *   **4**: S3, which indicates the high sensitivity level.
         * *   **5**: S4, which indicates the highest sensitivity level.
         */
        public Builder riskLevelId(Integer riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * The ID of the sensitive data detection rule that the OSS object hits.
         * <p>
         * 
         * > You can call the **DescribeRules** operation to query the ID of the sensitive data detection rule.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The region in which the data asset resides.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * The ID of the industry-specific rule template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeOssObjectsRequest build() {
            return new DescribeOssObjectsRequest(this);
        } 

    } 

}

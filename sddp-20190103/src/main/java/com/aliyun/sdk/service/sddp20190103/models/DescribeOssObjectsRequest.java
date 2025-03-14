// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeOssObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssObjectsRequest</p>
 */
public class DescribeOssObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCategoryCode")
    private Long fileCategoryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastScanTimeEnd")
    private Long lastScanTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastScanTimeStart")
    private Long lastScanTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private Long marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Integer riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private DescribeOssObjectsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fileCategoryCode = builder.fileCategoryCode;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.lastScanTimeEnd = builder.lastScanTimeEnd;
        this.lastScanTimeStart = builder.lastScanTimeStart;
        this.marker = builder.marker;
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
     * @return marker
     */
    public Long getMarker() {
        return this.marker;
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
        private Long marker; 
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
            this.marker = request.marker;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The code of the file type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileCategoryCode(Long fileCategoryCode) {
            this.putQueryParameter("FileCategoryCode", fileCategoryCode);
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }

        /**
         * <p>The ID of the instance to which the OSS object belongs.</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeInstances</strong> operation to query the instance ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ins-2222</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The end time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        public Builder lastScanTimeEnd(Long lastScanTimeEnd) {
            this.putQueryParameter("LastScanTimeEnd", lastScanTimeEnd);
            this.lastScanTimeEnd = lastScanTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        public Builder lastScanTimeStart(Long lastScanTimeStart) {
            this.putQueryParameter("LastScanTimeStart", lastScanTimeStart);
            this.lastScanTimeStart = lastScanTimeStart;
            return this;
        }

        /**
         * <p>When you query data by page, use the <code>Marker</code> parameter to query the data that follows the <code>Marker</code> value.</p>
         * 
         * <strong>example:</strong>
         * <p>1754786235714378752</p>
         */
        public Builder marker(Long marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The search keyword. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sensitivity level of the OSS object. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
         * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
         * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
         * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
         * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevelId(Integer riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * <p>The ID of the sensitive data detection rule that the OSS object hits.</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeRules</strong> operation to query the ID of the sensitive data detection rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1222</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The region in which the data asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * <p>The ID of the industry-specific rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

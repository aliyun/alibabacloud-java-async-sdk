// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAgentlessMaliciousFilesRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessMaliciousFilesRequest</p>
 */
public class ListAgentlessMaliciousFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyMaliciousName")
    private String fuzzyMaliciousName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
    private String maliciousMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaliciousType")
    private String maliciousType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListAgentlessMaliciousFilesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.eventId = builder.eventId;
        this.fuzzyMaliciousName = builder.fuzzyMaliciousName;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.maliciousMd5 = builder.maliciousMd5;
        this.maliciousType = builder.maliciousType;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.scanRange = builder.scanRange;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessMaliciousFilesRequest create() {
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return fuzzyMaliciousName
     */
    public String getFuzzyMaliciousName() {
        return this.fuzzyMaliciousName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    /**
     * @return maliciousMd5
     */
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    /**
     * @return maliciousType
     */
    public String getMaliciousType() {
        return this.maliciousType;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return scanRange
     */
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListAgentlessMaliciousFilesRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private Long eventId; 
        private String fuzzyMaliciousName; 
        private String lang; 
        private String levels; 
        private String maliciousMd5; 
        private String maliciousType; 
        private String pageSize; 
        private String remark; 
        private java.util.List<String> scanRange; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessMaliciousFilesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.eventId = request.eventId;
            this.fuzzyMaliciousName = request.fuzzyMaliciousName;
            this.lang = request.lang;
            this.levels = request.levels;
            this.maliciousMd5 = request.maliciousMd5;
            this.maliciousType = request.maliciousType;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.scanRange = request.scanRange;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether the vulnerability is handled. Valid values:</p>
         * <ul>
         * <li>Y: The vulnerability is handled.</li>
         * <li>N: The vulnerability is not handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81****</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The name of the malicious file that you want to query.</p>
         * <blockquote>
         * <p>Fuzzy match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        public Builder fuzzyMaliciousName(String fuzzyMaliciousName) {
            this.putQueryParameter("FuzzyMaliciousName", fuzzyMaliciousName);
            this.fuzzyMaliciousName = fuzzyMaliciousName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The severities of the malicious files. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li>serious</li>
         * <li>suspicious</li>
         * <li>remind</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind,suspicious</p>
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * <p>The MD5 hash value of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>d836968041f7683b5459****</p>
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
            return this;
        }

        /**
         * <p>The alert type.</p>
         * <p>Valid values when Lang is set to zh:</p>
         * <ul>
         * <li>WebShell</li>
         * <li>Malicious Software</li>
         * <li>Malicious Script</li>
         * </ul>
         * <p>Valid values when Lang is set to en:</p>
         * <ul>
         * <li>WebShell</li>
         * <li>Malicious Software</li>
         * <li>Malicious Script</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        public Builder maliciousType(String maliciousType) {
            this.putQueryParameter("MaliciousType", maliciousType);
            this.maliciousType = maliciousType;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source of the malicious file.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>d2d94e8b-bb25-4744-8004-1e08a53c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListAgentlessMaliciousFilesRequest build() {
            return new ListAgentlessMaliciousFilesRequest(this);
        } 

    } 

}

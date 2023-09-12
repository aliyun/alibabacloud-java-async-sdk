// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessMaliciousFilesRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessMaliciousFilesRequest</p>
 */
public class ListAgentlessMaliciousFilesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("EventId")
    private Long eventId;

    @Query
    @NameInMap("FuzzyMaliciousName")
    private String fuzzyMaliciousName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("MaliciousMd5")
    private String maliciousMd5;

    @Query
    @NameInMap("MaliciousType")
    private String maliciousType;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Uuid")
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
            this.uuid = request.uuid;
        } 

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the vulnerability is handled. Valid values:
         * <p>
         * 
         * *   Y: The vulnerability is handled.
         * *   N: The vulnerability is not handled.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The event ID.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The name of the malicious file that you want to query.
         * <p>
         * 
         * > Fuzzy match is supported.
         */
        public Builder fuzzyMaliciousName(String fuzzyMaliciousName) {
            this.putQueryParameter("FuzzyMaliciousName", fuzzyMaliciousName);
            this.fuzzyMaliciousName = fuzzyMaliciousName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The severities of the malicious files. Separate multiple values with commas (,). Valid values:
         * <p>
         * 
         * *   serious
         * *   suspicious
         * *   remind
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * The MD5 hash value of the malicious file.
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
            return this;
        }

        /**
         * MaliciousType.
         */
        public Builder maliciousType(String maliciousType) {
            this.putQueryParameter("MaliciousType", maliciousType);
            this.maliciousType = maliciousType;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The UUID of the asset.
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

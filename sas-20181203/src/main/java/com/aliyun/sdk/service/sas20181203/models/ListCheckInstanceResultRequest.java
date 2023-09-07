// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckInstanceResultRequest} extends {@link RequestModel}
 *
 * <p>ListCheckInstanceResultRequest</p>
 */
public class ListCheckInstanceResultRequest extends Request {
    @Query
    @NameInMap("CheckId")
    @Validation(required = true)
    private Long checkId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InstanceIdKey")
    private String instanceIdKey;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("InstanceNameKey")
    private String instanceNameKey;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionIdKey")
    private String regionIdKey;

    @Query
    @NameInMap("SortTypes")
    private java.util.List < String > sortTypes;

    @Query
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    private ListCheckInstanceResultRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.currentPage = builder.currentPage;
        this.instanceIdKey = builder.instanceIdKey;
        this.instanceIds = builder.instanceIds;
        this.instanceNameKey = builder.instanceNameKey;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.regionIdKey = builder.regionIdKey;
        this.sortTypes = builder.sortTypes;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckInstanceResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceIdKey
     */
    public String getInstanceIdKey() {
        return this.instanceIdKey;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceNameKey
     */
    public String getInstanceNameKey() {
        return this.instanceNameKey;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionIdKey
     */
    public String getRegionIdKey() {
        return this.regionIdKey;
    }

    /**
     * @return sortTypes
     */
    public java.util.List < String > getSortTypes() {
        return this.sortTypes;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListCheckInstanceResultRequest, Builder> {
        private Long checkId; 
        private Integer currentPage; 
        private String instanceIdKey; 
        private java.util.List < String > instanceIds; 
        private String instanceNameKey; 
        private String lang; 
        private Integer pageSize; 
        private String regionIdKey; 
        private java.util.List < String > sortTypes; 
        private java.util.List < String > statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckInstanceResultRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.currentPage = request.currentPage;
            this.instanceIdKey = request.instanceIdKey;
            this.instanceIds = request.instanceIds;
            this.instanceNameKey = request.instanceNameKey;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.regionIdKey = request.regionIdKey;
            this.sortTypes = request.sortTypes;
            this.statuses = request.statuses;
        } 

        /**
         * The ID of the check item.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceIdKey(String instanceIdKey) {
            this.putQueryParameter("InstanceIdKey", instanceIdKey);
            this.instanceIdKey = instanceIdKey;
            return this;
        }

        /**
         * The instance IDs of cloud services.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceNameKey(String instanceNameKey) {
            this.putQueryParameter("InstanceNameKey", instanceNameKey);
            this.instanceNameKey = instanceNameKey;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionIdKey(String regionIdKey) {
            this.putQueryParameter("RegionIdKey", regionIdKey);
            this.regionIdKey = regionIdKey;
            return this;
        }

        /**
         * The types of the conditions based on which the check items are sorted.
         */
        public Builder sortTypes(java.util.List < String > sortTypes) {
            this.putQueryParameter("SortTypes", sortTypes);
            this.sortTypes = sortTypes;
            return this;
        }

        /**
         * The statuses of check items.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListCheckInstanceResultRequest build() {
            return new ListCheckInstanceResultRequest(this);
        } 

    } 

}

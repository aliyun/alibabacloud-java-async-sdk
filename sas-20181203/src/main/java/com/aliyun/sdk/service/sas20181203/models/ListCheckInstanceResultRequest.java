// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCheckInstanceResultRequest} extends {@link RequestModel}
 *
 * <p>ListCheckInstanceResultRequest</p>
 */
public class ListCheckInstanceResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdKey")
    private String instanceIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNameKey")
    private String instanceNameKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIdKey")
    private String regionIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortTypes")
    private java.util.List < String > sortTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
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
         * <p>The ID of the check item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf64w4q6p9jti5gl****</p>
         */
        public Builder instanceIdKey(String instanceIdKey) {
            this.putQueryParameter("InstanceIdKey", instanceIdKey);
            this.instanceIdKey = instanceIdKey;
            return this;
        }

        /**
         * <p>The instance IDs of cloud services.</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf64w4q6p9jti5gl****</p>
         */
        public Builder instanceNameKey(String instanceNameKey) {
            this.putQueryParameter("InstanceNameKey", instanceNameKey);
            this.instanceNameKey = instanceNameKey;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionIdKey(String regionIdKey) {
            this.putQueryParameter("RegionIdKey", regionIdKey);
            this.regionIdKey = regionIdKey;
            return this;
        }

        /**
         * <p>The types of the conditions based on which the check items are sorted.</p>
         */
        public Builder sortTypes(java.util.List < String > sortTypes) {
            this.putQueryParameter("SortTypes", sortTypes);
            this.sortTypes = sortTypes;
            return this;
        }

        /**
         * <p>The statuses of check items.</p>
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

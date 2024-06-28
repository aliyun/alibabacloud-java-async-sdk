// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>DescribePlaybooksRequest</p>
 */
public class DescribePlaybooksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private Integer active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndMillis")
    private Long endMillis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnType")
    private String ownType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartMillis")
    private Long startMillis;

    private DescribePlaybooksRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.endMillis = builder.endMillis;
        this.lang = builder.lang;
        this.name = builder.name;
        this.order = builder.order;
        this.ownType = builder.ownType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.playbookUuid = builder.playbookUuid;
        this.sort = builder.sort;
        this.startMillis = builder.startMillis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybooksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Integer getActive() {
        return this.active;
    }

    /**
     * @return endMillis
     */
    public Long getEndMillis() {
        return this.endMillis;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return ownType
     */
    public String getOwnType() {
        return this.ownType;
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
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startMillis
     */
    public Long getStartMillis() {
        return this.startMillis;
    }

    public static final class Builder extends Request.Builder<DescribePlaybooksRequest, Builder> {
        private Integer active; 
        private Long endMillis; 
        private String lang; 
        private String name; 
        private String order; 
        private String ownType; 
        private String pageNumber; 
        private String pageSize; 
        private String playbookUuid; 
        private String sort; 
        private Long startMillis; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlaybooksRequest request) {
            super(request);
            this.active = request.active;
            this.endMillis = request.endMillis;
            this.lang = request.lang;
            this.name = request.name;
            this.order = request.order;
            this.ownType = request.ownType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.playbookUuid = request.playbookUuid;
            this.sort = request.sort;
            this.startMillis = request.startMillis;
        } 

        /**
         * The status of the playbook. Valid values:
         * <p>
         * 
         * *   **1**: enabled
         * *   **0**: disabled
         */
        public Builder active(Integer active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * The end of the time range to query. The value is a 13-digit timestamp.
         */
        public Builder endMillis(Long endMillis) {
            this.putQueryParameter("EndMillis", endMillis);
            this.endMillis = endMillis;
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
         * The name of the playbook.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The type of the playbook. Valid values:
         * <p>
         * 
         * *   **preset**: predefined playbook
         * *   **user**: custom playbook
         */
        public Builder ownType(String ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * The page number. Default value: 1. Pages start from page 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can use the UUID to query the information about a specific playbook.
         * 
         * *   You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a 13-digit timestamp.
         */
        public Builder startMillis(Long startMillis) {
            this.putQueryParameter("StartMillis", startMillis);
            this.startMillis = startMillis;
            return this;
        }

        @Override
        public DescribePlaybooksRequest build() {
            return new DescribePlaybooksRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("ParamTypes")
    private String paramTypes;

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
        this.paramTypes = builder.paramTypes;
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
     * @return paramTypes
     */
    public String getParamTypes() {
        return this.paramTypes;
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
        private String paramTypes; 
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
            this.paramTypes = request.paramTypes;
            this.playbookUuid = request.playbookUuid;
            this.sort = request.sort;
            this.startMillis = request.startMillis;
        } 

        /**
         * <p>The status of the playbook. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(Integer active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1683858064361</p>
         */
        public Builder endMillis(Long endMillis) {
            this.putQueryParameter("EndMillis", endMillis);
            this.endMillis = endMillis;
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
         * <p>The name of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_playbook</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sorting order. Default value: desc. Valid values:</p>
         * <ul>
         * <li>desc: descending order</li>
         * <li>asc: ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <ul>
         * <li><strong>preset</strong>: predefined playbook</li>
         * <li><strong>user</strong>: custom playbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder ownType(String ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. Pages start from page 1.</p>
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
         * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParamTypes.
         */
        public Builder paramTypes(String paramTypes) {
            this.putQueryParameter("ParamTypes", paramTypes);
            this.paramTypes = paramTypes;
            return this;
        }

        /**
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can use the UUID to query the information about a specific playbook.</p>
         * </blockquote>
         * <ul>
         * <li>You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8baa6cff-319e-4ede-97bc-1xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The sorting basis. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: last modification time</li>
         * <li>2: last execution time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1683526277415</p>
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

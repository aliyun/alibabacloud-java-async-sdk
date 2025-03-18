// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamTypes")
    private String paramTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuids")
    private String playbookUuids;

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
        this.playbookUuids = builder.playbookUuids;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
     * @return playbookUuids
     */
    public String getPlaybookUuids() {
        return this.playbookUuids;
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
        private Long pageNumber; 
        private Integer pageSize; 
        private String paramTypes; 
        private String playbookUuid; 
        private String playbookUuids; 
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
            this.playbookUuids = request.playbookUuids;
            this.sort = request.sort;
            this.startMillis = request.startMillis;
        } 

        /**
         * <p>Activation status of the playbook. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Indicates the playbook is activated.</li>
         * <li><strong>0</strong>: Indicates the playbook is not activated.</li>
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
         * <p>End time for the query, in 13-digit timestamp format.</p>
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
         * <p>Specifies the language type for the request and response, default is <strong>zh</strong>. Values:</p>
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
         * <p>The sorting logic, with a default value of <strong>desc</strong>. Values:</p>
         * <ul>
         * <li><strong>desc</strong>: Descending order.</li>
         * <li><strong>asc</strong>: Ascending order.</li>
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
         * <p>Type of the playbook. Values:</p>
         * <ul>
         * <li><strong>preset</strong>: Predefined playbook.</li>
         * <li><strong>user</strong>: Custom playbook.</li>
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
         * <p>Sets the page number from which to start displaying the query results. The default value is 1, indicating the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Specifies the maximum number of items to display per page in a paginated query. The default number of items per page is 20. If the PageSize parameter is empty, it will return 10 items by default.</p>
         * <blockquote>
         * <p>It is recommended that the PageSize value is not empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The trigger method for the playbook, with a default value of <strong>query all</strong>. Values:</p>
         * <ul>
         * <li><strong>template-incident</strong>: Security incident.</li>
         * <li><strong>template-ip</strong>: IP entity.</li>
         * <li><strong>template-file</strong>: File entity.</li>
         * <li><strong>template-process</strong>: Process entity.</li>
         * <li><strong>template-alert</strong>: Security alert.</li>
         * <li><strong>template-domain</strong>: Domain entity.</li>
         * <li><strong>template-container</strong>: Container entity.</li>
         * <li><strong>template-host</strong>: Host entity.</li>
         * <li><strong>template-custom</strong>: Custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template-alert</p>
         */
        public Builder paramTypes(String paramTypes) {
            this.putQueryParameter("ParamTypes", paramTypes);
            this.paramTypes = paramTypes;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p>You can use the UUID to query specific playbook information.</p>
         * <ul>
         * <li>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> API to obtain this parameter.</li>
         * </ul>
         * </blockquote>
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
         * <p>UUID List of the playbook.</p>
         * <p>Note You can use the UUID list to query specific playbook information.
         * Call the DescribePlaybooks API to obtain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8baa6cff-319e-4ede-97bc-1xxxxxx,7745e6cff-319e-4ede-97bc-1xxxxxx</p>
         */
        public Builder playbookUuids(String playbookUuids) {
            this.putQueryParameter("PlaybookUuids", playbookUuids);
            this.playbookUuids = playbookUuids;
            return this;
        }

        /**
         * <p>The sorting basis, with a default value of <strong>1</strong>. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Last modified time.</li>
         * <li><strong>2</strong>: Most recent execution time.</li>
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
         * <p>Start time for the query, in 13-digit timestamp format.</p>
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

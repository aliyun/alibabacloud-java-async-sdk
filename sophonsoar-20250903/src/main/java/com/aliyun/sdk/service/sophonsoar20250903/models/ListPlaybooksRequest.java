// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link ListPlaybooksRequest} extends {@link RequestModel}
 *
 * <p>ListPlaybooksRequest</p>
 */
public class ListPlaybooksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookExecutionEndTime")
    private Long playbookExecutionEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookExecutionStartTime")
    private Long playbookExecutionStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookName")
    private String playbookName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookParamTypes")
    private java.util.List<String> playbookParamTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookStatus")
    private Integer playbookStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookType")
    private String playbookType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuids")
    private java.util.List<String> playbookUuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListPlaybooksRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.playbookExecutionEndTime = builder.playbookExecutionEndTime;
        this.playbookExecutionStartTime = builder.playbookExecutionStartTime;
        this.playbookName = builder.playbookName;
        this.playbookParamTypes = builder.playbookParamTypes;
        this.playbookStatus = builder.playbookStatus;
        this.playbookType = builder.playbookType;
        this.playbookUuids = builder.playbookUuids;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlaybooksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbookExecutionEndTime
     */
    public Long getPlaybookExecutionEndTime() {
        return this.playbookExecutionEndTime;
    }

    /**
     * @return playbookExecutionStartTime
     */
    public Long getPlaybookExecutionStartTime() {
        return this.playbookExecutionStartTime;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return playbookParamTypes
     */
    public java.util.List<String> getPlaybookParamTypes() {
        return this.playbookParamTypes;
    }

    /**
     * @return playbookStatus
     */
    public Integer getPlaybookStatus() {
        return this.playbookStatus;
    }

    /**
     * @return playbookType
     */
    public String getPlaybookType() {
        return this.playbookType;
    }

    /**
     * @return playbookUuids
     */
    public java.util.List<String> getPlaybookUuids() {
        return this.playbookUuids;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<ListPlaybooksRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String orderField; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long playbookExecutionEndTime; 
        private Long playbookExecutionStartTime; 
        private String playbookName; 
        private java.util.List<String> playbookParamTypes; 
        private Integer playbookStatus; 
        private String playbookType; 
        private java.util.List<String> playbookUuids; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListPlaybooksRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.playbookExecutionEndTime = request.playbookExecutionEndTime;
            this.playbookExecutionStartTime = request.playbookExecutionStartTime;
            this.playbookName = request.playbookName;
            this.playbookParamTypes = request.playbookParamTypes;
            this.playbookStatus = request.playbookStatus;
            this.playbookType = request.playbookType;
            this.playbookUuids = request.playbookUuids;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>Language type for request and response messages.</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Maximum number of results returned in a single request. Range: 1~100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token for the next query start.</p>
         * 
         * <strong>example:</strong>
         * <p>7fbb1c****07c1f79a740f039a8dcfda</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Sorting logic, default is <strong>desc</strong>, with values as follows:</p>
         * <ul>
         * <li><strong>desc</strong>: Descending order.</li>
         * <li><strong>asc</strong>: Ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Sorting field. Values:</p>
         * <ul>
         * <li><strong>UpdateTime</strong>: Sort by update time.</li>
         * <li><strong>ExecutionTime</strong>: Sort by the latest execution time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpdateTime</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>Page number for pagination, default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of items per page for pagination. Range: 1~100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>End time of the latest execution of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>1731379251000</p>
         */
        public Builder playbookExecutionEndTime(Long playbookExecutionEndTime) {
            this.putBodyParameter("PlaybookExecutionEndTime", playbookExecutionEndTime);
            this.playbookExecutionEndTime = playbookExecutionEndTime;
            return this;
        }

        /**
         * <p>Start time of the latest execution of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>1731378251000</p>
         */
        public Builder playbookExecutionStartTime(Long playbookExecutionStartTime) {
            this.putBodyParameter("PlaybookExecutionStartTime", playbookExecutionStartTime);
            this.playbookExecutionStartTime = playbookExecutionStartTime;
            return this;
        }

        /**
         * <p>Name of the playbook, supports fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_test</p>
         */
        public Builder playbookName(String playbookName) {
            this.putBodyParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * <p>Collection of input parameter types for the playbook.</p>
         */
        public Builder playbookParamTypes(java.util.List<String> playbookParamTypes) {
            String playbookParamTypesShrink = shrink(playbookParamTypes, "PlaybookParamTypes", "simple");
            this.putBodyParameter("PlaybookParamTypes", playbookParamTypesShrink);
            this.playbookParamTypes = playbookParamTypes;
            return this;
        }

        /**
         * <p>Publication status of the playbook, with values as follows:</p>
         * <ul>
         * <li><strong>0</strong>: Unpublished.</li>
         * <li><strong>1</strong>: Published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder playbookStatus(Integer playbookStatus) {
            this.putBodyParameter("PlaybookStatus", playbookStatus);
            this.playbookStatus = playbookStatus;
            return this;
        }

        /**
         * <p>Type of the playbook, with values as follows:</p>
         * <ul>
         * <li><strong>preset</strong>: Predefined playbook.</li>
         * <li><strong>user</strong>: Custom playbook.</li>
         * <li><strong>component</strong>: Security response component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        public Builder playbookType(String playbookType) {
            this.putBodyParameter("PlaybookType", playbookType);
            this.playbookType = playbookType;
            return this;
        }

        /**
         * <p>Collection of UUIDs of playbooks.</p>
         */
        public Builder playbookUuids(java.util.List<String> playbookUuids) {
            String playbookUuidsShrink = shrink(playbookUuids, "PlaybookUuids", "simple");
            this.putBodyParameter("PlaybookUuids", playbookUuidsShrink);
            this.playbookUuids = playbookUuids;
            return this;
        }

        /**
         * <p>User ID for the administrator to switch to another member&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListPlaybooksRequest build() {
            return new ListPlaybooksRequest(this);
        } 

    } 

}

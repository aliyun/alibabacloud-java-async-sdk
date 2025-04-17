// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ListTriggersRequest} extends {@link RequestModel}
 *
 * <p>ListTriggersRequest</p>
 */
public class ListTriggersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagSelector")
    private String tagSelector;

    private ListTriggersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.sort = builder.sort;
        this.state = builder.state;
        this.tagSelector = builder.tagSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tagSelector
     */
    public String getTagSelector() {
        return this.tagSelector;
    }

    public static final class Builder extends Request.Builder<ListTriggersRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private String projectName; 
        private String sort; 
        private String state; 
        private String tagSelector; 

        private Builder() {
            super();
        } 

        private Builder(ListTriggersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.projectName = request.projectName;
            this.sort = request.sort;
            this.state = request.state;
            this.tagSelector = request.tagSelector;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Valid values: 0 to 100.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>If the total number of triggers is greater than the value of MaxResults, you must specify NextToken.</p>
         * <p>You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort order. Default value: DESC.</p>
         * <ul>
         * <li>ASC (default): ascending order.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li>CreateTime: the point in time when the trigger is created.</li>
         * <li>UpdateTime: the most recent point in time when the trigger is updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T06:51:17.5Z</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The status of the trigger. Valid values:</p>
         * <ul>
         * <li>Ready: The trigger is ready.</li>
         * <li>Running: The trigger is running.</li>
         * <li>Failed: The trigger failed and cannot be automatically recovered.</li>
         * <li>Suspended: The trigger is suspended.</li>
         * <li>Succeeded: The trigger is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The custom tag. You can specify this parameter only if you specified Tags when you called the CreateTrigger operation.</p>
         * 
         * <strong>example:</strong>
         * <p>test=val1</p>
         */
        public Builder tagSelector(String tagSelector) {
            this.putQueryParameter("TagSelector", tagSelector);
            this.tagSelector = tagSelector;
            return this;
        }

        @Override
        public ListTriggersRequest build() {
            return new ListTriggersRequest(this);
        } 

    } 

}

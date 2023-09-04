// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessConfigurationsRequest</p>
 */
public class ListAccessConfigurationsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("StatusNotifications")
    private String statusNotifications;

    private ListAccessConfigurationsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.statusNotifications = builder.statusNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessConfigurationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return statusNotifications
     */
    public String getStatusNotifications() {
        return this.statusNotifications;
    }

    public static final class Builder extends Request.Builder<ListAccessConfigurationsRequest, Builder> {
        private String directoryId; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String statusNotifications; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessConfigurationsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.statusNotifications = request.statusNotifications;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The filter condition.
         * <p>
         * 
         * Specify the value in the \<Attribute> \<Operator> \<Value> format. The value is not case sensitive. You can set \<Attribute> only to AccessConfigurationName and \<Operator> only to eq or sw. The value eq indicates Equals. The value sw indicates Starts With.
         * 
         * For example, if you set Filter to AccessConfigurationName sw test, the operation queries all access configurations whose names start with test. If you set Filter to AccessConfigurationName eq TestAccessConfiguration, the operation queries the access configuration whose name is TestAccessConfiguration.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token to return for the next page. If this is your first time to call this operation, you do not need to specify the `NextToken` parameter.
         * <p>
         * 
         * When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The status notification. The status notification can be used to filter access configurations.
         * <p>
         * 
         * Set the value to ReprovisionRequired, which indicates that the operation queries all access configurations that need to be re-provisioned.
         */
        public Builder statusNotifications(String statusNotifications) {
            this.putQueryParameter("StatusNotifications", statusNotifications);
            this.statusNotifications = statusNotifications;
            return this;
        }

        @Override
        public ListAccessConfigurationsRequest build() {
            return new ListAccessConfigurationsRequest(this);
        } 

    } 

}

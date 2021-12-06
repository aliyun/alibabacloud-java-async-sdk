// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String statusNotifications; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Filter.</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>StatusNotifications.</p>
         */
        public Builder statusNotifications(String statusNotifications) {
            this.putQueryParameter("StatusNotifications", statusNotifications);
            this.statusNotifications = statusNotifications;
            return this;
        }

        public ListAccessConfigurationsRequest build() {
            return new ListAccessConfigurationsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
 * {@link GetListenerHealthStatusRequest} extends {@link RequestModel}
 *
 * <p>GetListenerHealthStatusRequest</p>
 */
public class GetListenerHealthStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    private GetListenerHealthStatusRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.listenerId = builder.listenerId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerHealthStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<GetListenerHealthStatusRequest, Builder> {
        private java.util.List<Filter> filter; 
        private String listenerId; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 

        private Builder() {
            super();
        } 

        private Builder(GetListenerHealthStatusRequest request) {
            super(request);
            this.filter = request.filter;
            this.listenerId = request.listenerId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
        } 

        /**
         * <p>The filter conditions. You can specify at most 20 filter conditions.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The listener ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-7sixpvm5fc3v0b****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 1000. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4f1d7cc9f51e18904e8a063603a6b0c3d03bc69f78734254e0b5e8707e68****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries to be skipped in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        @Override
        public GetListenerHealthStatusRequest build() {
            return new GetListenerHealthStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetListenerHealthStatusRequest} extends {@link TeaModel}
     *
     * <p>GetListenerHealthStatusRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.name = model.name;
                this.values = model.values;
            } 

            /**
             * <p>The filter condition name. You can filter by one or more filter condition names. The URL must meet the following requirements:</p>
             * <ul>
             * <li><strong>Status</strong>: the health status.</li>
             * <li><strong>ReasonCode</strong>: the cause of an unhealthy server.</li>
             * <li><strong>ServerId</strong>: the ID of the backend server.</li>
             * <li><strong>ServerIp</strong>: the IP address of the backend server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Status</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The filter condition values. You can specify at most 20 condition values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}

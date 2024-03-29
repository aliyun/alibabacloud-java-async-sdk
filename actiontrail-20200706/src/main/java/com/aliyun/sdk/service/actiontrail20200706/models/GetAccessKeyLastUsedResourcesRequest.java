// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedResourcesRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedResourcesRequest</p>
 */
public class GetAccessKeyLastUsedResourcesRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    @Validation(required = true)
    private String accessKey;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private GetAccessKeyLastUsedResourcesRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedResourcesRequest, Builder> {
        private String accessKey; 
        private String nextToken; 
        private String pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedResourcesRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.serviceName = request.serviceName;
        } 

        /**
         * The AccessKey ID.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         * <p>
         * 
         * > The request parameters must be the same as those of the last request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 0 to 100.
         * *   Default value: 20.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The Alibaba Cloud service. For more information about the Alibaba Cloud services supported by ActionTrail, see [Supported Alibaba Cloud services](~~28829~~).
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedResourcesRequest build() {
            return new GetAccessKeyLastUsedResourcesRequest(this);
        } 

    } 

}

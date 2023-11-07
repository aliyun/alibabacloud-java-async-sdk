// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedEventsRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedEventsRequest</p>
 */
public class GetAccessKeyLastUsedEventsRequest extends Request {
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

    private GetAccessKeyLastUsedEventsRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedEventsRequest create() {
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

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedEventsRequest, Builder> {
        private String accessKey; 
        private String nextToken; 
        private String pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedEventsRequest request) {
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
         * The token that determines the start point of the query.
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
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 0 to 100.
         * 
         * Default value: 20.
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
        public GetAccessKeyLastUsedEventsRequest build() {
            return new GetAccessKeyLastUsedEventsRequest(this);
        } 

    } 

}

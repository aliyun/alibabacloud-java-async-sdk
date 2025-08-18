// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetAccessKeyLastUsedIpsRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedIpsRequest</p>
 */
public class GetAccessKeyLastUsedIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private GetAccessKeyLastUsedIpsRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedIpsRequest create() {
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

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedIpsRequest, Builder> {
        private String accessKey; 
        private String nextToken; 
        private String pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedIpsRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>The AccessKey ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI****************</p>
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 0 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The Alibaba Cloud service. For more information about the Alibaba Cloud services supported by ActionTrail, see <a href="https://help.aliyun.com/document_detail/28829.html">Services that work with ActionTrail</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedIpsRequest build() {
            return new GetAccessKeyLastUsedIpsRequest(this);
        } 

    } 

}

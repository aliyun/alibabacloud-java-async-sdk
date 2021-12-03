// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListProvisionConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListProvisionConfigsRequest</p>
 */
public class ListProvisionConfigsRequest extends Request {
    @Query
    @NameInMap("limit")
    private Long limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    @Query
    @NameInMap("serviceName")
    private String serviceName;


    private ListProvisionConfigsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.qualifier = builder.qualifier;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionConfigsRequest create() {
        return builder().build();
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder {
        private Long limit; 
        private String nextToken; 
        private String qualifier; 
        private String serviceName; 

        /**
         * <p>限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100。返回结果可能小于指定的数量，但不会多于指定的数量	</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>用来返回更多结果。第一次查询不需要提供这个参数，后续查询的token从返回结果中获取</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>限定返回的资源名称必须属于该qualifier。qualifier只能是aliasName，且必须和serviceName共同使用</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>限定返回的资源名称必须属于该service</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        public ListProvisionConfigsRequest build() {
            return new ListProvisionConfigsRequest(this);
        } 

    } 

}

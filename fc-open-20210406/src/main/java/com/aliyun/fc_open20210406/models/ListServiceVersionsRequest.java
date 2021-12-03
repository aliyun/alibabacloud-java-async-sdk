// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListServiceVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceVersionsRequest</p>
 */
public class ListServiceVersionsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Query
    @NameInMap("direction")
    private String direction;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("startKey")
    private String startKey;


    private ListServiceVersionsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.direction = builder.direction;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.startKey = builder.startKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceVersionsRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String direction; 
        private Integer limit; 
        private String nextToken; 
        private String startKey; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>排序方向</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>最多返回个数</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>下次查询token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>起始key</p>
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        public ListServiceVersionsRequest build() {
            return new ListServiceVersionsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersRequest} extends {@link RequestModel}
 *
 * <p>ListListenersRequest</p>
 */
public class ListListenersRequest extends Request {
    @Query
    @NameInMap("ListenerIds")
    private java.util.List < String > listenerIds;

    @Query
    @NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @Query
    @NameInMap("LoadBalancerIds")
    private java.util.List < String > loadBalancerIds;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListListenersRequest(Builder builder) {
        super(builder);
        this.listenerIds = builder.listenerIds;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerIds
     */
    public java.util.List < String > getListenerIds() {
        return this.listenerIds;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List < String > getLoadBalancerIds() {
        return this.loadBalancerIds;
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

    public static final class Builder extends Request.Builder<ListListenersRequest, Builder> {
        private java.util.List < String > listenerIds; 
        private String listenerProtocol; 
        private java.util.List < String > loadBalancerIds; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListListenersRequest response) {
            super(response);
            this.listenerIds = response.listenerIds;
            this.listenerProtocol = response.listenerProtocol;
            this.loadBalancerIds = response.loadBalancerIds;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * 监听ID列表，N最大支持20
         */
        public Builder listenerIds(java.util.List < String > listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * 监听协议
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * 实例ID列表，N最大支持20
         */
        public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量，此参数为可选参数，取值1-100，用户传入为空时，默认为20。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 用来标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListListenersRequest build() {
            return new ListListenersRequest(this);
        } 

    } 

}

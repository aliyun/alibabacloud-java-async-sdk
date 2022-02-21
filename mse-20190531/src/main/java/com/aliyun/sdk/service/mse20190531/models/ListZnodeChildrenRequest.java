// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZnodeChildrenRequest} extends {@link RequestModel}
 *
 * <p>ListZnodeChildrenRequest</p>
 */
public class ListZnodeChildrenRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    private ListZnodeChildrenRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZnodeChildrenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<ListZnodeChildrenRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(ListZnodeChildrenRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.clusterId = response.clusterId;
            this.path = response.path;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public ListZnodeChildrenRequest build() {
            return new ListZnodeChildrenRequest(this);
        } 

    } 

}

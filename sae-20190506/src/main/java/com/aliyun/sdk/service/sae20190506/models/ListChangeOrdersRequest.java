// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChangeOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListChangeOrdersRequest</p>
 */
public class ListChangeOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoStatus")
    private String coStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoType")
    private String coType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListChangeOrdersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.coStatus = builder.coStatus;
        this.coType = builder.coType;
        this.currentPage = builder.currentPage;
        this.key = builder.key;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return coStatus
     */
    public String getCoStatus() {
        return this.coStatus;
    }

    /**
     * @return coType
     */
    public String getCoType() {
        return this.coType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListChangeOrdersRequest, Builder> {
        private String appId; 
        private String coStatus; 
        private String coType; 
        private Integer currentPage; 
        private String key; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListChangeOrdersRequest request) {
            super(request);
            this.appId = request.appId;
            this.coStatus = request.coStatus;
            this.coType = request.coType;
            this.currentPage = request.currentPage;
            this.key = request.key;
            this.pageSize = request.pageSize;
        } 

        /**
         * 1
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder coStatus(String coStatus) {
            this.putQueryParameter("CoStatus", coStatus);
            this.coStatus = coStatus;
            return this;
        }

        /**
         * 2
         */
        public Builder coType(String coType) {
            this.putQueryParameter("CoType", coType);
            this.coType = coType;
            return this;
        }

        /**
         * 20
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * CoCreateApp
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * test
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListChangeOrdersRequest build() {
            return new ListChangeOrdersRequest(this);
        } 

    } 

}

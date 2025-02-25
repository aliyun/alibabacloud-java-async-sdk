// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListPublishVersionsRequest</p>
 */
public class ListPublishVersionsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private String envId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Source")
    private String source;

    private ListPublishVersionsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishVersionsRequest create() {
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
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListPublishVersionsRequest, Builder> {
        private String appId; 
        private String envId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishVersionsRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListPublishVersionsRequest build() {
            return new ListPublishVersionsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchAiboxesRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureSearchAiboxesRequest</p>
 */
public class QueryPictureSearchAiboxesRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    private QueryPictureSearchAiboxesRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureSearchAiboxesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryPictureSearchAiboxesRequest, Builder> {
        private String appInstanceId; 
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryPictureSearchAiboxesRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.currentPage = request.currentPage;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        @Override
        public QueryPictureSearchAiboxesRequest build() {
            return new QueryPictureSearchAiboxesRequest(this);
        } 

    } 

}

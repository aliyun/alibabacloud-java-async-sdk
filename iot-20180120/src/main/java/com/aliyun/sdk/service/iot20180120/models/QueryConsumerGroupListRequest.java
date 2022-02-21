// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConsumerGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryConsumerGroupListRequest</p>
 */
public class QueryConsumerGroupListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Fuzzy")
    private Boolean fuzzy;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private QueryConsumerGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fuzzy = builder.fuzzy;
        this.groupName = builder.groupName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConsumerGroupListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fuzzy
     */
    public Boolean getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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

    public static final class Builder extends Request.Builder<QueryConsumerGroupListRequest, Builder> {
        private Integer currentPage; 
        private Boolean fuzzy; 
        private String groupName; 
        private String iotInstanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryConsumerGroupListRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.fuzzy = response.fuzzy;
            this.groupName = response.groupName;
            this.iotInstanceId = response.iotInstanceId;
            this.pageSize = response.pageSize;
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
         * Fuzzy.
         */
        public Builder fuzzy(Boolean fuzzy) {
            this.putQueryParameter("Fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
        public QueryConsumerGroupListRequest build() {
            return new QueryConsumerGroupListRequest(this);
        } 

    } 

}

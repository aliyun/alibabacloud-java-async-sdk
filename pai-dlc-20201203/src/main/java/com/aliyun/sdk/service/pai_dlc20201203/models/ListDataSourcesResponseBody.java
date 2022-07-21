// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("DataSources")
    private java.util.List < DataSourceItem > dataSources;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDataSourcesResponseBody(Builder builder) {
        this.dataSources = builder.dataSources;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSourceItem > getDataSources() {
        return this.dataSources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataSourceItem > dataSources; 
        private String requestId; 
        private Long totalCount; 

        /**
         * 数据源配置列表
         */
        public Builder dataSources(java.util.List < DataSourceItem > dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 符合条件的数据源总数量
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

}

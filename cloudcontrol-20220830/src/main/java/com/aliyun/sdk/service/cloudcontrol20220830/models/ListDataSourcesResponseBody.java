// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataSources")
    private java.util.List < DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListDataSourcesResponseBody(Builder builder) {
        this.dataSources = builder.dataSources;
        this.requestId = builder.requestId;
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
    public java.util.List < DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataSources> dataSources; 
        private String requestId; 

        /**
         * dataSources.
         */
        public Builder dataSources(java.util.List < DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        private DataSources(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
}

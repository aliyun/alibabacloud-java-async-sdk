// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonitorSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMonitorSourcesResponseBody</p>
 */
public class ListMonitorSourcesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListMonitorSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonitorSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMonitorSourcesResponseBody build() {
            return new ListMonitorSourcesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("fieldKeys")
        private java.util.List < String > fieldKeys;

        @NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        private Data(Builder builder) {
            this.fieldKeys = builder.fieldKeys;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fieldKeys
         */
        public java.util.List < String > getFieldKeys() {
            return this.fieldKeys;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public static final class Builder {
            private java.util.List < String > fieldKeys; 
            private Long monitorSourceId; 
            private String monitorSourceName; 

            /**
             * fieldKeys.
             */
            public Builder fieldKeys(java.util.List < String > fieldKeys) {
                this.fieldKeys = fieldKeys;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

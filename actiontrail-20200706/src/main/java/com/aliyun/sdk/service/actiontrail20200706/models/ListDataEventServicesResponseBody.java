// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataEventServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataEventServicesResponseBody</p>
 */
public class ListDataEventServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataEventServicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataEventServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataEventServicesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataEventServicesResponseBody build() {
            return new ListDataEventServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataEventServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataEventServicesResponseBody</p>
     */
    public static class ServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventNames")
        private java.util.List<String> eventNames;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ServiceInfos(Builder builder) {
            this.eventNames = builder.eventNames;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfos create() {
            return builder().build();
        }

        /**
         * @return eventNames
         */
        public java.util.List<String> getEventNames() {
            return this.eventNames;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List<String> eventNames; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ServiceInfos model) {
                this.eventNames = model.eventNames;
                this.serviceName = model.serviceName;
            } 

            /**
             * EventNames.
             */
            public Builder eventNames(java.util.List<String> eventNames) {
                this.eventNames = eventNames;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceInfos build() {
                return new ServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataEventServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataEventServicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("ServiceInfos")
        private java.util.List<ServiceInfos> serviceInfos;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.serviceInfos = builder.serviceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        /**
         * @return serviceInfos
         */
        public java.util.List<ServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<ServiceInfos> serviceInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.serviceInfos = model.serviceInfos;
            } 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * ServiceInfos.
             */
            public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

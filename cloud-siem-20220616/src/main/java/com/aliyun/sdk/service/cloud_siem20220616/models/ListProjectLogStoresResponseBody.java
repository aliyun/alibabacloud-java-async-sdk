// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectLogStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectLogStoresResponseBody</p>
 */
public class ListProjectLogStoresResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListProjectLogStoresResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectLogStoresResponseBody create() {
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
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectLogStoresResponseBody build() {
            return new ListProjectLogStoresResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EndPoint")
        private String endPoint;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("Project")
        private String project;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.endPoint = builder.endPoint;
            this.localName = builder.localName;
            this.logStore = builder.logStore;
            this.mainUserId = builder.mainUserId;
            this.project = builder.project;
            this.regionId = builder.regionId;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private String endPoint; 
            private String localName; 
            private String logStore; 
            private Long mainUserId; 
            private String project; 
            private String regionId; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * The endpoint of the Simple Log Service project.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * The name of the region in which the Simple Log Service project resides.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The name of the Simple Log Service Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * The name of the Simple Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The ID of the region in which the Simple Log Service project resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

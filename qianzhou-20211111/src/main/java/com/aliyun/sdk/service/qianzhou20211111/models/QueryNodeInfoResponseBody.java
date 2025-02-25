// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryNodeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNodeInfoResponseBody</p>
 */
public class QueryNodeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryNodeInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNodeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String msg; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNodeInfoResponseBody build() {
            return new QueryNodeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNodeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNodeInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluserName")
        private String cluserName;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.cluserName = builder.cluserName;
            this.clusterId = builder.clusterId;
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cluserName
         */
        public String getCluserName() {
            return this.cluserName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String cluserName; 
            private String clusterId; 
            private String instanceId; 
            private String region; 
            private String uid; 

            /**
             * cluserName.
             */
            public Builder cluserName(String cluserName) {
                this.cluserName = cluserName;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

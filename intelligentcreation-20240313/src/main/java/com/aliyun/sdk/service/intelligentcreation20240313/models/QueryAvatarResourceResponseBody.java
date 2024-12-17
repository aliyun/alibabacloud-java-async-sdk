// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryAvatarResourceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAvatarResourceResponseBody</p>
 */
public class QueryAvatarResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryResourceInfoList")
    private java.util.List<QueryResourceInfoList> queryResourceInfoList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryAvatarResourceResponseBody(Builder builder) {
        this.queryResourceInfoList = builder.queryResourceInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryResourceInfoList
     */
    public java.util.List<QueryResourceInfoList> getQueryResourceInfoList() {
        return this.queryResourceInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QueryResourceInfoList> queryResourceInfoList; 
        private String requestId; 

        /**
         * queryResourceInfoList.
         */
        public Builder queryResourceInfoList(java.util.List<QueryResourceInfoList> queryResourceInfoList) {
            this.queryResourceInfoList = queryResourceInfoList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAvatarResourceResponseBody build() {
            return new QueryAvatarResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAvatarResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvatarResourceResponseBody</p>
     */
    public static class QueryResourceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("validPeriodTime")
        private String validPeriodTime;

        private QueryResourceInfoList(Builder builder) {
            this.resourceId = builder.resourceId;
            this.type = builder.type;
            this.validPeriodTime = builder.validPeriodTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryResourceInfoList create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validPeriodTime
         */
        public String getValidPeriodTime() {
            return this.validPeriodTime;
        }

        public static final class Builder {
            private String resourceId; 
            private String type; 
            private String validPeriodTime; 

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * validPeriodTime.
             */
            public Builder validPeriodTime(String validPeriodTime) {
                this.validPeriodTime = validPeriodTime;
                return this;
            }

            public QueryResourceInfoList build() {
                return new QueryResourceInfoList(this);
            } 

        } 

    }
}

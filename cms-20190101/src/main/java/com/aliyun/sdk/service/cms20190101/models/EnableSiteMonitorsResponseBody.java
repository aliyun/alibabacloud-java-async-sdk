// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSiteMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>EnableSiteMonitorsResponseBody</p>
 */
public class EnableSiteMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private EnableSiteMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSiteMonitorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The status code.
         * <p>
         * 
         * >  The status code 200 indicates a success.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The number of detection points that are affected by the site monitoring tasks.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation was successful. Valid values:
         * <p>
         * 
         * *   true: successful.
         * *   false: failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public EnableSiteMonitorsResponseBody build() {
            return new EnableSiteMonitorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("count")
        private Integer count;

        private Data(Builder builder) {
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private Integer count; 

            /**
             * The number of detection points.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

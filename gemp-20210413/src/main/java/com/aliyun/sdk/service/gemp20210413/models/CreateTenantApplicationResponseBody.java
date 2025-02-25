// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantApplicationResponseBody</p>
 */
public class CreateTenantApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateTenantApplicationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantApplicationResponseBody create() {
        return builder().build();
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

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * id of the req
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTenantApplicationResponseBody build() {
            return new CreateTenantApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("openUrl")
        private String openUrl;

        @com.aliyun.core.annotation.NameInMap("progress")
        private String progress;

        private Data(Builder builder) {
            this.openUrl = builder.openUrl;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return openUrl
         */
        public String getOpenUrl() {
            return this.openUrl;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String openUrl; 
            private String progress; 

            /**
             * openUrl.
             */
            public Builder openUrl(String openUrl) {
                this.openUrl = openUrl;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

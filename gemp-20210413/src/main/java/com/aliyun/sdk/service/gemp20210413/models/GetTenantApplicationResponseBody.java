// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTenantApplicationResponseBody</p>
 */
public class GetTenantApplicationResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetTenantApplicationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantApplicationResponseBody create() {
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
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTenantApplicationResponseBody build() {
            return new GetTenantApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("bizId")
        private String bizId;

        @NameInMap("channel")
        private String channel;

        @NameInMap("corporationId")
        private String corporationId;

        @NameInMap("originalCorpId")
        private String originalCorpId;

        @NameInMap("progress")
        private String progress;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.channel = builder.channel;
            this.corporationId = builder.corporationId;
            this.originalCorpId = builder.originalCorpId;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return corporationId
         */
        public String getCorporationId() {
            return this.corporationId;
        }

        /**
         * @return originalCorpId
         */
        public String getOriginalCorpId() {
            return this.originalCorpId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String bizId; 
            private String channel; 
            private String corporationId; 
            private String originalCorpId; 
            private String progress; 

            /**
             * bizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * corporationId.
             */
            public Builder corporationId(String corporationId) {
                this.corporationId = corporationId;
                return this;
            }

            /**
             * originalCorpId.
             */
            public Builder originalCorpId(String originalCorpId) {
                this.originalCorpId = originalCorpId;
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

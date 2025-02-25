// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRichTextResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRichTextResponseBody</p>
 */
public class CreateRichTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateRichTextResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRichTextResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRichTextResponseBody build() {
            return new CreateRichTextResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private Long instanceType;

        @com.aliyun.core.annotation.NameInMap("richText")
        private String richText;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.richText = builder.richText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public Long getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return richText
         */
        public String getRichText() {
            return this.richText;
        }

        public static final class Builder {
            private Long instanceId; 
            private Long instanceType; 
            private String richText; 

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(Long instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * richText.
             */
            public Builder richText(String richText) {
                this.richText = richText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListInstancesEcsInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesEcsInfoListResponseBody</p>
 */
public class ListInstancesEcsInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private ListInstancesEcsInfoListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesEcsInfoListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 

        private Builder() {
        } 

        private Builder(ListInstancesEcsInfoListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ListInstancesEcsInfoListResponseBody build() {
            return new ListInstancesEcsInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesEcsInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesEcsInfoListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("tag_key")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tag_value")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.ip = builder.ip;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ip; 
            private String tagKey; 
            private String tagValue; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ip = model.ip;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
                this.type = model.type;
            } 

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * tag_key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tag_value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

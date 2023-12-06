// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductComponentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProductComponentVersionResponseBody</p>
 */
public class UpdateProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private UpdateProductComponentVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductComponentVersionResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

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
        public Builder data(Data data) {
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

        public UpdateProductComponentVersionResponseBody build() {
            return new UpdateProductComponentVersionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("relationUID")
        private String relationUID;

        private Data(Builder builder) {
            this.relationUID = builder.relationUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return relationUID
         */
        public String getRelationUID() {
            return this.relationUID;
        }

        public static final class Builder {
            private String relationUID; 

            /**
             * relationUID.
             */
            public Builder relationUID(String relationUID) {
                this.relationUID = relationUID;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

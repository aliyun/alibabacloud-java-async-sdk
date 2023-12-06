// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoundationComponentReferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFoundationComponentReferenceResponseBody</p>
 */
public class GetFoundationComponentReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetFoundationComponentReferenceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoundationComponentReferenceResponseBody create() {
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

        public GetFoundationComponentReferenceResponseBody build() {
            return new GetFoundationComponentReferenceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < FoundationComponentReferenceDetail > list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < FoundationComponentReferenceDetail > getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < FoundationComponentReferenceDetail > list; 

            /**
             * list.
             */
            public Builder list(java.util.List < FoundationComponentReferenceDetail > list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

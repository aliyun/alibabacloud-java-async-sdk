// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListCustomAgentToolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomAgentToolsResponseBody</p>
 */
public class ListCustomAgentToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCustomAgentToolsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAgentToolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCustomAgentToolsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCustomAgentToolsResponseBody build() {
            return new ListCustomAgentToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomAgentToolsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("En")
        private String en;

        @com.aliyun.core.annotation.NameInMap("Ja")
        private String ja;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tc")
        private String tc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Zh")
        private String zh;

        private Data(Builder builder) {
            this.en = builder.en;
            this.ja = builder.ja;
            this.name = builder.name;
            this.tc = builder.tc;
            this.type = builder.type;
            this.zh = builder.zh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return en
         */
        public String getEn() {
            return this.en;
        }

        /**
         * @return ja
         */
        public String getJa() {
            return this.ja;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tc
         */
        public String getTc() {
            return this.tc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zh
         */
        public String getZh() {
            return this.zh;
        }

        public static final class Builder {
            private String en; 
            private String ja; 
            private String name; 
            private String tc; 
            private String type; 
            private String zh; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.en = model.en;
                this.ja = model.ja;
                this.name = model.name;
                this.tc = model.tc;
                this.type = model.type;
                this.zh = model.zh;
            } 

            /**
             * En.
             */
            public Builder en(String en) {
                this.en = en;
                return this;
            }

            /**
             * Ja.
             */
            public Builder ja(String ja) {
                this.ja = ja;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Tc.
             */
            public Builder tc(String tc) {
                this.tc = tc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Zh.
             */
            public Builder zh(String zh) {
                this.zh = zh;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

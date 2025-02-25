// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetAllSheetsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllSheetsResponseBody</p>
 */
public class GetAllSheetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("value")
    private java.util.List<Value> value;

    private GetAllSheetsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllSheetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public java.util.List<Value> getValue() {
        return this.value;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Value> value; 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * value.
         */
        public Builder value(java.util.List<Value> value) {
            this.value = value;
            return this;
        }

        public GetAllSheetsResponseBody build() {
            return new GetAllSheetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAllSheetsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAllSheetsResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Value(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}

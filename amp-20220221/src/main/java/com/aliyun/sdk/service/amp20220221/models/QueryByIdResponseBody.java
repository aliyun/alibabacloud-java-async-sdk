// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amp20220221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryByIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryByIdResponseBody</p>
 */
public class QueryByIdResponseBody extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("Color")
    private String color;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private QueryByIdResponseBody(Builder builder) {
        this.address = builder.address;
        this.color = builder.color;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String address; 
        private String color; 
        private String name; 
        private String requestId; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * fsdfsa
         */
        public Builder color(String color) {
            this.color = color;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryByIdResponseBody build() {
            return new QueryByIdResponseBody(this);
        } 

    } 

}

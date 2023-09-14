// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubCrowdResponseBody</p>
 */
public class GetSubCrowdResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("Quantity")
    private String quantity;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Source")
    private String source;

    @NameInMap("Users")
    private String users;

    private GetSubCrowdResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.quantity = builder.quantity;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubCrowdResponseBody create() {
        return builder().build();
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return quantity
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String quantity; 
        private String requestId; 
        private String source; 
        private String users; 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(String users) {
            this.users = users;
            return this;
        }

        public GetSubCrowdResponseBody build() {
            return new GetSubCrowdResponseBody(this);
        } 

    } 

}

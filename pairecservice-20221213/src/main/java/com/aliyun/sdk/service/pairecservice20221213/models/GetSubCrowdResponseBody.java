// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetSubCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubCrowdResponseBody</p>
 */
public class GetSubCrowdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("Quantity")
    private String quantity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Users")
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
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

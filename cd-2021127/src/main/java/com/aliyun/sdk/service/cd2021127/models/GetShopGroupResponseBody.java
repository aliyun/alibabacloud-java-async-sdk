// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link GetShopGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetShopGroupResponseBody</p>
 */
public class GetShopGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShopGroupId")
    private String shopGroupId;

    @com.aliyun.core.annotation.NameInMap("ShopGroupName")
    private String shopGroupName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetShopGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.shopGroupId = builder.shopGroupId;
        this.shopGroupName = builder.shopGroupName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShopGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shopGroupId
     */
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    /**
     * @return shopGroupName
     */
    public String getShopGroupName() {
        return this.shopGroupName;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String shopGroupId; 
        private String shopGroupName; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShopGroupId.
         */
        public Builder shopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }

        /**
         * ShopGroupName.
         */
        public Builder shopGroupName(String shopGroupName) {
            this.shopGroupName = shopGroupName;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetShopGroupResponseBody build() {
            return new GetShopGroupResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayCategoriesResponseBody</p>
 */
public class DescribeGatewayCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    private String categories;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public String getCategories() {
        return this.categories;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String categories; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Categories.
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayCategoriesResponseBody build() {
            return new DescribeGatewayCategoriesResponseBody(this);
        } 

    } 

}

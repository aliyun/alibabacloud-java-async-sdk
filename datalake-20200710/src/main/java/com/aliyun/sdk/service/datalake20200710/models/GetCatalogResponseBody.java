// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>GetCatalogResponseBody</p>
 */
public class GetCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private Catalog catalog;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCatalogResponseBody(Builder builder) {
        this.catalog = builder.catalog;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogResponseBody create() {
        return builder().build();
    }

    /**
     * @return catalog
     */
    public Catalog getCatalog() {
        return this.catalog;
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
        private Catalog catalog; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Catalog.
         */
        public Builder catalog(Catalog catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCatalogResponseBody build() {
            return new GetCatalogResponseBody(this);
        } 

    } 

}

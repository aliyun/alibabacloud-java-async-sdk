// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListBaaSFabricOrganizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListBaaSFabricOrganizationResponseBody</p>
 */
public class ListBaaSFabricOrganizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBaaSFabricOrganizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaaSFabricOrganizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListBaaSFabricOrganizationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBaaSFabricOrganizationResponseBody build() {
            return new ListBaaSFabricOrganizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBaaSFabricOrganizationResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaaSFabricOrganizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaaSFabricOrganizationId")
        private String baaSFabricOrganizationId;

        @com.aliyun.core.annotation.NameInMap("BaaSFabricOrganizationName")
        private String baaSFabricOrganizationName;

        private Data(Builder builder) {
            this.baaSFabricOrganizationId = builder.baaSFabricOrganizationId;
            this.baaSFabricOrganizationName = builder.baaSFabricOrganizationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baaSFabricOrganizationId
         */
        public String getBaaSFabricOrganizationId() {
            return this.baaSFabricOrganizationId;
        }

        /**
         * @return baaSFabricOrganizationName
         */
        public String getBaaSFabricOrganizationName() {
            return this.baaSFabricOrganizationName;
        }

        public static final class Builder {
            private String baaSFabricOrganizationId; 
            private String baaSFabricOrganizationName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baaSFabricOrganizationId = model.baaSFabricOrganizationId;
                this.baaSFabricOrganizationName = model.baaSFabricOrganizationName;
            } 

            /**
             * BaaSFabricOrganizationId.
             */
            public Builder baaSFabricOrganizationId(String baaSFabricOrganizationId) {
                this.baaSFabricOrganizationId = baaSFabricOrganizationId;
                return this;
            }

            /**
             * BaaSFabricOrganizationName.
             */
            public Builder baaSFabricOrganizationName(String baaSFabricOrganizationName) {
                this.baaSFabricOrganizationName = baaSFabricOrganizationName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

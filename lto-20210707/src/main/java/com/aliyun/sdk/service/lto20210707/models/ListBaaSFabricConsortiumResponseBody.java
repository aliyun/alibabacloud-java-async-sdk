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
 * {@link ListBaaSFabricConsortiumResponseBody} extends {@link TeaModel}
 *
 * <p>ListBaaSFabricConsortiumResponseBody</p>
 */
public class ListBaaSFabricConsortiumResponseBody extends TeaModel {
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

    private ListBaaSFabricConsortiumResponseBody(Builder builder) {
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

    public static ListBaaSFabricConsortiumResponseBody create() {
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

        private Builder(ListBaaSFabricConsortiumResponseBody model) {
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

        public ListBaaSFabricConsortiumResponseBody build() {
            return new ListBaaSFabricConsortiumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBaaSFabricConsortiumResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaaSFabricConsortiumResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaaSFabricConsortiumId")
        private String baaSFabricConsortiumId;

        @com.aliyun.core.annotation.NameInMap("BaaSFabricConsortiumName")
        private String baaSFabricConsortiumName;

        private Data(Builder builder) {
            this.baaSFabricConsortiumId = builder.baaSFabricConsortiumId;
            this.baaSFabricConsortiumName = builder.baaSFabricConsortiumName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baaSFabricConsortiumId
         */
        public String getBaaSFabricConsortiumId() {
            return this.baaSFabricConsortiumId;
        }

        /**
         * @return baaSFabricConsortiumName
         */
        public String getBaaSFabricConsortiumName() {
            return this.baaSFabricConsortiumName;
        }

        public static final class Builder {
            private String baaSFabricConsortiumId; 
            private String baaSFabricConsortiumName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baaSFabricConsortiumId = model.baaSFabricConsortiumId;
                this.baaSFabricConsortiumName = model.baaSFabricConsortiumName;
            } 

            /**
             * BaaSFabricConsortiumId.
             */
            public Builder baaSFabricConsortiumId(String baaSFabricConsortiumId) {
                this.baaSFabricConsortiumId = baaSFabricConsortiumId;
                return this;
            }

            /**
             * BaaSFabricConsortiumName.
             */
            public Builder baaSFabricConsortiumName(String baaSFabricConsortiumName) {
                this.baaSFabricConsortiumName = baaSFabricConsortiumName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckTypesResponseBody</p>
 */
public class ListCheckTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCheckTypesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListCheckTypesResponseBody build() {
            return new ListCheckTypesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CheckType")
        private String checkType;

        @NameInMap("CheckTypeDisName")
        private String checkTypeDisName;

        private Data(Builder builder) {
            this.checkType = builder.checkType;
            this.checkTypeDisName = builder.checkTypeDisName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return checkTypeDisName
         */
        public String getCheckTypeDisName() {
            return this.checkTypeDisName;
        }

        public static final class Builder {
            private String checkType; 
            private String checkTypeDisName; 

            /**
             * CheckType.
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * CheckTypeDisName.
             */
            public Builder checkTypeDisName(String checkTypeDisName) {
                this.checkTypeDisName = checkTypeDisName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

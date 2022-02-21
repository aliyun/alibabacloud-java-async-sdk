// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
 */
public class QueryBatchRegisterDeviceStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryBatchRegisterDeviceStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchRegisterDeviceStatusResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryBatchRegisterDeviceStatusResponseBody build() {
            return new QueryBatchRegisterDeviceStatusResponseBody(this);
        } 

    } 

    public static class InvalidList extends TeaModel {
        @NameInMap("Name")
        private java.util.List < String > name;

        private InvalidList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public java.util.List < String > getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > name; 

            /**
             * Name.
             */
            public Builder name(java.util.List < String > name) {
                this.name = name;
                return this;
            }

            public InvalidList build() {
                return new InvalidList(this);
            } 

        } 

    }
    public static class ValidList extends TeaModel {
        @NameInMap("Name")
        private java.util.List < String > name;

        private ValidList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public java.util.List < String > getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > name; 

            /**
             * Name.
             */
            public Builder name(java.util.List < String > name) {
                this.name = name;
                return this;
            }

            public ValidList build() {
                return new ValidList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("InvalidList")
        private InvalidList invalidList;

        @NameInMap("Status")
        private String status;

        @NameInMap("ValidList")
        private ValidList validList;

        private Data(Builder builder) {
            this.invalidList = builder.invalidList;
            this.status = builder.status;
            this.validList = builder.validList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidList
         */
        public InvalidList getInvalidList() {
            return this.invalidList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validList
         */
        public ValidList getValidList() {
            return this.validList;
        }

        public static final class Builder {
            private InvalidList invalidList; 
            private String status; 
            private ValidList validList; 

            /**
             * InvalidList.
             */
            public Builder invalidList(InvalidList invalidList) {
                this.invalidList = invalidList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ValidList.
             */
            public Builder validList(ValidList validList) {
                this.validList = validList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

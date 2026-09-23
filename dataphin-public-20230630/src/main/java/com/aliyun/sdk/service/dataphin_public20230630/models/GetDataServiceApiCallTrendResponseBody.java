// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataServiceApiCallTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiCallTrendResponseBody</p>
 */
public class GetDataServiceApiCallTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceApiCallTrendResponseBody(Builder builder) {
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

    public static GetDataServiceApiCallTrendResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceApiCallTrendResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The access trend data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataServiceApiCallTrendResponseBody build() {
            return new GetDataServiceApiCallTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceApiCallTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiCallTrendResponseBody</p>
     */
    public static class CallErrorImpactTrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiIdList")
        private java.util.List<Long> apiIdList;

        @com.aliyun.core.annotation.NameInMap("ErrorApiCount")
        private Integer errorApiCount;

        @com.aliyun.core.annotation.NameInMap("ErrorAppCount")
        private Integer errorAppCount;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private String minute;

        private CallErrorImpactTrendList(Builder builder) {
            this.apiIdList = builder.apiIdList;
            this.errorApiCount = builder.errorApiCount;
            this.errorAppCount = builder.errorAppCount;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallErrorImpactTrendList create() {
            return builder().build();
        }

        /**
         * @return apiIdList
         */
        public java.util.List<Long> getApiIdList() {
            return this.apiIdList;
        }

        /**
         * @return errorApiCount
         */
        public Integer getErrorApiCount() {
            return this.errorApiCount;
        }

        /**
         * @return errorAppCount
         */
        public Integer getErrorAppCount() {
            return this.errorAppCount;
        }

        /**
         * @return minute
         */
        public String getMinute() {
            return this.minute;
        }

        public static final class Builder {
            private java.util.List<Long> apiIdList; 
            private Integer errorApiCount; 
            private Integer errorAppCount; 
            private String minute; 

            private Builder() {
            } 

            private Builder(CallErrorImpactTrendList model) {
                this.apiIdList = model.apiIdList;
                this.errorApiCount = model.errorApiCount;
                this.errorAppCount = model.errorAppCount;
                this.minute = model.minute;
            } 

            /**
             * <p>The API IDs.</p>
             */
            public Builder apiIdList(java.util.List<Long> apiIdList) {
                this.apiIdList = apiIdList;
                return this;
            }

            /**
             * <p>The number of APIs with call errors.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder errorApiCount(Integer errorApiCount) {
                this.errorApiCount = errorApiCount;
                return this;
            }

            /**
             * <p>The number of affected applications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorAppCount(Integer errorAppCount) {
                this.errorAppCount = errorAppCount;
                return this;
            }

            /**
             * <p>The time scale in minutes, in the format of yyyy-MM-dd HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 08:00</p>
             */
            public Builder minute(String minute) {
                this.minute = minute;
                return this;
            }

            public CallErrorImpactTrendList build() {
                return new CallErrorImpactTrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiCallTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiCallTrendResponseBody</p>
     */
    public static class CallErrorTrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private String minute;

        private CallErrorTrendList(Builder builder) {
            this.callCount = builder.callCount;
            this.errorCount = builder.errorCount;
            this.minute = builder.minute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallErrorTrendList create() {
            return builder().build();
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return minute
         */
        public String getMinute() {
            return this.minute;
        }

        public static final class Builder {
            private Long callCount; 
            private Long errorCount; 
            private String minute; 

            private Builder() {
            } 

            private Builder(CallErrorTrendList model) {
                this.callCount = model.callCount;
                this.errorCount = model.errorCount;
                this.minute = model.minute;
            } 

            /**
             * <p>The number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * <p>The number of call errors.</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The minute in the format of yyyy_MMdd_HHmm.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder minute(String minute) {
                this.minute = minute;
                return this;
            }

            public CallErrorTrendList build() {
                return new CallErrorTrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiCallTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiCallTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallErrorImpactTrendList")
        private java.util.List<CallErrorImpactTrendList> callErrorImpactTrendList;

        @com.aliyun.core.annotation.NameInMap("CallErrorTrendList")
        private java.util.List<CallErrorTrendList> callErrorTrendList;

        private Data(Builder builder) {
            this.callErrorImpactTrendList = builder.callErrorImpactTrendList;
            this.callErrorTrendList = builder.callErrorTrendList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callErrorImpactTrendList
         */
        public java.util.List<CallErrorImpactTrendList> getCallErrorImpactTrendList() {
            return this.callErrorImpactTrendList;
        }

        /**
         * @return callErrorTrendList
         */
        public java.util.List<CallErrorTrendList> getCallErrorTrendList() {
            return this.callErrorTrendList;
        }

        public static final class Builder {
            private java.util.List<CallErrorImpactTrendList> callErrorImpactTrendList; 
            private java.util.List<CallErrorTrendList> callErrorTrendList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callErrorImpactTrendList = model.callErrorImpactTrendList;
                this.callErrorTrendList = model.callErrorTrendList;
            } 

            /**
             * <p>The call error impact trends, sorted by minute in ascending order.</p>
             */
            public Builder callErrorImpactTrendList(java.util.List<CallErrorImpactTrendList> callErrorImpactTrendList) {
                this.callErrorImpactTrendList = callErrorImpactTrendList;
                return this;
            }

            /**
             * <p>The call error trends, sorted by minute in ascending order.</p>
             */
            public Builder callErrorTrendList(java.util.List<CallErrorTrendList> callErrorTrendList) {
                this.callErrorTrendList = callErrorTrendList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

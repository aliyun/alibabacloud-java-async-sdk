// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClientIdsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClientIdsResponseBody</p>
 */
public class QueryClientIdsResponseBody extends TeaModel {
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

    private QueryClientIdsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClientIdsResponseBody create() {
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

        public QueryClientIdsResponseBody build() {
            return new QueryClientIdsResponseBody(this);
        } 

    } 

    public static class DynamicRegClientIds extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreateTime")
        private Long createTime;

        private DynamicRegClientIds(Builder builder) {
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicRegClientIds create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private String clientId; 
            private Long createTime; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            public DynamicRegClientIds build() {
                return new DynamicRegClientIds(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DynamicRegClientIds")
        private java.util.List < DynamicRegClientIds> dynamicRegClientIds;

        @NameInMap("IotId")
        private String iotId;

        private Data(Builder builder) {
            this.dynamicRegClientIds = builder.dynamicRegClientIds;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dynamicRegClientIds
         */
        public java.util.List < DynamicRegClientIds> getDynamicRegClientIds() {
            return this.dynamicRegClientIds;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private java.util.List < DynamicRegClientIds> dynamicRegClientIds; 
            private String iotId; 

            /**
             * DynamicRegClientIds.
             */
            public Builder dynamicRegClientIds(java.util.List < DynamicRegClientIds> dynamicRegClientIds) {
                this.dynamicRegClientIds = dynamicRegClientIds;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

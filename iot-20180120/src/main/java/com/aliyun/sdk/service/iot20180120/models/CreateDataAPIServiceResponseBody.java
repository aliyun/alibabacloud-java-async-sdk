// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateDataAPIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataAPIServiceResponseBody</p>
 */
public class CreateDataAPIServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDataAPIServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAPIServiceResponseBody create() {
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

        private Builder() {
        } 

        private Builder(CreateDataAPIServiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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

        public CreateDataAPIServiceResponseBody build() {
            return new CreateDataAPIServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataAPIServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDataAPIServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiSrn")
        private String apiSrn;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        private Data(Builder builder) {
            this.apiSrn = builder.apiSrn;
            this.createTime = builder.createTime;
            this.lastUpdateTime = builder.lastUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiSrn
         */
        public String getApiSrn() {
            return this.apiSrn;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public static final class Builder {
            private String apiSrn; 
            private Long createTime; 
            private Long lastUpdateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiSrn = model.apiSrn;
                this.createTime = model.createTime;
                this.lastUpdateTime = model.lastUpdateTime;
            } 

            /**
             * ApiSrn.
             */
            public Builder apiSrn(String apiSrn) {
                this.apiSrn = apiSrn;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

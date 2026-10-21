// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link QueryAsyncTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAsyncTaskResultResponseBody</p>
 */
public class QueryAsyncTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAsyncTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAsyncTaskResultResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAsyncTaskResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is not returned when the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the asynchronous task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned when the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values: true: The call is successful. false: The call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAsyncTaskResultResponseBody build() {
            return new QueryAsyncTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAsyncTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAsyncTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, ?> usageMap;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, ?> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private String bizId; 
            private String result; 
            private String status; 
            private String taskId; 
            private java.util.Map<String, ?> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizId = model.bizId;
                this.result = model.result;
                this.status = model.status;
                this.taskId = model.taskId;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>order-20260928-001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The task result.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;url\&quot;:\&quot;<a href="https://aidge-bailian-oss.oss-cn-beijing.aliyuncs.com/gaolinfeng/pdf_trans/translated_en.pdf?security-token=CAISzwJ1q6Ft5B2yfSjIr5ntKv7urOdn9YTeaVbb1lQRfcxi2Kz%2BgDz2IHhMeHFgAeAbs%2Fw%2Fm29W6v4SlqZdVplOWU3Da%2BB364xK7Q754wRDcULuv9I%2Bk5SANTW5KXyShb3%2FAYjQSNfaZY3eCTTtnTNyxr3XbCirW0ffX7SClZ9gaKZ8PGD6F00kYu1bPQx%2FssQXGGLMPPK2SH7Qj3HXEVBjt3gX6wo9y9zmk53FsUWA1QKmlr9F%2BdWhGPX%2BMZkwZqUYesyuwel7epDG1CNt8BVQ%2FM909vccoWuf7onNXgQJs0rZbbaMoscSJQ51aaV%2FFaUBt%2FXmi%2Fxzt6nJkID626jAvGbZzsW0rumBtyikcIvBXr5RHT3rIrVAU%2BuEf19557bo3dbfkNdWOrtHZDY5Qn9nURKxAbSEg2uBaWTIIJPmvc97r9wbhjuH87JeC0jQHt3xuRqAATp5EbLOeo%2BZktMLbi%2FUsZgcvdIEIv3tPBCYfyJnh%2Bj6U8IyaLKQYHQBtjsfyMngFfS09jFdjBcUebzvYJs21gyU5u%2FZ9SeReh%2FacuIMVoggWy3o9Y%2BnBA2QPCcKqVM7XlwriM%2FJOAyhvj%2Bjtj7BUoyD%2BrSgF5brq5ykjN7t2U7oIAA%3D&OSSAccessKeyId=STS.NZXaDZA8FBF5kpj2TDqCN7iUb&Expires=1780315869&Signature=CdbMkhcED4Ovhw438ZVe5nzU1mk%3D%5C%5C%22%7D">https://aidge-bailian-oss.oss-cn-beijing.aliyuncs.com/gaolinfeng/pdf_trans/translated_en.pdf?security-token=CAISzwJ1q6Ft5B2yfSjIr5ntKv7urOdn9YTeaVbb1lQRfcxi2Kz%2BgDz2IHhMeHFgAeAbs%2Fw%2Fm29W6v4SlqZdVplOWU3Da%2BB364xK7Q754wRDcULuv9I%2Bk5SANTW5KXyShb3%2FAYjQSNfaZY3eCTTtnTNyxr3XbCirW0ffX7SClZ9gaKZ8PGD6F00kYu1bPQx%2FssQXGGLMPPK2SH7Qj3HXEVBjt3gX6wo9y9zmk53FsUWA1QKmlr9F%2BdWhGPX%2BMZkwZqUYesyuwel7epDG1CNt8BVQ%2FM909vccoWuf7onNXgQJs0rZbbaMoscSJQ51aaV%2FFaUBt%2FXmi%2Fxzt6nJkID626jAvGbZzsW0rumBtyikcIvBXr5RHT3rIrVAU%2BuEf19557bo3dbfkNdWOrtHZDY5Qn9nURKxAbSEg2uBaWTIIJPmvc97r9wbhjuH87JeC0jQHt3xuRqAATp5EbLOeo%2BZktMLbi%2FUsZgcvdIEIv3tPBCYfyJnh%2Bj6U8IyaLKQYHQBtjsfyMngFfS09jFdjBcUebzvYJs21gyU5u%2FZ9SeReh%2FacuIMVoggWy3o9Y%2BnBA2QPCcKqVM7XlwriM%2FJOAyhvj%2Bjtj7BUoyD%2BrSgF5brq5ykjN7t2U7oIAA%3D&amp;OSSAccessKeyId=STS.NZXaDZA8FBF5kpj2TDqCN7iUb&amp;Expires=1780315869&amp;Signature=CdbMkhcED4Ovhw438ZVe5nzU1mk%3D\\&quot;}</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the downstream task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-xxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The usage information.</p>
             */
            public Builder usageMap(java.util.Map<String, ?> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

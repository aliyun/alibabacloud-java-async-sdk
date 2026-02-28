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
 * {@link QueryClientIdsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClientIdsResponseBody</p>
 */
public class QueryClientIdsResponseBody extends TeaModel {
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

        private Builder(QueryClientIdsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ClientIDs returned if the call is successful. For more information, see <strong>DynamicRegClientIds</strong>.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>89F22330-BAEE-<strong><strong>-</strong></strong>-41BA46D6E267</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClientIdsResponseBody build() {
            return new QueryClientIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryClientIdsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClientIdsResponseBody</p>
     */
    public static class DynamicRegClientIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
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

            private Builder() {
            } 

            private Builder(DynamicRegClientIds model) {
                this.clientId = model.clientId;
                this.createTime = model.createTime;
            } 

            /**
             * <p>The ClientID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>9rSzYt4js92********f000112</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The time when the ClientID was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1636514022424</p>
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
    /**
     * 
     * {@link QueryClientIdsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClientIdsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DynamicRegClientIds")
        private java.util.List<DynamicRegClientIds> dynamicRegClientIds;

        @com.aliyun.core.annotation.NameInMap("IotId")
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
        public java.util.List<DynamicRegClientIds> getDynamicRegClientIds() {
            return this.dynamicRegClientIds;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private java.util.List<DynamicRegClientIds> dynamicRegClientIds; 
            private String iotId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dynamicRegClientIds = model.dynamicRegClientIds;
                this.iotId = model.iotId;
            } 

            /**
             * <p>The list of ClientIDs.</p>
             */
            public Builder dynamicRegClientIds(java.util.List<DynamicRegClientIds> dynamicRegClientIds) {
                this.dynamicRegClientIds = dynamicRegClientIds;
                return this;
            }

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>y4u2weAI********HMle1234</p>
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

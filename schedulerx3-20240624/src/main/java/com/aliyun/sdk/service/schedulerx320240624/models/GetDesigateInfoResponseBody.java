// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetDesigateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDesigateInfoResponseBody</p>
 */
public class GetDesigateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDesigateInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDesigateInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDesigateInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter check error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1DF6732E-15D8-5E1F-95E3-C10077F556B5</p>
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

        public GetDesigateInfoResponseBody build() {
            return new GetDesigateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDesigateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDesigateInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesignateType")
        private Integer designateType;

        @com.aliyun.core.annotation.NameInMap("Transferable")
        private Boolean transferable;

        private Data(Builder builder) {
            this.designateType = builder.designateType;
            this.transferable = builder.transferable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return designateType
         */
        public Integer getDesignateType() {
            return this.designateType;
        }

        /**
         * @return transferable
         */
        public Boolean getTransferable() {
            return this.transferable;
        }

        public static final class Builder {
            private Integer designateType; 
            private Boolean transferable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.designateType = model.designateType;
                this.transferable = model.transferable;
            } 

            /**
             * <p>The type of the specified machine. Valid values:</p>
             * <ul>
             * <li>1: worker.</li>
             * <li>2: label.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder designateType(Integer designateType) {
                this.designateType = designateType;
                return this;
            }

            /**
             * <p>Indicates whether failover is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder transferable(Boolean transferable) {
                this.transferable = transferable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

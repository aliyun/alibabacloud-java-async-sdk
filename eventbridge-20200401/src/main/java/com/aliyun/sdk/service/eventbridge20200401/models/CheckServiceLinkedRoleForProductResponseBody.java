// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CheckServiceLinkedRoleForProductResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleForProductResponseBody</p>
 */
public class CheckServiceLinkedRoleForProductResponseBody extends TeaModel {
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

    private CheckServiceLinkedRoleForProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleForProductResponseBody create() {
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

        private Builder(CheckServiceLinkedRoleForProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
        public Builder data(Data data) {
            this.data = data;
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

        public CheckServiceLinkedRoleForProductResponseBody build() {
            return new CheckServiceLinkedRoleForProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckServiceLinkedRoleForProductResponseBody} extends {@link TeaModel}
     *
     * <p>CheckServiceLinkedRoleForProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckPass")
        private Boolean checkPass;

        @com.aliyun.core.annotation.NameInMap("StsRoleName")
        private String stsRoleName;

        private Data(Builder builder) {
            this.checkPass = builder.checkPass;
            this.stsRoleName = builder.stsRoleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkPass
         */
        public Boolean getCheckPass() {
            return this.checkPass;
        }

        /**
         * @return stsRoleName
         */
        public String getStsRoleName() {
            return this.stsRoleName;
        }

        public static final class Builder {
            private Boolean checkPass; 
            private String stsRoleName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkPass = model.checkPass;
                this.stsRoleName = model.stsRoleName;
            } 

            /**
             * CheckPass.
             */
            public Builder checkPass(Boolean checkPass) {
                this.checkPass = checkPass;
                return this;
            }

            /**
             * StsRoleName.
             */
            public Builder stsRoleName(String stsRoleName) {
                this.stsRoleName = stsRoleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

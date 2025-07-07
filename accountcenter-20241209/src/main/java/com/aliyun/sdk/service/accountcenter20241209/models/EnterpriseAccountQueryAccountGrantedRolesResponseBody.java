// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountQueryAccountGrantedRolesResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseAccountQueryAccountGrantedRolesResponseBody</p>
 */
public class EnterpriseAccountQueryAccountGrantedRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseAccountQueryAccountGrantedRolesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountQueryAccountGrantedRolesResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseAccountQueryAccountGrantedRolesResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public EnterpriseAccountQueryAccountGrantedRolesResponseBody build() {
            return new EnterpriseAccountQueryAccountGrantedRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseAccountQueryAccountGrantedRolesResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseAccountQueryAccountGrantedRolesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizRoleCode")
        private String bizRoleCode;

        @com.aliyun.core.annotation.NameInMap("BizRoleName")
        private String bizRoleName;

        private Data(Builder builder) {
            this.bizRoleCode = builder.bizRoleCode;
            this.bizRoleName = builder.bizRoleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizRoleCode
         */
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        /**
         * @return bizRoleName
         */
        public String getBizRoleName() {
            return this.bizRoleName;
        }

        public static final class Builder {
            private String bizRoleCode; 
            private String bizRoleName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizRoleCode = model.bizRoleCode;
                this.bizRoleName = model.bizRoleName;
            } 

            /**
             * BizRoleCode.
             */
            public Builder bizRoleCode(String bizRoleCode) {
                this.bizRoleCode = bizRoleCode;
                return this;
            }

            /**
             * BizRoleName.
             */
            public Builder bizRoleName(String bizRoleName) {
                this.bizRoleName = bizRoleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectOptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectOptionResponseBody</p>
 */
public class GetProjectOptionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private GetProjectOptionResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectOptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return object
     */
    public java.util.List < Object> getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(java.util.List < Object> object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public GetProjectOptionResponseBody build() {
            return new GetProjectOptionResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Kind")
        private String kind;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScopeName")
        private String scopeName;

        @NameInMap("Value")
        private String value;

        private Object(Builder builder) {
            this.kind = builder.kind;
            this.name = builder.name;
            this.scopeName = builder.scopeName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scopeName
         */
        public String getScopeName() {
            return this.scopeName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String kind; 
            private String name; 
            private String scopeName; 
            private String value; 

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ScopeName.
             */
            public Builder scopeName(String scopeName) {
                this.scopeName = scopeName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopsPolicyGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopsPolicyGroupResponseBody</p>
 */
public class ModifyDesktopsPolicyGroupResponseBody extends TeaModel {
    @NameInMap("ModifyResults")
    private java.util.List < ModifyResults> modifyResults;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopsPolicyGroupResponseBody(Builder builder) {
        this.modifyResults = builder.modifyResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopsPolicyGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return modifyResults
     */
    public java.util.List < ModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ModifyResults> modifyResults; 
        private String requestId; 

        /**
         * ModifyResults.
         */
        public Builder modifyResults(java.util.List < ModifyResults> modifyResults) {
            this.modifyResults = modifyResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopsPolicyGroupResponseBody build() {
            return new ModifyDesktopsPolicyGroupResponseBody(this);
        } 

    } 

    public static class ModifyResults extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("Message")
        private String message;

        private ModifyResults(Builder builder) {
            this.code = builder.code;
            this.desktopId = builder.desktopId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyResults create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String desktopId; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ModifyResults build() {
                return new ModifyResults(this);
            } 

        } 

    }
}

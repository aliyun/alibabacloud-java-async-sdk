// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopsPolicyGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopsPolicyGroupResponseBody</p>
 */
public class ModifyDesktopsPolicyGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyResults")
    private java.util.List<ModifyResults> modifyResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ModifyResults> modifyResults; 
        private String requestId; 

        /**
         * <p>The request results.</p>
         */
        public Builder modifyResults(java.util.List<ModifyResults> modifyResults) {
            this.modifyResults = modifyResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopsPolicyGroupResponseBody build() {
            return new ModifyDesktopsPolicyGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDesktopsPolicyGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDesktopsPolicyGroupResponseBody</p>
     */
    public static class ModifyResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("Message")
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
             * <p>The returned message. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7w78ozhjcwa3u****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The error message returned if the request failed. This parameter is not returned if the value of Code is success.``</p>
             * 
             * <strong>example:</strong>
             * <p>The specified param DesktopId ecd-ia2zw38bi6cm7**** is not found.</p>
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

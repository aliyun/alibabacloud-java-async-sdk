// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>RebuildDesktopsResponseBody</p>
 */
public class RebuildDesktopsResponseBody extends TeaModel {
    @NameInMap("RebuildResults")
    private java.util.List < RebuildResults> rebuildResults;

    @NameInMap("RequestId")
    private String requestId;

    private RebuildDesktopsResponseBody(Builder builder) {
        this.rebuildResults = builder.rebuildResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildDesktopsResponseBody create() {
        return builder().build();
    }

    /**
     * @return rebuildResults
     */
    public java.util.List < RebuildResults> getRebuildResults() {
        return this.rebuildResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RebuildResults> rebuildResults; 
        private String requestId; 

        /**
         * RebuildDesktops
         */
        public Builder rebuildResults(java.util.List < RebuildResults> rebuildResults) {
            this.rebuildResults = rebuildResults;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **RebuildDesktops**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RebuildDesktopsResponseBody build() {
            return new RebuildDesktopsResponseBody(this);
        } 

    } 

    public static class RebuildResults extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("Message")
        private String message;

        private RebuildResults(Builder builder) {
            this.code = builder.code;
            this.desktopId = builder.desktopId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RebuildResults create() {
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

            public RebuildResults build() {
                return new RebuildResults(this);
            } 

        } 

    }
}

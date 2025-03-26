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
 * {@link RebuildDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>RebuildDesktopsResponseBody</p>
 */
public class RebuildDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RebuildResults")
    private java.util.List<RebuildResults> rebuildResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rebuildResults
     */
    public java.util.List<RebuildResults> getRebuildResults() {
        return this.rebuildResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RebuildResults> rebuildResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RebuildDesktopsResponseBody model) {
            this.rebuildResults = model.rebuildResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The recreation results.</p>
         */
        public Builder rebuildResults(java.util.List<RebuildResults> rebuildResults) {
            this.rebuildResults = rebuildResults;
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

        public RebuildDesktopsResponseBody build() {
            return new RebuildDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RebuildDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>RebuildDesktopsResponseBody</p>
     */
    public static class RebuildResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("Message")
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

            private Builder() {
            } 

            private Builder(RebuildResults model) {
                this.code = model.code;
                this.desktopId = model.desktopId;
                this.message = model.message;
            } 

            /**
             * <p>The recreation result code. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>IncorrectDesktopStatus</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The IDs of the cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The error message. This parameter is invalid if the value of <code>Code</code> is <code>success</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>The current status of the desktop does not support this operation.</p>
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

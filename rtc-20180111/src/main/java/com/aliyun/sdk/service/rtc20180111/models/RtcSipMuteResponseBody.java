// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link RtcSipMuteResponseBody} extends {@link TeaModel}
 *
 * <p>RtcSipMuteResponseBody</p>
 */
public class RtcSipMuteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrTracks")
    private java.util.List<ErrTracks> errTracks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RtcSipMuteResponseBody(Builder builder) {
        this.errTracks = builder.errTracks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RtcSipMuteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errTracks
     */
    public java.util.List<ErrTracks> getErrTracks() {
        return this.errTracks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ErrTracks> errTracks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RtcSipMuteResponseBody model) {
            this.errTracks = model.errTracks;
            this.requestId = model.requestId;
        } 

        /**
         * ErrTracks.
         */
        public Builder errTracks(java.util.List<ErrTracks> errTracks) {
            this.errTracks = errTracks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RtcSipMuteResponseBody build() {
            return new RtcSipMuteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RtcSipMuteResponseBody} extends {@link TeaModel}
     *
     * <p>RtcSipMuteResponseBody</p>
     */
    public static class ErrTracks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        private ErrTracks(Builder builder) {
            this.errMsg = builder.errMsg;
            this.id = builder.id;
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrTracks create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private String errMsg; 
            private String id; 
            private String operationId; 

            private Builder() {
            } 

            private Builder(ErrTracks model) {
                this.errMsg = model.errMsg;
                this.id = model.id;
                this.operationId = model.operationId;
            } 

            /**
             * <p>ErrMsg。</p>
             * 
             * <strong>example:</strong>
             * <p>participant does not existed.</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>OperationId。</p>
             * 
             * <strong>example:</strong>
             * <p>12122121</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public ErrTracks build() {
                return new ErrTracks(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link SaveOrderRelationInfoToMsenceResponseBody} extends {@link TeaModel}
 *
 * <p>SaveOrderRelationInfoToMsenceResponseBody</p>
 */
public class SaveOrderRelationInfoToMsenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasSaveOrderRelationResponse")
    private MpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SaveOrderRelationInfoToMsenceResponseBody(Builder builder) {
        this.mpaasSaveOrderRelationResponse = builder.mpaasSaveOrderRelationResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveOrderRelationInfoToMsenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasSaveOrderRelationResponse
     */
    public MpaasSaveOrderRelationResponse getMpaasSaveOrderRelationResponse() {
        return this.mpaasSaveOrderRelationResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveOrderRelationInfoToMsenceResponseBody model) {
            this.mpaasSaveOrderRelationResponse = model.mpaasSaveOrderRelationResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasSaveOrderRelationResponse.
         */
        public Builder mpaasSaveOrderRelationResponse(MpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse) {
            this.mpaasSaveOrderRelationResponse = mpaasSaveOrderRelationResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SaveOrderRelationInfoToMsenceResponseBody build() {
            return new SaveOrderRelationInfoToMsenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SaveOrderRelationInfoToMsenceResponseBody} extends {@link TeaModel}
     *
     * <p>SaveOrderRelationInfoToMsenceResponseBody</p>
     */
    public static class MpaasSaveOrderRelationResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private MpaasSaveOrderRelationResponse(Builder builder) {
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasSaveOrderRelationResponse create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Boolean success; 

            private Builder() {
            } 

            private Builder(MpaasSaveOrderRelationResponse model) {
                this.success = model.success;
            } 

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public MpaasSaveOrderRelationResponse build() {
                return new MpaasSaveOrderRelationResponse(this);
            } 

        } 

    }
}

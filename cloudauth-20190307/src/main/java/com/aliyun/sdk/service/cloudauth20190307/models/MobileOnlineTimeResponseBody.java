// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link MobileOnlineTimeResponseBody} extends {@link TeaModel}
 *
 * <p>MobileOnlineTimeResponseBody</p>
 */
public class MobileOnlineTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private MobileOnlineTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileOnlineTimeResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(MobileOnlineTimeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public MobileOnlineTimeResponseBody build() {
            return new MobileOnlineTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MobileOnlineTimeResponseBody} extends {@link TeaModel}
     *
     * <p>MobileOnlineTimeResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("TimeCode")
        private String timeCode;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.ispName = builder.ispName;
            this.timeCode = builder.timeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return timeCode
         */
        public String getTimeCode() {
            return this.timeCode;
        }

        public static final class Builder {
            private String bizCode; 
            private String ispName; 
            private String timeCode; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.ispName = model.ispName;
                this.timeCode = model.timeCode;
            } 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * TimeCode.
             */
            public Builder timeCode(String timeCode) {
                this.timeCode = timeCode;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}

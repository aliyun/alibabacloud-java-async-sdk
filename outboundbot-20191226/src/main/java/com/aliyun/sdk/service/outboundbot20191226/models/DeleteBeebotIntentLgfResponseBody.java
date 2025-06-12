// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteBeebotIntentLgfResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBeebotIntentLgfResponseBody</p>
 */
public class DeleteBeebotIntentLgfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeebotRequestId")
    private String beebotRequestId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LgfId")
    private Long lgfId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteBeebotIntentLgfResponseBody(Builder builder) {
        this.beebotRequestId = builder.beebotRequestId;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.lgfId = builder.lgfId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBeebotIntentLgfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beebotRequestId
     */
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return lgfId
     */
    public Long getLgfId() {
        return this.lgfId;
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
        private String beebotRequestId; 
        private String code; 
        private Integer httpStatusCode; 
        private Long lgfId; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteBeebotIntentLgfResponseBody model) {
            this.beebotRequestId = model.beebotRequestId;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.lgfId = model.lgfId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * BeebotRequestId.
         */
        public Builder beebotRequestId(String beebotRequestId) {
            this.beebotRequestId = beebotRequestId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LgfId.
         */
        public Builder lgfId(Long lgfId) {
            this.lgfId = lgfId;
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

        public DeleteBeebotIntentLgfResponseBody build() {
            return new DeleteBeebotIntentLgfResponseBody(this);
        } 

    } 

}

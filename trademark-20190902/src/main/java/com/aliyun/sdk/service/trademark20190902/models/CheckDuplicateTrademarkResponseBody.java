// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDuplicateTrademarkResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDuplicateTrademarkResponseBody</p>
 */
public class CheckDuplicateTrademarkResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DuplicateTrademark")
    private String duplicateTrademark;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
    private String type;

    private CheckDuplicateTrademarkResponseBody(Builder builder) {
        this.code = builder.code;
        this.duplicateTrademark = builder.duplicateTrademark;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDuplicateTrademarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return duplicateTrademark
     */
    public String getDuplicateTrademark() {
        return this.duplicateTrademark;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String code; 
        private String duplicateTrademark; 
        private String message; 
        private String requestId; 
        private String type; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DuplicateTrademark.
         */
        public Builder duplicateTrademark(String duplicateTrademark) {
            this.duplicateTrademark = duplicateTrademark;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CheckDuplicateTrademarkResponseBody build() {
            return new CheckDuplicateTrademarkResponseBody(this);
        } 

    } 

}

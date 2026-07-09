// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link DetectImageBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageBasicInfoResponseBody</p>
 */
public class DetectImageBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Dpi")
    private String dpi;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DetectImageBasicInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.dpi = builder.dpi;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageBasicInfoResponseBody create() {
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
     * @return dpi
     */
    public String getDpi() {
        return this.dpi;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String code; 
        private String dpi; 
        private Integer httpStatusCode; 
        private String message; 
        private String name; 
        private String requestId; 
        private String size; 
        private Boolean success; 
        private String type; 

        private Builder() {
        } 

        private Builder(DetectImageBasicInfoResponseBody model) {
            this.code = model.code;
            this.dpi = model.dpi;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
            this.type = model.type;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Dpi.
         */
        public Builder dpi(String dpi) {
            this.dpi = dpi;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DetectImageBasicInfoResponseBody build() {
            return new DetectImageBasicInfoResponseBody(this);
        } 

    } 

}

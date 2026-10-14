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
         * <p>The business error code. Returns &quot;OK&quot; when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The image resolution (width × height), such as 1920 × 1080. Empty if the resolution cannot be identified.</p>
         * 
         * <strong>example:</strong>
         * <p>2048 * 2048</p>
         */
        public Builder dpi(String dpi) {
            this.dpi = dpi;
            return this;
        }

        /**
         * <p>The HTTP status code. Returns 200 when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The additional information. Returns &quot;success&quot; when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>photo.jpg</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The file size in a human-readable format, such as 1.5 MB or 256 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>2.3 MB</p>
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The image format, such as JPEG, PNG, GIF, or WEBP. Returns <code>UNKNOWN</code> if the format cannot be identified.</p>
         * 
         * <strong>example:</strong>
         * <p>PNG</p>
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

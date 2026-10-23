// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ClearAutoMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>ClearAutoMemoryResponseBody</p>
 */
public class ClearAutoMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clearedCount")
    private Long clearedCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ClearAutoMemoryResponseBody(Builder builder) {
        this.clearedCount = builder.clearedCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAutoMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clearedCount
     */
    public Long getClearedCount() {
        return this.clearedCount;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long clearedCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(ClearAutoMemoryResponseBody model) {
            this.clearedCount = model.clearedCount;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * <p>The number of automatic memory files successfully deleted in this request. The value is 0 if no memory is available to be cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder clearedCount(Long clearedCount) {
            this.clearedCount = clearedCount;
            return this;
        }

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The current user is not an active member of the group cg_12345</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of automatic memory cleared in this request. Valid values: user, feedback, reference, project, and all.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ClearAutoMemoryResponseBody build() {
            return new ClearAutoMemoryResponseBody(this);
        } 

    } 

}

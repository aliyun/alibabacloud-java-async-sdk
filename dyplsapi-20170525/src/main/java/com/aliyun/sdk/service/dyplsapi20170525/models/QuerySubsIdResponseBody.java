// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QuerySubsIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySubsIdResponseBody</p>
 */
public class QuerySubsIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubsId")
    private String subsId;

    private QuerySubsIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subsId = builder.subsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubsIdResponseBody create() {
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
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String subsId; 

        private Builder() {
        } 

        private Builder(QuerySubsIdResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.subsId = model.subsId;
        } 

        /**
         * <p>The response code. The value OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7F99446-8191-43C0-99B5-F58A6AEAD779</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The binding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111****</p>
         */
        public Builder subsId(String subsId) {
            this.subsId = subsId;
            return this;
        }

        public QuerySubsIdResponseBody build() {
            return new QuerySubsIdResponseBody(this);
        } 

    } 

}

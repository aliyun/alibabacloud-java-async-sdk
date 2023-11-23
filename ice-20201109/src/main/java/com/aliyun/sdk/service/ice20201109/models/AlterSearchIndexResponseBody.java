// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlterSearchIndexResponseBody} extends {@link TeaModel}
 *
 * <p>AlterSearchIndexResponseBody</p>
 */
public class AlterSearchIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private AlterSearchIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterSearchIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public AlterSearchIndexResponseBody build() {
            return new AlterSearchIndexResponseBody(this);
        } 

    } 

}

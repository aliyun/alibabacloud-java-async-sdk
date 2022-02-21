// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableVersionResponseBody</p>
 */
public class GetTableVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableVersion")
    private TableVersion tableVersion;

    private GetTableVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableVersion = builder.tableVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableVersionResponseBody create() {
        return builder().build();
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tableVersion
     */
    public TableVersion getTableVersion() {
        return this.tableVersion;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TableVersion tableVersion; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TableVersion.
         */
        public Builder tableVersion(TableVersion tableVersion) {
            this.tableVersion = tableVersion;
            return this;
        }

        public GetTableVersionResponseBody build() {
            return new GetTableVersionResponseBody(this);
        } 

    } 

}

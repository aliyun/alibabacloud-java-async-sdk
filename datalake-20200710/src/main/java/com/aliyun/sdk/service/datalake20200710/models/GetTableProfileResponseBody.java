// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableProfileResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableProfileResponseBody</p>
 */
public class GetTableProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableProfile")
    private TableProfile tableProfile;

    private GetTableProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableProfile = builder.tableProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableProfileResponseBody create() {
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
     * @return tableProfile
     */
    public TableProfile getTableProfile() {
        return this.tableProfile;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TableProfile tableProfile; 

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

        /**
         * TableProfile.
         */
        public Builder tableProfile(TableProfile tableProfile) {
            this.tableProfile = tableProfile;
            return this;
        }

        public GetTableProfileResponseBody build() {
            return new GetTableProfileResponseBody(this);
        } 

    } 

}

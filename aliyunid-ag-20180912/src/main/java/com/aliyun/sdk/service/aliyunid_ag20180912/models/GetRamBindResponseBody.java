// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunid_ag20180912.models;

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
 * {@link GetRamBindResponseBody} extends {@link TeaModel}
 *
 * <p>GetRamBindResponseBody</p>
 */
public class GetRamBindResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RamBindDto")
    private RamBindDto ramBindDto;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRamBindResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.ramBindDto = builder.ramBindDto;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRamBindResponseBody create() {
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
     * @return ramBindDto
     */
    public RamBindDto getRamBindDto() {
        return this.ramBindDto;
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
        private String code; 
        private String message; 
        private RamBindDto ramBindDto; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRamBindResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.ramBindDto = model.ramBindDto;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * RamBindDto.
         */
        public Builder ramBindDto(RamBindDto ramBindDto) {
            this.ramBindDto = ramBindDto;
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

        public GetRamBindResponseBody build() {
            return new GetRamBindResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRamBindResponseBody} extends {@link TeaModel}
     *
     * <p>GetRamBindResponseBody</p>
     */
    public static class RamBindDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private RamBindDto(Builder builder) {
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamBindDto create() {
            return builder().build();
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String roleName; 

            private Builder() {
            } 

            private Builder(RamBindDto model) {
                this.roleName = model.roleName;
            } 

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public RamBindDto build() {
                return new RamBindDto(this);
            } 

        } 

    }
}

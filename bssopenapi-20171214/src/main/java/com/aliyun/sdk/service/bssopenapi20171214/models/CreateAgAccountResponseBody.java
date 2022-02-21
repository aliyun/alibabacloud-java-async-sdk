// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgAccountResponseBody</p>
 */
public class CreateAgAccountResponseBody extends TeaModel {
    @NameInMap("AgRelationDto")
    private AgRelationDto agRelationDto;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateAgAccountResponseBody(Builder builder) {
        this.agRelationDto = builder.agRelationDto;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return agRelationDto
     */
    public AgRelationDto getAgRelationDto() {
        return this.agRelationDto;
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

    public static final class Builder {
        private AgRelationDto agRelationDto; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AgRelationDto.
         */
        public Builder agRelationDto(AgRelationDto agRelationDto) {
            this.agRelationDto = agRelationDto;
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

        public CreateAgAccountResponseBody build() {
            return new CreateAgAccountResponseBody(this);
        } 

    } 

    public static class AgRelationDto extends TeaModel {
        @NameInMap("Mpk")
        private String mpk;

        @NameInMap("Pk")
        private String pk;

        @NameInMap("RamAdminRoleName")
        private String ramAdminRoleName;

        @NameInMap("Type")
        private String type;

        private AgRelationDto(Builder builder) {
            this.mpk = builder.mpk;
            this.pk = builder.pk;
            this.ramAdminRoleName = builder.ramAdminRoleName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgRelationDto create() {
            return builder().build();
        }

        /**
         * @return mpk
         */
        public String getMpk() {
            return this.mpk;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return ramAdminRoleName
         */
        public String getRamAdminRoleName() {
            return this.ramAdminRoleName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mpk; 
            private String pk; 
            private String ramAdminRoleName; 
            private String type; 

            /**
             * Mpk.
             */
            public Builder mpk(String mpk) {
                this.mpk = mpk;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * RamAdminRoleName.
             */
            public Builder ramAdminRoleName(String ramAdminRoleName) {
                this.ramAdminRoleName = ramAdminRoleName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AgRelationDto build() {
                return new AgRelationDto(this);
            } 

        } 

    }
}

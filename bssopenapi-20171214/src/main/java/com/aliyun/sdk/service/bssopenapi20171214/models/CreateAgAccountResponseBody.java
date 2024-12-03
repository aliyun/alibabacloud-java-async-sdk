// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAgAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgAccountResponseBody</p>
 */
public class CreateAgAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgRelationDto")
    private AgRelationDto agRelationDto;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The relationship between the account that is used to call the CreateAgAccount operation and the account that is created.</p>
         */
        public Builder agRelationDto(AgRelationDto agRelationDto) {
            this.agRelationDto = agRelationDto;
            return this;
        }

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>LOGIN_EMAIL_HAS_BEEN_USED</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>loginEmail=<a href="mailto:685741089H@chinaunicom.cn">685741089H@chinaunicom.cn</a>,has used</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EAE08A27-386C-579E-966D-8853EC3C5D0E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAgAccountResponseBody build() {
            return new CreateAgAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgAccountResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgAccountResponseBody</p>
     */
    public static class AgRelationDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mpk")
        private String mpk;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("RamAdminRoleName")
        private String ramAdminRoleName;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The ID of the account that is used to call the CreateAgAccount operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1785287436011964</p>
             */
            public Builder mpk(String mpk) {
                this.mpk = mpk;
                return this;
            }

            /**
             * <p>The ID of the account that is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1728240534507590</p>
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * <p>The role of the account that is created.</p>
             * 
             * <strong>example:</strong>
             * <p>admin-role</p>
             */
            public Builder ramAdminRoleName(String ramAdminRoleName) {
                this.ramAdminRoleName = ramAdminRoleName;
                return this;
            }

            /**
             * <p>The type of the relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>FINACE_CLOUD</p>
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

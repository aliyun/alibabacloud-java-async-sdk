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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateAgAccountResponseBody model) {
            this.agRelationDto = model.agRelationDto;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AgRelationDto(Builder builder) {
            this.mpk = builder.mpk;
            this.pk = builder.pk;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mpk; 
            private String pk; 
            private String type; 

            private Builder() {
            } 

            private Builder(AgRelationDto model) {
                this.mpk = model.mpk;
                this.pk = model.pk;
                this.type = model.type;
            } 

            /**
             * <p>MPK（UID）</p>
             * 
             * <strong>example:</strong>
             * <p>1387058806890955</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link CreateLabReservationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLabReservationResponseBody</p>
 */
public class CreateLabReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LabReservation")
    private LabReservation labReservation;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateLabReservationResponseBody(Builder builder) {
        this.code = builder.code;
        this.labReservation = builder.labReservation;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabReservationResponseBody create() {
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
     * @return labReservation
     */
    public LabReservation getLabReservation() {
        return this.labReservation;
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
        private String code; 
        private LabReservation labReservation; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateLabReservationResponseBody model) {
            this.code = model.code;
            this.labReservation = model.labReservation;
            this.message = model.message;
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
         * LabReservation.
         */
        public Builder labReservation(LabReservation labReservation) {
            this.labReservation = labReservation;
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

        public CreateLabReservationResponseBody build() {
            return new CreateLabReservationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateLabReservationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateLabReservationResponseBody</p>
     */
    public static class LabReservation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private LabReservation(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabReservation create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(LabReservation model) {
                this.id = model.id;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public LabReservation build() {
                return new LabReservation(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @NameInMap("ServiceId")
    private Long serviceId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    private DataValue(Builder builder) {
        this.serviceId = builder.serviceId;
        this.status = builder.status;
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Long serviceId; 
        private String status; 
        private Integer code; 
        private String message; 

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleInApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleInApplicationResponseBody</p>
 */
public class ScaleInApplicationResponseBody extends TeaModel {
    @NameInMap("ChangeOrderId")
    private String changeOrderId;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    private ScaleInApplicationResponseBody(Builder builder) {
        this.changeOrderId = builder.changeOrderId;
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleInApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
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
        private String changeOrderId; 
        private Integer code; 
        private String message; 

        /**
         * The ID of the change process for this operation. You can call the GetChangeOrderInfo operation to query the progress of this scale-in. For more information, see [GetChangeOrderInfo](~~62072~~). No ID is generated if the ForceStatus parameter is set to true. You can check whether the request is successful based on the value of the Code parameter.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ScaleInApplicationResponseBody build() {
            return new ScaleInApplicationResponseBody(this);
        } 

    } 

}

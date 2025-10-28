// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ScaleInApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleInApplicationResponseBody</p>
 */
public class ScaleInApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    private String changeOrderId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ScaleInApplicationResponseBody model) {
            this.changeOrderId = model.changeOrderId;
            this.code = model.code;
            this.message = model.message;
        } 

        /**
         * <p>The ID of the change process for this operation. You can call the GetChangeOrderInfo operation to query the progress of this scale-in. For more information, see <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a>. No ID is generated if the ForceStatus parameter is set to true. You can check whether the request is successful based on the value of the Code parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ddf5a4c7-a507-4a6e****************</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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

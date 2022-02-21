// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotspotTagResponseBody</p>
 */
public class GetHotspotTagResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("ObjectString")
    private String objectString;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetHotspotTagResponseBody(Builder builder) {
        this.data = builder.data;
        this.errMessage = builder.errMessage;
        this.objectString = builder.objectString;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return objectString
     */
    public String getObjectString() {
        return this.objectString;
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
        private String data; 
        private String errMessage; 
        private String objectString; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * ObjectString.
         */
        public Builder objectString(String objectString) {
            this.objectString = objectString;
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

        public GetHotspotTagResponseBody build() {
            return new GetHotspotTagResponseBody(this);
        } 

    } 

}

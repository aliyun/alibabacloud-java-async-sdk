// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDLAServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDLAServiceResponseBody</p>
 */
public class DescribeDLAServiceResponseBody extends TeaModel {
    @NameInMap("AutoAdd")
    private Boolean autoAdd;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HaveJobFailed")
    private Boolean haveJobFailed;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDLAServiceResponseBody(Builder builder) {
        this.autoAdd = builder.autoAdd;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.haveJobFailed = builder.haveJobFailed;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDLAServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoAdd
     */
    public Boolean getAutoAdd() {
        return this.autoAdd;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return haveJobFailed
     */
    public Boolean getHaveJobFailed() {
        return this.haveJobFailed;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean autoAdd; 
        private String errCode; 
        private String errMessage; 
        private Boolean haveJobFailed; 
        private Integer httpStatusCode; 
        private String requestId; 
        private String state; 
        private Boolean success; 

        /**
         * AutoAdd.
         */
        public Builder autoAdd(Boolean autoAdd) {
            this.autoAdd = autoAdd;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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
         * HaveJobFailed.
         */
        public Builder haveJobFailed(Boolean haveJobFailed) {
            this.haveJobFailed = haveJobFailed;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDLAServiceResponseBody build() {
            return new DescribeDLAServiceResponseBody(this);
        } 

    } 

}

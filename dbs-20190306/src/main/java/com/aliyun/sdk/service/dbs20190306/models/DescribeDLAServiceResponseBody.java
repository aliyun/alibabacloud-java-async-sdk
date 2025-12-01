// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeDLAServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDLAServiceResponseBody</p>
 */
public class DescribeDLAServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoAdd")
    private Boolean autoAdd;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HaveJobFailed")
    private Boolean haveJobFailed;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDLAServiceResponseBody model) {
            this.autoAdd = model.autoAdd;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.haveJobFailed = model.haveJobFailed;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.state = model.state;
            this.success = model.success;
        } 

        /**
         * <p>Specifies whether to enable the feature of automatically adding incremental data to a data lake. If this feature is enabled, DBS adds the backup sets that are newly generated to the data lake that is created for the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoAdd(Boolean autoAdd) {
            this.autoAdd = autoAdd;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Indicates whether a failed DLA task exists in the return result. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A failed DLA task exists.</li>
         * <li><strong>false</strong>: No failed DLA task exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder haveJobFailed(Boolean haveJobFailed) {
            this.haveJobFailed = haveJobFailed;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the DLA service for the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: DLA is running.</li>
         * <li><strong>Closing</strong>: DLA is being disabled.</li>
         * <li><strong>Closed</strong>: DLA is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder state(String state) {
            this.state = state;
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

        public DescribeDLAServiceResponseBody build() {
            return new DescribeDLAServiceResponseBody(this);
        } 

    } 

}

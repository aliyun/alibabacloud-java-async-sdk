// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePostInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleasePostInstanceResponseBody</p>
 */
public class ReleasePostInstanceResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("ReleaseStatus")
    private Boolean releaseStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ReleasePostInstanceResponseBody(Builder builder) {
        this.httpStatusCode = builder.httpStatusCode;
        this.releaseStatus = builder.releaseStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePostInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return releaseStatus
     */
    public Boolean getReleaseStatus() {
        return this.releaseStatus;
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
        private Integer httpStatusCode; 
        private Boolean releaseStatus; 
        private String requestId; 
        private Boolean success; 

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * ReleaseStatus.
         */
        public Builder releaseStatus(Boolean releaseStatus) {
            this.releaseStatus = releaseStatus;
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

        public ReleasePostInstanceResponseBody build() {
            return new ReleasePostInstanceResponseBody(this);
        } 

    } 

}

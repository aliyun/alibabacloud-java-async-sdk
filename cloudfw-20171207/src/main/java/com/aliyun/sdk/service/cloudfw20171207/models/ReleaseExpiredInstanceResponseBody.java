// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ReleaseExpiredInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseExpiredInstanceResponseBody</p>
 */
public class ReleaseExpiredInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ReleaseStatus")
    private String releaseStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReleaseExpiredInstanceResponseBody(Builder builder) {
        this.httpStatusCode = builder.httpStatusCode;
        this.releaseStatus = builder.releaseStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseExpiredInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getReleaseStatus() {
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
        private String releaseStatus; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReleaseExpiredInstanceResponseBody model) {
            this.httpStatusCode = model.httpStatusCode;
            this.releaseStatus = model.releaseStatus;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>Indicates whether the instance was released:</p>
         * <ul>
         * <li><p><strong>true</strong>: Successful.</p>
         * </li>
         * <li><p><strong>false</strong>: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder releaseStatus(String releaseStatus) {
            this.releaseStatus = releaseStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9EC1DB0F-EE53-5D36-B5DA-71CB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReleaseExpiredInstanceResponseBody build() {
            return new ReleaseExpiredInstanceResponseBody(this);
        } 

    } 

}

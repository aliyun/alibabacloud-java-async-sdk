// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageRegistryNameResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateJenkinsImageRegistryNameResponseBody</p>
 */
public class UpdateJenkinsImageRegistryNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private UpdateJenkinsImageRegistryNameResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageRegistryNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
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
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private Boolean data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Long timeCost; 

        /**
         * The result of the operation. Valid values:
         * <p>
         * 
         * *   **true**: successful
         * *   **false**: failed
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time consumed. Unit: seconds.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public UpdateJenkinsImageRegistryNameResponseBody build() {
            return new UpdateJenkinsImageRegistryNameResponseBody(this);
        } 

    } 

}

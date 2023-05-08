// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageRegistryPersistenceDayResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateJenkinsImageRegistryPersistenceDayResponseBody</p>
 */
public class UpdateJenkinsImageRegistryPersistenceDayResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeCost")
    private Long timeCost;

    private UpdateJenkinsImageRegistryPersistenceDayResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageRegistryPersistenceDayResponseBody create() {
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
         * Data.
         */
        public Builder data(Boolean data) {
            this.data = data;
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
         * TimeCost.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public UpdateJenkinsImageRegistryPersistenceDayResponseBody build() {
            return new UpdateJenkinsImageRegistryPersistenceDayResponseBody(this);
        } 

    } 

}

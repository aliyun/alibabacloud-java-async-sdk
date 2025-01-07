// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryJenkinsImageRegistryPersistenceDayResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJenkinsImageRegistryPersistenceDayResponseBody</p>
 */
public class QueryJenkinsImageRegistryPersistenceDayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Integer data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private QueryJenkinsImageRegistryPersistenceDayResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJenkinsImageRegistryPersistenceDayResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Integer getData() {
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
        private Integer data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Long timeCost; 

        /**
         * <p>The retention period. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder data(Integer data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EA4AC8B7-0C18-5BC1-9DA4-798B3BE4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time consumed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public QueryJenkinsImageRegistryPersistenceDayResponseBody build() {
            return new QueryJenkinsImageRegistryPersistenceDayResponseBody(this);
        } 

    } 

}

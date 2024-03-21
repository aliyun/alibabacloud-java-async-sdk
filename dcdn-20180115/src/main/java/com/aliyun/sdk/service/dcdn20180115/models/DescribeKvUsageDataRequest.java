// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKvUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeKvUsageDataRequest</p>
 */
public class DescribeKvUsageDataRequest extends Request {
    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Field")
    @Validation(required = true)
    private String field;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("ResponseType")
    private String responseType;

    @Query
    @NameInMap("SplitBy")
    private String splitBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeKvUsageDataRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.namespaceId = builder.namespaceId;
        this.responseType = builder.responseType;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKvUsageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return responseType
     */
    public String getResponseType() {
        return this.responseType;
    }

    /**
     * @return splitBy
     */
    public String getSplitBy() {
        return this.splitBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeKvUsageDataRequest, Builder> {
        private String accessType; 
        private String endTime; 
        private String field; 
        private String namespaceId; 
        private String responseType; 
        private String splitBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKvUsageDataRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.endTime = request.endTime;
            this.field = request.field;
            this.namespaceId = request.namespaceId;
            this.responseType = request.responseType;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
        } 

        /**
         * The request method. If the parameter is empty, data about all methods is returned. Valid values:
         * <p>
         * 
         * *   **get**
         * *   **put**
         * *   **list**
         * *   **delete**
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the request data. Set the value to **acc**.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * The namespace ID. If the parameter is empty, data about all namespaces is returned.
         * <p>
         * 
         * You can specify a maximum number of 30 namespace IDs and separate them with commas (,).
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The type of the response data. Valid values:
         * <p>
         * 
         * *   **detail**: detailed data
         * *   **total**: summary data
         * 
         * Default value: **detail**.
         */
        public Builder responseType(String responseType) {
            this.putQueryParameter("ResponseType", responseType);
            this.responseType = responseType;
            return this;
        }

        /**
         * The key that is used to group data. Valid values: **type** and **namespace**.
         * <p>
         * 
         * *   **type**: Data is grouped by time. The data in the last 5 minutes is returned.
         * *   **namespace**: Data is grouped by namespace and is not padded with zeros.
         * *   Default value: **type**.
         * 
         * If **ResponseType** is set to **total**, data to return is not grouped by **namespace** but by **type**.
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * The minimum data granularity is 1 hour. If you do not specify this parameter, the data in the last seven days is returned.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeKvUsageDataRequest build() {
            return new DescribeKvUsageDataRequest(this);
        } 

    } 

}

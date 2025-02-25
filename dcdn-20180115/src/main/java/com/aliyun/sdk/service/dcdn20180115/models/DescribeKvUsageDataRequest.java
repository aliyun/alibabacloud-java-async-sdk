// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeKvUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeKvUsageDataRequest</p>
 */
public class DescribeKvUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    @com.aliyun.core.annotation.Validation(required = true)
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseType")
    private String responseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitBy")
    private String splitBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The request method. If the parameter is empty, data about all methods is returned. Valid values:</p>
         * <ul>
         * <li><strong>get</strong></li>
         * <li><strong>put</strong></li>
         * <li><strong>list</strong></li>
         * <li><strong>delete</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10T23:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the request data. Set the value to <strong>acc</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acc</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The namespace ID. If the parameter is empty, data about all namespaces is returned.</p>
         * <p>You can specify a maximum number of 30 namespace IDs and separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>12423131231****</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The type of the response data. Valid values:</p>
         * <ul>
         * <li><strong>detail</strong>: detailed data</li>
         * <li><strong>total</strong>: summary data</li>
         * </ul>
         * <p>Default value: <strong>detail</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>detail</p>
         */
        public Builder responseType(String responseType) {
            this.putQueryParameter("ResponseType", responseType);
            this.responseType = responseType;
            return this;
        }

        /**
         * <p>The key that is used to group data. Valid values: <strong>type</strong> and <strong>namespace</strong>.</p>
         * <ul>
         * <li><strong>type</strong>: Data is grouped by time. The data in the last 5 minutes is returned.</li>
         * <li><strong>namespace</strong>: Data is grouped by namespace and is not padded with zeros.</li>
         * <li>Default value: <strong>type</strong>.</li>
         * </ul>
         * <p>If <strong>ResponseType</strong> is set to <strong>total</strong>, data to return is not grouped by <strong>namespace</strong> but by <strong>type</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The minimum data granularity is 1 hour. If you do not specify this parameter, the data in the last seven days is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10T00:00:00Z</p>
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

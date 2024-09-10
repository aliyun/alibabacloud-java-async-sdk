// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomMetricRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomMetricRequest</p>
 */
public class DeleteCustomMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UUID")
    private String UUID;

    private DeleteCustomMetricRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.md5 = builder.md5;
        this.metricName = builder.metricName;
        this.UUID = builder.UUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    public static final class Builder extends Request.Builder<DeleteCustomMetricRequest, Builder> {
        private String groupId; 
        private String md5; 
        private String metricName; 
        private String UUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomMetricRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.md5 = request.md5;
            this.metricName = request.metricName;
            this.UUID = request.UUID;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The MD5 value of the HTTP request body. The MD5 value is a 128-bit hash value used to verify the uniqueness of the reported monitoring data.
         * <p>
         * 
         * >  `Md5` is returned when you query the reported monitoring data of a metric.
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * The name of the metric.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The ID of the request for reporting monitoring data.
         * <p>
         * 
         * >  `UUID` is returned when you query the reported monitoring data of a metric. We recommend that you specify the `Md5` parameter.
         */
        public Builder UUID(String UUID) {
            this.putQueryParameter("UUID", UUID);
            this.UUID = UUID;
            return this;
        }

        @Override
        public DeleteCustomMetricRequest build() {
            return new DeleteCustomMetricRequest(this);
        } 

    } 

}

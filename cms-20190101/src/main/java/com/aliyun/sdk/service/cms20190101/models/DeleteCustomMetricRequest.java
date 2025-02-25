// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The MD5 value of the HTTP request body. The MD5 value is a 128-bit hash value used to verify the uniqueness of the reported monitoring data.</p>
         * <blockquote>
         * <p> <code>Md5</code> is returned when you query the reported monitoring data of a metric.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>38796C8CFFEB8F89BB2A626C7BD7****</p>
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The name of the metric.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AdvanceCredit</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The ID of the request for reporting monitoring data.</p>
         * <blockquote>
         * <p> <code>UUID</code> is returned when you query the reported monitoring data of a metric. We recommend that you specify the <code>Md5</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5497633c-66c5-4eae-abaa-89db5adb****</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceByConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceByConfigurationRequest</p>
 */
public class DescribeTraceByConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    private String endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    private String startTs;

    private DescribeTraceByConfigurationRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
        this.endTs = builder.endTs;
        this.group = builder.group;
        this.namespaceId = builder.namespaceId;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceByConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return endTs
     */
    public String getEndTs() {
        return this.endTs;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return startTs
     */
    public String getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeTraceByConfigurationRequest, Builder> {
        private String dataId; 
        private String endTs; 
        private String group; 
        private String namespaceId; 
        private String startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTraceByConfigurationRequest request) {
            super(request);
            this.dataId = request.dataId;
            this.endTs = request.endTs;
            this.group = request.group;
            this.namespaceId = request.namespaceId;
            this.startTs = request.startTs;
        } 

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(String endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(String startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public DescribeTraceByConfigurationRequest build() {
            return new DescribeTraceByConfigurationRequest(this);
        } 

    } 

}

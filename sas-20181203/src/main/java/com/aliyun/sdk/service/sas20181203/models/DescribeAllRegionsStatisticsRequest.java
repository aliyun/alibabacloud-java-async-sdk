// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllRegionsStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllRegionsStatisticsRequest</p>
 */
public class DescribeAllRegionsStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeAllRegionsStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllRegionsStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeAllRegionsStatisticsRequest, Builder> {
        private String from; 
        private Long groupId; 
        private String remark; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAllRegionsStatisticsRequest request) {
            super(request);
            this.from = request.from;
            this.groupId = request.groupId;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The source of the request. Default value: **aqs**. Valid values:
         * <p>
         * 
         * *   **sas**: Security Center.
         * *   **aqs**: Server Guard.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ID of the asset group that you want to query.
         * <p>
         * 
         * >  You can call the [DescribeAllGroups](~~130972~~) operation to query the ID.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name or public IP address of the asset.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeAllRegionsStatisticsRequest build() {
            return new DescribeAllRegionsStatisticsRequest(this);
        } 

    } 

}

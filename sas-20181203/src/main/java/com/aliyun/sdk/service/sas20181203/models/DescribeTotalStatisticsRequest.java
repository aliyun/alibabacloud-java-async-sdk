// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTotalStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTotalStatisticsRequest</p>
 */
public class DescribeTotalStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private DescribeTotalStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTotalStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTotalStatisticsRequest, Builder> {
        private String from; 
        private Long groupId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTotalStatisticsRequest request) {
            super(request);
            this.from = request.from;
            this.groupId = request.groupId;
            this.remark = request.remark;
        } 

        /**
         * <p>The source of data. Default value: <strong>aqs</strong>. Valid values:</p>
         * <ul>
         * <li><strong>sas</strong>: Security Center</li>
         * <li><strong>aqs</strong>: Server Guard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/130972.html">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8076980</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name or public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>222.185.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public DescribeTotalStatisticsRequest build() {
            return new DescribeTotalStatisticsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTotalStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTotalStatisticsRequest</p>
 */
public class DescribeTotalStatisticsRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Remark")
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Remark.
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

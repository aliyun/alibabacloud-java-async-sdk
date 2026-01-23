// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SubmitQualityWatchTasksRequest} extends {@link RequestModel}
 *
 * <p>SubmitQualityWatchTasksRequest</p>
 */
public class SubmitQualityWatchTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitQualityWatchTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.submitCommand = builder.submitCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQualityWatchTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return submitCommand
     */
    public SubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static final class Builder extends Request.Builder<SubmitQualityWatchTasksRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitQualityWatchTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.submitCommand = request.submitCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder submitCommand(SubmitCommand submitCommand) {
            String submitCommandShrink = shrink(submitCommand, "SubmitCommand", "json");
            this.putBodyParameter("SubmitCommand", submitCommandShrink);
            this.submitCommand = submitCommand;
            return this;
        }

        @Override
        public SubmitQualityWatchTasksRequest build() {
            return new SubmitQualityWatchTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitQualityWatchTasksRequest} extends {@link TeaModel}
     *
     * <p>SubmitQualityWatchTasksRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("PartitionExpression")
        private String partitionExpression;

        @com.aliyun.core.annotation.NameInMap("WatchIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> watchIdList;

        private SubmitCommand(Builder builder) {
            this.bizDate = builder.bizDate;
            this.partitionExpression = builder.partitionExpression;
            this.watchIdList = builder.watchIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommand create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return partitionExpression
         */
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        /**
         * @return watchIdList
         */
        public java.util.List<Long> getWatchIdList() {
            return this.watchIdList;
        }

        public static final class Builder {
            private String bizDate; 
            private String partitionExpression; 
            private java.util.List<Long> watchIdList; 

            private Builder() {
            } 

            private Builder(SubmitCommand model) {
                this.bizDate = model.bizDate;
                this.partitionExpression = model.partitionExpression;
                this.watchIdList = model.watchIdList;
            } 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * PartitionExpression.
             */
            public Builder partitionExpression(String partitionExpression) {
                this.partitionExpression = partitionExpression;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder watchIdList(java.util.List<Long> watchIdList) {
                this.watchIdList = watchIdList;
                return this;
            }

            public SubmitCommand build() {
                return new SubmitCommand(this);
            } 

        } 

    }
}

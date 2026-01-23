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
 * {@link DeleteQualitySchedulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteQualitySchedulesRequest</p>
 */
public class DeleteQualitySchedulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteCommand deleteCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteQualitySchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteCommand = builder.deleteCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQualitySchedulesRequest create() {
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
     * @return deleteCommand
     */
    public DeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteQualitySchedulesRequest, Builder> {
        private String regionId; 
        private DeleteCommand deleteCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualitySchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteCommand = request.deleteCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder deleteCommand(DeleteCommand deleteCommand) {
            String deleteCommandShrink = shrink(deleteCommand, "DeleteCommand", "json");
            this.putBodyParameter("DeleteCommand", deleteCommandShrink);
            this.deleteCommand = deleteCommand;
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

        @Override
        public DeleteQualitySchedulesRequest build() {
            return new DeleteQualitySchedulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteQualitySchedulesRequest} extends {@link TeaModel}
     *
     * <p>DeleteQualitySchedulesRequest</p>
     */
    public static class DeleteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> scheduleIdList;

        private DeleteCommand(Builder builder) {
            this.scheduleIdList = builder.scheduleIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteCommand create() {
            return builder().build();
        }

        /**
         * @return scheduleIdList
         */
        public java.util.List<Long> getScheduleIdList() {
            return this.scheduleIdList;
        }

        public static final class Builder {
            private java.util.List<Long> scheduleIdList; 

            private Builder() {
            } 

            private Builder(DeleteCommand model) {
                this.scheduleIdList = model.scheduleIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder scheduleIdList(java.util.List<Long> scheduleIdList) {
                this.scheduleIdList = scheduleIdList;
                return this;
            }

            public DeleteCommand build() {
                return new DeleteCommand(this);
            } 

        } 

    }
}

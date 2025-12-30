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
 * {@link DeleteBizMetricRequest} extends {@link RequestModel}
 *
 * <p>DeleteBizMetricRequest</p>
 */
public class DeleteBizMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteBizMetricCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteBizMetricCommand deleteBizMetricCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteBizMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteBizMetricCommand = builder.deleteBizMetricCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBizMetricRequest create() {
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
     * @return deleteBizMetricCommand
     */
    public DeleteBizMetricCommand getDeleteBizMetricCommand() {
        return this.deleteBizMetricCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteBizMetricRequest, Builder> {
        private String regionId; 
        private DeleteBizMetricCommand deleteBizMetricCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBizMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteBizMetricCommand = request.deleteBizMetricCommand;
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
        public Builder deleteBizMetricCommand(DeleteBizMetricCommand deleteBizMetricCommand) {
            String deleteBizMetricCommandShrink = shrink(deleteBizMetricCommand, "DeleteBizMetricCommand", "json");
            this.putBodyParameter("DeleteBizMetricCommand", deleteBizMetricCommandShrink);
            this.deleteBizMetricCommand = deleteBizMetricCommand;
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
        public DeleteBizMetricRequest build() {
            return new DeleteBizMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteBizMetricRequest} extends {@link TeaModel}
     *
     * <p>DeleteBizMetricRequest</p>
     */
    public static class DeleteBizMetricCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
        private String name;

        private DeleteBizMetricCommand(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteBizMetricCommand create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DeleteBizMetricCommand model) {
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeleteBizMetricCommand build() {
                return new DeleteBizMetricCommand(this);
            } 

        } 

    }
}

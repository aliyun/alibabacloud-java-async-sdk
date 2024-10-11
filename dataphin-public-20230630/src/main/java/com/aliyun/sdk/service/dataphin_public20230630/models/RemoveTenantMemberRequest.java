// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveTenantMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveTenantMemberRequest</p>
 */
public class RemoveTenantMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RemoveCommand removeCommand;

    private RemoveTenantMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.removeCommand = builder.removeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTenantMemberRequest create() {
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
     * @return removeCommand
     */
    public RemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static final class Builder extends Request.Builder<RemoveTenantMemberRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RemoveCommand removeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTenantMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.removeCommand = request.removeCommand;
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
        public Builder removeCommand(RemoveCommand removeCommand) {
            String removeCommandShrink = shrink(removeCommand, "RemoveCommand", "json");
            this.putBodyParameter("RemoveCommand", removeCommandShrink);
            this.removeCommand = removeCommand;
            return this;
        }

        @Override
        public RemoveTenantMemberRequest build() {
            return new RemoveTenantMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveTenantMemberRequest} extends {@link TeaModel}
     *
     * <p>RemoveTenantMemberRequest</p>
     */
    public static class RemoveCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceId;

        private RemoveCommand(Builder builder) {
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveCommand create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String sourceId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public RemoveCommand build() {
                return new RemoveCommand(this);
            } 

        } 

    }
}

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
 * {@link RemoveDataServiceAppMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveDataServiceAppMemberRequest</p>
 */
public class RemoveDataServiceAppMemberRequest extends Request {
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

    private RemoveDataServiceAppMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.removeCommand = builder.removeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDataServiceAppMemberRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveDataServiceAppMemberRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RemoveCommand removeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDataServiceAppMemberRequest request) {
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
        public RemoveDataServiceAppMemberRequest build() {
            return new RemoveDataServiceAppMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveDataServiceAppMemberRequest} extends {@link TeaModel}
     *
     * <p>RemoveDataServiceAppMemberRequest</p>
     */
    public static class RemoveCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("MemberIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> memberIds;

        private RemoveCommand(Builder builder) {
            this.appId = builder.appId;
            this.memberIds = builder.memberIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveCommand create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return memberIds
         */
        public java.util.List<String> getMemberIds() {
            return this.memberIds;
        }

        public static final class Builder {
            private Integer appId; 
            private java.util.List<String> memberIds; 

            private Builder() {
            } 

            private Builder(RemoveCommand model) {
                this.appId = model.appId;
                this.memberIds = model.memberIds;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200000000</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder memberIds(java.util.List<String> memberIds) {
                this.memberIds = memberIds;
                return this;
            }

            public RemoveCommand build() {
                return new RemoveCommand(this);
            } 

        } 

    }
}

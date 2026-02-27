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
 * {@link UpdateDataServiceAppMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataServiceAppMemberRequest</p>
 */
public class UpdateDataServiceAppMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateDataServiceAppMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataServiceAppMemberRequest create() {
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
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateDataServiceAppMemberRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataServiceAppMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
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
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateDataServiceAppMemberRequest build() {
            return new UpdateDataServiceAppMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataServiceAppMemberRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataServiceAppMemberRequest</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveEnd")
        @com.aliyun.core.annotation.Validation(required = true)
        private String effectiveEnd;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private MemberList(Builder builder) {
            this.effectiveEnd = builder.effectiveEnd;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return effectiveEnd
         */
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String effectiveEnd; 
            private String userId; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.effectiveEnd = model.effectiveEnd;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-12</p>
             */
            public Builder effectiveEnd(String effectiveEnd) {
                this.effectiveEnd = effectiveEnd;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataServiceAppMemberRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataServiceAppMemberRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<MemberList> memberList;

        private UpdateCommand(Builder builder) {
            this.appId = builder.appId;
            this.memberList = builder.memberList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return memberList
         */
        public java.util.List<MemberList> getMemberList() {
            return this.memberList;
        }

        public static final class Builder {
            private Integer appId; 
            private java.util.List<MemberList> memberList; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.appId = model.appId;
                this.memberList = model.memberList;
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
            public Builder memberList(java.util.List<MemberList> memberList) {
                this.memberList = memberList;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}

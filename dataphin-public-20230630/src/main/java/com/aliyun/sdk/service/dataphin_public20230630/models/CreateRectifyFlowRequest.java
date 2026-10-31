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
 * {@link CreateRectifyFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateRectifyFlowRequest</p>
 */
public class CreateRectifyFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateRectifyFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRectifyFlowRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreateRectifyFlowRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRectifyFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The business request parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateRectifyFlowRequest build() {
            return new CreateRectifyFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRectifyFlowRequest} extends {@link TeaModel}
     *
     * <p>CreateRectifyFlowRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindToRectify")
        private Boolean bindToRectify;

        @com.aliyun.core.annotation.NameInMap("BindToRectifyId")
        private Long bindToRectifyId;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("GovernItemType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String governItemType;

        @com.aliyun.core.annotation.NameInMap("GovernObjectIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> governObjectIds;

        @com.aliyun.core.annotation.NameInMap("RectifyName")
        private String rectifyName;

        @com.aliyun.core.annotation.NameInMap("RectifyPriority")
        private String rectifyPriority;

        @com.aliyun.core.annotation.NameInMap("RectifyScope")
        private String rectifyScope;

        @com.aliyun.core.annotation.NameInMap("RectifyUser")
        private String rectifyUser;

        @com.aliyun.core.annotation.NameInMap("VerifyUser")
        private String verifyUser;

        private CreateCommand(Builder builder) {
            this.bindToRectify = builder.bindToRectify;
            this.bindToRectifyId = builder.bindToRectifyId;
            this.comment = builder.comment;
            this.governItemType = builder.governItemType;
            this.governObjectIds = builder.governObjectIds;
            this.rectifyName = builder.rectifyName;
            this.rectifyPriority = builder.rectifyPriority;
            this.rectifyScope = builder.rectifyScope;
            this.rectifyUser = builder.rectifyUser;
            this.verifyUser = builder.verifyUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return bindToRectify
         */
        public Boolean getBindToRectify() {
            return this.bindToRectify;
        }

        /**
         * @return bindToRectifyId
         */
        public Long getBindToRectifyId() {
            return this.bindToRectifyId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return governItemType
         */
        public String getGovernItemType() {
            return this.governItemType;
        }

        /**
         * @return governObjectIds
         */
        public java.util.List<Long> getGovernObjectIds() {
            return this.governObjectIds;
        }

        /**
         * @return rectifyName
         */
        public String getRectifyName() {
            return this.rectifyName;
        }

        /**
         * @return rectifyPriority
         */
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        /**
         * @return rectifyScope
         */
        public String getRectifyScope() {
            return this.rectifyScope;
        }

        /**
         * @return rectifyUser
         */
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        /**
         * @return verifyUser
         */
        public String getVerifyUser() {
            return this.verifyUser;
        }

        public static final class Builder {
            private Boolean bindToRectify; 
            private Long bindToRectifyId; 
            private String comment; 
            private String governItemType; 
            private java.util.List<Long> governObjectIds; 
            private String rectifyName; 
            private String rectifyPriority; 
            private String rectifyScope; 
            private String rectifyUser; 
            private String verifyUser; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.bindToRectify = model.bindToRectify;
                this.bindToRectifyId = model.bindToRectifyId;
                this.comment = model.comment;
                this.governItemType = model.governItemType;
                this.governObjectIds = model.governObjectIds;
                this.rectifyName = model.rectifyName;
                this.rectifyPriority = model.rectifyPriority;
                this.rectifyScope = model.rectifyScope;
                this.rectifyUser = model.rectifyUser;
                this.verifyUser = model.verifyUser;
            } 

            /**
             * <p>Specifies whether to associate with an existing process. Default value: false.</p>
             */
            public Builder bindToRectify(Boolean bindToRectify) {
                this.bindToRectify = bindToRectify;
                return this;
            }

            /**
             * <p>This parameter is required when you associate with an existing process.</p>
             * 
             * <strong>example:</strong>
             * <p>117970862340</p>
             */
            public Builder bindToRectifyId(Long bindToRectifyId) {
                this.bindToRectifyId = bindToRectifyId;
                return this;
            }

            /**
             * <p>The operation description. This parameter is optional. Maximum length: 128 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Initiate quality issue rectification for the customer table</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The governance object type. Valid values: TABLE, DATASOURCE_TABLE, DATASOURCE, INDEX, REALTIME_LOGICAL_TABLE, and QD_FEATURE.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder governItemType(String governItemType) {
                this.governItemType = governItemType;
                return this;
            }

            /**
             * <p>The list of issue IDs. Issues that cannot be rectified are skipped. If all issues are skipped, the original business error is returned.</p>
             * <p>This parameter is required.</p>
             */
            public Builder governObjectIds(java.util.List<Long> governObjectIds) {
                this.governObjectIds = governObjectIds;
                return this;
            }

            /**
             * <p>The rectification name. This parameter is required when you create a process and can contain up to 128 characters. It is ignored when you associate with an existing process.</p>
             * 
             * <strong>example:</strong>
             * <p>Quality issue rectification for the customer table</p>
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * <p>The rectification priority. Valid values: HIGH, MIDDLE, and LOW. Default value: MIDDLE. This parameter is ignored and not verified when you associate with an existing process.</p>
             * 
             * <strong>example:</strong>
             * <p>MIDDLE</p>
             */
            public Builder rectifyPriority(String rectifyPriority) {
                this.rectifyPriority = rectifyPriority;
                return this;
            }

            /**
             * <p>The rectification scope. Valid values: QUALITY_RULE_SCOPE, QUALITY_RULE_TASK_SCOPE, QUALITY_GOVERN_OBJECT_SCOPE, and QUALITY_WATCH_SCOPE. The default value is the same as the value on the page. A rule scope may include other issues.</p>
             * 
             * <strong>example:</strong>
             * <p>QUALITY_GOVERN_OBJECT_SCOPE</p>
             */
            public Builder rectifyScope(String rectifyScope) {
                this.rectifyScope = rectifyScope;
                return this;
            }

            /**
             * <p>The ID of the user who performs the rectification. Default value: the current user. This parameter is ignored when you associate with an existing process.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder rectifyUser(String rectifyUser) {
                this.rectifyUser = rectifyUser;
                return this;
            }

            /**
             * <p>The ID of the user who performs the verification. Default value: the current user. This parameter is ignored when you associate with an existing process.</p>
             * 
             * <strong>example:</strong>
             * <p>user002</p>
             */
            public Builder verifyUser(String verifyUser) {
                this.verifyUser = verifyUser;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}

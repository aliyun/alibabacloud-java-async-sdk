// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTenantMembersBySourceUserRequest} extends {@link RequestModel}
 *
 * <p>AddTenantMembersBySourceUserRequest</p>
 */
public class AddTenantMembersBySourceUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddCommand")
    private AddCommand addCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private AddTenantMembersBySourceUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addCommand = builder.addCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTenantMembersBySourceUserRequest create() {
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
     * @return addCommand
     */
    public AddCommand getAddCommand() {
        return this.addCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<AddTenantMembersBySourceUserRequest, Builder> {
        private String regionId; 
        private AddCommand addCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddTenantMembersBySourceUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addCommand = request.addCommand;
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
         * AddCommand.
         */
        public Builder addCommand(AddCommand addCommand) {
            String addCommandShrink = shrink(addCommand, "AddCommand", "json");
            this.putBodyParameter("AddCommand", addCommandShrink);
            this.addCommand = addCommand;
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
        public AddTenantMembersBySourceUserRequest build() {
            return new AddTenantMembersBySourceUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddTenantMembersBySourceUserRequest} extends {@link TeaModel}
     *
     * <p>AddTenantMembersBySourceUserRequest</p>
     */
    public static class SourceUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DingNumber")
        private String dingNumber;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Mail")
        private String mail;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        private SourceUserList(Builder builder) {
            this.accountName = builder.accountName;
            this.dingNumber = builder.dingNumber;
            this.displayName = builder.displayName;
            this.mail = builder.mail;
            this.mobilePhone = builder.mobilePhone;
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceUserList create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return dingNumber
         */
        public String getDingNumber() {
            return this.dingNumber;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return mail
         */
        public String getMail() {
            return this.mail;
        }

        /**
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String accountName; 
            private String dingNumber; 
            private String displayName; 
            private String mail; 
            private String mobilePhone; 
            private String sourceId; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DingNumber.
             */
            public Builder dingNumber(String dingNumber) {
                this.dingNumber = dingNumber;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Mail.
             */
            public Builder mail(String mail) {
                this.mail = mail;
                return this;
            }

            /**
             * MobilePhone.
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public SourceUserList build() {
                return new SourceUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTenantMembersBySourceUserRequest} extends {@link TeaModel}
     *
     * <p>AddTenantMembersBySourceUserRequest</p>
     */
    public static class AddCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceUserList")
        private java.util.List < SourceUserList> sourceUserList;

        private AddCommand(Builder builder) {
            this.sourceUserList = builder.sourceUserList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddCommand create() {
            return builder().build();
        }

        /**
         * @return sourceUserList
         */
        public java.util.List < SourceUserList> getSourceUserList() {
            return this.sourceUserList;
        }

        public static final class Builder {
            private java.util.List < SourceUserList> sourceUserList; 

            /**
             * SourceUserList.
             */
            public Builder sourceUserList(java.util.List < SourceUserList> sourceUserList) {
                this.sourceUserList = sourceUserList;
                return this;
            }

            public AddCommand build() {
                return new AddCommand(this);
            } 

        } 

    }
}

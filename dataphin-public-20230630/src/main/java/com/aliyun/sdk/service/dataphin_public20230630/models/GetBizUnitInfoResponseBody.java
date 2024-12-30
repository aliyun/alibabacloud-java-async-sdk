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
 * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBizUnitInfoResponseBody</p>
 */
public class GetBizUnitInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizUnitInfo")
    private BizUnitInfo bizUnitInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBizUnitInfoResponseBody(Builder builder) {
        this.bizUnitInfo = builder.bizUnitInfo;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizUnitInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizUnitInfo
     */
    public BizUnitInfo getBizUnitInfo() {
        return this.bizUnitInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BizUnitInfo bizUnitInfo; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BizUnitInfo.
         */
        public Builder bizUnitInfo(BizUnitInfo bizUnitInfo) {
            this.bizUnitInfo = bizUnitInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBizUnitInfoResponseBody build() {
            return new GetBizUnitInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizUnitInfoResponseBody</p>
     */
    public static class AccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private AccountList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizUnitInfoResponseBody</p>
     */
    public static class BusinessLeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private BusinessLeaderList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessLeaderList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public BusinessLeaderList build() {
                return new BusinessLeaderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizUnitInfoResponseBody</p>
     */
    public static class DataLeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private DataLeaderList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataLeaderList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DataLeaderList build() {
                return new DataLeaderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizUnitInfoResponseBody</p>
     */
    public static class EnvList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EnvName")
        private String envName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EnvList(Builder builder) {
            this.displayName = builder.displayName;
            this.envName = builder.envName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvList create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String displayName; 
            private String envName; 
            private String name; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EnvList build() {
                return new EnvList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizUnitInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizUnitInfoResponseBody</p>
     */
    public static class BizUnitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountList")
        private java.util.List<AccountList> accountList;

        @com.aliyun.core.annotation.NameInMap("BizObjectCount")
        private Integer bizObjectCount;

        @com.aliyun.core.annotation.NameInMap("BizProcessCount")
        private Integer bizProcessCount;

        @com.aliyun.core.annotation.NameInMap("BusinessLeaderList")
        private java.util.List<BusinessLeaderList> businessLeaderList;

        @com.aliyun.core.annotation.NameInMap("DataDomainCount")
        private Integer dataDomainCount;

        @com.aliyun.core.annotation.NameInMap("DataLeaderList")
        private java.util.List<DataLeaderList> dataLeaderList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EnvList")
        private java.util.List<EnvList> envList;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        private BizUnitInfo(Builder builder) {
            this.accountList = builder.accountList;
            this.bizObjectCount = builder.bizObjectCount;
            this.bizProcessCount = builder.bizProcessCount;
            this.businessLeaderList = builder.businessLeaderList;
            this.dataDomainCount = builder.dataDomainCount;
            this.dataLeaderList = builder.dataLeaderList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.envList = builder.envList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icon = builder.icon;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.mode = builder.mode;
            this.name = builder.name;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizUnitInfo create() {
            return builder().build();
        }

        /**
         * @return accountList
         */
        public java.util.List<AccountList> getAccountList() {
            return this.accountList;
        }

        /**
         * @return bizObjectCount
         */
        public Integer getBizObjectCount() {
            return this.bizObjectCount;
        }

        /**
         * @return bizProcessCount
         */
        public Integer getBizProcessCount() {
            return this.bizProcessCount;
        }

        /**
         * @return businessLeaderList
         */
        public java.util.List<BusinessLeaderList> getBusinessLeaderList() {
            return this.businessLeaderList;
        }

        /**
         * @return dataDomainCount
         */
        public Integer getDataDomainCount() {
            return this.dataDomainCount;
        }

        /**
         * @return dataLeaderList
         */
        public java.util.List<DataLeaderList> getDataLeaderList() {
            return this.dataLeaderList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return envList
         */
        public java.util.List<EnvList> getEnvList() {
            return this.envList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public static final class Builder {
            private java.util.List<AccountList> accountList; 
            private Integer bizObjectCount; 
            private Integer bizProcessCount; 
            private java.util.List<BusinessLeaderList> businessLeaderList; 
            private Integer dataDomainCount; 
            private java.util.List<DataLeaderList> dataLeaderList; 
            private String description; 
            private String displayName; 
            private java.util.List<EnvList> envList; 
            private String gmtCreate; 
            private String gmtModified; 
            private String icon; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private String mode; 
            private String name; 
            private String ownerName; 
            private String ownerUserId; 

            /**
             * AccountList.
             */
            public Builder accountList(java.util.List<AccountList> accountList) {
                this.accountList = accountList;
                return this;
            }

            /**
             * BizObjectCount.
             */
            public Builder bizObjectCount(Integer bizObjectCount) {
                this.bizObjectCount = bizObjectCount;
                return this;
            }

            /**
             * BizProcessCount.
             */
            public Builder bizProcessCount(Integer bizProcessCount) {
                this.bizProcessCount = bizProcessCount;
                return this;
            }

            /**
             * BusinessLeaderList.
             */
            public Builder businessLeaderList(java.util.List<BusinessLeaderList> businessLeaderList) {
                this.businessLeaderList = businessLeaderList;
                return this;
            }

            /**
             * DataDomainCount.
             */
            public Builder dataDomainCount(Integer dataDomainCount) {
                this.dataDomainCount = dataDomainCount;
                return this;
            }

            /**
             * DataLeaderList.
             */
            public Builder dataLeaderList(java.util.List<DataLeaderList> dataLeaderList) {
                this.dataLeaderList = dataLeaderList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * EnvList.
             */
            public Builder envList(java.util.List<EnvList> envList) {
                this.envList = envList;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            public BizUnitInfo build() {
                return new BizUnitInfo(this);
            } 

        } 

    }
}

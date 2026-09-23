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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetBizUnitInfoResponseBody model) {
            this.bizUnitInfo = model.bizUnitInfo;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data domain.</p>
         */
        public Builder bizUnitInfo(BizUnitInfo bizUnitInfo) {
            this.bizUnitInfo = bizUnitInfo;
            return this;
        }

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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

            private Builder() {
            } 

            private Builder(AccountList model) {
                this.id = model.id;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001201</p>
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

            private Builder() {
            } 

            private Builder(BusinessLeaderList model) {
                this.id = model.id;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001201</p>
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

            private Builder() {
            } 

            private Builder(DataLeaderList model) {
                this.id = model.id;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001201</p>
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

            private Builder() {
            } 

            private Builder(EnvList model) {
                this.displayName = model.displayName;
                this.envName = model.envName;
                this.name = model.name;
            } 

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试数据板块001_开发</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The environment identifier. Valid values: PROD and DEV.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * <p>The English name.</p>
             * 
             * <strong>example:</strong>
             * <p>LD_test001_dev</p>
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

            private Builder() {
            } 

            private Builder(BizUnitInfo model) {
                this.accountList = model.accountList;
                this.bizObjectCount = model.bizObjectCount;
                this.bizProcessCount = model.bizProcessCount;
                this.businessLeaderList = model.businessLeaderList;
                this.dataDomainCount = model.dataDomainCount;
                this.dataLeaderList = model.dataLeaderList;
                this.description = model.description;
                this.displayName = model.displayName;
                this.envList = model.envList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.icon = model.icon;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.mode = model.mode;
                this.name = model.name;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
            } 

            /**
             * <p>The architects of the data domain.</p>
             */
            public Builder accountList(java.util.List<AccountList> accountList) {
                this.accountList = accountList;
                return this;
            }

            /**
             * <p>The number of business objects.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizObjectCount(Integer bizObjectCount) {
                this.bizObjectCount = bizObjectCount;
                return this;
            }

            /**
             * <p>The number of business activities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizProcessCount(Integer bizProcessCount) {
                this.bizProcessCount = bizProcessCount;
                return this;
            }

            /**
             * <p>The business owners.</p>
             */
            public Builder businessLeaderList(java.util.List<BusinessLeaderList> businessLeaderList) {
                this.businessLeaderList = businessLeaderList;
                return this;
            }

            /**
             * <p>The number of subject domains.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataDomainCount(Integer dataDomainCount) {
                this.dataDomainCount = dataDomainCount;
                return this;
            }

            /**
             * <p>The data owners.</p>
             */
            public Builder dataLeaderList(java.util.List<DataLeaderList> dataLeaderList) {
                this.dataLeaderList = dataLeaderList;
                return this;
            }

            /**
             * <p>The description of the business object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The English names of the data domain for the two environments: production and development.</p>
             */
            public Builder envList(java.util.List<EnvList> envList) {
                this.envList = envList;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The icon of the data domain.</p>
             * 
             * <strong>example:</strong>
             * <p>icon-e-commerce</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The data domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101001201</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the data domain.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>The name of the user who last modified the data domain.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * <p>The production mode. Valid values:</p>
             * <ul>
             * <li>BASIC: single-environment mode.</li>
             * <li>DEV_PROD: development/production dual-environment mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEV_PROD</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the business object.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The owner of the business object.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
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

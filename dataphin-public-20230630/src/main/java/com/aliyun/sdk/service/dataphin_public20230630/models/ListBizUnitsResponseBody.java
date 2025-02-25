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
 * {@link ListBizUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBizUnitsResponseBody</p>
 */
public class ListBizUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBizUnitsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBizUnitsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListBizUnitsResponseBody build() {
            return new ListBizUnitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBizUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBizUnitsResponseBody</p>
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
     * {@link ListBizUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBizUnitsResponseBody</p>
     */
    public static class BizUnitList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountList")
        private java.util.List<AccountList> accountList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

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

        private BizUnitList(Builder builder) {
            this.accountList = builder.accountList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.env = builder.env;
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

        public static BizUnitList create() {
            return builder().build();
        }

        /**
         * @return accountList
         */
        public java.util.List<AccountList> getAccountList() {
            return this.accountList;
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
         * @return env
         */
        public String getEnv() {
            return this.env;
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
            private String description; 
            private String displayName; 
            private String env; 
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
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

            public BizUnitList build() {
                return new BizUnitList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBizUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBizUnitsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitList")
        private java.util.List<BizUnitList> bizUnitList;

        private Data(Builder builder) {
            this.bizUnitList = builder.bizUnitList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizUnitList
         */
        public java.util.List<BizUnitList> getBizUnitList() {
            return this.bizUnitList;
        }

        public static final class Builder {
            private java.util.List<BizUnitList> bizUnitList; 

            /**
             * BizUnitList.
             */
            public Builder bizUnitList(java.util.List<BizUnitList> bizUnitList) {
                this.bizUnitList = bizUnitList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

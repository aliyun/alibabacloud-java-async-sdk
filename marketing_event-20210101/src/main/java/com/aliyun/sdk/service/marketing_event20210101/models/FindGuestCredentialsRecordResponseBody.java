// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
 *
 * <p>FindGuestCredentialsRecordResponseBody</p>
 */
public class FindGuestCredentialsRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindGuestCredentialsRecordResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindGuestCredentialsRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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

        public FindGuestCredentialsRecordResponseBody build() {
            return new FindGuestCredentialsRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>FindGuestCredentialsRecordResponseBody</p>
     */
    public static class LevelOneOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerEmpIdOrTelephone")
        private String ownerEmpIdOrTelephone;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private String ownerNickName;

        private LevelOneOwner(Builder builder) {
            this.ownerEmpIdOrTelephone = builder.ownerEmpIdOrTelephone;
            this.ownerName = builder.ownerName;
            this.ownerNickName = builder.ownerNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelOneOwner create() {
            return builder().build();
        }

        /**
         * @return ownerEmpIdOrTelephone
         */
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerNickName
         */
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        public static final class Builder {
            private String ownerEmpIdOrTelephone; 
            private String ownerName; 
            private String ownerNickName; 

            /**
             * OwnerEmpIdOrTelephone.
             */
            public Builder ownerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
                this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
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
             * OwnerNickName.
             */
            public Builder ownerNickName(String ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            public LevelOneOwner build() {
                return new LevelOneOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>FindGuestCredentialsRecordResponseBody</p>
     */
    public static class LevelThreeOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerEmpIdOrTelephone")
        private String ownerEmpIdOrTelephone;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private String ownerNickName;

        private LevelThreeOwner(Builder builder) {
            this.ownerEmpIdOrTelephone = builder.ownerEmpIdOrTelephone;
            this.ownerName = builder.ownerName;
            this.ownerNickName = builder.ownerNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelThreeOwner create() {
            return builder().build();
        }

        /**
         * @return ownerEmpIdOrTelephone
         */
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerNickName
         */
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        public static final class Builder {
            private String ownerEmpIdOrTelephone; 
            private String ownerName; 
            private String ownerNickName; 

            /**
             * OwnerEmpIdOrTelephone.
             */
            public Builder ownerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
                this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
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
             * OwnerNickName.
             */
            public Builder ownerNickName(String ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            public LevelThreeOwner build() {
                return new LevelThreeOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>FindGuestCredentialsRecordResponseBody</p>
     */
    public static class LevelTwoOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerEmpIdOrTelephone")
        private String ownerEmpIdOrTelephone;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private String ownerNickName;

        private LevelTwoOwner(Builder builder) {
            this.ownerEmpIdOrTelephone = builder.ownerEmpIdOrTelephone;
            this.ownerName = builder.ownerName;
            this.ownerNickName = builder.ownerNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelTwoOwner create() {
            return builder().build();
        }

        /**
         * @return ownerEmpIdOrTelephone
         */
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerNickName
         */
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        public static final class Builder {
            private String ownerEmpIdOrTelephone; 
            private String ownerName; 
            private String ownerNickName; 

            /**
             * OwnerEmpIdOrTelephone.
             */
            public Builder ownerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
                this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
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
             * OwnerNickName.
             */
            public Builder ownerNickName(String ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            public LevelTwoOwner build() {
                return new LevelTwoOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>FindGuestCredentialsRecordResponseBody</p>
     */
    public static class ChannelLevelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("LevelOneChannelName")
        private String levelOneChannelName;

        @com.aliyun.core.annotation.NameInMap("LevelOneOwner")
        private java.util.List < LevelOneOwner> levelOneOwner;

        @com.aliyun.core.annotation.NameInMap("LevelThreeChannelName")
        private String levelThreeChannelName;

        @com.aliyun.core.annotation.NameInMap("LevelThreeOwner")
        private java.util.List < LevelThreeOwner> levelThreeOwner;

        @com.aliyun.core.annotation.NameInMap("LevelTwoChannelName")
        private String levelTwoChannelName;

        @com.aliyun.core.annotation.NameInMap("LevelTwoOwner")
        private java.util.List < LevelTwoOwner> levelTwoOwner;

        private ChannelLevelInfo(Builder builder) {
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.levelOneChannelName = builder.levelOneChannelName;
            this.levelOneOwner = builder.levelOneOwner;
            this.levelThreeChannelName = builder.levelThreeChannelName;
            this.levelThreeOwner = builder.levelThreeOwner;
            this.levelTwoChannelName = builder.levelTwoChannelName;
            this.levelTwoOwner = builder.levelTwoOwner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelLevelInfo create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return levelOneChannelName
         */
        public String getLevelOneChannelName() {
            return this.levelOneChannelName;
        }

        /**
         * @return levelOneOwner
         */
        public java.util.List < LevelOneOwner> getLevelOneOwner() {
            return this.levelOneOwner;
        }

        /**
         * @return levelThreeChannelName
         */
        public String getLevelThreeChannelName() {
            return this.levelThreeChannelName;
        }

        /**
         * @return levelThreeOwner
         */
        public java.util.List < LevelThreeOwner> getLevelThreeOwner() {
            return this.levelThreeOwner;
        }

        /**
         * @return levelTwoChannelName
         */
        public String getLevelTwoChannelName() {
            return this.levelTwoChannelName;
        }

        /**
         * @return levelTwoOwner
         */
        public java.util.List < LevelTwoOwner> getLevelTwoOwner() {
            return this.levelTwoOwner;
        }

        public static final class Builder {
            private Long channelId; 
            private String channelName; 
            private String levelOneChannelName; 
            private java.util.List < LevelOneOwner> levelOneOwner; 
            private String levelThreeChannelName; 
            private java.util.List < LevelThreeOwner> levelThreeOwner; 
            private String levelTwoChannelName; 
            private java.util.List < LevelTwoOwner> levelTwoOwner; 

            /**
             * ChannelId.
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * LevelOneChannelName.
             */
            public Builder levelOneChannelName(String levelOneChannelName) {
                this.levelOneChannelName = levelOneChannelName;
                return this;
            }

            /**
             * LevelOneOwner.
             */
            public Builder levelOneOwner(java.util.List < LevelOneOwner> levelOneOwner) {
                this.levelOneOwner = levelOneOwner;
                return this;
            }

            /**
             * LevelThreeChannelName.
             */
            public Builder levelThreeChannelName(String levelThreeChannelName) {
                this.levelThreeChannelName = levelThreeChannelName;
                return this;
            }

            /**
             * LevelThreeOwner.
             */
            public Builder levelThreeOwner(java.util.List < LevelThreeOwner> levelThreeOwner) {
                this.levelThreeOwner = levelThreeOwner;
                return this;
            }

            /**
             * LevelTwoChannelName.
             */
            public Builder levelTwoChannelName(String levelTwoChannelName) {
                this.levelTwoChannelName = levelTwoChannelName;
                return this;
            }

            /**
             * LevelTwoOwner.
             */
            public Builder levelTwoOwner(java.util.List < LevelTwoOwner> levelTwoOwner) {
                this.levelTwoOwner = levelTwoOwner;
                return this;
            }

            public ChannelLevelInfo build() {
                return new ChannelLevelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindGuestCredentialsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>FindGuestCredentialsRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Admin")
        private java.util.Map < String, ? > admin;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelLevelInfo")
        private ChannelLevelInfo channelLevelInfo;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("CredentialsCode")
        private String credentialsCode;

        @com.aliyun.core.annotation.NameInMap("CredentialsName")
        private String credentialsName;

        @com.aliyun.core.annotation.NameInMap("IdNumber")
        private String idNumber;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.admin = builder.admin;
            this.channelId = builder.channelId;
            this.channelLevelInfo = builder.channelLevelInfo;
            this.companyName = builder.companyName;
            this.credentialsCode = builder.credentialsCode;
            this.credentialsName = builder.credentialsName;
            this.idNumber = builder.idNumber;
            this.idType = builder.idType;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return admin
         */
        public java.util.Map < String, ? > getAdmin() {
            return this.admin;
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelLevelInfo
         */
        public ChannelLevelInfo getChannelLevelInfo() {
            return this.channelLevelInfo;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return credentialsCode
         */
        public String getCredentialsCode() {
            return this.credentialsCode;
        }

        /**
         * @return credentialsName
         */
        public String getCredentialsName() {
            return this.credentialsName;
        }

        /**
         * @return idNumber
         */
        public String getIdNumber() {
            return this.idNumber;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, ? > admin; 
            private Long channelId; 
            private ChannelLevelInfo channelLevelInfo; 
            private String companyName; 
            private String credentialsCode; 
            private String credentialsName; 
            private String idNumber; 
            private String idType; 
            private String name; 
            private Integer status; 

            /**
             * Admin.
             */
            public Builder admin(java.util.Map < String, ? > admin) {
                this.admin = admin;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelLevelInfo.
             */
            public Builder channelLevelInfo(ChannelLevelInfo channelLevelInfo) {
                this.channelLevelInfo = channelLevelInfo;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * CredentialsCode.
             */
            public Builder credentialsCode(String credentialsCode) {
                this.credentialsCode = credentialsCode;
                return this;
            }

            /**
             * CredentialsName.
             */
            public Builder credentialsName(String credentialsName) {
                this.credentialsName = credentialsName;
                return this;
            }

            /**
             * IdNumber.
             */
            public Builder idNumber(String idNumber) {
                this.idNumber = idNumber;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

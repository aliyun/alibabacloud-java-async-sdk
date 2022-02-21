// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBindedUserByDingIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetBindedUserByDingIdResponseBody</p>
 */
public class GetBindedUserByDingIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetBindedUserByDingIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBindedUserByDingIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public GetBindedUserByDingIdResponseBody build() {
            return new GetBindedUserByDingIdResponseBody(this);
        } 

    } 

    public static class AliyunUser extends TeaModel {
        @NameInMap("AccountStructure")
        private Integer accountStructure;

        @NameInMap("AliyunId")
        private String aliyunId;

        @NameInMap("Email")
        private String email;

        @NameInMap("HavanaId")
        private String havanaId;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Kp")
        private String kp;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("Realname")
        private String realname;

        @NameInMap("TaobaoNick")
        private String taobaoNick;

        private AliyunUser(Builder builder) {
            this.accountStructure = builder.accountStructure;
            this.aliyunId = builder.aliyunId;
            this.email = builder.email;
            this.havanaId = builder.havanaId;
            this.id = builder.id;
            this.kp = builder.kp;
            this.nickName = builder.nickName;
            this.realname = builder.realname;
            this.taobaoNick = builder.taobaoNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunUser create() {
            return builder().build();
        }

        /**
         * @return accountStructure
         */
        public Integer getAccountStructure() {
            return this.accountStructure;
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return havanaId
         */
        public String getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return kp
         */
        public String getKp() {
            return this.kp;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return realname
         */
        public String getRealname() {
            return this.realname;
        }

        /**
         * @return taobaoNick
         */
        public String getTaobaoNick() {
            return this.taobaoNick;
        }

        public static final class Builder {
            private Integer accountStructure; 
            private String aliyunId; 
            private String email; 
            private String havanaId; 
            private Integer id; 
            private String kp; 
            private String nickName; 
            private String realname; 
            private String taobaoNick; 

            /**
             * AccountStructure.
             */
            public Builder accountStructure(Integer accountStructure) {
                this.accountStructure = accountStructure;
                return this;
            }

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * HavanaId.
             */
            public Builder havanaId(String havanaId) {
                this.havanaId = havanaId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Kp.
             */
            public Builder kp(String kp) {
                this.kp = kp;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * Realname.
             */
            public Builder realname(String realname) {
                this.realname = realname;
                return this;
            }

            /**
             * TaobaoNick.
             */
            public Builder taobaoNick(String taobaoNick) {
                this.taobaoNick = taobaoNick;
                return this;
            }

            public AliyunUser build() {
                return new AliyunUser(this);
            } 

        } 

    }
    public static class DingtalkUser extends TeaModel {
        @NameInMap("CodeUserName")
        private String codeUserName;

        @NameInMap("DingId")
        private String dingId;

        @NameInMap("DingtalkUserId")
        private Integer dingtalkUserId;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Nick")
        private String nick;

        @NameInMap("UnionId")
        private String unionId;

        private DingtalkUser(Builder builder) {
            this.codeUserName = builder.codeUserName;
            this.dingId = builder.dingId;
            this.dingtalkUserId = builder.dingtalkUserId;
            this.id = builder.id;
            this.nick = builder.nick;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkUser create() {
            return builder().build();
        }

        /**
         * @return codeUserName
         */
        public String getCodeUserName() {
            return this.codeUserName;
        }

        /**
         * @return dingId
         */
        public String getDingId() {
            return this.dingId;
        }

        /**
         * @return dingtalkUserId
         */
        public Integer getDingtalkUserId() {
            return this.dingtalkUserId;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String codeUserName; 
            private String dingId; 
            private Integer dingtalkUserId; 
            private Integer id; 
            private String nick; 
            private String unionId; 

            /**
             * CodeUserName.
             */
            public Builder codeUserName(String codeUserName) {
                this.codeUserName = codeUserName;
                return this;
            }

            /**
             * DingId.
             */
            public Builder dingId(String dingId) {
                this.dingId = dingId;
                return this;
            }

            /**
             * DingtalkUserId.
             */
            public Builder dingtalkUserId(Integer dingtalkUserId) {
                this.dingtalkUserId = dingtalkUserId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public DingtalkUser build() {
                return new DingtalkUser(this);
            } 

        } 

    }
    public static class UserProfileDTO extends TeaModel {
        @NameInMap("Avatar")
        private String avatar;

        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("Email")
        private String email;

        @NameInMap("EnglishName")
        private String englishName;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("Name")
        private String name;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("UserId")
        private Integer userId;

        private UserProfileDTO(Builder builder) {
            this.avatar = builder.avatar;
            this.createdAt = builder.createdAt;
            this.dataSource = builder.dataSource;
            this.email = builder.email;
            this.englishName = builder.englishName;
            this.mobile = builder.mobile;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfileDTO create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String avatar; 
            private Long createdAt; 
            private String dataSource; 
            private String email; 
            private String englishName; 
            private String mobile; 
            private String name; 
            private String nickName; 
            private Integer userId; 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
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
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public UserProfileDTO build() {
                return new UserProfileDTO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AliyunUser")
        private AliyunUser aliyunUser;

        @NameInMap("DingtalkUser")
        private DingtalkUser dingtalkUser;

        @NameInMap("Guid")
        private String guid;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IsValid")
        private Boolean isValid;

        @NameInMap("MainAccountType")
        private String mainAccountType;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("UserProfileDTO")
        private UserProfileDTO userProfileDTO;

        @NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.aliyunUser = builder.aliyunUser;
            this.dingtalkUser = builder.dingtalkUser;
            this.guid = builder.guid;
            this.id = builder.id;
            this.isValid = builder.isValid;
            this.mainAccountType = builder.mainAccountType;
            this.nickName = builder.nickName;
            this.userProfileDTO = builder.userProfileDTO;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUser
         */
        public AliyunUser getAliyunUser() {
            return this.aliyunUser;
        }

        /**
         * @return dingtalkUser
         */
        public DingtalkUser getDingtalkUser() {
            return this.dingtalkUser;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isValid
         */
        public Boolean getIsValid() {
            return this.isValid;
        }

        /**
         * @return mainAccountType
         */
        public String getMainAccountType() {
            return this.mainAccountType;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return userProfileDTO
         */
        public UserProfileDTO getUserProfileDTO() {
            return this.userProfileDTO;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private AliyunUser aliyunUser; 
            private DingtalkUser dingtalkUser; 
            private String guid; 
            private Integer id; 
            private Boolean isValid; 
            private String mainAccountType; 
            private String nickName; 
            private UserProfileDTO userProfileDTO; 
            private String uuid; 

            /**
             * AliyunUser.
             */
            public Builder aliyunUser(AliyunUser aliyunUser) {
                this.aliyunUser = aliyunUser;
                return this;
            }

            /**
             * DingtalkUser.
             */
            public Builder dingtalkUser(DingtalkUser dingtalkUser) {
                this.dingtalkUser = dingtalkUser;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IsValid.
             */
            public Builder isValid(Boolean isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * MainAccountType.
             */
            public Builder mainAccountType(String mainAccountType) {
                this.mainAccountType = mainAccountType;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UserProfileDTO.
             */
            public Builder userProfileDTO(UserProfileDTO userProfileDTO) {
                this.userProfileDTO = userProfileDTO;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFormDatasResponseBody</p>
 */
public class SearchFormDatasResponseBody extends TeaModel {
    @NameInMap("currentPage")
    private Integer currentPage;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Integer totalCount;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private SearchFormDatasResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFormDatasResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public SearchFormDatasResponseBody build() {
            return new SearchFormDatasResponseBody(this);
        } 

    } 

    public static class UserName extends TeaModel {
        @NameInMap("NameInChinese")
        private String nameInChinese;

        @NameInMap("NameInEnglish")
        private String nameInEnglish;

        @NameInMap("Type")
        private String type;

        private UserName(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserName create() {
            return builder().build();
        }

        /**
         * @return nameInChinese
         */
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        /**
         * @return nameInEnglish
         */
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 
            private String type; 

            /**
             * NameInChinese.
             */
            public Builder nameInChinese(String nameInChinese) {
                this.nameInChinese = nameInChinese;
                return this;
            }

            /**
             * NameInEnglish.
             */
            public Builder nameInEnglish(String nameInEnglish) {
                this.nameInEnglish = nameInEnglish;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserName build() {
                return new UserName(this);
            } 

        } 

    }
    public static class ModifyUser extends TeaModel {
        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private UserName userName;

        private ModifyUser(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyUser create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public UserName getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private UserName userName; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(UserName userName) {
                this.userName = userName;
                return this;
            }

            public ModifyUser build() {
                return new ModifyUser(this);
            } 

        } 

    }
    public static class OriginatorUserName extends TeaModel {
        @NameInMap("NameInChinese")
        private String nameInChinese;

        @NameInMap("NameInEnglish")
        private String nameInEnglish;

        @NameInMap("Type")
        private String type;

        private OriginatorUserName(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginatorUserName create() {
            return builder().build();
        }

        /**
         * @return nameInChinese
         */
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        /**
         * @return nameInEnglish
         */
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 
            private String type; 

            /**
             * NameInChinese.
             */
            public Builder nameInChinese(String nameInChinese) {
                this.nameInChinese = nameInChinese;
                return this;
            }

            /**
             * NameInEnglish.
             */
            public Builder nameInEnglish(String nameInEnglish) {
                this.nameInEnglish = nameInEnglish;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OriginatorUserName build() {
                return new OriginatorUserName(this);
            } 

        } 

    }
    public static class Originator extends TeaModel {
        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private OriginatorUserName userName;

        private Originator(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Originator create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public OriginatorUserName getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private OriginatorUserName userName; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(OriginatorUserName userName) {
                this.userName = userName;
                return this;
            }

            public Originator build() {
                return new Originator(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreatedTimeGMT")
        private String createdTimeGMT;

        @NameInMap("CreatorUserId")
        private String creatorUserId;

        @NameInMap("DataId")
        private Long dataId;

        @NameInMap("FormData")
        private java.util.Map < String, ? > formData;

        @NameInMap("FormInstanceId")
        private String formInstanceId;

        @NameInMap("FormUuid")
        private String formUuid;

        @NameInMap("InstanceValue")
        private String instanceValue;

        @NameInMap("ModelUuid")
        private String modelUuid;

        @NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @NameInMap("ModifierUserId")
        private String modifierUserId;

        @NameInMap("ModifyUser")
        private ModifyUser modifyUser;

        @NameInMap("Originator")
        private Originator originator;

        @NameInMap("Sequence")
        private String sequence;

        @NameInMap("SerialNo")
        private String serialNo;

        @NameInMap("Title")
        private String title;

        @NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.createdTimeGMT = builder.createdTimeGMT;
            this.creatorUserId = builder.creatorUserId;
            this.dataId = builder.dataId;
            this.formData = builder.formData;
            this.formInstanceId = builder.formInstanceId;
            this.formUuid = builder.formUuid;
            this.instanceValue = builder.instanceValue;
            this.modelUuid = builder.modelUuid;
            this.modifiedTimeGMT = builder.modifiedTimeGMT;
            this.modifierUserId = builder.modifierUserId;
            this.modifyUser = builder.modifyUser;
            this.originator = builder.originator;
            this.sequence = builder.sequence;
            this.serialNo = builder.serialNo;
            this.title = builder.title;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTimeGMT
         */
        public String getCreatedTimeGMT() {
            return this.createdTimeGMT;
        }

        /**
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return dataId
         */
        public Long getDataId() {
            return this.dataId;
        }

        /**
         * @return formData
         */
        public java.util.Map < String, ? > getFormData() {
            return this.formData;
        }

        /**
         * @return formInstanceId
         */
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        /**
         * @return formUuid
         */
        public String getFormUuid() {
            return this.formUuid;
        }

        /**
         * @return instanceValue
         */
        public String getInstanceValue() {
            return this.instanceValue;
        }

        /**
         * @return modelUuid
         */
        public String getModelUuid() {
            return this.modelUuid;
        }

        /**
         * @return modifiedTimeGMT
         */
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        /**
         * @return modifierUserId
         */
        public String getModifierUserId() {
            return this.modifierUserId;
        }

        /**
         * @return modifyUser
         */
        public ModifyUser getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return originator
         */
        public Originator getOriginator() {
            return this.originator;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createdTimeGMT; 
            private String creatorUserId; 
            private Long dataId; 
            private java.util.Map < String, ? > formData; 
            private String formInstanceId; 
            private String formUuid; 
            private String instanceValue; 
            private String modelUuid; 
            private String modifiedTimeGMT; 
            private String modifierUserId; 
            private ModifyUser modifyUser; 
            private Originator originator; 
            private String sequence; 
            private String serialNo; 
            private String title; 
            private Long version; 

            /**
             * CreatedTimeGMT.
             */
            public Builder createdTimeGMT(String createdTimeGMT) {
                this.createdTimeGMT = createdTimeGMT;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(Long dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FormData.
             */
            public Builder formData(java.util.Map < String, ? > formData) {
                this.formData = formData;
                return this;
            }

            /**
             * FormInstanceId.
             */
            public Builder formInstanceId(String formInstanceId) {
                this.formInstanceId = formInstanceId;
                return this;
            }

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * InstanceValue.
             */
            public Builder instanceValue(String instanceValue) {
                this.instanceValue = instanceValue;
                return this;
            }

            /**
             * ModelUuid.
             */
            public Builder modelUuid(String modelUuid) {
                this.modelUuid = modelUuid;
                return this;
            }

            /**
             * ModifiedTimeGMT.
             */
            public Builder modifiedTimeGMT(String modifiedTimeGMT) {
                this.modifiedTimeGMT = modifiedTimeGMT;
                return this;
            }

            /**
             * ModifierUserId.
             */
            public Builder modifierUserId(String modifierUserId) {
                this.modifierUserId = modifierUserId;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(ModifyUser modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * Originator.
             */
            public Builder originator(Originator originator) {
                this.originator = originator;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

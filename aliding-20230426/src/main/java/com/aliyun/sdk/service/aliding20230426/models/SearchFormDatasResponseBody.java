// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFormDatasResponseBody</p>
 */
public class SearchFormDatasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(SearchFormDatasResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

    /**
     * 
     * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFormDatasResponseBody</p>
     */
    public static class UserName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(UserName model) {
                this.nameInChinese = model.nameInChinese;
                this.nameInEnglish = model.nameInEnglish;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFormDatasResponseBody</p>
     */
    public static class ModifyUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(ModifyUser model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

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
    /**
     * 
     * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFormDatasResponseBody</p>
     */
    public static class OriginatorUserName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(OriginatorUserName model) {
                this.nameInChinese = model.nameInChinese;
                this.nameInEnglish = model.nameInEnglish;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFormDatasResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(Originator model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

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
    /**
     * 
     * {@link SearchFormDatasResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFormDatasResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTimeGMT")
        private String createdTimeGMT;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private String creatorUserId;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private Long dataId;

        @com.aliyun.core.annotation.NameInMap("FormData")
        private java.util.Map<String, ?> formData;

        @com.aliyun.core.annotation.NameInMap("FormInstanceId")
        private String formInstanceId;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceValue")
        private String instanceValue;

        @com.aliyun.core.annotation.NameInMap("ModelUuid")
        private String modelUuid;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @com.aliyun.core.annotation.NameInMap("ModifierUserId")
        private String modifierUserId;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private ModifyUser modifyUser;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private Originator originator;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Version")
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
        public java.util.Map<String, ?> getFormData() {
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
            private java.util.Map<String, ?> formData; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdTimeGMT = model.createdTimeGMT;
                this.creatorUserId = model.creatorUserId;
                this.dataId = model.dataId;
                this.formData = model.formData;
                this.formInstanceId = model.formInstanceId;
                this.formUuid = model.formUuid;
                this.instanceValue = model.instanceValue;
                this.modelUuid = model.modelUuid;
                this.modifiedTimeGMT = model.modifiedTimeGMT;
                this.modifierUserId = model.modifierUserId;
                this.modifyUser = model.modifyUser;
                this.originator = model.originator;
                this.sequence = model.sequence;
                this.serialNo = model.serialNo;
                this.title = model.title;
                this.version = model.version;
            } 

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
            public Builder formData(java.util.Map<String, ?> formData) {
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

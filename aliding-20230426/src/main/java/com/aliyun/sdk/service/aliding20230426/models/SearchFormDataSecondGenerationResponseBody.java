// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFormDataSecondGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFormDataSecondGenerationResponseBody</p>
 */
public class SearchFormDataSecondGenerationResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private SearchFormDataSecondGenerationResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFormDataSecondGenerationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
    public Long getTotalCount() {
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
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
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
        public Builder totalCount(Long totalCount) {
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

        public SearchFormDataSecondGenerationResponseBody build() {
            return new SearchFormDataSecondGenerationResponseBody(this);
        } 

    } 

    public static class Name extends TeaModel {
        @NameInMap("NameInChinese")
        private String nameInChinese;

        @NameInMap("NameInEnglish")
        private String nameInEnglish;

        private Name(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Name create() {
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

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 

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

            public Name build() {
                return new Name(this);
            } 

        } 

    }
    public static class ModifyUser extends TeaModel {
        @NameInMap("Name")
        private Name name;

        @NameInMap("UserId")
        private String userId;

        private ModifyUser(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyUser create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public Name getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Name name; 
            private String userId; 

            /**
             * Name.
             */
            public Builder name(Name name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ModifyUser build() {
                return new ModifyUser(this);
            } 

        } 

    }
    public static class OriginatorName extends TeaModel {
        @NameInMap("NameInChinese")
        private String nameInChinese;

        @NameInMap("NameInEnglish")
        private String nameInEnglish;

        private OriginatorName(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginatorName create() {
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

        public static final class Builder {
            private String nameInChinese; 
            private String nameInEnglish; 

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

            public OriginatorName build() {
                return new OriginatorName(this);
            } 

        } 

    }
    public static class Originator extends TeaModel {
        @NameInMap("Name")
        private OriginatorName name;

        @NameInMap("UserId")
        private String userId;

        private Originator(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Originator create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public OriginatorName getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private OriginatorName name; 
            private String userId; 

            /**
             * Name.
             */
            public Builder name(OriginatorName name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Originator build() {
                return new Originator(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @NameInMap("CreatorUserId")
        private String creatorUserId;

        @NameInMap("FormData")
        private java.util.Map < String, ? > formData;

        @NameInMap("FormInstanceId")
        private String formInstanceId;

        @NameInMap("FormUuid")
        private String formUuid;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceValue")
        private String instanceValue;

        @NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("ModifyUser")
        private ModifyUser modifyUser;

        @NameInMap("Originator")
        private Originator originator;

        @NameInMap("Sequence")
        private String sequence;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Title")
        private String title;

        @NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.createTimeGMT = builder.createTimeGMT;
            this.creatorUserId = builder.creatorUserId;
            this.formData = builder.formData;
            this.formInstanceId = builder.formInstanceId;
            this.formUuid = builder.formUuid;
            this.id = builder.id;
            this.instanceValue = builder.instanceValue;
            this.modifiedTimeGMT = builder.modifiedTimeGMT;
            this.modifier = builder.modifier;
            this.modifyUser = builder.modifyUser;
            this.originator = builder.originator;
            this.sequence = builder.sequence;
            this.serialNumber = builder.serialNumber;
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
         * @return createTimeGMT
         */
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        /**
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceValue
         */
        public String getInstanceValue() {
            return this.instanceValue;
        }

        /**
         * @return modifiedTimeGMT
         */
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
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
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
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
            private String createTimeGMT; 
            private String creatorUserId; 
            private java.util.Map < String, ? > formData; 
            private String formInstanceId; 
            private String formUuid; 
            private Long id; 
            private String instanceValue; 
            private String modifiedTimeGMT; 
            private String modifier; 
            private ModifyUser modifyUser; 
            private Originator originator; 
            private String sequence; 
            private String serialNumber; 
            private String title; 
            private Long version; 

            /**
             * CreateTimeGMT.
             */
            public Builder createTimeGMT(String createTimeGMT) {
                this.createTimeGMT = createTimeGMT;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * ModifiedTimeGMT.
             */
            public Builder modifiedTimeGMT(String modifiedTimeGMT) {
                this.modifiedTimeGMT = modifiedTimeGMT;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
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
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
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

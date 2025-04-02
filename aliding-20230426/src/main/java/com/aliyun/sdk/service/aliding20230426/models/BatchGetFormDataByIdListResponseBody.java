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
 * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetFormDataByIdListResponseBody</p>
 */
public class BatchGetFormDataByIdListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private BatchGetFormDataByIdListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetFormDataByIdListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
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
        private String requestId; 
        private java.util.List<Result> result; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(BatchGetFormDataByIdListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
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

        public BatchGetFormDataByIdListResponseBody build() {
            return new BatchGetFormDataByIdListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetFormDataByIdListResponseBody</p>
     */
    public static class Name extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
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

            private Builder() {
            } 

            private Builder(Name model) {
                this.nameInChinese = model.nameInChinese;
                this.nameInEnglish = model.nameInEnglish;
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

            public Name build() {
                return new Name(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetFormDataByIdListResponseBody</p>
     */
    public static class ModifyUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private Name name;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(ModifyUser model) {
                this.name = model.name;
                this.userId = model.userId;
            } 

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
    /**
     * 
     * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetFormDataByIdListResponseBody</p>
     */
    public static class OriginatorName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
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

            private Builder() {
            } 

            private Builder(OriginatorName model) {
                this.nameInChinese = model.nameInChinese;
                this.nameInEnglish = model.nameInEnglish;
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

            public OriginatorName build() {
                return new OriginatorName(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetFormDataByIdListResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private OriginatorName name;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(Originator model) {
                this.name = model.name;
                this.userId = model.userId;
            } 

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
    /**
     * 
     * {@link BatchGetFormDataByIdListResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetFormDataByIdListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private String creatorUserId;

        @com.aliyun.core.annotation.NameInMap("FormData")
        private java.util.Map<String, ?> formData;

        @com.aliyun.core.annotation.NameInMap("FormInstanceId")
        private String formInstanceId;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceValue")
        private String instanceValue;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private ModifyUser modifyUser;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private Originator originator;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Result(Builder builder) {
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

        public static Result create() {
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
            private java.util.Map<String, ?> formData; 
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTimeGMT = model.createTimeGMT;
                this.creatorUserId = model.creatorUserId;
                this.formData = model.formData;
                this.formInstanceId = model.formInstanceId;
                this.formUuid = model.formUuid;
                this.id = model.id;
                this.instanceValue = model.instanceValue;
                this.modifiedTimeGMT = model.modifiedTimeGMT;
                this.modifier = model.modifier;
                this.modifyUser = model.modifyUser;
                this.originator = model.originator;
                this.sequence = model.sequence;
                this.serialNumber = model.serialNumber;
                this.title = model.title;
                this.version = model.version;
            } 

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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

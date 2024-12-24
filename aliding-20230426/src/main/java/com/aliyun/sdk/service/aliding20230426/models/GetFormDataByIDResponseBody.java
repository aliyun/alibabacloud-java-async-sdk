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
 * {@link GetFormDataByIDResponseBody} extends {@link TeaModel}
 *
 * <p>GetFormDataByIDResponseBody</p>
 */
public class GetFormDataByIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("formData")
    private java.util.Map<String, ?> formData;

    @com.aliyun.core.annotation.NameInMap("formInstId")
    private String formInstId;

    @com.aliyun.core.annotation.NameInMap("modifiedTimeGMT")
    private String modifiedTimeGMT;

    @com.aliyun.core.annotation.NameInMap("originator")
    private Originator originator;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetFormDataByIDResponseBody(Builder builder) {
        this.formData = builder.formData;
        this.formInstId = builder.formInstId;
        this.modifiedTimeGMT = builder.modifiedTimeGMT;
        this.originator = builder.originator;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFormDataByIDResponseBody create() {
        return builder().build();
    }

    /**
     * @return formData
     */
    public java.util.Map<String, ?> getFormData() {
        return this.formData;
    }

    /**
     * @return formInstId
     */
    public String getFormInstId() {
        return this.formInstId;
    }

    /**
     * @return modifiedTimeGMT
     */
    public String getModifiedTimeGMT() {
        return this.modifiedTimeGMT;
    }

    /**
     * @return originator
     */
    public Originator getOriginator() {
        return this.originator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.Map<String, ?> formData; 
        private String formInstId; 
        private String modifiedTimeGMT; 
        private Originator originator; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * formData.
         */
        public Builder formData(java.util.Map<String, ?> formData) {
            this.formData = formData;
            return this;
        }

        /**
         * formInstId.
         */
        public Builder formInstId(String formInstId) {
            this.formInstId = formInstId;
            return this;
        }

        /**
         * modifiedTimeGMT.
         */
        public Builder modifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }

        /**
         * originator.
         */
        public Builder originator(Originator originator) {
            this.originator = originator;
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

        public GetFormDataByIDResponseBody build() {
            return new GetFormDataByIDResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFormDataByIDResponseBody} extends {@link TeaModel}
     *
     * <p>GetFormDataByIDResponseBody</p>
     */
    public static class Name extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Name(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
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

            public Name build() {
                return new Name(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFormDataByIDResponseBody} extends {@link TeaModel}
     *
     * <p>GetFormDataByIDResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentName")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Name name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Originator(Builder builder) {
            this.departmentName = builder.departmentName;
            this.email = builder.email;
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
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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
            private String departmentName; 
            private String email; 
            private Name name; 
            private String userId; 

            /**
             * DepartmentName.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
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

            public Originator build() {
                return new Originator(this);
            } 

        } 

    }
}

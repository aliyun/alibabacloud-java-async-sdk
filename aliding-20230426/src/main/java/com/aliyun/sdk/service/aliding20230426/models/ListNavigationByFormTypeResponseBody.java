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
 * {@link ListNavigationByFormTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListNavigationByFormTypeResponseBody</p>
 */
public class ListNavigationByFormTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListNavigationByFormTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNavigationByFormTypeResponseBody create() {
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

        private Builder(ListNavigationByFormTypeResponseBody model) {
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

        public ListNavigationByFormTypeResponseBody build() {
            return new ListNavigationByFormTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNavigationByFormTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListNavigationByFormTypeResponseBody</p>
     */
    public static class Title extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameInChinese")
        private String nameInChinese;

        @com.aliyun.core.annotation.NameInMap("NameInEnglish")
        private String nameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Title(Builder builder) {
            this.nameInChinese = builder.nameInChinese;
            this.nameInEnglish = builder.nameInEnglish;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Title create() {
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

            private Builder(Title model) {
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

            public Title build() {
                return new Title(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNavigationByFormTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListNavigationByFormTypeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("ProcessCode")
        private String processCode;

        @com.aliyun.core.annotation.NameInMap("Title")
        private Title title;

        private Result(Builder builder) {
            this.formUuid = builder.formUuid;
            this.processCode = builder.processCode;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return formUuid
         */
        public String getFormUuid() {
            return this.formUuid;
        }

        /**
         * @return processCode
         */
        public String getProcessCode() {
            return this.processCode;
        }

        /**
         * @return title
         */
        public Title getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String formUuid; 
            private String processCode; 
            private Title title; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.formUuid = model.formUuid;
                this.processCode = model.processCode;
                this.title = model.title;
            } 

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * ProcessCode.
             */
            public Builder processCode(String processCode) {
                this.processCode = processCode;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(Title title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

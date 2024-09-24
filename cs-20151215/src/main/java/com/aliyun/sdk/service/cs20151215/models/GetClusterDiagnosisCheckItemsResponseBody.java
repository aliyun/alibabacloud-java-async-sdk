// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDiagnosisCheckItemsResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDiagnosisCheckItemsResponseBody</p>
 */
public class GetClusterDiagnosisCheckItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("check_items")
    private java.util.List < CheckItems> checkItems;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("is_success")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private GetClusterDiagnosisCheckItemsResponseBody(Builder builder) {
        this.checkItems = builder.checkItems;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDiagnosisCheckItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkItems
     */
    public java.util.List < CheckItems> getCheckItems() {
        return this.checkItems;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckItems> checkItems; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * The check item.
         */
        public Builder checkItems(java.util.List < CheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the check is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterDiagnosisCheckItemsResponseBody build() {
            return new GetClusterDiagnosisCheckItemsResponseBody(this);
        } 

    } 

    public static class CheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("refer")
        private String refer;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private CheckItems(Builder builder) {
            this.desc = builder.desc;
            this.display = builder.display;
            this.group = builder.group;
            this.level = builder.level;
            this.message = builder.message;
            this.name = builder.name;
            this.refer = builder.refer;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItems create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return refer
         */
        public String getRefer() {
            return this.refer;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private String display; 
            private String group; 
            private String level; 
            private String message; 
            private String name; 
            private String refer; 
            private String value; 

            /**
             * The description.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The display name.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * The name of the group to which the check item belongs.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The severity level of the check result.
             * <p>
             * 
             * Valid values:
             * 
             * *   normal
             * *   warning
             * *   error
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The check result.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The reference value.
             */
            public Builder refer(String refer) {
                this.refer = refer;
                return this;
            }

            /**
             * The value of the check item.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CheckItems build() {
                return new CheckItems(this);
            } 

        } 

    }
}

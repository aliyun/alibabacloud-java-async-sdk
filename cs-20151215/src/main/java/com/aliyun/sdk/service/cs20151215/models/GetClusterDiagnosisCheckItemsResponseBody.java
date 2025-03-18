// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterDiagnosisCheckItemsResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDiagnosisCheckItemsResponseBody</p>
 */
public class GetClusterDiagnosisCheckItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("check_items")
    private java.util.List<CheckItems> checkItems;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkItems
     */
    public java.util.List<CheckItems> getCheckItems() {
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
        private java.util.List<CheckItems> checkItems; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClusterDiagnosisCheckItemsResponseBody model) {
            this.checkItems = model.checkItems;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The check item.</p>
         */
        public Builder checkItems(java.util.List<CheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the check is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1DFFD8C6-259E-582B-8B40-002C17DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterDiagnosisCheckItemsResponseBody build() {
            return new GetClusterDiagnosisCheckItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterDiagnosisCheckItemsResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterDiagnosisCheckItemsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CheckItems model) {
                this.desc = model.desc;
                this.display = model.display;
                this.group = model.group;
                this.level = model.level;
                this.message = model.message;
                this.name = model.name;
                this.refer = model.refer;
                this.value = model.value;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Check whether the node can access host dns service</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>HostDNS</p>
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The name of the group to which the check item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The severity level of the check result.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>normal</li>
             * <li>warning</li>
             * <li>error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The check result.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>HostDNS</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The reference value.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder refer(String refer) {
                this.refer = refer;
                return this;
            }

            /**
             * <p>The value of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
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

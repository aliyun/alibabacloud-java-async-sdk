// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link PrecheckDuckDBDependencyResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckDuckDBDependencyResponseBody</p>
 */
public class PrecheckDuckDBDependencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCheckItems")
    private java.util.List<FailedCheckItems> failedCheckItems;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private PrecheckDuckDBDependencyResponseBody(Builder builder) {
        this.failedCheckItems = builder.failedCheckItems;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckDuckDBDependencyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedCheckItems
     */
    public java.util.List<FailedCheckItems> getFailedCheckItems() {
        return this.failedCheckItems;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private java.util.List<FailedCheckItems> failedCheckItems; 
        private Boolean result; 

        private Builder() {
        } 

        private Builder(PrecheckDuckDBDependencyResponseBody model) {
            this.failedCheckItems = model.failedCheckItems;
            this.result = model.result;
        } 

        /**
         * <p>The check items that do not meet the requirements for creating DuckDB-based analytical instances.</p>
         */
        public Builder failedCheckItems(java.util.List<FailedCheckItems> failedCheckItems) {
            this.failedCheckItems = failedCheckItems;
            return this;
        }

        /**
         * <p>Indicates whether the primary instance meet the requirements for creating DuckDB-based analytical instances. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public PrecheckDuckDBDependencyResponseBody build() {
            return new PrecheckDuckDBDependencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckDuckDBDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>PrecheckDuckDBDependencyResponseBody</p>
     */
    public static class FailedCheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowAutoModify")
        private Boolean allowAutoModify;

        @com.aliyun.core.annotation.NameInMap("CurrentValue")
        private String currentValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RequiredValue")
        private String requiredValue;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FailedCheckItems(Builder builder) {
            this.allowAutoModify = builder.allowAutoModify;
            this.currentValue = builder.currentValue;
            this.name = builder.name;
            this.requiredValue = builder.requiredValue;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedCheckItems create() {
            return builder().build();
        }

        /**
         * @return allowAutoModify
         */
        public Boolean getAllowAutoModify() {
            return this.allowAutoModify;
        }

        /**
         * @return currentValue
         */
        public String getCurrentValue() {
            return this.currentValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requiredValue
         */
        public String getRequiredValue() {
            return this.requiredValue;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean allowAutoModify; 
            private String currentValue; 
            private String name; 
            private String requiredValue; 
            private String type; 

            private Builder() {
            } 

            private Builder(FailedCheckItems model) {
                this.allowAutoModify = model.allowAutoModify;
                this.currentValue = model.currentValue;
                this.name = model.name;
                this.requiredValue = model.requiredValue;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the item can be changed with one click to meet the requirements.</p>
             * <ul>
             * <li><strong>true</strong>: Yes. You can call the <a href="https://help.aliyun.com/document_detail/2623684.html">ModifyDBInstanceConfig</a> operation to change the item with one click.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p> If the major engine version of the primary does not meet the requirements, you must manually upgrade it.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowAutoModify(Boolean allowAutoModify) {
                this.allowAutoModify = allowAutoModify;
                return this;
            }

            /**
             * <p>The current value of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>15.0</p>
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>MajorVersion</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value or value range that meets the requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>17.0</p>
             */
            public Builder requiredValue(String requiredValue) {
                this.requiredValue = requiredValue;
                return this;
            }

            /**
             * <p>The check item. Valid values:</p>
             * <ul>
             * <li><strong>Parameter</strong>: The parameters of the primary instance.</li>
             * <li><strong>MinorVersion</strong>: The minor engine version of the primary instance.</li>
             * <li><strong>MajorVersion</strong>: The major engine version of the primary instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Parameter</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FailedCheckItems build() {
                return new FailedCheckItems(this);
            } 

        } 

    }
}

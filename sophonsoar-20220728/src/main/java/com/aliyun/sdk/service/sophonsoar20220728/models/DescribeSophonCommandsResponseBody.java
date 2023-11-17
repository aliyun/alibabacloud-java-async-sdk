// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSophonCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSophonCommandsResponseBody</p>
 */
public class DescribeSophonCommandsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSophonCommandsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSophonCommandsResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public DescribeSophonCommandsResponseBody build() {
            return new DescribeSophonCommandsResponseBody(this);
        } 

    } 

    public static class ParamConfig extends TeaModel {
        @NameInMap("CheckField")
        private String checkField;

        @NameInMap("Field")
        private String field;

        @NameInMap("Necessary")
        private Boolean necessary;

        @NameInMap("Value")
        private String value;

        private ParamConfig(Builder builder) {
            this.checkField = builder.checkField;
            this.field = builder.field;
            this.necessary = builder.necessary;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamConfig create() {
            return builder().build();
        }

        /**
         * @return checkField
         */
        public String getCheckField() {
            return this.checkField;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return necessary
         */
        public Boolean getNecessary() {
            return this.necessary;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String checkField; 
            private String field; 
            private Boolean necessary; 
            private String value; 

            /**
             * CheckField.
             */
            public Builder checkField(String checkField) {
                this.checkField = checkField;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Necessary.
             */
            public Builder necessary(Boolean necessary) {
                this.necessary = necessary;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamConfig build() {
                return new ParamConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParamConfig")
        private java.util.List < ParamConfig> paramConfig;

        private Data(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.paramConfig = builder.paramConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paramConfig
         */
        public java.util.List < ParamConfig> getParamConfig() {
            return this.paramConfig;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private java.util.List < ParamConfig> paramConfig; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * ParamConfig.
             */
            public Builder paramConfig(java.util.List < ParamConfig> paramConfig) {
                this.paramConfig = paramConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

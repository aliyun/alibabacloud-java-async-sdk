// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeSophonCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSophonCommandsResponseBody</p>
 */
public class DescribeSophonCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSophonCommandsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The commands.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E1EC464-3BD7-518F-9937-BCC12E6855FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSophonCommandsResponseBody build() {
            return new DescribeSophonCommandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSophonCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSophonCommandsResponseBody</p>
     */
    public static class ParamConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckField")
        private String checkField;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Necessary")
        private Boolean necessary;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ParamConfig model) {
                this.checkField = model.checkField;
                this.field = model.field;
                this.necessary = model.necessary;
                this.value = model.value;
            } 

            /**
             * <p>The regular expression that is used to check the format of the parameter value. If the parameter is left empty, the check is not performed.</p>
             * 
             * <strong>example:</strong>
             * <p>[0-9]{4}.[0-9]{4}.[0-9]{4}.[0-9]{4}</p>
             */
            public Builder checkField(String checkField) {
                this.checkField = checkField;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder necessary(Boolean necessary) {
                this.necessary = necessary;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>12.xx.xx.xx</p>
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
    /**
     * 
     * {@link DescribeSophonCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSophonCommandsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParamConfig")
        private java.util.List<ParamConfig> paramConfig;

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
        public java.util.List<ParamConfig> getParamConfig() {
            return this.paramConfig;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private java.util.List<ParamConfig> paramConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.paramConfig = model.paramConfig;
            } 

            /**
             * <p>The description of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a action of processing for WAF</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>WAF Process IP</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_process_ip_v2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter configurations.</p>
             */
            public Builder paramConfig(java.util.List<ParamConfig> paramConfig) {
                this.paramConfig = paramConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

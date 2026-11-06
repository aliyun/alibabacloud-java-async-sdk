// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link PreviewTaskParametersResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewTaskParametersResponseBody</p>
 */
public class PreviewTaskParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreviewTaskParametersResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewTaskParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewTaskParametersResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The parameter preview results for each cycle.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewTaskParametersResponseBody build() {
            return new PreviewTaskParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewTaskParametersResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewTaskParametersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TriggerTime")
        private Long triggerTime;

        private Items(Builder builder) {
            this.bizdate = builder.bizdate;
            this.errorMessage = builder.errorMessage;
            this.parameters = builder.parameters;
            this.success = builder.success;
            this.triggerTime = builder.triggerTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return triggerTime
         */
        public Long getTriggerTime() {
            return this.triggerTime;
        }

        public static final class Builder {
            private Long bizdate; 
            private String errorMessage; 
            private String parameters; 
            private Boolean success; 
            private Long triggerTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bizdate = model.bizdate;
                this.errorMessage = model.errorMessage;
                this.parameters = model.parameters;
                this.success = model.success;
                this.triggerTime = model.triggerTime;
            } 

            /**
             * <p>The business date of the cycle. The value is a 13-digit UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792425600000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The error message returned when the parsing for the cycle fails. This parameter is returned when Success is false and is not returned when Success is true.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to parse scheduling parameters. Check the parameter settings.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The complete script parameter string parsed for the cycle. Multiple parameters are separated by spaces. This parameter is returned when Success is true.</p>
             * 
             * <strong>example:</strong>
             * <p>para1=20261020 para2=00</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>Specifies whether the scheduling parameters for the cycle are parsed successfully. Valid values:</p>
             * <ul>
             * <li>true: The parsing is successful.</li>
             * <li>false: The parsing fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The simulated scheduled trigger time. The value is a 13-digit UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792512000000</p>
             */
            public Builder triggerTime(Long triggerTime) {
                this.triggerTime = triggerTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}

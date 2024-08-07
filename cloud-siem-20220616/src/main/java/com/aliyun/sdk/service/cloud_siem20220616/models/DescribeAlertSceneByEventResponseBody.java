// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSceneByEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertSceneByEventResponseBody</p>
 */
public class DescribeAlertSceneByEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAlertSceneByEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSceneByEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertSceneByEventResponseBody build() {
            return new DescribeAlertSceneByEventResponseBody(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < String > values;

        private Targets(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 
            private java.util.List < String > values; 

            /**
             * The display name of the entity attribute field that can be added to the whitelist.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The entity attribute field that can be added to the whitelist.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The right operand that is displayed by default in the whitelist rule.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The supported right operands of the whitelist rule.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertNameId")
        private String alertNameId;

        @com.aliyun.core.annotation.NameInMap("AlertTile")
        private String alertTile;

        @com.aliyun.core.annotation.NameInMap("AlertTileId")
        private String alertTileId;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AlertTypeId")
        private String alertTypeId;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List < Targets> targets;

        private Data(Builder builder) {
            this.alertName = builder.alertName;
            this.alertNameId = builder.alertNameId;
            this.alertTile = builder.alertTile;
            this.alertTileId = builder.alertTileId;
            this.alertType = builder.alertType;
            this.alertTypeId = builder.alertTypeId;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertNameId
         */
        public String getAlertNameId() {
            return this.alertNameId;
        }

        /**
         * @return alertTile
         */
        public String getAlertTile() {
            return this.alertTile;
        }

        /**
         * @return alertTileId
         */
        public String getAlertTileId() {
            return this.alertTileId;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertTypeId
         */
        public String getAlertTypeId() {
            return this.alertTypeId;
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private String alertName; 
            private String alertNameId; 
            private String alertTile; 
            private String alertTileId; 
            private String alertType; 
            private String alertTypeId; 
            private java.util.List < Targets> targets; 

            /**
             * The alert name. The display name of the alert name varies based on the language of the system, such as Chinese and English.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The ID of the alert name.
             */
            public Builder alertNameId(String alertNameId) {
                this.alertNameId = alertNameId;
                return this;
            }

            /**
             * The alert title. The display name of the alert title varies based on the language of the system, such as Chinese and English.
             */
            public Builder alertTile(String alertTile) {
                this.alertTile = alertTile;
                return this;
            }

            /**
             * The ID of the alert title.
             */
            public Builder alertTileId(String alertTileId) {
                this.alertTileId = alertTileId;
                return this;
            }

            /**
             * The alert type. The display name of the alert type varies based on the language of the system, such as Chinese and English.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The ID of the alert type.
             */
            public Builder alertTypeId(String alertTypeId) {
                this.alertTypeId = alertTypeId;
                return this;
            }

            /**
             * The objects that can be added to the whitelist.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

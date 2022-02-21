// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigResponseBody</p>
 */
public class ListConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConfigItems")
    private ConfigItems configItems;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.configItems = builder.configItems;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configItems
     */
    public ConfigItems getConfigItems() {
        return this.configItems;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private ConfigItems configItems; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConfigItems.
         */
        public Builder configItems(ConfigItems configItems) {
            this.configItems = configItems;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConfigResponseBody build() {
            return new ListConfigResponseBody(this);
        } 

    } 

    public static class ConfigItem extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ConfigItem(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigItem build() {
                return new ConfigItem(this);
            } 

        } 

    }
    public static class ConfigItems extends TeaModel {
        @NameInMap("ConfigItem")
        private java.util.List < ConfigItem> configItem;

        private ConfigItems(Builder builder) {
            this.configItem = builder.configItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItems create() {
            return builder().build();
        }

        /**
         * @return configItem
         */
        public java.util.List < ConfigItem> getConfigItem() {
            return this.configItem;
        }

        public static final class Builder {
            private java.util.List < ConfigItem> configItem; 

            /**
             * ConfigItem.
             */
            public Builder configItem(java.util.List < ConfigItem> configItem) {
                this.configItem = configItem;
                return this;
            }

            public ConfigItems build() {
                return new ConfigItems(this);
            } 

        } 

    }
}

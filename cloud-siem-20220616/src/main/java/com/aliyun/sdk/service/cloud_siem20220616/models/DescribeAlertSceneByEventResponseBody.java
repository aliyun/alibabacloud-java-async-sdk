// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeAlertSceneByEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertSceneByEventResponseBody</p>
 */
public class DescribeAlertSceneByEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeAlertSceneByEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertSceneByEventResponseBody build() {
            return new DescribeAlertSceneByEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertSceneByEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertSceneByEventResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

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
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
                this.values = model.values;
            } 

            /**
             * <p>The display name of the entity attribute field that can be added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>host uuid</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The entity attribute field that can be added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>host_uuid</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The right operand that is displayed by default in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>441862da-a539-4cc0-a00d-47395582****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The supported right operands of the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;441862da-a539-4cc0-a00d-473955826881&quot;]</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertSceneByEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertSceneByEventResponseBody</p>
     */
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
        private java.util.List<Targets> targets;

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
        public java.util.List<Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private String alertName; 
            private String alertNameId; 
            private String alertTile; 
            private String alertTileId; 
            private String alertType; 
            private String alertTypeId; 
            private java.util.List<Targets> targets; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertName = model.alertName;
                this.alertNameId = model.alertNameId;
                this.alertTile = model.alertTile;
                this.alertTileId = model.alertTileId;
                this.alertType = model.alertType;
                this.alertTypeId = model.alertTypeId;
                this.targets = model.targets;
            } 

            /**
             * <p>The alert name. The display name of the alert name varies based on the language of the system, such as Chinese and English.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_ip</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The ID of the alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_ip</p>
             */
            public Builder alertNameId(String alertNameId) {
                this.alertNameId = alertNameId;
                return this;
            }

            /**
             * <p>The alert title. The display name of the alert title varies based on the language of the system, such as Chinese and English.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon-login_common_ip</p>
             */
            public Builder alertTile(String alertTile) {
                this.alertTile = alertTile;
                return this;
            }

            /**
             * <p>The ID of the alert title.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon-login_common_ip</p>
             */
            public Builder alertTileId(String alertTileId) {
                this.alertTileId = alertTileId;
                return this;
            }

            /**
             * <p>The alert type. The display name of the alert type varies based on the language of the system, such as Chinese and English.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The ID of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder alertTypeId(String alertTypeId) {
                this.alertTypeId = alertTypeId;
                return this;
            }

            /**
             * <p>The objects that can be added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Type&quot;: &quot;host_uuid&quot;,&quot;Value&quot;: &quot;441862da-a539-4cc0-a00d-473955826881&quot;,&quot;Values&quot;: [&quot;441862da-a539-4cc0-a00d-473955826881&quot;],&quot;Name&quot;: &quot;${aliyun.siem.entity.host_uuid}&quot;}]</p>
             */
            public Builder targets(java.util.List<Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

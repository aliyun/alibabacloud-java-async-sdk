// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link VerifyCheckCustomConfigResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCheckCustomConfigResponseBody</p>
 */
public class VerifyCheckCustomConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCheckConfigs")
    private java.util.List<ErrorCheckConfigs> errorCheckConfigs;

    @com.aliyun.core.annotation.NameInMap("ErrorRepairConfigs")
    private java.util.List<ErrorRepairConfigs> errorRepairConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyCheckCustomConfigResponseBody(Builder builder) {
        this.errorCheckConfigs = builder.errorCheckConfigs;
        this.errorRepairConfigs = builder.errorRepairConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckCustomConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCheckConfigs
     */
    public java.util.List<ErrorCheckConfigs> getErrorCheckConfigs() {
        return this.errorCheckConfigs;
    }

    /**
     * @return errorRepairConfigs
     */
    public java.util.List<ErrorRepairConfigs> getErrorRepairConfigs() {
        return this.errorRepairConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ErrorCheckConfigs> errorCheckConfigs; 
        private java.util.List<ErrorRepairConfigs> errorRepairConfigs; 
        private String requestId; 

        /**
         * <p>List of check parameters with configuration errors.</p>
         */
        public Builder errorCheckConfigs(java.util.List<ErrorCheckConfigs> errorCheckConfigs) {
            this.errorCheckConfigs = errorCheckConfigs;
            return this;
        }

        /**
         * <p>List of repair parameters with configuration check errors.</p>
         */
        public Builder errorRepairConfigs(java.util.List<ErrorRepairConfigs> errorRepairConfigs) {
            this.errorRepairConfigs = errorRepairConfigs;
            return this;
        }

        /**
         * <p>The ID of this call request, a unique identifier generated by Alibaba Cloud for the request, which can be used for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyCheckCustomConfigResponseBody build() {
            return new VerifyCheckCustomConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCheckCustomConfigResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigResponseBody</p>
     */
    public static class LinkErrorConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private LinkErrorConfigs(Builder builder) {
            this.name = builder.name;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkErrorConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String showName; 
            private String type; 

            /**
             * <p>Name of the check item configuration, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IpLists</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Display name of the user&quot;s check configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>IP Lists</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the parameter that caused the error:</p>
             * <ul>
             * <li>repair: Repair parameter</li>
             * <li>custom: Custom configuration parameter</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>repair</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LinkErrorConfigs build() {
                return new LinkErrorConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigResponseBody</p>
     */
    public static class ErrorCheckConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("LinkErrorConfigs")
        private java.util.List<LinkErrorConfigs> linkErrorConfigs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ErrorCheckConfigs(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.linkErrorConfigs = builder.linkErrorConfigs;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorCheckConfigs create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return linkErrorConfigs
         */
        public java.util.List<LinkErrorConfigs> getLinkErrorConfigs() {
            return this.linkErrorConfigs;
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

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private java.util.List<LinkErrorConfigs> linkErrorConfigs; 
            private String name; 
            private String type; 
            private String value; 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigEqualIllegal</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom parameter is not equal to corresponding check parameter</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Related configurations causing this error.</p>
             */
            public Builder linkErrorConfigs(java.util.List<LinkErrorConfigs> linkErrorConfigs) {
                this.linkErrorConfigs = linkErrorConfigs;
                return this;
            }

            /**
             * <p>Name of the custom configuration item for the check item, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IpList</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Type of the erroneous parameter:</p>
             * <ul>
             * <li>custom: Custom configuration parameter</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User-configured value string for the custom configuration item of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>10.12.4.XX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ErrorCheckConfigs build() {
                return new ErrorCheckConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigResponseBody</p>
     */
    public static class ErrorRepairConfigsLinkErrorConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ErrorRepairConfigsLinkErrorConfigs(Builder builder) {
            this.name = builder.name;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorRepairConfigsLinkErrorConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String showName; 
            private String type; 

            /**
             * <p>Name of the check item&quot;s configuration, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IpList</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Display name of the user&quot;s check configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Ip List</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the parameter that caused the error:</p>
             * <ul>
             * <li>repair: Repair parameter</li>
             * <li>custom: Custom configuration parameter</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ErrorRepairConfigsLinkErrorConfigs build() {
                return new ErrorRepairConfigsLinkErrorConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyCheckCustomConfigResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigResponseBody</p>
     */
    public static class ErrorRepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("LinkErrorConfigs")
        private java.util.List<ErrorRepairConfigsLinkErrorConfigs> linkErrorConfigs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ErrorRepairConfigs(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.linkErrorConfigs = builder.linkErrorConfigs;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorRepairConfigs create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return linkErrorConfigs
         */
        public java.util.List<ErrorRepairConfigsLinkErrorConfigs> getLinkErrorConfigs() {
            return this.linkErrorConfigs;
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

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private java.util.List<ErrorRepairConfigsLinkErrorConfigs> linkErrorConfigs; 
            private String name; 
            private String type; 
            private String value; 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigEqualIllegal</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Repair parameter is not equal to corresponding check parameter</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Related configurations causing this error.</p>
             */
            public Builder linkErrorConfigs(java.util.List<ErrorRepairConfigsLinkErrorConfigs> linkErrorConfigs) {
                this.linkErrorConfigs = linkErrorConfigs;
                return this;
            }

            /**
             * <p>Name of the check item&quot;s repair configuration, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IpLists</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the parameter that caused the error:</p>
             * <ul>
             * <li>repair: Repair parameter</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>repair</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Name of the check item&quot;s repair parameter, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>172.26.49.XX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ErrorRepairConfigs build() {
                return new ErrorRepairConfigs(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExtensionResponseBody} extends {@link TeaModel}
 *
 * <p>GetExtensionResponseBody</p>
 */
public class GetExtensionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extension")
    private Extension extension;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetExtensionResponseBody(Builder builder) {
        this.extension = builder.extension;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExtensionResponseBody create() {
        return builder().build();
    }

    /**
     * @return extension
     */
    public Extension getExtension() {
        return this.extension;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Extension extension; 
        private String requestId; 

        /**
         * The details of the extension.
         */
        public Builder extension(Extension extension) {
            this.extension = extension;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExtensionResponseBody build() {
            return new GetExtensionResponseBody(this);
        } 

    } 

    public static class BindEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        private BindEventList(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindEventList create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 

            /**
             * The code of the extension point event.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * The name of the extension point event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            public BindEventList build() {
                return new BindEventList(this);
            } 

        } 

    }
    public static class EventCategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryCode")
        private String categoryCode;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        private EventCategoryList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryName = builder.categoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCategoryList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        public static final class Builder {
            private String categoryCode; 
            private String categoryName; 

            /**
             * The code of the event type.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * The name of the event type.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            public EventCategoryList build() {
                return new EventCategoryList(this);
            } 

        } 

    }
    public static class Extension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindEventList")
        private java.util.List < BindEventList> bindEventList;

        @com.aliyun.core.annotation.NameInMap("DetailUrl")
        private String detailUrl;

        @com.aliyun.core.annotation.NameInMap("EventCategoryList")
        private java.util.List < EventCategoryList> eventCategoryList;

        @com.aliyun.core.annotation.NameInMap("ExtensionCode")
        private String extensionCode;

        @com.aliyun.core.annotation.NameInMap("ExtensionDesc")
        private String extensionDesc;

        @com.aliyun.core.annotation.NameInMap("ExtensionName")
        private String extensionName;

        @com.aliyun.core.annotation.NameInMap("HelpDocUrl")
        private String helpDocUrl;

        @com.aliyun.core.annotation.NameInMap("OptionSetting")
        private String optionSetting;

        @com.aliyun.core.annotation.NameInMap("ParameterSetting")
        private String parameterSetting;

        @com.aliyun.core.annotation.NameInMap("ProjectTesting")
        private Long projectTesting;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Extension(Builder builder) {
            this.bindEventList = builder.bindEventList;
            this.detailUrl = builder.detailUrl;
            this.eventCategoryList = builder.eventCategoryList;
            this.extensionCode = builder.extensionCode;
            this.extensionDesc = builder.extensionDesc;
            this.extensionName = builder.extensionName;
            this.helpDocUrl = builder.helpDocUrl;
            this.optionSetting = builder.optionSetting;
            this.parameterSetting = builder.parameterSetting;
            this.projectTesting = builder.projectTesting;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extension create() {
            return builder().build();
        }

        /**
         * @return bindEventList
         */
        public java.util.List < BindEventList> getBindEventList() {
            return this.bindEventList;
        }

        /**
         * @return detailUrl
         */
        public String getDetailUrl() {
            return this.detailUrl;
        }

        /**
         * @return eventCategoryList
         */
        public java.util.List < EventCategoryList> getEventCategoryList() {
            return this.eventCategoryList;
        }

        /**
         * @return extensionCode
         */
        public String getExtensionCode() {
            return this.extensionCode;
        }

        /**
         * @return extensionDesc
         */
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        /**
         * @return helpDocUrl
         */
        public String getHelpDocUrl() {
            return this.helpDocUrl;
        }

        /**
         * @return optionSetting
         */
        public String getOptionSetting() {
            return this.optionSetting;
        }

        /**
         * @return parameterSetting
         */
        public String getParameterSetting() {
            return this.parameterSetting;
        }

        /**
         * @return projectTesting
         */
        public Long getProjectTesting() {
            return this.projectTesting;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < BindEventList> bindEventList; 
            private String detailUrl; 
            private java.util.List < EventCategoryList> eventCategoryList; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String helpDocUrl; 
            private String optionSetting; 
            private String parameterSetting; 
            private Long projectTesting; 
            private Integer status; 

            /**
             * The extension point events.
             */
            public Builder bindEventList(java.util.List < BindEventList> bindEventList) {
                this.bindEventList = bindEventList;
                return this;
            }

            /**
             * The URL of the help document about the extension. You can visit the URL for the details of the extension.
             */
            public Builder detailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
                return this;
            }

            /**
             * The types of the events.
             */
            public Builder eventCategoryList(java.util.List < EventCategoryList> eventCategoryList) {
                this.eventCategoryList = eventCategoryList;
                return this;
            }

            /**
             * The unique code of the extension.
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * The description of the extension.
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * The name of the extension.
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * The URL of the help document about the extension.
             */
            public Builder helpDocUrl(String helpDocUrl) {
                this.helpDocUrl = helpDocUrl;
                return this;
            }

            /**
             * The option settings of the extension.
             */
            public Builder optionSetting(String optionSetting) {
                this.optionSetting = optionSetting;
                return this;
            }

            /**
             * The parameter settings of the extension. For more information, visit https://www.alibabacloud.com/help/en/dataworks/latest/set-extension-parameters.
             */
            public Builder parameterSetting(String parameterSetting) {
                this.parameterSetting = parameterSetting;
                return this;
            }

            /**
             * The workspace for testing. If the extension is in the testing state, the extension can be used only in the workspace for testing.
             */
            public Builder projectTesting(Long projectTesting) {
                this.projectTesting = projectTesting;
                return this;
            }

            /**
             * The state of the extension. 0: testing. 1: publishing. 3: disabled. 4: approving. 5: approved. 6: approval failed.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Extension build() {
                return new Extension(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The details of the extension.</p>
         */
        public Builder extension(Extension extension) {
            this.extension = extension;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExtensionResponseBody build() {
            return new GetExtensionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExtensionResponseBody} extends {@link TeaModel}
     *
     * <p>GetExtensionResponseBody</p>
     */
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
             * <p>The code of the extension point event.</p>
             * 
             * <strong>example:</strong>
             * <p>commit-file</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The name of the extension point event.</p>
             * 
             * <strong>example:</strong>
             * <p>File submission pre-event</p>
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
    /**
     * 
     * {@link GetExtensionResponseBody} extends {@link TeaModel}
     *
     * <p>GetExtensionResponseBody</p>
     */
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
             * <p>The code of the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>file-change</p>
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * <p>The name of the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>File change event</p>
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
    /**
     * 
     * {@link GetExtensionResponseBody} extends {@link TeaModel}
     *
     * <p>GetExtensionResponseBody</p>
     */
    public static class Extension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindEventList")
        private java.util.List<BindEventList> bindEventList;

        @com.aliyun.core.annotation.NameInMap("DetailUrl")
        private String detailUrl;

        @com.aliyun.core.annotation.NameInMap("EventCategoryList")
        private java.util.List<EventCategoryList> eventCategoryList;

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
        public java.util.List<BindEventList> getBindEventList() {
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
        public java.util.List<EventCategoryList> getEventCategoryList() {
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
            private java.util.List<BindEventList> bindEventList; 
            private String detailUrl; 
            private java.util.List<EventCategoryList> eventCategoryList; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String helpDocUrl; 
            private String optionSetting; 
            private String parameterSetting; 
            private Long projectTesting; 
            private Integer status; 

            /**
             * <p>The list of extension points.</p>
             */
            public Builder bindEventList(java.util.List<BindEventList> bindEventList) {
                this.bindEventList = bindEventList;
                return this;
            }

            /**
             * <p>The URL of the extension details page, on which users can view the details of the process blocked by the extension.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
             */
            public Builder detailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
                return this;
            }

            /**
             * <p>The list of event types.</p>
             */
            public Builder eventCategoryList(java.util.List<EventCategoryList> eventCategoryList) {
                this.eventCategoryList = eventCategoryList;
                return this;
            }

            /**
             * <p>The unique code of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>ce4*********086da5</p>
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * <p>The description of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a description</p>
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>Extension name</p>
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * <p>The URL of the help documentation of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
             */
            public Builder helpDocUrl(String helpDocUrl) {
                this.helpDocUrl = helpDocUrl;
                return this;
            }

            /**
             * <p>The options defined for the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>Option configuration</p>
             */
            public Builder optionSetting(String optionSetting) {
                this.optionSetting = optionSetting;
                return this;
            }

            /**
             * <p>The parameter settings of the extension. For more information, see <a href="https://help.aliyun.com/document_detail/405354.html">Configure extension parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>extension.project.disabled=projectId1,projectId2,projectId3</p>
             */
            public Builder parameterSetting(String parameterSetting) {
                this.parameterSetting = parameterSetting;
                return this;
            }

            /**
             * <p>The workspace for testing. If the extension is being tested, the extension can be used only in the workspace for testing.</p>
             * 
             * <strong>example:</strong>
             * <p>13552</p>
             */
            public Builder projectTesting(Long projectTesting) {
                this.projectTesting = projectTesting;
                return this;
            }

            /**
             * <p>The state of the extension. 0: Testing, 1: Publishing, 3: Disabled, 4: Processing, 5: Approved, 6: Approve Failed</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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

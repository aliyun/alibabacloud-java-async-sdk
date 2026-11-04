// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link RequestWhatsappConversionApiRequest} extends {@link RequestModel}
 *
 * <p>RequestWhatsappConversionApiRequest</p>
 */
public class RequestWhatsappConversionApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestData")
    private java.util.List<RequestData> requestData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RequestWhatsappConversionApiRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.pageId = builder.pageId;
        this.requestData = builder.requestData;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestWhatsappConversionApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
    }

    /**
     * @return requestData
     */
    public java.util.List<RequestData> getRequestData() {
        return this.requestData;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<RequestWhatsappConversionApiRequest, Builder> {
        private String custSpaceId; 
        private Long ownerId; 
        private String pageId; 
        private java.util.List<RequestData> requestData; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RequestWhatsappConversionApiRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.pageId = request.pageId;
            this.requestData = request.requestData;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The space ID or instance ID of the customer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>929399382</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The PageId of Meta.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1939848838</p>
         */
        public Builder pageId(String pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * <p>The request data.</p>
         */
        public Builder requestData(java.util.List<RequestData> requestData) {
            String requestDataShrink = shrink(requestData, "RequestData", "json");
            this.putQueryParameter("RequestData", requestDataShrink);
            this.requestData = requestData;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public RequestWhatsappConversionApiRequest build() {
            return new RequestWhatsappConversionApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link RequestWhatsappConversionApiRequest} extends {@link TeaModel}
     *
     * <p>RequestWhatsappConversionApiRequest</p>
     */
    public static class RequestData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionSource")
        @com.aliyun.core.annotation.Validation(required = true)
        private String actionSource;

        @com.aliyun.core.annotation.NameInMap("AppData")
        private java.util.Map<String, ?> appData;

        @com.aliyun.core.annotation.NameInMap("CustomData")
        private java.util.Map<String, ?> customData;

        @com.aliyun.core.annotation.NameInMap("DataProcessingOptions")
        private java.util.List<String> dataProcessingOptions;

        @com.aliyun.core.annotation.NameInMap("DataProcessingOptionsCountry")
        private Long dataProcessingOptionsCountry;

        @com.aliyun.core.annotation.NameInMap("DataProcessingOptionsState")
        private Long dataProcessingOptionsState;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventSourceUrl")
        private String eventSourceUrl;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("MessagingChannel")
        private String messagingChannel;

        @com.aliyun.core.annotation.NameInMap("OptOut")
        private Boolean optOut;

        @com.aliyun.core.annotation.NameInMap("UserData")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, ?> userData;

        private RequestData(Builder builder) {
            this.actionSource = builder.actionSource;
            this.appData = builder.appData;
            this.customData = builder.customData;
            this.dataProcessingOptions = builder.dataProcessingOptions;
            this.dataProcessingOptionsCountry = builder.dataProcessingOptionsCountry;
            this.dataProcessingOptionsState = builder.dataProcessingOptionsState;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.eventSourceUrl = builder.eventSourceUrl;
            this.eventTime = builder.eventTime;
            this.extInfo = builder.extInfo;
            this.messagingChannel = builder.messagingChannel;
            this.optOut = builder.optOut;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestData create() {
            return builder().build();
        }

        /**
         * @return actionSource
         */
        public String getActionSource() {
            return this.actionSource;
        }

        /**
         * @return appData
         */
        public java.util.Map<String, ?> getAppData() {
            return this.appData;
        }

        /**
         * @return customData
         */
        public java.util.Map<String, ?> getCustomData() {
            return this.customData;
        }

        /**
         * @return dataProcessingOptions
         */
        public java.util.List<String> getDataProcessingOptions() {
            return this.dataProcessingOptions;
        }

        /**
         * @return dataProcessingOptionsCountry
         */
        public Long getDataProcessingOptionsCountry() {
            return this.dataProcessingOptionsCountry;
        }

        /**
         * @return dataProcessingOptionsState
         */
        public Long getDataProcessingOptionsState() {
            return this.dataProcessingOptionsState;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventSourceUrl
         */
        public String getEventSourceUrl() {
            return this.eventSourceUrl;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return messagingChannel
         */
        public String getMessagingChannel() {
            return this.messagingChannel;
        }

        /**
         * @return optOut
         */
        public Boolean getOptOut() {
            return this.optOut;
        }

        /**
         * @return userData
         */
        public java.util.Map<String, ?> getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String actionSource; 
            private java.util.Map<String, ?> appData; 
            private java.util.Map<String, ?> customData; 
            private java.util.List<String> dataProcessingOptions; 
            private Long dataProcessingOptionsCountry; 
            private Long dataProcessingOptionsState; 
            private String eventId; 
            private String eventName; 
            private String eventSourceUrl; 
            private Long eventTime; 
            private java.util.Map<String, ?> extInfo; 
            private String messagingChannel; 
            private Boolean optOut; 
            private java.util.Map<String, ?> userData; 

            private Builder() {
            } 

            private Builder(RequestData model) {
                this.actionSource = model.actionSource;
                this.appData = model.appData;
                this.customData = model.customData;
                this.dataProcessingOptions = model.dataProcessingOptions;
                this.dataProcessingOptionsCountry = model.dataProcessingOptionsCountry;
                this.dataProcessingOptionsState = model.dataProcessingOptionsState;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.eventSourceUrl = model.eventSourceUrl;
                this.eventTime = model.eventTime;
                this.extInfo = model.extInfo;
                this.messagingChannel = model.messagingChannel;
                this.optOut = model.optOut;
                this.userData = model.userData;
            } 

            /**
             * <p>Specifies where the conversion occurred. Knowing where the event occurred helps ensure that ads are delivered to the correct audience. By using the Conversions API, you agree that the action_source parameter is accurate to the best of your knowledge.</p>
             * <p>The values you can send in the action_source field are as follows:</p>
             * <ul>
             * <li>email: The conversion occurred through email.</li>
             * <li>website: The conversion was made on a website.</li>
             * <li>app: The conversion was made on a shift application.</li>
             * <li>phone_call: The conversion was made over the phone.</li>
             * <li>chat: The conversion was made through a messaging app, SMS, or online messaging feature.</li>
             * <li>physical_store: The conversion was made in person at a physical store entity.</li>
             * <li>system_generated: The conversion occurred automatically, such as a subscribe renewal with Settings for monthly automatic payment.</li>
             * <li>other: The conversion was made through a method not listed in this topic.</li>
             * </ul>
             * <p>Note: All action source values support ads measurement and custom audience creation. All action sources except physical_store support ads optimization.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>business_messaging</p>
             */
            public Builder actionSource(String actionSource) {
                this.actionSource = actionSource;
                return this;
            }

            /**
             * <p>Required parameters for app events.</p>
             * <p>These parameters are used to share app data and device information with the Conversions API.</p>
             */
            public Builder appData(java.util.Map<String, ?> appData) {
                this.appData = appData;
                return this;
            }

            /**
             * <p>A map that contains additional business data for the event.</p>
             */
            public Builder customData(java.util.Map<String, ?> customData) {
                this.customData = customData;
                return this;
            }

            /**
             * <p>The processing options you want to enable for a specific event. For Limited Data Use, the currently accepted value is LDU. You can send an empty array to explicitly specify that the event must not be processed with Limited Data Use restrictions.</p>
             */
            public Builder dataProcessingOptions(java.util.List<String> dataProcessingOptions) {
                this.dataProcessingOptions = dataProcessingOptions;
                return this;
            }

            /**
             * <p>Required if you send LDU under data_processing_options.
             * The country you want to associate with this data processing option. Currently accepted values are 1 (representing the United States) or 0 (requesting that we geolocate this event).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataProcessingOptionsCountry(Long dataProcessingOptionsCountry) {
                this.dataProcessingOptionsCountry = dataProcessingOptionsCountry;
                return this;
            }

            /**
             * <p>Required in some cases. (See the notes below for details.)
             * The state you want to associate with this data processing option. Currently accepted values are 1000 (representing California) or 0 (requesting that we geolocate this event).</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder dataProcessingOptionsState(Long dataProcessingOptionsState) {
                this.dataProcessingOptionsState = dataProcessingOptionsState;
                return this;
            }

            /**
             * <p>This ID can be any unique string chosen by the advertiser. The event_name and event_id parameters are used to deduplicate events sent by a website (through Meta Pixel), an app (through the SDK or App Events API), and the Conversions API. Although event_id is marked as optional, we recommend that you use this parameter for deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>20029399299</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <ul>
             * <li><p>The name of a standard event or custom event. This field is used to deduplicate events sent by a website (through Meta Pixel), an app (through the SDK or App Events API), and the Conversions API. The event_id parameter is also used for deduplication.</p>
             * </li>
             * <li><p>For the same customer action, the event from the browser or app should match the event_name from the server event. If a match is found between events sent within 48 hours, only the first event is considered. If server and browser/app events are received at approximately the same time (within 5 minutes of each other), the browser/app event takes priority. Learn more about deduplicating Pixel events and server events.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Purchase</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The browser URL where the event occurred. The URL must start with http:// or https:// and should match the verified domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://alibaba.com">http://alibaba.com</a></p>
             */
            public Builder eventSourceUrl(String eventSourceUrl) {
                this.eventSourceUrl = eventSourceUrl;
                return this;
            }

            /**
             * <p>A Unix timestamp in seconds indicating when the event actually occurred. The specified time may be earlier than the time you send the event to Facebook. This is intended for batch processing and server performance optimization. You must send the date in Greenwich Mean Time (GMT) time zone format.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1709201870</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>Required parameters for app events.</p>
             * <p>Extended device information, such as the width and height of the screen. This parameter is an array with values separated by commas. When using extinfo, all values are required and must be arranged in the following index order. If a value is missing, use an empty string as a placeholder.</p>
             */
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>The source. Fixed value: whatsapp.</p>
             * 
             * <strong>example:</strong>
             * <p>whatsapp</p>
             */
            public Builder messagingChannel(String messagingChannel) {
                this.messagingChannel = messagingChannel;
                return this;
            }

            /**
             * <p>A flag that indicates this event should not be used for ad delivery optimization. When set to true, the event can only be used for attribution.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder optOut(Boolean optOut) {
                this.optOut = optOut;
                return this;
            }

            /**
             * <p>A map that contains customer information data.</p>
             * <p>This parameter is required.</p>
             */
            public Builder userData(java.util.Map<String, ?> userData) {
                this.userData = userData;
                return this;
            }

            public RequestData build() {
                return new RequestData(this);
            } 

        } 

    }
}

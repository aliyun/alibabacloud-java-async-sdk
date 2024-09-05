// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskOrderByEventReportRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskOrderByEventReportRequest</p>
 */
public class CreateTaskOrderByEventReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Business")
    private String business;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateRealName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createRealName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBody")
    private EventBody eventBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extinfo")
    private java.util.List < Extinfo> extinfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportantDesc")
    private String importantDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinChildGroupUserIds")
    private String joinChildGroupUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorCongregation")
    private String monitorCongregation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private CreateTaskOrderByEventReportRequest(Builder builder) {
        super(builder);
        this.business = builder.business;
        this.createRealName = builder.createRealName;
        this.createUserId = builder.createUserId;
        this.eventBody = builder.eventBody;
        this.extinfo = builder.extinfo;
        this.importantDesc = builder.importantDesc;
        this.joinChildGroupUserIds = builder.joinChildGroupUserIds;
        this.monitorCongregation = builder.monitorCongregation;
        this.openGroupId = builder.openGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskOrderByEventReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return business
     */
    public String getBusiness() {
        return this.business;
    }

    /**
     * @return createRealName
     */
    public String getCreateRealName() {
        return this.createRealName;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return eventBody
     */
    public EventBody getEventBody() {
        return this.eventBody;
    }

    /**
     * @return extinfo
     */
    public java.util.List < Extinfo> getExtinfo() {
        return this.extinfo;
    }

    /**
     * @return importantDesc
     */
    public String getImportantDesc() {
        return this.importantDesc;
    }

    /**
     * @return joinChildGroupUserIds
     */
    public String getJoinChildGroupUserIds() {
        return this.joinChildGroupUserIds;
    }

    /**
     * @return monitorCongregation
     */
    public String getMonitorCongregation() {
        return this.monitorCongregation;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<CreateTaskOrderByEventReportRequest, Builder> {
        private String business; 
        private String createRealName; 
        private String createUserId; 
        private EventBody eventBody; 
        private java.util.List < Extinfo> extinfo; 
        private String importantDesc; 
        private String joinChildGroupUserIds; 
        private String monitorCongregation; 
        private String openGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskOrderByEventReportRequest request) {
            super(request);
            this.business = request.business;
            this.createRealName = request.createRealName;
            this.createUserId = request.createUserId;
            this.eventBody = request.eventBody;
            this.extinfo = request.extinfo;
            this.importantDesc = request.importantDesc;
            this.joinChildGroupUserIds = request.joinChildGroupUserIds;
            this.monitorCongregation = request.monitorCongregation;
            this.openGroupId = request.openGroupId;
            this.productType = request.productType;
        } 

        /**
         * Business.
         */
        public Builder business(String business) {
            this.putQueryParameter("Business", business);
            this.business = business;
            return this;
        }

        /**
         * CreateRealName.
         */
        public Builder createRealName(String createRealName) {
            this.putQueryParameter("CreateRealName", createRealName);
            this.createRealName = createRealName;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.putQueryParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * EventBody.
         */
        public Builder eventBody(EventBody eventBody) {
            String eventBodyShrink = shrink(eventBody, "EventBody", "json");
            this.putQueryParameter("EventBody", eventBodyShrink);
            this.eventBody = eventBody;
            return this;
        }

        /**
         * Extinfo.
         */
        public Builder extinfo(java.util.List < Extinfo> extinfo) {
            String extinfoShrink = shrink(extinfo, "Extinfo", "json");
            this.putQueryParameter("Extinfo", extinfoShrink);
            this.extinfo = extinfo;
            return this;
        }

        /**
         * ImportantDesc.
         */
        public Builder importantDesc(String importantDesc) {
            this.putQueryParameter("ImportantDesc", importantDesc);
            this.importantDesc = importantDesc;
            return this;
        }

        /**
         * JoinChildGroupUserIds.
         */
        public Builder joinChildGroupUserIds(String joinChildGroupUserIds) {
            this.putQueryParameter("JoinChildGroupUserIds", joinChildGroupUserIds);
            this.joinChildGroupUserIds = joinChildGroupUserIds;
            return this;
        }

        /**
         * MonitorCongregation.
         */
        public Builder monitorCongregation(String monitorCongregation) {
            this.putQueryParameter("MonitorCongregation", monitorCongregation);
            this.monitorCongregation = monitorCongregation;
            return this;
        }

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public CreateTaskOrderByEventReportRequest build() {
            return new CreateTaskOrderByEventReportRequest(this);
        } 

    } 

    public static class EventLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        private EventLocation(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventLocation create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private String domain; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public EventLocation build() {
                return new EventLocation(this);
            } 

        } 

    }
    public static class EventBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDesc")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventDesc;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventLocation")
        private EventLocation eventLocation;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        private EventBody(Builder builder) {
            this.eventDesc = builder.eventDesc;
            this.eventId = builder.eventId;
            this.eventLevel = builder.eventLevel;
            this.eventLocation = builder.eventLocation;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBody create() {
            return builder().build();
        }

        /**
         * @return eventDesc
         */
        public String getEventDesc() {
            return this.eventDesc;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventLocation
         */
        public EventLocation getEventLocation() {
            return this.eventLocation;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String eventDesc; 
            private String eventId; 
            private String eventLevel; 
            private EventLocation eventLocation; 
            private String eventTime; 

            /**
             * EventDesc.
             */
            public Builder eventDesc(String eventDesc) {
                this.eventDesc = eventDesc;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventLocation.
             */
            public Builder eventLocation(EventLocation eventLocation) {
                this.eventLocation = eventLocation;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public EventBody build() {
                return new EventBody(this);
            } 

        } 

    }
    public static class Extinfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Extinfo(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extinfo create() {
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

            public Extinfo build() {
                return new Extinfo(this);
            } 

        } 

    }
}

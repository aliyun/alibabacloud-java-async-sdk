// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskOrderByEventReportRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskOrderByEventReportRequest</p>
 */
public class CreateTaskOrderByEventReportRequest extends Request {
    @Query
    @NameInMap("Business")
    private String business;

    @Query
    @NameInMap("CreateRealName")
    @Validation(required = true)
    private String createRealName;

    @Query
    @NameInMap("CreateUserId")
    @Validation(required = true)
    private String createUserId;

    @Query
    @NameInMap("EventBody")
    private EventBody eventBody;

    @Query
    @NameInMap("Extinfo")
    private java.util.List < Extinfo> extinfo;

    @Query
    @NameInMap("ImportantDesc")
    private String importantDesc;

    @Query
    @NameInMap("JoinChildGroupUserIds")
    private String joinChildGroupUserIds;

    @Query
    @NameInMap("MonitorCongregation")
    private String monitorCongregation;

    @Query
    @NameInMap("OpenGroupId")
    @Validation(required = true)
    private String openGroupId;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
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

        private Builder(CreateTaskOrderByEventReportRequest response) {
            super(response);
            this.business = response.business;
            this.createRealName = response.createRealName;
            this.createUserId = response.createUserId;
            this.eventBody = response.eventBody;
            this.extinfo = response.extinfo;
            this.importantDesc = response.importantDesc;
            this.joinChildGroupUserIds = response.joinChildGroupUserIds;
            this.monitorCongregation = response.monitorCongregation;
            this.openGroupId = response.openGroupId;
            this.productType = response.productType;
        } 

        /**
         * 告警所属业务
         */
        public Builder business(String business) {
            this.putQueryParameter("Business", business);
            this.business = business;
            return this;
        }

        /**
         * 提交人姓名
         */
        public Builder createRealName(String createRealName) {
            this.putQueryParameter("CreateRealName", createRealName);
            this.createRealName = createRealName;
            return this;
        }

        /**
         * 提交人userId
         */
        public Builder createUserId(String createUserId) {
            this.putQueryParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * 告警描述
         */
        public Builder eventBody(EventBody eventBody) {
            this.putQueryParameter("EventBody", eventBody);
            this.eventBody = eventBody;
            return this;
        }

        /**
         * 扩展信息
         */
        public Builder extinfo(java.util.List < Extinfo> extinfo) {
            this.putQueryParameter("Extinfo", extinfo);
            this.extinfo = extinfo;
            return this;
        }

        /**
         * 当eventLevel为warn时，必传
         */
        public Builder importantDesc(String importantDesc) {
            this.putQueryParameter("ImportantDesc", importantDesc);
            this.importantDesc = importantDesc;
            return this;
        }

        /**
         * 建单入群人员
         */
        public Builder joinChildGroupUserIds(String joinChildGroupUserIds) {
            this.putQueryParameter("JoinChildGroupUserIds", joinChildGroupUserIds);
            this.joinChildGroupUserIds = joinChildGroupUserIds;
            return this;
        }

        /**
         * 监控集如：视频业务的质量监控
         */
        public Builder monitorCongregation(String monitorCongregation) {
            this.putQueryParameter("MonitorCongregation", monitorCongregation);
            this.monitorCongregation = monitorCongregation;
            return this;
        }

        /**
         * 告警关联主群id
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * 问题分类
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
        @NameInMap("Domain")
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
             * domian域名
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
        @NameInMap("EventDesc")
        @Validation(required = true)
        private String eventDesc;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventLocation")
        private EventLocation eventLocation;

        @NameInMap("EventTime")
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
             * 当前告警描述信息
             */
            public Builder eventDesc(String eventDesc) {
                this.eventDesc = eventDesc;
                return this;
            }

            /**
             * 事件id
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * 事件级别
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * 事件源标识，自定义和TAM在云企配置的Location指标一致
             */
            public Builder eventLocation(EventLocation eventLocation) {
                this.eventLocation = eventLocation;
                return this;
            }

            /**
             * 事件上报时间
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * 扩展信息名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 扩展信息value值
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

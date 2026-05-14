// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudCreateEnterpriseTimeResponseBody} extends {@link TeaModel}
 *
 * <p>CloudCreateEnterpriseTimeResponseBody</p>
 */
public class CloudCreateEnterpriseTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudCreateEnterpriseTimeResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateEnterpriseTimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudCreateEnterpriseTimeResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public CloudCreateEnterpriseTimeResponseBody build() {
            return new CloudCreateEnterpriseTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudCreateEnterpriseTimeResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateEnterpriseTimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DayOfWeek")
        private String dayOfWeek;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("FromDay")
        private String fromDay;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("ToDay")
        private String toDay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.dayOfWeek = builder.dayOfWeek;
            this.endTime = builder.endTime;
            this.enterpriseId = builder.enterpriseId;
            this.fromDay = builder.fromDay;
            this.id = builder.id;
            this.name = builder.name;
            this.priority = builder.priority;
            this.startTime = builder.startTime;
            this.timeType = builder.timeType;
            this.toDay = builder.toDay;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dayOfWeek
         */
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return fromDay
         */
        public String getFromDay() {
            return this.fromDay;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return toDay
         */
        public String getToDay() {
            return this.toDay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String dayOfWeek; 
            private String endTime; 
            private String enterpriseId; 
            private String fromDay; 
            private String id; 
            private String name; 
            private String priority; 
            private String startTime; 
            private String timeType; 
            private String toDay; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.dayOfWeek = model.dayOfWeek;
                this.endTime = model.endTime;
                this.enterpriseId = model.enterpriseId;
                this.fromDay = model.fromDay;
                this.id = model.id;
                this.name = model.name;
                this.priority = model.priority;
                this.startTime = model.startTime;
                this.timeType = model.timeType;
                this.toDay = model.toDay;
                this.type = model.type;
            } 

            /**
             * <p>创建时间，格式为： yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>星期 周一：2、周二：3、周三：4、周四：5、周五：6、周六：7、周日：1、使用&quot;,&quot;进行分割、type=2时为空串</p>
             * 
             * <strong>example:</strong>
             * <p>2,3,4</p>
             */
            public Builder dayOfWeek(String dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
                return this;
            }

            /**
             * <p>结束时间 格式为 HH:mm startTime不能大于endTime</p>
             * 
             * <strong>example:</strong>
             * <p>19:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>呼叫中心编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>起始日期 格式为：yyyy-MM-dd、type=1时为空串 fromDay不能大于toDay</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20</p>
             */
            public Builder fromDay(String fromDay) {
                this.fromDay = fromDay;
                return this;
            }

            /**
             * <p>时间条件id</p>
             * 
             * <strong>example:</strong>
             * <p>236</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>时间条件名称 、同一呼叫中心下不能重复</p>
             * 
             * <strong>example:</strong>
             * <p>demo01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>优先级、同一呼叫中心下不能重复，值从1开始，值越小优先级越高</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>开始时间 格式为 HH:mm startTime不能大于endTime</p>
             * 
             * <strong>example:</strong>
             * <p>06:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>时间类型 1.连续 2.间隔</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>终止日期 格式为：yyyy-MM-dd、type=1时为空串 fromDay不能大于toDay</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-25</p>
             */
            public Builder toDay(String toDay) {
                this.toDay = toDay;
                return this;
            }

            /**
             * <p>时间条件类型 1:按照星期配置 2:按照固定时间配置</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
